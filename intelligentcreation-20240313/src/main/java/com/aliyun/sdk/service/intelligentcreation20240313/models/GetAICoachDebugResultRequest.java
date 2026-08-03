// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachDebugResultRequest} extends {@link RequestModel}
 *
 * <p>GetAICoachDebugResultRequest</p>
 */
public class GetAICoachDebugResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataId")
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scriptDebugId")
    private String scriptDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scriptRecordId")
    private String scriptRecordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scriptSnapshotId")
    private String scriptSnapshotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetAICoachDebugResultRequest(Builder builder) {
        super(builder);
        this.dataId = builder.dataId;
        this.dataType = builder.dataType;
        this.scriptDebugId = builder.scriptDebugId;
        this.scriptRecordId = builder.scriptRecordId;
        this.scriptSnapshotId = builder.scriptSnapshotId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachDebugResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return scriptDebugId
     */
    public String getScriptDebugId() {
        return this.scriptDebugId;
    }

    /**
     * @return scriptRecordId
     */
    public String getScriptRecordId() {
        return this.scriptRecordId;
    }

    /**
     * @return scriptSnapshotId
     */
    public String getScriptSnapshotId() {
        return this.scriptSnapshotId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetAICoachDebugResultRequest, Builder> {
        private String dataId; 
        private String dataType; 
        private String scriptDebugId; 
        private String scriptRecordId; 
        private String scriptSnapshotId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAICoachDebugResultRequest request) {
            super(request);
            this.dataId = request.dataId;
            this.dataType = request.dataType;
            this.scriptDebugId = request.scriptDebugId;
            this.scriptRecordId = request.scriptRecordId;
            this.scriptSnapshotId = request.scriptSnapshotId;
            this.taskId = request.taskId;
        } 

        /**
         * dataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("dataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>debugId</p>
         * 
         * <strong>example:</strong>
         * <p>970378621365452802</p>
         */
        public Builder scriptDebugId(String scriptDebugId) {
            this.putQueryParameter("scriptDebugId", scriptDebugId);
            this.scriptDebugId = scriptDebugId;
            return this;
        }

        /**
         * scriptRecordId.
         */
        public Builder scriptRecordId(String scriptRecordId) {
            this.putQueryParameter("scriptRecordId", scriptRecordId);
            this.scriptRecordId = scriptRecordId;
            return this;
        }

        /**
         * scriptSnapshotId.
         */
        public Builder scriptSnapshotId(String scriptSnapshotId) {
            this.putQueryParameter("scriptSnapshotId", scriptSnapshotId);
            this.scriptSnapshotId = scriptSnapshotId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetAICoachDebugResultRequest build() {
            return new GetAICoachDebugResultRequest(this);
        } 

    } 

}
