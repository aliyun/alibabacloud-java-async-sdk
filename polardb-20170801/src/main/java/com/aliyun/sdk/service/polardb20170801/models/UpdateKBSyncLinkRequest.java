// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdateKBSyncLinkRequest} extends {@link RequestModel}
 *
 * <p>UpdateKBSyncLinkRequest</p>
 */
public class UpdateKBSyncLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LinkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String linkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncIntervalMinutes")
    private Integer syncIntervalMinutes;

    private UpdateKBSyncLinkRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.linkId = builder.linkId;
        this.regionId = builder.regionId;
        this.syncIntervalMinutes = builder.syncIntervalMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKBSyncLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return linkId
     */
    public String getLinkId() {
        return this.linkId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return syncIntervalMinutes
     */
    public Integer getSyncIntervalMinutes() {
        return this.syncIntervalMinutes;
    }

    public static final class Builder extends Request.Builder<UpdateKBSyncLinkRequest, Builder> {
        private String knowledgeBaseId; 
        private String linkId; 
        private String regionId; 
        private Integer syncIntervalMinutes; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKBSyncLinkRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.linkId = request.linkId;
            this.regionId = request.regionId;
            this.syncIntervalMinutes = request.syncIntervalMinutes;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-xxxxx</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putQueryParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pkbl-xxxxx</p>
         */
        public Builder linkId(String linkId) {
            this.putQueryParameter("LinkId", linkId);
            this.linkId = linkId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>20</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder syncIntervalMinutes(Integer syncIntervalMinutes) {
            this.putQueryParameter("SyncIntervalMinutes", syncIntervalMinutes);
            this.syncIntervalMinutes = syncIntervalMinutes;
            return this;
        }

        @Override
        public UpdateKBSyncLinkRequest build() {
            return new UpdateKBSyncLinkRequest(this);
        } 

    } 

}
