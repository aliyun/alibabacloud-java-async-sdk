// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEntriesFromAclRequest} extends {@link RequestModel}
 *
 * <p>RemoveEntriesFromAclRequest</p>
 */
public class RemoveEntriesFromAclRequest extends Request {
    @Query
    @NameInMap("AclId")
    @Validation(required = true)
    private String aclId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Entries")
    @Validation(required = true)
    private java.util.List < String > entries;

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
    public java.util.List < String > getEntries() {
        return this.entries;
    }

    public static final class Builder extends Request.Builder<RemoveEntriesFromAclRequest, Builder> {
        private String aclId; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > entries; 

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
         * The ACL ID.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The entries that you want to remove. You can remove up to 20 entries in each call.
         */
        public Builder entries(java.util.List < String > entries) {
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
