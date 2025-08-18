// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link CreateDeliveryHistoryJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeliveryHistoryJobResponseBody</p>
 */
public class CreateDeliveryHistoryJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private Integer jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDeliveryHistoryJobResponseBody model) {
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the historical event delivery task.</p>
         * 
         * <strong>example:</strong>
         * <p>16602</p>
         */
        public Builder jobId(Integer jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9D356A34-D5A9-41CD-9915-837B7F9D8722</p>
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
