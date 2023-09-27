// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceEndpointResponseBody</p>
 */
public class ListInstanceEndpointResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
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
        private java.util.List < Endpoints> endpoints; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The endpoints of the instance.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceEndpointResponseBody build() {
            return new ListInstanceEndpointResponseBody(this);
        } 

    } 

    public static class AclEntries extends TeaModel {
        @NameInMap("Entry")
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

            /**
             * Details about the ACL.
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
    public static class Domains extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Type")
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

            /**
             * The domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Type
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
    public static class LinkedVpcs extends TeaModel {
        @NameInMap("VpcId")
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

            /**
             * VPC ID
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
    public static class Endpoints extends TeaModel {
        @NameInMap("AclEnable")
        private Boolean aclEnable;

        @NameInMap("AclEntries")
        private java.util.List < AclEntries> aclEntries;

        @NameInMap("Domains")
        private java.util.List < Domains> domains;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("LinkedVpcs")
        private java.util.List < LinkedVpcs> linkedVpcs;

        @NameInMap("Status")
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
        public java.util.List < AclEntries> getAclEntries() {
            return this.aclEntries;
        }

        /**
         * @return domains
         */
        public java.util.List < Domains> getDomains() {
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
        public java.util.List < LinkedVpcs> getLinkedVpcs() {
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
            private java.util.List < AclEntries> aclEntries; 
            private java.util.List < Domains> domains; 
            private Boolean enable; 
            private String endpointType; 
            private java.util.List < LinkedVpcs> linkedVpcs; 
            private String status; 

            /**
             * Indicates whether the access control list (ACL) feature is enabled.
             */
            public Builder aclEnable(Boolean aclEnable) {
                this.aclEnable = aclEnable;
                return this;
            }

            /**
             * The ACL configured for the instance.
             */
            public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
                this.aclEntries = aclEntries;
                return this;
            }

            /**
             * Domain names.
             */
            public Builder domains(java.util.List < Domains> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * Indicates whether the ACL feature is enabled.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The type of the endpoint.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The virtual private clouds (VPCs) that are associated with the instance.
             */
            public Builder linkedVpcs(java.util.List < LinkedVpcs> linkedVpcs) {
                this.linkedVpcs = linkedVpcs;
                return this;
            }

            /**
             * The status of the instance.
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
