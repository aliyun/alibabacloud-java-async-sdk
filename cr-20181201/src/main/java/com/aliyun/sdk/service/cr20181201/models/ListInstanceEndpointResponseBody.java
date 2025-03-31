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
 * {@link ListInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceEndpointResponseBody</p>
 */
public class ListInstanceEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstanceEndpointResponseBody(Builder builder) {
        this.code = builder.code;
        this.endpoints = builder.endpoints;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceEndpointResponseBody create() {
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
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Endpoints> endpoints; 
        private Boolean isSuccess; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstanceEndpointResponseBody model) {
            this.code = model.code;
            this.endpoints = model.endpoints;
            this.isSuccess = model.isSuccess;
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
         * <p>The endpoints of the instance.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1B21A877-66A2-4095-90EB-20A7781A4A67</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceEndpointResponseBody build() {
            return new ListInstanceEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceEndpointResponseBody</p>
     */
    public static class AclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        private AclEntries(Builder builder) {
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String entry; 

            private Builder() {
            } 

            private Builder(AclEntries model) {
                this.entry = model.entry;
            } 

            /**
             * <p>The information about the ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public AclEntries build() {
                return new AclEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceEndpointResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Domains(Builder builder) {
            this.domain = builder.domain;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domain; 
            private String type; 

            private Builder() {
            } 

            private Builder(Domains model) {
                this.domain = model.domain;
                this.type = model.type;
            } 

            /**
             * <p>The domain name of the Container Registry instance.</p>
             * 
             * <strong>example:</strong>
             * <p>t****-registry.cn-shanghai.cr.aliyuncs.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The type of the domain name. Valid values:</p>
             * <ul>
             * <li>SYSTEM: system domain name.</li>
             * <li>USER: user domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceEndpointResponseBody</p>
     */
    public static class LinkedVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private LinkedVpcs(Builder builder) {
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LinkedVpcs create() {
            return builder().build();
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String vpcId; 

            private Builder() {
            } 

            private Builder(LinkedVpcs model) {
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public LinkedVpcs build() {
                return new LinkedVpcs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceEndpointResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclEnable")
        private Boolean aclEnable;

        @com.aliyun.core.annotation.NameInMap("AclEntries")
        private java.util.List<AclEntries> aclEntries;

        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List<Domains> domains;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("LinkedVpcs")
        private java.util.List<LinkedVpcs> linkedVpcs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Endpoints(Builder builder) {
            this.aclEnable = builder.aclEnable;
            this.aclEntries = builder.aclEntries;
            this.domains = builder.domains;
            this.enable = builder.enable;
            this.endpointType = builder.endpointType;
            this.linkedVpcs = builder.linkedVpcs;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return aclEnable
         */
        public Boolean getAclEnable() {
            return this.aclEnable;
        }

        /**
         * @return aclEntries
         */
        public java.util.List<AclEntries> getAclEntries() {
            return this.aclEntries;
        }

        /**
         * @return domains
         */
        public java.util.List<Domains> getDomains() {
            return this.domains;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return linkedVpcs
         */
        public java.util.List<LinkedVpcs> getLinkedVpcs() {
            return this.linkedVpcs;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean aclEnable; 
            private java.util.List<AclEntries> aclEntries; 
            private java.util.List<Domains> domains; 
            private Boolean enable; 
            private String endpointType; 
            private java.util.List<LinkedVpcs> linkedVpcs; 
            private String status; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.aclEnable = model.aclEnable;
                this.aclEntries = model.aclEntries;
                this.domains = model.domains;
                this.enable = model.enable;
                this.endpointType = model.endpointType;
                this.linkedVpcs = model.linkedVpcs;
                this.status = model.status;
            } 

            /**
             * <p>Indicates whether the endpoint is added to an access control list (ACL).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder aclEnable(Boolean aclEnable) {
                this.aclEnable = aclEnable;
                return this;
            }

            /**
             * <p>The ACLs that are configured for the instance.</p>
             */
            public Builder aclEntries(java.util.List<AclEntries> aclEntries) {
                this.aclEntries = aclEntries;
                return this;
            }

            /**
             * <p>The list of domain names of the Container Registry instance.</p>
             */
            public Builder domains(java.util.List<Domains> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>Indicates whether the endpoint is added to an ACL.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The type of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>internet</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The VPCs associated with the instance.</p>
             */
            public Builder linkedVpcs(java.util.List<LinkedVpcs> linkedVpcs) {
                this.linkedVpcs = linkedVpcs;
                return this;
            }

            /**
             * <p>The status of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
