// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotStatisticsResponseBody</p>
 */
public class GetHoneypotStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetHoneypotStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHoneypotStatisticsResponseBody create() {
        return builder().build();
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code that is returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The honeypot usage statistics.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHoneypotStatisticsResponseBody build() {
            return new GetHoneypotStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalHoneypotCount")
        private Integer totalHoneypotCount;

        @com.aliyun.core.annotation.NameInMap("TotalNodeStatus")
        private Integer totalNodeStatus;

        @com.aliyun.core.annotation.NameInMap("TotalProbeCount")
        private Integer totalProbeCount;

        @com.aliyun.core.annotation.NameInMap("UsedHoneypotCount")
        private Integer usedHoneypotCount;

        @com.aliyun.core.annotation.NameInMap("UsedHostProbeCount")
        private Integer usedHostProbeCount;

        @com.aliyun.core.annotation.NameInMap("UsedProbeCount")
        private Integer usedProbeCount;

        @com.aliyun.core.annotation.NameInMap("UsedVpcProbeCount")
        private Integer usedVpcProbeCount;

        private Data(Builder builder) {
            this.totalHoneypotCount = builder.totalHoneypotCount;
            this.totalNodeStatus = builder.totalNodeStatus;
            this.totalProbeCount = builder.totalProbeCount;
            this.usedHoneypotCount = builder.usedHoneypotCount;
            this.usedHostProbeCount = builder.usedHostProbeCount;
            this.usedProbeCount = builder.usedProbeCount;
            this.usedVpcProbeCount = builder.usedVpcProbeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return totalHoneypotCount
         */
        public Integer getTotalHoneypotCount() {
            return this.totalHoneypotCount;
        }

        /**
         * @return totalNodeStatus
         */
        public Integer getTotalNodeStatus() {
            return this.totalNodeStatus;
        }

        /**
         * @return totalProbeCount
         */
        public Integer getTotalProbeCount() {
            return this.totalProbeCount;
        }

        /**
         * @return usedHoneypotCount
         */
        public Integer getUsedHoneypotCount() {
            return this.usedHoneypotCount;
        }

        /**
         * @return usedHostProbeCount
         */
        public Integer getUsedHostProbeCount() {
            return this.usedHostProbeCount;
        }

        /**
         * @return usedProbeCount
         */
        public Integer getUsedProbeCount() {
            return this.usedProbeCount;
        }

        /**
         * @return usedVpcProbeCount
         */
        public Integer getUsedVpcProbeCount() {
            return this.usedVpcProbeCount;
        }

        public static final class Builder {
            private Integer totalHoneypotCount; 
            private Integer totalNodeStatus; 
            private Integer totalProbeCount; 
            private Integer usedHoneypotCount; 
            private Integer usedHostProbeCount; 
            private Integer usedProbeCount; 
            private Integer usedVpcProbeCount; 

            /**
             * The total number of honeypots.
             */
            public Builder totalHoneypotCount(Integer totalHoneypotCount) {
                this.totalHoneypotCount = totalHoneypotCount;
                return this;
            }

            /**
             * The health status of the management node. Valid values:
             * <p>
             * 
             * *   1: normal
             * *   2: abnormal
             */
            public Builder totalNodeStatus(Integer totalNodeStatus) {
                this.totalNodeStatus = totalNodeStatus;
                return this;
            }

            /**
             * The total number of authorized probes.
             */
            public Builder totalProbeCount(Integer totalProbeCount) {
                this.totalProbeCount = totalProbeCount;
                return this;
            }

            /**
             * The number of deployed honeypots.
             */
            public Builder usedHoneypotCount(Integer usedHoneypotCount) {
                this.usedHoneypotCount = usedHoneypotCount;
                return this;
            }

            /**
             * The number of deployed host probes.
             */
            public Builder usedHostProbeCount(Integer usedHostProbeCount) {
                this.usedHostProbeCount = usedHostProbeCount;
                return this;
            }

            /**
             * The number of deployed probes.
             */
            public Builder usedProbeCount(Integer usedProbeCount) {
                this.usedProbeCount = usedProbeCount;
                return this;
            }

            /**
             * The number of deployed VPC probes.
             */
            public Builder usedVpcProbeCount(Integer usedVpcProbeCount) {
                this.usedVpcProbeCount = usedVpcProbeCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
