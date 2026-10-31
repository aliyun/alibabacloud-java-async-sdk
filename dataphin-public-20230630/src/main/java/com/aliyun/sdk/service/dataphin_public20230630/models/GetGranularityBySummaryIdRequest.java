// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetGranularityBySummaryIdRequest} extends {@link RequestModel}
 *
 * <p>GetGranularityBySummaryIdRequest</p>
 */
public class GetGranularityBySummaryIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryDraft")
    private Boolean queryDraft;

    private GetGranularityBySummaryIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.modelId = builder.modelId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.projectId = builder.projectId;
        this.queryDraft = builder.queryDraft;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGranularityBySummaryIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return queryDraft
     */
    public Boolean getQueryDraft() {
        return this.queryDraft;
    }

    public static final class Builder extends Request.Builder<GetGranularityBySummaryIdRequest, Builder> {
        private String regionId; 
        private String env; 
        private Long modelId; 
        private Long opTenantId; 
        private String opUserId; 
        private Long projectId; 
        private Boolean queryDraft; 

        private Builder() {
            super();
        } 

        private Builder(GetGranularityBySummaryIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.env = request.env;
            this.modelId = request.modelId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.projectId = request.projectId;
            this.queryDraft = request.queryDraft;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Env</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>ModelId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1978</p>
         */
        public Builder modelId(Long modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The operator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>ProjectId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7081229106458752</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>QueryDraft</p>
         */
        public Builder queryDraft(Boolean queryDraft) {
            this.putQueryParameter("QueryDraft", queryDraft);
            this.queryDraft = queryDraft;
            return this;
        }

        @Override
        public GetGranularityBySummaryIdRequest build() {
            return new GetGranularityBySummaryIdRequest(this);
        } 

    } 

}
