// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryPreCheckDatabaseRequest} extends {@link RequestModel}
 *
 * <p>QueryPreCheckDatabaseRequest</p>
 */
public class QueryPreCheckDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceUuid")
    private String instanceUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The UUID of the agent that is used to back up the data of the database.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeUniBackupDatabase~~">DescribeUniBackupDatabase</a> operation to query the UUID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ebc895506c6911ed800000163e0e****</p>
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * <p>The ID of the database precheck task.</p>
         * <blockquote>
         * <p>You can call the <a href="~~StartPreCheckDatabase~~">StartPreCheckDatabase</a> operation to query the ID of the database precheck task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>t-000bc9nqwxsbyvod****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The region ID of the server that hosts the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
