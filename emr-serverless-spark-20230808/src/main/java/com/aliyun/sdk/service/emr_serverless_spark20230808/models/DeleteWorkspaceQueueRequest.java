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
 * {@link DeleteWorkspaceQueueRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkspaceQueueRequest</p>
 */
public class DeleteWorkspaceQueueRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceQueueName")
    private String workspaceQueueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private DeleteWorkspaceQueueRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.workspaceQueueName = builder.workspaceQueueName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceQueueRequest create() {
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
     * @return workspaceQueueName
     */
    public String getWorkspaceQueueName() {
        return this.workspaceQueueName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteWorkspaceQueueRequest, Builder> {
        private String workspaceId; 
        private String workspaceQueueName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkspaceQueueRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.workspaceQueueName = request.workspaceQueueName;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * workspaceQueueName.
         */
        public Builder workspaceQueueName(String workspaceQueueName) {
            this.putPathParameter("workspaceQueueName", workspaceQueueName);
            this.workspaceQueueName = workspaceQueueName;
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
        public DeleteWorkspaceQueueRequest build() {
            return new DeleteWorkspaceQueueRequest(this);
        } 

    } 

}
