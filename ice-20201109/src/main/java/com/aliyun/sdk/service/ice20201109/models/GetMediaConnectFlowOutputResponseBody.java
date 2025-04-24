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
 * {@link GetMediaConnectFlowOutputResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaConnectFlowOutputResponseBody</p>
 */
public class GetMediaConnectFlowOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
    private Integer retCode;

    private GetMediaConnectFlowOutputResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConnectFlowOutputResponseBody create() {
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

        private Builder(GetMediaConnectFlowOutputResponseBody model) {
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
         * <p>0DB23DCE-0D69-598B-AA7C-7268D55E2F89</p>
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

        public GetMediaConnectFlowOutputResponseBody build() {
            return new GetMediaConnectFlowOutputResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaConnectFlowOutputResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaConnectFlowOutputResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidrs")
        private String cidrs;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Forbid")
        private String forbid;

        @com.aliyun.core.annotation.NameInMap("OutputName")
        private String outputName;

        @com.aliyun.core.annotation.NameInMap("OutputProtocol")
        private String outputProtocol;

        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("PairFlowId")
        private String pairFlowId;

        @com.aliyun.core.annotation.NameInMap("PairInputName")
        private String pairInputName;

        @com.aliyun.core.annotation.NameInMap("PlayerLimit")
        private Integer playerLimit;

        @com.aliyun.core.annotation.NameInMap("SrtLatency")
        private Integer srtLatency;

        @com.aliyun.core.annotation.NameInMap("SrtPassphrase")
        private String srtPassphrase;

        @com.aliyun.core.annotation.NameInMap("SrtPbkeyLen")
        private Integer srtPbkeyLen;

        private Content(Builder builder) {
            this.cidrs = builder.cidrs;
            this.createTime = builder.createTime;
            this.forbid = builder.forbid;
            this.outputName = builder.outputName;
            this.outputProtocol = builder.outputProtocol;
            this.outputUrl = builder.outputUrl;
            this.pairFlowId = builder.pairFlowId;
            this.pairInputName = builder.pairInputName;
            this.playerLimit = builder.playerLimit;
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
         * @return forbid
         */
        public String getForbid() {
            return this.forbid;
        }

        /**
         * @return outputName
         */
        public String getOutputName() {
            return this.outputName;
        }

        /**
         * @return outputProtocol
         */
        public String getOutputProtocol() {
            return this.outputProtocol;
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        /**
         * @return pairFlowId
         */
        public String getPairFlowId() {
            return this.pairFlowId;
        }

        /**
         * @return pairInputName
         */
        public String getPairInputName() {
            return this.pairInputName;
        }

        /**
         * @return playerLimit
         */
        public Integer getPlayerLimit() {
            return this.playerLimit;
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
            private String forbid; 
            private String outputName; 
            private String outputProtocol; 
            private String outputUrl; 
            private String pairFlowId; 
            private String pairInputName; 
            private Integer playerLimit; 
            private Integer srtLatency; 
            private String srtPassphrase; 
            private Integer srtPbkeyLen; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.cidrs = model.cidrs;
                this.createTime = model.createTime;
                this.forbid = model.forbid;
                this.outputName = model.outputName;
                this.outputProtocol = model.outputProtocol;
                this.outputUrl = model.outputUrl;
                this.pairFlowId = model.pairFlowId;
                this.pairInputName = model.pairInputName;
                this.playerLimit = model.playerLimit;
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
             * Forbid.
             */
            public Builder forbid(String forbid) {
                this.forbid = forbid;
                return this;
            }

            /**
             * <p>The output name.</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestInput</p>
             */
            public Builder outputName(String outputName) {
                this.outputName = outputName;
                return this;
            }

            /**
             * <p>The output type.</p>
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
             * <p>SRT-PULL</p>
             */
            public Builder outputProtocol(String outputProtocol) {
                this.outputProtocol = outputProtocol;
                return this;
            }

            /**
             * <p>The output URL.</p>
             * 
             * <strong>example:</strong>
             * <p>srt://1.2.3.4:1025</p>
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * <p>The ID of the destination flow. This parameter is returned when the output type is Flow.</p>
             * 
             * <strong>example:</strong>
             * <p>805fbdd0-575e-4146-b35d-ec7f63937b20</p>
             */
            public Builder pairFlowId(String pairFlowId) {
                this.pairFlowId = pairFlowId;
                return this;
            }

            /**
             * <p>The source name of the destination flow. This parameter is returned when the output type is Flow.</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestInput</p>
             */
            public Builder pairInputName(String pairInputName) {
                this.pairInputName = pairInputName;
                return this;
            }

            /**
             * <p>The maximum number of viewers.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder playerLimit(Integer playerLimit) {
                this.playerLimit = playerLimit;
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
