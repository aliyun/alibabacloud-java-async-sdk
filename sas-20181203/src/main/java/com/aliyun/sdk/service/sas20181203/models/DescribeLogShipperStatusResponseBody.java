// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogShipperStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogShipperStatusResponseBody</p>
 */
public class DescribeLogShipperStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogShipperStatus")
    private LogShipperStatus logShipperStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The status information.
         */
        public Builder logShipperStatus(LogShipperStatus logShipperStatus) {
            this.logShipperStatus = logShipperStatus;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
        @com.aliyun.core.annotation.NameInMap("AuthStatus")
        private String authStatus;

        @com.aliyun.core.annotation.NameInMap("BuyStatus")
        private String buyStatus;

        @com.aliyun.core.annotation.NameInMap("EtlMetaVersion")
        private String etlMetaVersion;

        @com.aliyun.core.annotation.NameInMap("OpenStatus")
        private String openStatus;

        @com.aliyun.core.annotation.NameInMap("PostPaidOpenStatus")
        private String postPaidOpenStatus;

        @com.aliyun.core.annotation.NameInMap("PostPaidSupportStatus")
        private String postPaidSupportStatus;

        @com.aliyun.core.annotation.NameInMap("SlsProjectStatus")
        private String slsProjectStatus;

        @com.aliyun.core.annotation.NameInMap("SlsServiceStatus")
        private String slsServiceStatus;

        private LogShipperStatus(Builder builder) {
            this.authStatus = builder.authStatus;
            this.buyStatus = builder.buyStatus;
            this.etlMetaVersion = builder.etlMetaVersion;
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
         * @return etlMetaVersion
         */
        public String getEtlMetaVersion() {
            return this.etlMetaVersion;
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
            private String etlMetaVersion; 
            private String openStatus; 
            private String postPaidOpenStatus; 
            private String postPaidSupportStatus; 
            private String slsProjectStatus; 
            private String slsServiceStatus; 

            /**
             * Indicates whether Security Center is authorized to access Log Service. Valid values:
             * <p>
             * 
             * *   **yes**
             * *   **no**
             */
            public Builder authStatus(String authStatus) {
                this.authStatus = authStatus;
                return this;
            }

            /**
             * Indicates whether the log analysis feature is purchased. Valid values:
             * <p>
             * 
             * *   **yes**
             * *   **no**
             */
            public Builder buyStatus(String buyStatus) {
                this.buyStatus = buyStatus;
                return this;
            }

            /**
             * The version of the log analysis field. Valid values:
             * <p>
             * - SAS_V1
             * - SAS_V2
             */
            public Builder etlMetaVersion(String etlMetaVersion) {
                this.etlMetaVersion = etlMetaVersion;
                return this;
            }

            /**
             * The status of the log analysis feature. Valid values:
             * <p>
             * 
             * *   **yes**: enabled
             * *   **no**: disabled
             */
            public Builder openStatus(String openStatus) {
                this.openStatus = openStatus;
                return this;
            }

            /**
             * Indicates whether the pay-as-you-go billing method is used. Valid values:
             * <p>
             * 
             * *   **yes**
             * *   **no**
             */
            public Builder postPaidOpenStatus(String postPaidOpenStatus) {
                this.postPaidOpenStatus = postPaidOpenStatus;
                return this;
            }

            /**
             * Indicates whether the log analysis feature supports the pay-as-you-go billing method. Valid values:
             * <p>
             * 
             * *   **yes**
             * *   **no**
             */
            public Builder postPaidSupportStatus(String postPaidSupportStatus) {
                this.postPaidSupportStatus = postPaidSupportStatus;
                return this;
            }

            /**
             * The status of the dedicated Log Service project. Valid values:
             * <p>
             * 
             * *   **Normal**: normal
             * *   **Disable**: disabled
             */
            public Builder slsProjectStatus(String slsProjectStatus) {
                this.slsProjectStatus = slsProjectStatus;
                return this;
            }

            /**
             * Indicates whether Log Service is activated. Valid values:
             * <p>
             * 
             * *   **yes**
             * *   **no**
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
