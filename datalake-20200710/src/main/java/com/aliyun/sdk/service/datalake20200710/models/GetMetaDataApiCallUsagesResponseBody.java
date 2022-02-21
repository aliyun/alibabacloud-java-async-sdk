// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaDataApiCallUsagesResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaDataApiCallUsagesResponseBody</p>
 */
public class GetMetaDataApiCallUsagesResponseBody extends TeaModel {
    @NameInMap("MetaDataApiCallUsages")
    private java.util.List < MetaDataApiCallUsages> metaDataApiCallUsages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GetMetaDataApiCallUsagesResponseBody(Builder builder) {
        this.metaDataApiCallUsages = builder.metaDataApiCallUsages;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaDataApiCallUsagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return metaDataApiCallUsages
     */
    public java.util.List < MetaDataApiCallUsages> getMetaDataApiCallUsages() {
        return this.metaDataApiCallUsages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < MetaDataApiCallUsages> metaDataApiCallUsages; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * MetaDataApiCallUsages.
         */
        public Builder metaDataApiCallUsages(java.util.List < MetaDataApiCallUsages> metaDataApiCallUsages) {
            this.metaDataApiCallUsages = metaDataApiCallUsages;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetMetaDataApiCallUsagesResponseBody build() {
            return new GetMetaDataApiCallUsagesResponseBody(this);
        } 

    } 

    public static class MetaDataApiCallUsages extends TeaModel {
        @NameInMap("ApiCall")
        private Long apiCall;

        @NameInMap("Month")
        private String month;

        @NameInMap("QueryTime")
        private String queryTime;

        private MetaDataApiCallUsages(Builder builder) {
            this.apiCall = builder.apiCall;
            this.month = builder.month;
            this.queryTime = builder.queryTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaDataApiCallUsages create() {
            return builder().build();
        }

        /**
         * @return apiCall
         */
        public Long getApiCall() {
            return this.apiCall;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        public static final class Builder {
            private Long apiCall; 
            private String month; 
            private String queryTime; 

            /**
             * ApiCall.
             */
            public Builder apiCall(Long apiCall) {
                this.apiCall = apiCall;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(String month) {
                this.month = month;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            public MetaDataApiCallUsages build() {
                return new MetaDataApiCallUsages(this);
            } 

        } 

    }
}
