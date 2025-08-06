// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitMediaExportJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaExportJobRequest</p>
 */
public class SubmitMediaExportJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Match")
    private String match;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaExportConfig")
    private String mediaExportConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private SubmitMediaExportJobRequest(Builder builder) {
        super(builder);
        this.jobName = builder.jobName;
        this.match = builder.match;
        this.mediaExportConfig = builder.mediaExportConfig;
        this.mediaType = builder.mediaType;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaExportJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return match
     */
    public String getMatch() {
        return this.match;
    }

    /**
     * @return mediaExportConfig
     */
    public String getMediaExportConfig() {
        return this.mediaExportConfig;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<SubmitMediaExportJobRequest, Builder> {
        private String jobName; 
        private String match; 
        private String mediaExportConfig; 
        private String mediaType; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaExportJobRequest request) {
            super(request);
            this.jobName = request.jobName;
            this.match = request.match;
            this.mediaExportConfig = request.mediaExportConfig;
            this.mediaType = request.mediaType;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sortBy = request.sortBy;
        } 

        /**
         * JobName.
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * Match.
         */
        public Builder match(String match) {
            this.putQueryParameter("Match", match);
            this.match = match;
            return this;
        }

        /**
         * MediaExportConfig.
         */
        public Builder mediaExportConfig(String mediaExportConfig) {
            this.putQueryParameter("MediaExportConfig", mediaExportConfig);
            this.mediaExportConfig = mediaExportConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public SubmitMediaExportJobRequest build() {
            return new SubmitMediaExportJobRequest(this);
        } 

    } 

}
