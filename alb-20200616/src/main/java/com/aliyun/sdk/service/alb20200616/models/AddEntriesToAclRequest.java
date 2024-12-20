// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link AddEntriesToAclRequest} extends {@link RequestModel}
 *
 * <p>AddEntriesToAclRequest</p>
 */
public class AddEntriesToAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclEntries")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AclEntries> aclEntries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    private AddEntriesToAclRequest(Builder builder) {
        super(builder);
        this.aclEntries = builder.aclEntries;
        this.aclId = builder.aclId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEntriesToAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclEntries
     */
    public java.util.List<AclEntries> getAclEntries() {
        return this.aclEntries;
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<AddEntriesToAclRequest, Builder> {
        private java.util.List<AclEntries> aclEntries; 
        private String aclId; 
        private String clientToken; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(AddEntriesToAclRequest request) {
            super(request);
            this.aclEntries = request.aclEntries;
            this.aclId = request.aclId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The ACL entries that you want to add. You can add at most 20 entries in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder aclEntries(java.util.List<AclEntries> aclEntries) {
            this.putQueryParameter("AclEntries", aclEntries);
            this.aclEntries = aclEntries;
            return this;
        }

        /**
         * <p>The ID of the ACL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-hp34s2h0xx1ht4nwo****</p>
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public AddEntriesToAclRequest build() {
            return new AddEntriesToAclRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddEntriesToAclRequest} extends {@link TeaModel}
     *
     * <p>AddEntriesToAclRequest</p>
     */
    public static class AclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Entry")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entry;

        private AclEntries(Builder builder) {
            this.description = builder.description;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String description; 
            private String entry; 

            /**
             * <p>The description of the ACL entry. The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
             * <p>You can add at most 20 entries in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>test-entry</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The CIDR block in the ACL entry.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.1.0/24</p>
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
