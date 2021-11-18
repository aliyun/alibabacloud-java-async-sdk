// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceEndpointResponseBody</p>
 */
public class GetInstanceEndpointResponseBody extends TeaModel {
    @NameInMap("Status")
    private String status;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("AclEnable")
    private Boolean aclEnable;

    @NameInMap("Enable")
    private Boolean enable;

    @NameInMap("Domains")
    private java.util.List < Domains> domains;

    @NameInMap("AclEntries")
    private java.util.List < AclEntries> aclEntries;


    private GetInstanceEndpointResponseBody(Builder builder) {
        this.status = builder.status;
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.aclEnable = builder.aclEnable;
        this.enable = builder.enable;
        this.domains = builder.domains;
        this.aclEntries = builder.aclEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return aclEntries
     */
    public java.util.List < AclEntries> getAclEntries() {
        return this.aclEntries;
    }

    public static final class Builder {
        private String status; 
        private String requestId; 
        private String code; 
        private Boolean isSuccess; 
        private Boolean aclEnable; 
        private Boolean enable; 
        private java.util.List < Domains> domains; 
        private java.util.List < AclEntries> aclEntries; 

        /**
         * <p>Running status</p>
         */
        public Builder status(String status) {
            this.status = status;
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
         * <p>Enable ACL</p>
         */
        public Builder aclEnable(Boolean aclEnable) {
            this.aclEnable = aclEnable;
            return this;
        }

        /**
         * <p>Enabled</p>
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
         * <p>ACL list</p>
         */
        public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        public GetInstanceEndpointResponseBody build() {
            return new GetInstanceEndpointResponseBody(this);
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
             * <p>The type of the domain name. Valid values:

-"SYSTEM": system domain name

-"USER": User Domain name</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The domain name used to access the enterprise instance.</p>
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
    public static class AclEntries extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Entry")
        private String entry;


        private AclEntries(Builder builder) {
            this.comment = builder.comment;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String comment; 
            private String entry; 

            /**
             * <p>Remarks for adding a public IP address whitelist</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Add public IP address range</p>
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
}
