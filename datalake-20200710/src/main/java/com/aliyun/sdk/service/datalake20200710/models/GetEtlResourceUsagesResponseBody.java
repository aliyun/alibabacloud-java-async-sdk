// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEtlResourceUsagesResponseBody} extends {@link TeaModel}
 *
 * <p>GetEtlResourceUsagesResponseBody</p>
 */
public class GetEtlResourceUsagesResponseBody extends TeaModel {
    @NameInMap("EtlResourceUsages")
    private java.util.List < EtlResourceUsages> etlResourceUsages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private String totalCount;

    private GetEtlResourceUsagesResponseBody(Builder builder) {
        this.etlResourceUsages = builder.etlResourceUsages;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEtlResourceUsagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return etlResourceUsages
     */
    public java.util.List < EtlResourceUsages> getEtlResourceUsages() {
        return this.etlResourceUsages;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < EtlResourceUsages> etlResourceUsages; 
        private String requestId; 
        private Boolean success; 
        private String totalCount; 

        /**
         * EtlResourceUsages.
         */
        public Builder etlResourceUsages(java.util.List < EtlResourceUsages> etlResourceUsages) {
            this.etlResourceUsages = etlResourceUsages;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetEtlResourceUsagesResponseBody build() {
            return new GetEtlResourceUsagesResponseBody(this);
        } 

    } 

    public static class EtlResourceUsages extends TeaModel {
        @NameInMap("CuUsage")
        private Long cuUsage;

        @NameInMap("Month")
        private String month;

        @NameInMap("QueryTime")
        private String queryTime;

        private EtlResourceUsages(Builder builder) {
            this.cuUsage = builder.cuUsage;
            this.month = builder.month;
            this.queryTime = builder.queryTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EtlResourceUsages create() {
            return builder().build();
        }

        /**
         * @return cuUsage
         */
        public Long getCuUsage() {
            return this.cuUsage;
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
            private Long cuUsage; 
            private String month; 
            private String queryTime; 

            /**
             * CuUsage.
             */
            public Builder cuUsage(Long cuUsage) {
                this.cuUsage = cuUsage;
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

            public EtlResourceUsages build() {
                return new EtlResourceUsages(this);
            } 

        } 

    }
}
