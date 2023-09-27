// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceVpcEndpointResponseBody</p>
 */
public class GetInstanceVpcEndpointResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Domains")
    private java.util.List < String > domains;

    @NameInMap("Enable")
    private Boolean enable;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("LinkedVpcs")
    private java.util.List < LinkedVpcs> linkedVpcs;

    @NameInMap("ModuleName")
    private String moduleName;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceVpcEndpointResponseBody(Builder builder) {
        this.code = builder.code;
        this.domains = builder.domains;
        this.enable = builder.enable;
        this.isSuccess = builder.isSuccess;
        this.linkedVpcs = builder.linkedVpcs;
        this.moduleName = builder.moduleName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceVpcEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return domains
     */
    public java.util.List < String > getDomains() {
        return this.domains;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return linkedVpcs
     */
    public java.util.List < LinkedVpcs> getLinkedVpcs() {
        return this.linkedVpcs;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < String > domains; 
        private Boolean enable; 
        private Boolean isSuccess; 
        private java.util.List < LinkedVpcs> linkedVpcs; 
        private String moduleName; 
        private String requestId; 

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Domains.
         */
        public Builder domains(java.util.List < String > domains) {
            this.domains = domains;
            return this;
        }

        /**
         * Indicates whether the access control list (ACL) feature is enabled. Valid values:
         * <p>
         * 
         * *   `true`: The ACL feature is enabled.
         * *   `false`: The ACL feature is disabled.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   `true`: The request is successful.
         * *   `false`: The request fails.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The VPCs in which the instance is deployed.
         */
        public Builder linkedVpcs(java.util.List < LinkedVpcs> linkedVpcs) {
            this.linkedVpcs = linkedVpcs;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceVpcEndpointResponseBody build() {
            return new GetInstanceVpcEndpointResponseBody(this);
        } 

    } 

    public static class LinkedVpcs extends TeaModel {
        @NameInMap("DefaultAccess")
        private Boolean defaultAccess;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private LinkedVpcs(Builder builder) {
            this.defaultAccess = builder.defaultAccess;
            this.ip = builder.ip;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkedVpcs create() {
            return builder().build();
        }

        /**
         * @return defaultAccess
         */
        public Boolean getDefaultAccess() {
            return this.defaultAccess;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private Boolean defaultAccess; 
            private String ip; 
            private String status; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * Indicates whether the default ACL is used.
             */
            public Builder defaultAccess(Boolean defaultAccess) {
                this.defaultAccess = defaultAccess;
                return this;
            }

            /**
             * IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The status of the VPC. Valid values:
             * <p>
             * 
             * *   `CREATING`: The VPC is being created.
             * *   `RUNNING`: The VPC is running.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VPC ID
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public LinkedVpcs build() {
                return new LinkedVpcs(this);
            } 

        } 

    }
}
