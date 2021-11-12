// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeScanTaskProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeScanTaskProgressRequest</p>
 */
public class DescribeScanTaskProgressRequest extends Request {
    @Query
    @NameInMap("TaskId")
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

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder {
        private Long taskId; 

        /**
         * <p>TaskId.</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        public DescribeScanTaskProgressRequest build() {
            return new DescribeScanTaskProgressRequest(this);
        } 

    } 

}
