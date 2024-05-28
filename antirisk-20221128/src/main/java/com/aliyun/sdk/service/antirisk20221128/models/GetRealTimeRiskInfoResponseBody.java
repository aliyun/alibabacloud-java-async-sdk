// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealTimeRiskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealTimeRiskInfoResponseBody</p>
 */
public class GetRealTimeRiskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetRealTimeRiskInfoResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealTimeRiskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String msg; 
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRealTimeRiskInfoResponseBody build() {
            return new GetRealTimeRiskInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appChannel")
        private String appChannel;

        @com.aliyun.core.annotation.NameInMap("fakeDevice")
        private String fakeDevice;

        @com.aliyun.core.annotation.NameInMap("idfa")
        private String idfa;

        @com.aliyun.core.annotation.NameInMap("oaid")
        private String oaid;

        @com.aliyun.core.annotation.NameInMap("proxyDevice")
        private String proxyDevice;

        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("riskScore")
        private String riskScore;

        @com.aliyun.core.annotation.NameInMap("zid")
        private String zid;

        private Data(Builder builder) {
            this.appChannel = builder.appChannel;
            this.fakeDevice = builder.fakeDevice;
            this.idfa = builder.idfa;
            this.oaid = builder.oaid;
            this.proxyDevice = builder.proxyDevice;
            this.riskLevel = builder.riskLevel;
            this.riskScore = builder.riskScore;
            this.zid = builder.zid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appChannel
         */
        public String getAppChannel() {
            return this.appChannel;
        }

        /**
         * @return fakeDevice
         */
        public String getFakeDevice() {
            return this.fakeDevice;
        }

        /**
         * @return idfa
         */
        public String getIdfa() {
            return this.idfa;
        }

        /**
         * @return oaid
         */
        public String getOaid() {
            return this.oaid;
        }

        /**
         * @return proxyDevice
         */
        public String getProxyDevice() {
            return this.proxyDevice;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskScore
         */
        public String getRiskScore() {
            return this.riskScore;
        }

        /**
         * @return zid
         */
        public String getZid() {
            return this.zid;
        }

        public static final class Builder {
            private String appChannel; 
            private String fakeDevice; 
            private String idfa; 
            private String oaid; 
            private String proxyDevice; 
            private String riskLevel; 
            private String riskScore; 
            private String zid; 

            /**
             * appChannel.
             */
            public Builder appChannel(String appChannel) {
                this.appChannel = appChannel;
                return this;
            }

            /**
             * fakeDevice.
             */
            public Builder fakeDevice(String fakeDevice) {
                this.fakeDevice = fakeDevice;
                return this;
            }

            /**
             * idfa.
             */
            public Builder idfa(String idfa) {
                this.idfa = idfa;
                return this;
            }

            /**
             * oaid.
             */
            public Builder oaid(String oaid) {
                this.oaid = oaid;
                return this;
            }

            /**
             * proxyDevice.
             */
            public Builder proxyDevice(String proxyDevice) {
                this.proxyDevice = proxyDevice;
                return this;
            }

            /**
             * riskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * riskScore.
             */
            public Builder riskScore(String riskScore) {
                this.riskScore = riskScore;
                return this;
            }

            /**
             * zid.
             */
            public Builder zid(String zid) {
                this.zid = zid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
