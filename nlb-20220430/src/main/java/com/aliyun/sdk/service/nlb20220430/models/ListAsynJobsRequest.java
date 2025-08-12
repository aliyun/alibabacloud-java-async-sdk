// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link ListAsynJobsRequest} extends {@link RequestModel}
 *
 * <p>ListAsynJobsRequest</p>
 */
public class ListAsynJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private java.util.List<String> jobIds;

    private ListAsynJobsRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsynJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobIds
     */
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<ListAsynJobsRequest, Builder> {
        private java.util.List<String> jobIds; 

        private Builder() {
            super();
        } 

        private Builder(ListAsynJobsRequest request) {
            super(request);
            this.jobIds = request.jobIds;
        } 

        /**
         * <p>The task IDs.</p>
         */
        public Builder jobIds(java.util.List<String> jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public ListAsynJobsRequest build() {
            return new ListAsynJobsRequest(this);
        } 

    } 

}
