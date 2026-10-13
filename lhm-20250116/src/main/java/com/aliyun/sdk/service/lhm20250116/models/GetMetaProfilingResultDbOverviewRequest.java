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
 * {@link GetMetaProfilingResultDbOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetMetaProfilingResultDbOverviewRequest</p>
 */
public class GetMetaProfilingResultDbOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isSummary")
    private String isSummary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetMetaProfilingResultDbOverviewRequest(Builder builder) {
        super(builder);
        this.isSummary = builder.isSummary;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaProfilingResultDbOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isSummary
     */
    public String getIsSummary() {
        return this.isSummary;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetMetaProfilingResultDbOverviewRequest, Builder> {
        private String isSummary; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaProfilingResultDbOverviewRequest request) {
            super(request);
            this.isSummary = request.isSummary;
            this.taskId = request.taskId;
        } 

        /**
         * <p>Specifies whether to return only summary data.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSummary(String isSummary) {
            this.putQueryParameter("isSummary", isSummary);
            this.isSummary = isSummary;
            return this;
        }

        /**
         * <p>The ID of the metadata profiling task. It is used to locate the profiling task for which you want to query the overview.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetMetaProfilingResultDbOverviewRequest build() {
            return new GetMetaProfilingResultDbOverviewRequest(this);
        } 

    } 

}
