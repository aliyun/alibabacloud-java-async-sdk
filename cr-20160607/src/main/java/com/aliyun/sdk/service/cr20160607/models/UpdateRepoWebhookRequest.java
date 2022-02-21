// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepoWebhookRequest} extends {@link RequestModel}
 *
 * <p>UpdateRepoWebhookRequest</p>
 */
public class UpdateRepoWebhookRequest extends Request {
    @Path
    @NameInMap("RepoNamespace")
    @Validation(required = true)
    private String repoNamespace;

    @Path
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Path
    @NameInMap("WebhookId")
    @Validation(required = true)
    private Long webhookId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateRepoWebhookRequest(Builder builder) {
        super(builder);
        this.repoNamespace = builder.repoNamespace;
        this.repoName = builder.repoName;
        this.webhookId = builder.webhookId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepoWebhookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return webhookId
     */
    public Long getWebhookId() {
        return this.webhookId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateRepoWebhookRequest, Builder> {
        private String repoNamespace; 
        private String repoName; 
        private Long webhookId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRepoWebhookRequest response) {
            super(response);
            this.repoNamespace = response.repoNamespace;
            this.repoName = response.repoName;
            this.webhookId = response.webhookId;
            this.regionId = response.regionId;
        } 

        /**
         * RepoNamespace.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putPathParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putPathParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * WebhookId.
         */
        public Builder webhookId(Long webhookId) {
            this.putPathParameter("WebhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateRepoWebhookRequest build() {
            return new UpdateRepoWebhookRequest(this);
        } 

    } 

}
