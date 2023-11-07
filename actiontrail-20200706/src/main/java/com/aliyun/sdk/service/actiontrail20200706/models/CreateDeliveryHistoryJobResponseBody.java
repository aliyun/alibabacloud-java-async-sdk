// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeliveryHistoryJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeliveryHistoryJobResponseBody</p>
 */
public class CreateDeliveryHistoryJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    private Integer jobId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDeliveryHistoryJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeliveryHistoryJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public Integer getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer jobId; 
        private String requestId; 

        /**
         * The ID of the historical event delivery task.
         */
        public Builder jobId(Integer jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDeliveryHistoryJobResponseBody build() {
            return new CreateDeliveryHistoryJobResponseBody(this);
        } 

    } 

}
