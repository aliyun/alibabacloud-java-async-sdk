// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayInfoResponseBody</p>
 */
public class DescribeGatewayInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GatewayInfos")
    private GatewayInfos gatewayInfos;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.gatewayInfos = builder.gatewayInfos;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gatewayInfos
     */
    public GatewayInfos getGatewayInfos() {
        return this.gatewayInfos;
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
        private GatewayInfos gatewayInfos; 
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
         * GatewayInfos.
         */
        public Builder gatewayInfos(GatewayInfos gatewayInfos) {
            this.gatewayInfos = gatewayInfos;
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

        public DescribeGatewayInfoResponseBody build() {
            return new DescribeGatewayInfoResponseBody(this);
        } 

    } 

    public static class GatewayInfo extends TeaModel {
        @NameInMap("Info")
        private String info;

        @NameInMap("Time")
        private Long time;

        private GatewayInfo(Builder builder) {
            this.info = builder.info;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayInfo create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String info; 
            private Long time; 

            /**
             * Info.
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public GatewayInfo build() {
                return new GatewayInfo(this);
            } 

        } 

    }
    public static class GatewayInfos extends TeaModel {
        @NameInMap("GatewayInfo")
        private java.util.List < GatewayInfo> gatewayInfo;

        private GatewayInfos(Builder builder) {
            this.gatewayInfo = builder.gatewayInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayInfos create() {
            return builder().build();
        }

        /**
         * @return gatewayInfo
         */
        public java.util.List < GatewayInfo> getGatewayInfo() {
            return this.gatewayInfo;
        }

        public static final class Builder {
            private java.util.List < GatewayInfo> gatewayInfo; 

            /**
             * GatewayInfo.
             */
            public Builder gatewayInfo(java.util.List < GatewayInfo> gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            public GatewayInfos build() {
                return new GatewayInfos(this);
            } 

        } 

    }
}
