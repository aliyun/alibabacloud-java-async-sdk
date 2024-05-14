// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQueryOptimizeTagRequest} extends {@link RequestModel}
 *
 * <p>CreateQueryOptimizeTagRequest</p>
 */
public class CreateQueryOptimizeTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tags;

    private CreateQueryOptimizeTagRequest(Builder builder) {
        super(builder);
        this.comments = builder.comments;
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.sqlIds = builder.sqlIds;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQueryOptimizeTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sqlIds
     */
    public String getSqlIds() {
        return this.sqlIds;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateQueryOptimizeTagRequest, Builder> {
        private String comments; 
        private String engine; 
        private String instanceId; 
        private String sqlIds; 
        private Integer status; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateQueryOptimizeTagRequest request) {
            super(request);
            this.comments = request.comments;
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.sqlIds = request.sqlIds;
            this.status = request.status;
            this.tags = request.tags;
        } 

        /**
         * The remarks.
         * <p>
         * 
         * The remarks can be 1 to 300 characters in length.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * The database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**: ApsaraDB RDS for MySQL
         * *   **PolarDBMySQL**: PolarDB for MySQL
         * *   **PostgreSQL**: ApsaraDB RDS for PostgreSQL
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The SQL template IDs. You can call the [GetQueryOptimizeExecErrorStats](~~405261~~) operation to obtain the SQL template ID. Separate multiple SQL template IDs with commas (,).
         */
        public Builder sqlIds(String sqlIds) {
            this.putQueryParameter("SqlIds", sqlIds);
            this.sqlIds = sqlIds;
            return this;
        }

        /**
         * The status of **Tags**. Valid values:
         * <p>
         * 
         * *   **0**: removes all tags added to the SQL templates that are specified by **SqlIds** and leaves **Tags** empty.
         * *   **1**: adds the tags specified by **Tags** to the SQL templates that are specified by **SqlIds**.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The SQL tags. Separate multiple SQL tags with commas (,). Valid values:
         * <p>
         * 
         * *   **DAS_IMPORTANT**: The SQL template is important.
         * *   **DAS_NOT_IMPORTANT**: The SQL template is unimportant.
         * *   **USER_IGNORE**: The scheduling of the SQL template does not need to be optimized.
         * *   **DAS_IN_PLAN**: The scheduling of the SQL template needs to be optimized.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateQueryOptimizeTagRequest build() {
            return new CreateQueryOptimizeTagRequest(this);
        } 

    } 

}
