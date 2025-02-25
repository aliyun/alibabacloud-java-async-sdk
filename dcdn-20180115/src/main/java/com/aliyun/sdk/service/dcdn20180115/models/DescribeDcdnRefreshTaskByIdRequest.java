// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnRefreshTaskByIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnRefreshTaskByIdRequest</p>
 */
public class DescribeDcdnRefreshTaskByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private DescribeDcdnRefreshTaskByIdRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnRefreshTaskByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnRefreshTaskByIdRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnRefreshTaskByIdRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the task that you want to query. The following signature algorithms require different message digest algorithms:</p>
         * <ul>
         * <li>Perform the <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a> operation to query refresh task IDs.</li>
         * <li>Perform the <a href="https://help.aliyun.com/document_detail/130636.html">PreloadDcdnObjectCaches</a> operation to query prefetch task IDs.</li>
         * </ul>
         * <blockquote>
         * <p>You can specify at most 10 task IDs in each call. Separate IDs with commas (,).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>113681**</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeDcdnRefreshTaskByIdRequest build() {
            return new DescribeDcdnRefreshTaskByIdRequest(this);
        } 

    } 

}
