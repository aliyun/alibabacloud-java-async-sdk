// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhoneNumberAnalysisTransparentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberAnalysisTransparentResponseBody</p>
 */
public class DescribePhoneNumberAnalysisTransparentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePhoneNumberAnalysisTransparentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberAnalysisTransparentResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneNumberAnalysisTransparentResponseBody build() {
            return new DescribePhoneNumberAnalysisTransparentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Device_risk")
        private String deviceRisk;

        @NameInMap("Ip_risk")
        private String ipRisk;

        @NameInMap("Score1")
        private String score1;

        @NameInMap("Score2")
        private String score2;

        @NameInMap("Score3")
        private String score3;

        private Data(Builder builder) {
            this.deviceRisk = builder.deviceRisk;
            this.ipRisk = builder.ipRisk;
            this.score1 = builder.score1;
            this.score2 = builder.score2;
            this.score3 = builder.score3;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceRisk
         */
        public String getDeviceRisk() {
            return this.deviceRisk;
        }

        /**
         * @return ipRisk
         */
        public String getIpRisk() {
            return this.ipRisk;
        }

        /**
         * @return score1
         */
        public String getScore1() {
            return this.score1;
        }

        /**
         * @return score2
         */
        public String getScore2() {
            return this.score2;
        }

        /**
         * @return score3
         */
        public String getScore3() {
            return this.score3;
        }

        public static final class Builder {
            private String deviceRisk; 
            private String ipRisk; 
            private String score1; 
            private String score2; 
            private String score3; 

            /**
             * Device_risk.
             */
            public Builder deviceRisk(String deviceRisk) {
                this.deviceRisk = deviceRisk;
                return this;
            }

            /**
             * Ip_risk.
             */
            public Builder ipRisk(String ipRisk) {
                this.ipRisk = ipRisk;
                return this;
            }

            /**
             * Score1.
             */
            public Builder score1(String score1) {
                this.score1 = score1;
                return this;
            }

            /**
             * Score2.
             */
            public Builder score2(String score2) {
                this.score2 = score2;
                return this;
            }

            /**
             * Score3.
             */
            public Builder score3(String score3) {
                this.score3 = score3;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
