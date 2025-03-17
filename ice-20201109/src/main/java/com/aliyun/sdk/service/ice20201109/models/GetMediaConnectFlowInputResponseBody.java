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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMediaConnectFlowInputResponseBody model) {
            this.content = model.content;
            this.description = model.description;
            this.requestId = model.requestId;
            this.retCode = model.retCode;
        } 

        /**
         * <p>The response body.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The call description.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D4C231DF-103A-55FF-8D09-E699552457DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned error code. A value of 0 indicates the call is successful.</p>
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

            private Builder() {
            } 

            private Builder(Content model) {
                this.cidrs = model.cidrs;
                this.createTime = model.createTime;
                this.inputName = model.inputName;
                this.inputProtocol = model.inputProtocol;
                this.inputUrl = model.inputUrl;
                this.maxBitrate = model.maxBitrate;
                this.pairFlowId = model.pairFlowId;
                this.pairOutputName = model.pairOutputName;
                this.srtLatency = model.srtLatency;
                this.srtPassphrase = model.srtPassphrase;
                this.srtPbkeyLen = model.srtPbkeyLen;
            } 

            /**
             * <p>The IP address whitelist in CIDR format. CIDR blocks are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>10.211.0.0/17</p>
             */
            public Builder cidrs(String cidrs) {
                this.cidrs = cidrs;
                return this;
            }

            /**
             * <p>The time when the flow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-18T01:29:24Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The source name.</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestInput</p>
             */
            public Builder inputName(String inputName) {
                this.inputName = inputName;
                return this;
            }

            /**
             * <p>The source type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RTMP-PUSH</li>
             * <li>SRT-Caller</li>
             * <li>RTMP-PULL</li>
             * <li>SRT-Listener</li>
             * <li>Flow</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RTMP-PUSH</p>
             */
            public Builder inputProtocol(String inputProtocol) {
                this.inputProtocol = inputProtocol;
                return this;
            }

            /**
             * <p>The source URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://1.2.3.4:1935/live/AliTestInput_8666ec062190f00e263012666319a5be</p>
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * <p>The maximum bitrate. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2000000</p>
             */
            public Builder maxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
                return this;
            }

            /**
             * <p>The ID of the source flow. This parameter is returned when the source type is Flow.</p>
             * 
             * <strong>example:</strong>
             * <p>05c3adf4-aa0e-421d-a991-48ceae3e642e</p>
             */
            public Builder pairFlowId(String pairFlowId) {
                this.pairFlowId = pairFlowId;
                return this;
            }

            /**
             * <p>The output of the source flow. This parameter is returned when the source type is Flow.</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestOutput</p>
             */
            public Builder pairOutputName(String pairOutputName) {
                this.pairOutputName = pairOutputName;
                return this;
            }

            /**
             * <p>The latency for the SRT stream. Unit: milliseconds. This parameter is returned when the source type is SRT-Listener or SRT-Caller.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder srtLatency(Integer srtLatency) {
                this.srtLatency = srtLatency;
                return this;
            }

            /**
             * <p>The SRT key. This parameter is returned when the source type is SRT-Listener or SRT-Caller.</p>
             * 
             * <strong>example:</strong>
             * <p>FICUBPX4Q77DYHRF</p>
             */
            public Builder srtPassphrase(String srtPassphrase) {
                this.srtPassphrase = srtPassphrase;
                return this;
            }

            /**
             * <p>The encryption key length. This parameter is returned when the source type is SRT-Listener or SRT-Caller.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0</li>
             * <li>16</li>
             * <li>24</li>
             * <li>32</li>
             * </ul>
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
