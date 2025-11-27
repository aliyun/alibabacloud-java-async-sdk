// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link DeleteJobRecordsRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobRecordsRequest</p>
 */
public class DeleteJobRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private java.util.List<String> jobIds;

    private DeleteJobRecordsRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobRecordsRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteJobRecordsRequest, Builder> {
        private java.util.List<String> jobIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobRecordsRequest request) {
            super(request);
            this.jobIds = request.jobIds;
        } 

        /**
         * <p>The list of job IDs.</p>
         */
        public Builder jobIds(java.util.List<String> jobIds) {
            String jobIdsShrink = shrink(jobIds, "JobIds", "json");
            this.putQueryParameter("JobIds", jobIdsShrink);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public DeleteJobRecordsRequest build() {
            return new DeleteJobRecordsRequest(this);
        } 

    } 

}
