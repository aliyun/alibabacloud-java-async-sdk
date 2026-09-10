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
 * {@link GetDataCheckTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>GetDataCheckTaskConfigRequest</p>
 */
public class GetDataCheckTaskConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private GetDataCheckTaskConfigRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataCheckTaskConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetDataCheckTaskConfigRequest, Builder> {
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataCheckTaskConfigRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the data validation task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetDataCheckTaskConfigRequest build() {
            return new GetDataCheckTaskConfigRequest(this);
        } 

    } 

}
