// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link EditTaskPopRequest} extends {@link RequestModel}
 *
 * <p>EditTaskPopRequest</p>
 */
public class EditTaskPopRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("concurrency")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer concurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dqlTestDatasourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dqlTestDatasourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceDialect")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetDialect")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDialect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskType;

    private EditTaskPopRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.dqlTestDatasourceName = builder.dqlTestDatasourceName;
        this.sourceDialect = builder.sourceDialect;
        this.targetDialect = builder.targetDialect;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditTaskPopRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrency
     */
    public Integer getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return dqlTestDatasourceName
     */
    public String getDqlTestDatasourceName() {
        return this.dqlTestDatasourceName;
    }

    /**
     * @return sourceDialect
     */
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    /**
     * @return targetDialect
     */
    public String getTargetDialect() {
        return this.targetDialect;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<EditTaskPopRequest, Builder> {
        private Integer concurrency; 
        private String dqlTestDatasourceName; 
        private String sourceDialect; 
        private String targetDialect; 
        private Long taskId; 
        private String taskName; 
        private Integer taskType; 

        private Builder() {
            super();
        } 

        private Builder(EditTaskPopRequest request) {
            super(request);
            this.concurrency = request.concurrency;
            this.dqlTestDatasourceName = request.dqlTestDatasourceName;
            this.sourceDialect = request.sourceDialect;
            this.targetDialect = request.targetDialect;
            this.taskId = request.taskId;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The concurrency for controlling the number of concurrent conversion executions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder concurrency(Integer concurrency) {
            this.putBodyParameter("concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>The name of the test data source associated with a DQL task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hive_test_ds</p>
         */
        public Builder dqlTestDatasourceName(String dqlTestDatasourceName) {
            this.putBodyParameter("dqlTestDatasourceName", dqlTestDatasourceName);
            this.dqlTestDatasourceName = dqlTestDatasourceName;
            return this;
        }

        /**
         * <p>The source SQL dialect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder sourceDialect(String sourceDialect) {
            this.putBodyParameter("sourceDialect", sourceDialect);
            this.sourceDialect = sourceDialect;
            return this;
        }

        /**
         * <p>The target SQL dialect.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder targetDialect(String targetDialect) {
            this.putBodyParameter("targetDialect", targetDialect);
            this.targetDialect = targetDialect;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>data_check_task_demo</p>
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>1: DDL</li>
         * <li>2: DQL</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskType(Integer taskType) {
            this.putBodyParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public EditTaskPopRequest build() {
            return new EditTaskPopRequest(this);
        } 

    } 

}
