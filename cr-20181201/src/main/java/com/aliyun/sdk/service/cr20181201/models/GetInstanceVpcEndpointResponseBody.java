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

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceVpcEndpointResponseBody(Builder builder) {
        this.code = builder.code;
        this.domains = builder.domains;
        this.enable = builder.enable;
        this.isSuccess = builder.isSuccess;
        this.linkedVpcs = builder.linkedVpcs;
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
        private String requestId; 

        /**
         * Code.
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
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * LinkedVpcs.
         */
        public Builder linkedVpcs(java.util.List < LinkedVpcs> linkedVpcs) {
            this.linkedVpcs = linkedVpcs;
            return this;
        }

        /**
         * RequestId.
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
             * DefaultAccess.
             */
            public Builder defaultAccess(Boolean defaultAccess) {
                this.defaultAccess = defaultAccess;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
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
