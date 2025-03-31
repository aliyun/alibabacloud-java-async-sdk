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
 * {@link GetInstanceEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceEndpointResponseBody</p>
 */
public class GetInstanceEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclEnable")
    private Boolean aclEnable;

    @com.aliyun.core.annotation.NameInMap("AclEntries")
    private java.util.List<AclEntries> aclEntries;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<Domains> domains;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private java.util.List<AclEntries> aclEntries; 
        private String code; 
        private java.util.List<Domains> domains; 
        private Boolean enable; 
        private Boolean isSuccess; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetInstanceEndpointResponseBody model) {
            this.aclEnable = model.aclEnable;
            this.aclEntries = model.aclEntries;
            this.code = model.code;
            this.domains = model.domains;
            this.enable = model.enable;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>Indicates whether the access control list (ACL) feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder aclEnable(Boolean aclEnable) {
            this.aclEnable = aclEnable;
            return this;
        }

        /**
         * <p>The ACLs.</p>
         */
        public Builder aclEntries(java.util.List<AclEntries> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
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
        public Builder domains(java.util.List<Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>Indicates whether the ACL feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8F3D5EC5-39D1-4C53-A198-48C54C658FA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetInstanceEndpointResponseBody build() {
            return new GetInstanceEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceEndpointResponseBody</p>
     */
    public static class AclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Entry")
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

            private Builder() {
            } 

            private Builder(AclEntries model) {
                this.comment = model.comment;
                this.entry = model.entry;
            } 

            /**
             * <p>Remarks for public IP address whitelists.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The public IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
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
     * {@link GetInstanceEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceEndpointResponseBody</p>
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
             * <p>The domain name that is used to access the Container Registry Enterprise Edition instance.</p>
             * 
             * <strong>example:</strong>
             * <p>shanghai-instance1-registry.cn-shanghai.cr.aliyuncs.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The type of the domain name. Valid values:</p>
             * <ul>
             * <li><code>SYSTEM</code>: a system domain name.</li>
             * <li><code>USER</code>: a user domain name.</li>
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
}
