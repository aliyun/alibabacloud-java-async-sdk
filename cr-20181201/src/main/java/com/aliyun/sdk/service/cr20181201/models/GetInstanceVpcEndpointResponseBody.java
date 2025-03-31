// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceVpcEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceVpcEndpointResponseBody</p>
 */
public class GetInstanceVpcEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<String> domains;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("LinkedVpcs")
    private java.util.List<LinkedVpcs> linkedVpcs;

    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getDomains() {
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
    public java.util.List<LinkedVpcs> getLinkedVpcs() {
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
        private java.util.List<String> domains; 
        private Boolean enable; 
        private Boolean isSuccess; 
        private java.util.List<LinkedVpcs> linkedVpcs; 
        private String moduleName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceVpcEndpointResponseBody model) {
            this.code = model.code;
            this.domains = model.domains;
            this.enable = model.enable;
            this.isSuccess = model.isSuccess;
            this.linkedVpcs = model.linkedVpcs;
            this.moduleName = model.moduleName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Domain names.</p>
         */
        public Builder domains(java.util.List<String> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>Indicates whether the VPC endpoint is enabled. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The VPCs that are added to the access control list.</p>
         */
        public Builder linkedVpcs(java.util.List<LinkedVpcs> linkedVpcs) {
            this.linkedVpcs = linkedVpcs;
            return this;
        }

        /**
         * <p>The name of the modules that can be accessed. Valid values:</p>
         * <ul>
         * <li><code>Registry</code>: image repositories.</li>
         * <li><code>Chart</code>: Helm charts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Registry</p>
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BAE9349D-A587-4F9A-B574-9DA0EF2638D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceVpcEndpointResponseBody build() {
            return new GetInstanceVpcEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceVpcEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceVpcEndpointResponseBody</p>
     */
    public static class LinkedVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultAccess")
        private Boolean defaultAccess;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
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

            private Builder() {
            } 

            private Builder(LinkedVpcs model) {
                this.defaultAccess = model.defaultAccess;
                this.ip = model.ip;
                this.status = model.status;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>Indicates whether the VPC is the default VPC over which the Container Registry instance is accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultAccess(Boolean defaultAccess) {
                this.defaultAccess = defaultAccess;
                return this;
            }

            /**
             * <p>IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.11</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The status of the VPC. Valid values:</p>
             * <ul>
             * <li><code>CREATING</code></li>
             * <li><code>RUNNING</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6aamu2nomfr1thd****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf62m5vmxl2e72dk7****</p>
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
