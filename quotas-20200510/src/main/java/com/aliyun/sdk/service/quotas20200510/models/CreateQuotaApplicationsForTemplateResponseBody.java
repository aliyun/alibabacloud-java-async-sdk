// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link CreateQuotaApplicationsForTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQuotaApplicationsForTemplateResponseBody</p>
 */
public class CreateQuotaApplicationsForTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunUids")
    private java.util.List<String> aliyunUids;

    @com.aliyun.core.annotation.NameInMap("BatchQuotaApplicationId")
    private String batchQuotaApplicationId;

    @com.aliyun.core.annotation.NameInMap("FailResults")
    private java.util.List<FailResults> failResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateQuotaApplicationsForTemplateResponseBody(Builder builder) {
        this.aliyunUids = builder.aliyunUids;
        this.batchQuotaApplicationId = builder.batchQuotaApplicationId;
        this.failResults = builder.failResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQuotaApplicationsForTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunUids
     */
    public java.util.List<String> getAliyunUids() {
        return this.aliyunUids;
    }

    /**
     * @return batchQuotaApplicationId
     */
    public String getBatchQuotaApplicationId() {
        return this.batchQuotaApplicationId;
    }

    /**
     * @return failResults
     */
    public java.util.List<FailResults> getFailResults() {
        return this.failResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> aliyunUids; 
        private String batchQuotaApplicationId; 
        private java.util.List<FailResults> failResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateQuotaApplicationsForTemplateResponseBody model) {
            this.aliyunUids = model.aliyunUids;
            this.batchQuotaApplicationId = model.batchQuotaApplicationId;
            this.failResults = model.failResults;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of Alibaba Cloud accounts that belong to the resource directory members for which quotas are applied.</p>
         */
        public Builder aliyunUids(java.util.List<String> aliyunUids) {
            this.aliyunUids = aliyunUids;
            return this;
        }

        /**
         * <p>The batch ID of the quota application.</p>
         * 
         * <strong>example:</strong>
         * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
         */
        public Builder batchQuotaApplicationId(String batchQuotaApplicationId) {
            this.batchQuotaApplicationId = batchQuotaApplicationId;
            return this;
        }

        /**
         * <p>The list of Alibaba Cloud accounts that belong to the resource directory members for which quota applications failed and the reasons for the failures.</p>
         */
        public Builder failResults(java.util.List<FailResults> failResults) {
            this.failResults = failResults;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FF8CAF0-29D9-4F11-B6A4-FD2CBCA016D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateQuotaApplicationsForTemplateResponseBody build() {
            return new CreateQuotaApplicationsForTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateQuotaApplicationsForTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>CreateQuotaApplicationsForTemplateResponseBody</p>
     */
    public static class FailResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private FailResults(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailResults create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String reason; 

            private Builder() {
            } 

            private Builder(FailResults model) {
                this.aliyunUid = model.aliyunUid;
                this.reason = model.reason;
            } 

            /**
             * <p>The Alibaba Cloud account that belongs to the resource directory member for which the quota application failed.</p>
             * 
             * <strong>example:</strong>
             * <p>135048337611****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The reason for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>The quota adjustment application is being processed. Please try again later.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public FailResults build() {
                return new FailResults(this);
            } 

        } 

    }
}
