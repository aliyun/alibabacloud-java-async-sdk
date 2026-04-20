// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link UpdateMmAppRagWeightRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmAppRagWeightRequest</p>
 */
public class UpdateMmAppRagWeightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RankWeights")
    private java.util.Map<String, Double> rankWeights;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateMmAppRagWeightRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.rankWeights = builder.rankWeights;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmAppRagWeightRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return rankWeights
     */
    public java.util.Map<String, Double> getRankWeights() {
        return this.rankWeights;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateMmAppRagWeightRequest, Builder> {
        private String appId; 
        private java.util.Map<String, Double> rankWeights; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmAppRagWeightRequest request) {
            super(request);
            this.appId = request.appId;
            this.rankWeights = request.rankWeights;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_a2eb4e04b48041108edb1f6de815</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * RankWeights.
         */
        public Builder rankWeights(java.util.Map<String, Double> rankWeights) {
            String rankWeightsShrink = shrink(rankWeights, "RankWeights", "json");
            this.putQueryParameter("RankWeights", rankWeightsShrink);
            this.rankWeights = rankWeights;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-6uhm7nfev4k8pwcz</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateMmAppRagWeightRequest build() {
            return new UpdateMmAppRagWeightRequest(this);
        } 

    } 

}
