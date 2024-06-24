// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQuotaApplicationsForTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQuotaApplicationsForTemplateResponseBody</p>
 */
public class CreateQuotaApplicationsForTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunUids")
    private java.util.List < String > aliyunUids;

    @com.aliyun.core.annotation.NameInMap("BatchQuotaApplicationId")
    private String batchQuotaApplicationId;

    @com.aliyun.core.annotation.NameInMap("FailResults")
    private java.util.List < FailResults> failResults;

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

    /**
     * @return aliyunUids
     */
    public java.util.List < String > getAliyunUids() {
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
    public java.util.List < FailResults> getFailResults() {
        return this.failResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > aliyunUids; 
        private String batchQuotaApplicationId; 
        private java.util.List < FailResults> failResults; 
        private String requestId; 

        /**
         * The Alibaba Cloud accounts for which the quotas are applied.
         */
        public Builder aliyunUids(java.util.List < String > aliyunUids) {
            this.aliyunUids = aliyunUids;
            return this;
        }

        /**
         * The ID of the quota application batch.
         */
        public Builder batchQuotaApplicationId(String batchQuotaApplicationId) {
            this.batchQuotaApplicationId = batchQuotaApplicationId;
            return this;
        }

        /**
         * The Alibaba Cloud accounts of the members in a resource directory whose quota increase request is rejected, and the reason for the rejection.
         */
        public Builder failResults(java.util.List < FailResults> failResults) {
            this.failResults = failResults;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateQuotaApplicationsForTemplateResponseBody build() {
            return new CreateQuotaApplicationsForTemplateResponseBody(this);
        } 

    } 

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

            /**
             * The Alibaba Cloud account of the members in a resource directory whose quota increase request is rejected.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The reason for the rejection.
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
