// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMultiAccountCarbonTrackResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMultiAccountCarbonTrackResponseBody</p>
 */
public class QueryMultiAccountCarbonTrackResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryMultiAccountCarbonTrackResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMultiAccountCarbonTrackResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMultiAccountCarbonTrackResponseBody build() {
            return new QueryMultiAccountCarbonTrackResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CarbonActualEmission")
        private String carbonActualEmission;

        @NameInMap("Month")
        private String month;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Region")
        private String region;

        @NameInMap("Uid")
        private String uid;

        private Data(Builder builder) {
            this.carbonActualEmission = builder.carbonActualEmission;
            this.month = builder.month;
            this.productCode = builder.productCode;
            this.region = builder.region;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carbonActualEmission
         */
        public String getCarbonActualEmission() {
            return this.carbonActualEmission;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String carbonActualEmission; 
            private String month; 
            private String productCode; 
            private String region; 
            private String uid; 

            /**
             * CarbonActualEmission.
             */
            public Builder carbonActualEmission(String carbonActualEmission) {
                this.carbonActualEmission = carbonActualEmission;
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
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
