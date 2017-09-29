package com.sitewhere.microservice;

/**
 * Constants for interacting with Microservice environment.
 * 
 * @author Derek
 */
public class MicroserviceEnvironment {

    /** Default port used for GRPC servers */
    public static final int DEFAULT_GRPC_PORT = 9000;

    /** Environment variable for SiteWhere instance id */
    public static final String ENV_GRPC_PORT_OVERRIDE = "SW_GRPC_PORT_OVERRIDE";

    /** Default Docker hostname for user management microservice */
    public static final String HOST_USER_MANAGEMENT = "user-management";

    /** Default Docker hostname for tenant management microservice */
    public static final String HOST_TENANT_MANAGEMENT = "tenant-management";
}
