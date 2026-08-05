// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link StartOfflineTaskRequest} extends {@link RequestModel}
 *
 * <p>StartOfflineTaskRequest</p>
 */
public class StartOfflineTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parallelism")
    private Integer parallelism;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private StartOfflineTaskRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.type = builder.type;
        this.taskName = builder.taskName;
        this.parallelism = builder.parallelism;
        this.timestamp = builder.timestamp;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartOfflineTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return parallelism
     */
    public Integer getParallelism() {
        return this.parallelism;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartOfflineTaskRequest, Builder> {
        private String workspaceName; 
        private String type; 
        private String taskName; 
        private Integer parallelism; 
        private Long timestamp; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartOfflineTaskRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.type = request.type;
            this.taskName = request.taskName;
            this.parallelism = request.parallelism;
            this.timestamp = request.timestamp;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putPathParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * parallelism.
         */
        public Builder parallelism(Integer parallelism) {
            this.putBodyParameter("parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.putBodyParameter("timestamp", timestamp);
            this.timestamp = timestamp;
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
        public StartOfflineTaskRequest build() {
            return new StartOfflineTaskRequest(this);
        } 

    } 

}
