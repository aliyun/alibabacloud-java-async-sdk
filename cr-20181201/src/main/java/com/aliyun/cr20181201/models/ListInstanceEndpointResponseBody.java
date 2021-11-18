// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceEndpointResponseBody</p>
 */
public class ListInstanceEndpointResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;


    private ListInstanceEndpointResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.endpoints = builder.endpoints;
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
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private java.util.List < Endpoints> endpoints; 

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
         * <p>Network access entrance list</p>
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public ListInstanceEndpointResponseBody build() {
            return new ListInstanceEndpointResponseBody(this);
        } 

    } 

    public static class Domains extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Domain")
        private String domain;


        private Domains(Builder builder) {
            this.type = builder.type;
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private String type; 
            private String domain; 

            /**
             * <p>Type</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Domain name</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * <p>VPC ID</p>
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
             * <p>Entity Information</p>
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
    public static class Endpoints extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("AclEnable")
        private Boolean aclEnable;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("Domains")
        private java.util.List < Domains> domains;

        @NameInMap("LinkedVpcs")
        private java.util.List < LinkedVpcs> linkedVpcs;

        @NameInMap("AclEntries")
        private java.util.List < AclEntries> aclEntries;


        private Endpoints(Builder builder) {
            this.status = builder.status;
            this.endpointType = builder.endpointType;
            this.aclEnable = builder.aclEnable;
            this.enable = builder.enable;
            this.domains = builder.domains;
            this.linkedVpcs = builder.linkedVpcs;
            this.aclEntries = builder.aclEntries;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return aclEnable
         */
        public Boolean getAclEnable() {
            return this.aclEnable;
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
        public java.util.List < Domains> getDomains() {
            return this.domains;
        }

        /**
         * @return linkedVpcs
         */
        public java.util.List < LinkedVpcs> getLinkedVpcs() {
            return this.linkedVpcs;
        }

        /**
         * @return aclEntries
         */
        public java.util.List < AclEntries> getAclEntries() {
            return this.aclEntries;
        }

        public static final class Builder {
            private String status; 
            private String endpointType; 
            private Boolean aclEnable; 
            private Boolean enable; 
            private java.util.List < Domains> domains; 
            private java.util.List < LinkedVpcs> linkedVpcs; 
            private java.util.List < AclEntries> aclEntries; 

            /**
             * <p>State</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Network access type</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>Enable Access control</p>
             */
            public Builder aclEnable(Boolean aclEnable) {
                this.aclEnable = aclEnable;
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
             * <p>Domain names</p>
             */
            public Builder domains(java.util.List < Domains> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>Associated VPCs</p>
             */
            public Builder linkedVpcs(java.util.List < LinkedVpcs> linkedVpcs) {
                this.linkedVpcs = linkedVpcs;
                return this;
            }

            /**
             * <p>List of access control entities</p>
             */
            public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
                this.aclEntries = aclEntries;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
