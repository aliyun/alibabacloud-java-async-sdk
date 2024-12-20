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
 * {@link RemoveEntriesFromAclRequest} extends {@link RequestModel}
 *
 * <p>RemoveEntriesFromAclRequest</p>
 */
public class RemoveEntriesFromAclRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Entries")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> entries;

    private RemoveEntriesFromAclRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.entries = builder.entries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveEntriesFromAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return entries
     */
    public java.util.List<String> getEntries() {
        return this.entries;
    }

    public static final class Builder extends Request.Builder<RemoveEntriesFromAclRequest, Builder> {
        private String aclId; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<String> entries; 

        private Builder() {
            super();
        } 

        private Builder(RemoveEntriesFromAclRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.entries = request.entries;
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
         * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
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
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The entries that you want to remove. You can remove up to 20 entries in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder entries(java.util.List<String> entries) {
            this.putQueryParameter("Entries", entries);
            this.entries = entries;
            return this;
        }

        @Override
        public RemoveEntriesFromAclRequest build() {
            return new RemoveEntriesFromAclRequest(this);
        } 

    } 

}
