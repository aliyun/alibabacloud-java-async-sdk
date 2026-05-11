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
 * {@link UpdateJobRecordDurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobRecordDurationRequest</p>
 */
public class UpdateJobRecordDurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobRecordDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobRecordDuration;

    private UpdateJobRecordDurationRequest(Builder builder) {
        super(builder);
        this.jobRecordDuration = builder.jobRecordDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobRecordDurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobRecordDuration
     */
    public Long getJobRecordDuration() {
        return this.jobRecordDuration;
    }

    public static final class Builder extends Request.Builder<UpdateJobRecordDurationRequest, Builder> {
        private Long jobRecordDuration; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRecordDurationRequest request) {
            super(request);
            this.jobRecordDuration = request.jobRecordDuration;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder jobRecordDuration(Long jobRecordDuration) {
            this.putQueryParameter("JobRecordDuration", jobRecordDuration);
            this.jobRecordDuration = jobRecordDuration;
            return this;
        }

        @Override
        public UpdateJobRecordDurationRequest build() {
            return new UpdateJobRecordDurationRequest(this);
        } 

    } 

}
