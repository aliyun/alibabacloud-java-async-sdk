// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPreCheckDatabaseRequest} extends {@link RequestModel}
 *
 * <p>QueryPreCheckDatabaseRequest</p>
 */
public class QueryPreCheckDatabaseRequest extends Request {
    @Query
    @NameInMap("InstanceUuid")
    private String instanceUuid;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("UniRegionId")
    @Validation(required = true)
    private String uniRegionId;

    private QueryPreCheckDatabaseRequest(Builder builder) {
        super(builder);
        this.instanceUuid = builder.instanceUuid;
        this.taskId = builder.taskId;
        this.uniRegionId = builder.uniRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPreCheckDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return uniRegionId
     */
    public String getUniRegionId() {
        return this.uniRegionId;
    }

    public static final class Builder extends Request.Builder<QueryPreCheckDatabaseRequest, Builder> {
        private String instanceUuid; 
        private String taskId; 
        private String uniRegionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPreCheckDatabaseRequest request) {
            super(request);
            this.instanceUuid = request.instanceUuid;
            this.taskId = request.taskId;
            this.uniRegionId = request.uniRegionId;
        } 

        /**
         * InstanceUuid.
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * UniRegionId.
         */
        public Builder uniRegionId(String uniRegionId) {
            this.putQueryParameter("UniRegionId", uniRegionId);
            this.uniRegionId = uniRegionId;
            return this;
        }

        @Override
        public QueryPreCheckDatabaseRequest build() {
            return new QueryPreCheckDatabaseRequest(this);
        } 

    } 

}
