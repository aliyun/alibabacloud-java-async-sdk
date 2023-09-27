// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceEndpointResponseBody</p>
 */
public class GetInstanceEndpointResponseBody extends TeaModel {
    @NameInMap("AclEnable")
    private Boolean aclEnable;

    @NameInMap("AclEntries")
    private java.util.List < AclEntries> aclEntries;

    @NameInMap("Code")
    private String code;

    @NameInMap("Domains")
    private java.util.List < Domains> domains;

    @NameInMap("Enable")
    private Boolean enable;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetInstanceEndpointResponseBody(Builder builder) {
        this.aclEnable = builder.aclEnable;
        this.aclEntries = builder.aclEntries;
        this.code = builder.code;
        this.domains = builder.domains;
        this.enable = builder.enable;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceEndpointResponseBody create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Boolean aclEnable; 
        private java.util.List < AclEntries> aclEntries; 
        private String code; 
        private java.util.List < Domains> domains; 
        private Boolean enable; 
        private Boolean isSuccess; 
        private String requestId; 
        private String status; 

        /**
         * Indicates whether the access control list (ACL) feature is enabled.
         */
        public Builder aclEnable(Boolean aclEnable) {
            this.aclEnable = aclEnable;
            return this;
        }

        /**
         * The ACLs.
         */
        public Builder aclEntries(java.util.List < AclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * The status of the instance.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetInstanceEndpointResponseBody build() {
            return new GetInstanceEndpointResponseBody(this);
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
             * Remarks for public IP address whitelists.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The public IP address whitelist.
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
             * The domain name that is used to access the Container Registry Enterprise Edition instance.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The type of the domain name. Valid values:
             * <p>
             * 
             * *   `SYSTEM`: a system domain name.
             * *   `USER`: a user domain name.
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
}
