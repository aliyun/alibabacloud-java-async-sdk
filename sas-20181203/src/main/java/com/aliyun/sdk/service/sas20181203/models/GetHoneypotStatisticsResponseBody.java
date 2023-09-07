// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotStatisticsResponseBody</p>
 */
public class GetHoneypotStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
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
        @NameInMap("TotalHoneypotCount")
        private Integer totalHoneypotCount;

        @NameInMap("TotalNodeStatus")
        private Integer totalNodeStatus;

        @NameInMap("TotalProbeCount")
        private Integer totalProbeCount;

        @NameInMap("UsedHoneypotCount")
        private Integer usedHoneypotCount;

        @NameInMap("UsedHostProbeCount")
        private Integer usedHostProbeCount;

        @NameInMap("UsedProbeCount")
        private Integer usedProbeCount;

        @NameInMap("UsedVpcProbeCount")
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
             * TotalHoneypotCount.
             */
            public Builder totalHoneypotCount(Integer totalHoneypotCount) {
                this.totalHoneypotCount = totalHoneypotCount;
                return this;
            }

            /**
             * TotalNodeStatus.
             */
            public Builder totalNodeStatus(Integer totalNodeStatus) {
                this.totalNodeStatus = totalNodeStatus;
                return this;
            }

            /**
             * TotalProbeCount.
             */
            public Builder totalProbeCount(Integer totalProbeCount) {
                this.totalProbeCount = totalProbeCount;
                return this;
            }

            /**
             * UsedHoneypotCount.
             */
            public Builder usedHoneypotCount(Integer usedHoneypotCount) {
                this.usedHoneypotCount = usedHoneypotCount;
                return this;
            }

            /**
             * UsedHostProbeCount.
             */
            public Builder usedHostProbeCount(Integer usedHostProbeCount) {
                this.usedHostProbeCount = usedHostProbeCount;
                return this;
            }

            /**
             * UsedProbeCount.
             */
            public Builder usedProbeCount(Integer usedProbeCount) {
                this.usedProbeCount = usedProbeCount;
                return this;
            }

            /**
             * UsedVpcProbeCount.
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
