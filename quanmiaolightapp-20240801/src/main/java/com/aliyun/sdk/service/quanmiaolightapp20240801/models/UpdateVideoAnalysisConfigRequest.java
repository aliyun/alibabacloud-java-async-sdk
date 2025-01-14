// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link UpdateVideoAnalysisConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateVideoAnalysisConfigRequest</p>
 */
public class UpdateVideoAnalysisConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("asyncConcurrency")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer asyncConcurrency;

    private UpdateVideoAnalysisConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.asyncConcurrency = builder.asyncConcurrency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVideoAnalysisConfigRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return asyncConcurrency
     */
    public Integer getAsyncConcurrency() {
        return this.asyncConcurrency;
    }

    public static final class Builder extends Request.Builder<UpdateVideoAnalysisConfigRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private Integer asyncConcurrency; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVideoAnalysisConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.asyncConcurrency = request.asyncConcurrency;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder asyncConcurrency(Integer asyncConcurrency) {
            this.putBodyParameter("asyncConcurrency", asyncConcurrency);
            this.asyncConcurrency = asyncConcurrency;
            return this;
        }

        @Override
        public UpdateVideoAnalysisConfigRequest build() {
            return new UpdateVideoAnalysisConfigRequest(this);
        } 

    } 

}
