// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetRunConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetRunConfigurationRequest</p>
 */
public class GetRunConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("runId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetRunConfigurationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.runId = builder.runId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRunConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetRunConfigurationRequest, Builder> {
        private String workspaceId; 
        private String runId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRunConfigurationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.runId = request.runId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>工作空间id。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09151****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>任务实例ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-93d98d2f7061****</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetRunConfigurationRequest build() {
            return new GetRunConfigurationRequest(this);
        } 

    } 

}
