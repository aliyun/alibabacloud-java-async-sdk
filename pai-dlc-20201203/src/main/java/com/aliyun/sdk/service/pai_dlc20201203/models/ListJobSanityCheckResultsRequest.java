// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListJobSanityCheckResultsRequest} extends {@link RequestModel}
 *
 * <p>ListJobSanityCheckResultsRequest</p>
 */
public class ListJobSanityCheckResultsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    private ListJobSanityCheckResultsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.order = builder.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobSanityCheckResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    public static final class Builder extends Request.Builder<ListJobSanityCheckResultsRequest, Builder> {
        private String jobId; 
        private String order; 

        private Builder() {
            super();
        } 

        private Builder(ListJobSanityCheckResultsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.order = request.order;
        } 

        /**
         * <p>The job ID. Call <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a> to get the job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210114104214-xxxx</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The sorting order:</p>
         * <ul>
         * <li>desc: descending order</li>
         * <li>asc: ascending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        @Override
        public ListJobSanityCheckResultsRequest build() {
            return new ListJobSanityCheckResultsRequest(this);
        } 

    } 

}
