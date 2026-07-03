// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link StopDataAgentAccuracyTestTaskRequest} extends {@link RequestModel}
 *
 * <p>StopDataAgentAccuracyTestTaskRequest</p>
 */
public class StopDataAgentAccuracyTestTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccuracyTestTaskId")
    private String accuracyTestTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private StopDataAgentAccuracyTestTaskRequest(Builder builder) {
        super(builder);
        this.accuracyTestTaskId = builder.accuracyTestTaskId;
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopDataAgentAccuracyTestTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accuracyTestTaskId
     */
    public String getAccuracyTestTaskId() {
        return this.accuracyTestTaskId;
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

    public static final class Builder extends Request.Builder<StopDataAgentAccuracyTestTaskRequest, Builder> {
        private String accuracyTestTaskId; 
        private String regionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(StopDataAgentAccuracyTestTaskRequest request) {
            super(request);
            this.accuracyTestTaskId = request.accuracyTestTaskId;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AccuracyTestTaskId.
         */
        public Builder accuracyTestTaskId(String accuracyTestTaskId) {
            this.putQueryParameter("AccuracyTestTaskId", accuracyTestTaskId);
            this.accuracyTestTaskId = accuracyTestTaskId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public StopDataAgentAccuracyTestTaskRequest build() {
            return new StopDataAgentAccuracyTestTaskRequest(this);
        } 

    } 

}
