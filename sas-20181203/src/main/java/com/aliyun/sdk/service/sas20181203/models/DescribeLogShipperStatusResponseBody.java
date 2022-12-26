// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogShipperStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogShipperStatusResponseBody</p>
 */
public class DescribeLogShipperStatusResponseBody extends TeaModel {
    @NameInMap("LogShipperStatus")
    private LogShipperStatus logShipperStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLogShipperStatusResponseBody(Builder builder) {
        this.logShipperStatus = builder.logShipperStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogShipperStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return logShipperStatus
     */
    public LogShipperStatus getLogShipperStatus() {
        return this.logShipperStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LogShipperStatus logShipperStatus; 
        private String requestId; 

        /**
         * LogShipperStatus.
         */
        public Builder logShipperStatus(LogShipperStatus logShipperStatus) {
            this.logShipperStatus = logShipperStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogShipperStatusResponseBody build() {
            return new DescribeLogShipperStatusResponseBody(this);
        } 

    } 

    public static class LogShipperStatus extends TeaModel {
        @NameInMap("AuthStatus")
        private String authStatus;

        @NameInMap("BuyStatus")
        private String buyStatus;

        @NameInMap("OpenStatus")
        private String openStatus;

        @NameInMap("PostPaidOpenStatus")
        private String postPaidOpenStatus;

        @NameInMap("PostPaidSupportStatus")
        private String postPaidSupportStatus;

        @NameInMap("SlsProjectStatus")
        private String slsProjectStatus;

        @NameInMap("SlsServiceStatus")
        private String slsServiceStatus;

        private LogShipperStatus(Builder builder) {
            this.authStatus = builder.authStatus;
            this.buyStatus = builder.buyStatus;
            this.openStatus = builder.openStatus;
            this.postPaidOpenStatus = builder.postPaidOpenStatus;
            this.postPaidSupportStatus = builder.postPaidSupportStatus;
            this.slsProjectStatus = builder.slsProjectStatus;
            this.slsServiceStatus = builder.slsServiceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogShipperStatus create() {
            return builder().build();
        }

        /**
         * @return authStatus
         */
        public String getAuthStatus() {
            return this.authStatus;
        }

        /**
         * @return buyStatus
         */
        public String getBuyStatus() {
            return this.buyStatus;
        }

        /**
         * @return openStatus
         */
        public String getOpenStatus() {
            return this.openStatus;
        }

        /**
         * @return postPaidOpenStatus
         */
        public String getPostPaidOpenStatus() {
            return this.postPaidOpenStatus;
        }

        /**
         * @return postPaidSupportStatus
         */
        public String getPostPaidSupportStatus() {
            return this.postPaidSupportStatus;
        }

        /**
         * @return slsProjectStatus
         */
        public String getSlsProjectStatus() {
            return this.slsProjectStatus;
        }

        /**
         * @return slsServiceStatus
         */
        public String getSlsServiceStatus() {
            return this.slsServiceStatus;
        }

        public static final class Builder {
            private String authStatus; 
            private String buyStatus; 
            private String openStatus; 
            private String postPaidOpenStatus; 
            private String postPaidSupportStatus; 
            private String slsProjectStatus; 
            private String slsServiceStatus; 

            /**
             * AuthStatus.
             */
            public Builder authStatus(String authStatus) {
                this.authStatus = authStatus;
                return this;
            }

            /**
             * BuyStatus.
             */
            public Builder buyStatus(String buyStatus) {
                this.buyStatus = buyStatus;
                return this;
            }

            /**
             * OpenStatus.
             */
            public Builder openStatus(String openStatus) {
                this.openStatus = openStatus;
                return this;
            }

            /**
             * PostPaidOpenStatus.
             */
            public Builder postPaidOpenStatus(String postPaidOpenStatus) {
                this.postPaidOpenStatus = postPaidOpenStatus;
                return this;
            }

            /**
             * PostPaidSupportStatus.
             */
            public Builder postPaidSupportStatus(String postPaidSupportStatus) {
                this.postPaidSupportStatus = postPaidSupportStatus;
                return this;
            }

            /**
             * SlsProjectStatus.
             */
            public Builder slsProjectStatus(String slsProjectStatus) {
                this.slsProjectStatus = slsProjectStatus;
                return this;
            }

            /**
             * SlsServiceStatus.
             */
            public Builder slsServiceStatus(String slsServiceStatus) {
                this.slsServiceStatus = slsServiceStatus;
                return this;
            }

            public LogShipperStatus build() {
                return new LogShipperStatus(this);
            } 

        } 

    }
}
