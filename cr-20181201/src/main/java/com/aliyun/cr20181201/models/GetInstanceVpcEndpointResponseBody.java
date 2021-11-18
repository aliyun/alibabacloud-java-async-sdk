// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceVpcEndpointResponseBody</p>
 */
public class GetInstanceVpcEndpointResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Enable")
    private Boolean enable;

    @NameInMap("Domains")
    private java.util.List < String > domains;

    @NameInMap("LinkedVpcs")
    private java.util.List < LinkedVpcs> linkedVpcs;


    private GetInstanceVpcEndpointResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.enable = builder.enable;
        this.domains = builder.domains;
        this.linkedVpcs = builder.linkedVpcs;
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return domains
     */
    public java.util.List < String > getDomains() {
        return this.domains;
    }

    /**
     * @return linkedVpcs
     */
    public java.util.List < LinkedVpcs> getLinkedVpcs() {
        return this.linkedVpcs;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private Boolean enable; 
        private java.util.List < String > domains; 
        private java.util.List < LinkedVpcs> linkedVpcs; 

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Open</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>Domains.</p>
         */
        public Builder domains(java.util.List < String > domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The list of associated VPCs.</p>
         */
        public Builder linkedVpcs(java.util.List < LinkedVpcs> linkedVpcs) {
            this.linkedVpcs = linkedVpcs;
            return this;
        }

        public GetInstanceVpcEndpointResponseBody build() {
            return new GetInstanceVpcEndpointResponseBody(this);
        } 

    } 

    public static class LinkedVpcs extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("DefaultAccess")
        private Boolean defaultAccess;

        @NameInMap("VswitchId")
        private String vswitchId;


        private LinkedVpcs(Builder builder) {
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.ip = builder.ip;
            this.defaultAccess = builder.defaultAccess;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkedVpcs create() {
            return builder().build();
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return defaultAccess
         */
        public Boolean getDefaultAccess() {
            return this.defaultAccess;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String status; 
            private String vpcId; 
            private String ip; 
            private Boolean defaultAccess; 
            private String vswitchId; 

            /**
             * <p>State</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>VPC ID</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>IP ADDRESS</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Default access policy</p>
             */
            public Builder defaultAccess(Boolean defaultAccess) {
                this.defaultAccess = defaultAccess;
                return this;
            }

            /**
             * <p>Switch ID</p>
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
