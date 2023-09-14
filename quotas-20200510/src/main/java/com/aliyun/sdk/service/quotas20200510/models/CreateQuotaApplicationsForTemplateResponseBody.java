// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQuotaApplicationsForTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQuotaApplicationsForTemplateResponseBody</p>
 */
public class CreateQuotaApplicationsForTemplateResponseBody extends TeaModel {
    @NameInMap("AliyunUids")
    private java.util.List < String > aliyunUids;

    @NameInMap("BatchQuotaApplicationId")
    private String batchQuotaApplicationId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateQuotaApplicationsForTemplateResponseBody(Builder builder) {
        this.aliyunUids = builder.aliyunUids;
        this.batchQuotaApplicationId = builder.batchQuotaApplicationId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > aliyunUids; 
        private String batchQuotaApplicationId; 
        private String requestId; 

        /**
         * AliyunUids.
         */
        public Builder aliyunUids(java.util.List < String > aliyunUids) {
            this.aliyunUids = aliyunUids;
            return this;
        }

        /**
         * BatchQuotaApplicationId.
         */
        public Builder batchQuotaApplicationId(String batchQuotaApplicationId) {
            this.batchQuotaApplicationId = batchQuotaApplicationId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateQuotaApplicationsForTemplateResponseBody build() {
            return new CreateQuotaApplicationsForTemplateResponseBody(this);
        } 

    } 

}
