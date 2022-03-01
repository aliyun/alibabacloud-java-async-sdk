// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScanTaskProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeScanTaskProgressRequest</p>
 */
public class DescribeScanTaskProgressRequest extends Request {
    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private DescribeScanTaskProgressRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanTaskProgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeScanTaskProgressRequest, Builder> {
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScanTaskProgressRequest response) {
            super(response);
            this.taskId = response.taskId;
        } 

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeScanTaskProgressRequest build() {
            return new DescribeScanTaskProgressRequest(this);
        } 

    } 

}
