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
 * {@link GetJobRecordDurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobRecordDurationResponseBody</p>
 */
public class GetJobRecordDurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobRecordDuration")
    private Long jobRecordDuration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetJobRecordDurationResponseBody(Builder builder) {
        this.jobRecordDuration = builder.jobRecordDuration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobRecordDurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobRecordDuration
     */
    public Long getJobRecordDuration() {
        return this.jobRecordDuration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long jobRecordDuration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetJobRecordDurationResponseBody model) {
            this.jobRecordDuration = model.jobRecordDuration;
            this.requestId = model.requestId;
        } 

        /**
         * JobRecordDuration.
         */
        public Builder jobRecordDuration(Long jobRecordDuration) {
            this.jobRecordDuration = jobRecordDuration;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobRecordDurationResponseBody build() {
            return new GetJobRecordDurationResponseBody(this);
        } 

    } 

}
