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
 * {@link CreateSqlExecJobRequest} extends {@link RequestModel}
 *
 * <p>CreateSqlExecJobRequest</p>
 */
public class CreateSqlExecJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("concurrency")
    private Integer concurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private CreateSqlExecJobRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlExecJobRequest create() {
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
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CreateSqlExecJobRequest, Builder> {
        private Integer concurrency; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSqlExecJobRequest request) {
            super(request);
            this.concurrency = request.concurrency;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The concurrency level. This is an optional parameter.</p>
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
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CreateSqlExecJobRequest build() {
            return new CreateSqlExecJobRequest(this);
        } 

    } 

}
