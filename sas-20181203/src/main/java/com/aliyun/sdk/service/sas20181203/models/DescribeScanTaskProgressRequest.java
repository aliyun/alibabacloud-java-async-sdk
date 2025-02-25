// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeScanTaskProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeScanTaskProgressRequest</p>
 */
public class DescribeScanTaskProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DescribeScanTaskProgressRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the virus scan task.</p>
         * <blockquote>
         * <p> You can call the <a href="~~StartVirusScanTask~~">StartVirusScanTask</a> operation to query the IDs of virus scan tasks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>282832</p>
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
