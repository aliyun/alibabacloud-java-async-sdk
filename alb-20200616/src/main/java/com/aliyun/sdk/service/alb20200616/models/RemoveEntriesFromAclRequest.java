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

        private Builder(RemoveEntriesFromAclRequest response) {
            super(response);
            this.aclId = response.aclId;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.entries = response.entries;
        } 

        /**
         * 访问控制策略Id
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 条目列表
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
