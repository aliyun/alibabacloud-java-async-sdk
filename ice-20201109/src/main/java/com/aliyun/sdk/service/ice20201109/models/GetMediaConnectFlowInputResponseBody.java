// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMediaConnectFlowInputResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaConnectFlowInputResponseBody</p>
 */
public class GetMediaConnectFlowInputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    private GetMediaConnectFlowInputResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConnectFlowInputResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public Integer getRetCode() {
        return this.retCode;
    }

    public static final class Builder {
        private Content content; 
        private String description; 
        private String requestId; 
        private Integer retCode; 

        /**
         * <p>Response body</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Interface call description</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>D4C231DF-103A-55FF-8D09-E699552457DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned error code, 0 indicates success</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retCode(Integer retCode) {
            this.retCode = retCode;
            return this;
        }

        public GetMediaConnectFlowInputResponseBody build() {
            return new GetMediaConnectFlowInputResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaConnectFlowInputResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaConnectFlowInputResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidrs")
        private String cidrs;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InputName")
        private String inputName;

        @com.aliyun.core.annotation.NameInMap("InputProtocol")
        private String inputProtocol;

        @com.aliyun.core.annotation.NameInMap("InputUrl")
        private String inputUrl;

        @com.aliyun.core.annotation.NameInMap("MaxBitrate")
        private Integer maxBitrate;

        @com.aliyun.core.annotation.NameInMap("PairFlowId")
        private String pairFlowId;

        @com.aliyun.core.annotation.NameInMap("PairOutputName")
        private String pairOutputName;

        @com.aliyun.core.annotation.NameInMap("SrtLatency")
        private Integer srtLatency;

        @com.aliyun.core.annotation.NameInMap("SrtPassphrase")
        private String srtPassphrase;

        @com.aliyun.core.annotation.NameInMap("SrtPbkeyLen")
        private Integer srtPbkeyLen;

        private Content(Builder builder) {
            this.cidrs = builder.cidrs;
            this.createTime = builder.createTime;
            this.inputName = builder.inputName;
            this.inputProtocol = builder.inputProtocol;
            this.inputUrl = builder.inputUrl;
            this.maxBitrate = builder.maxBitrate;
            this.pairFlowId = builder.pairFlowId;
            this.pairOutputName = builder.pairOutputName;
            this.srtLatency = builder.srtLatency;
            this.srtPassphrase = builder.srtPassphrase;
            this.srtPbkeyLen = builder.srtPbkeyLen;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cidrs
         */
        public String getCidrs() {
            return this.cidrs;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return inputName
         */
        public String getInputName() {
            return this.inputName;
        }

        /**
         * @return inputProtocol
         */
        public String getInputProtocol() {
            return this.inputProtocol;
        }

        /**
         * @return inputUrl
         */
        public String getInputUrl() {
            return this.inputUrl;
        }

        /**
         * @return maxBitrate
         */
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        /**
         * @return pairFlowId
         */
        public String getPairFlowId() {
            return this.pairFlowId;
        }

        /**
         * @return pairOutputName
         */
        public String getPairOutputName() {
            return this.pairOutputName;
        }

        /**
         * @return srtLatency
         */
        public Integer getSrtLatency() {
            return this.srtLatency;
        }

        /**
         * @return srtPassphrase
         */
        public String getSrtPassphrase() {
            return this.srtPassphrase;
        }

        /**
         * @return srtPbkeyLen
         */
        public Integer getSrtPbkeyLen() {
            return this.srtPbkeyLen;
        }

        public static final class Builder {
            private String cidrs; 
            private String createTime; 
            private String inputName; 
            private String inputProtocol; 
            private String inputUrl; 
            private Integer maxBitrate; 
            private String pairFlowId; 
            private String pairOutputName; 
            private Integer srtLatency; 
            private String srtPassphrase; 
            private Integer srtPbkeyLen; 

            /**
             * <p>IP whitelist, in CIDR format, multiple IP segments separated by commas</p>
             * 
             * <strong>example:</strong>
             * <p>10.211.0.0/17</p>
             */
            public Builder cidrs(String cidrs) {
                this.cidrs = cidrs;
                return this;
            }

            /**
             * <p>Flow creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-18T01:29:24Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Input name</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestInput</p>
             */
            public Builder inputName(String inputName) {
                this.inputName = inputName;
                return this;
            }

            /**
             * <p>Input type</p>
             * 
             * <strong>example:</strong>
             * <p>RTMP-PUSH</p>
             */
            public Builder inputProtocol(String inputProtocol) {
                this.inputProtocol = inputProtocol;
                return this;
            }

            /**
             * <p>Input URL</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://1.2.3.4:1935/live/AliTestInput_8666ec062190f00e263012666319a5be</p>
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * <p>Input bitrate, in bps</p>
             * 
             * <strong>example:</strong>
             * <p>2000000</p>
             */
            public Builder maxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
                return this;
            }

            /**
             * <p>Peer Flow instance ID, required when the output type is Flow</p>
             * 
             * <strong>example:</strong>
             * <p>05c3adf4-aa0e-421d-a991-48ceae3e642e</p>
             */
            public Builder pairFlowId(String pairFlowId) {
                this.pairFlowId = pairFlowId;
                return this;
            }

            /**
             * <p>Peer Flow output name, required only when the input type is Flow</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestOutput</p>
             */
            public Builder pairOutputName(String pairOutputName) {
                this.pairOutputName = pairOutputName;
                return this;
            }

            /**
             * <p>SRT latency, in ms, required only when the input type is SRT-Listener/SRT-Caller</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder srtLatency(Integer srtLatency) {
                this.srtLatency = srtLatency;
                return this;
            }

            /**
             * <p>SRT encryption key, required only when the input type is SRT-Listener/SRT-Caller</p>
             * 
             * <strong>example:</strong>
             * <p>FICUBPX4Q77DYHRF</p>
             */
            public Builder srtPassphrase(String srtPassphrase) {
                this.srtPassphrase = srtPassphrase;
                return this;
            }

            /**
             * <p>SRT encryption length, required only when the input type is SRT-Listener/SRT-Caller</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder srtPbkeyLen(Integer srtPbkeyLen) {
                this.srtPbkeyLen = srtPbkeyLen;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
