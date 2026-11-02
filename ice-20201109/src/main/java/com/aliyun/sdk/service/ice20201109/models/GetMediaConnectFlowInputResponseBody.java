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
         * <p>The API call description.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D4C231DF-103A-55FF-8D09-E699552457DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned error code. A value of 0 indicates success.</p>
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
        @com.aliyun.core.annotation.NameInMap("BackupCidrs")
        private String backupCidrs;

        @com.aliyun.core.annotation.NameInMap("BackupCreateTime")
        private String backupCreateTime;

        @com.aliyun.core.annotation.NameInMap("BackupInnerInputUrl")
        private String backupInnerInputUrl;

        @com.aliyun.core.annotation.NameInMap("BackupInputName")
        private String backupInputName;

        @com.aliyun.core.annotation.NameInMap("BackupInputStatus")
        private String backupInputStatus;

        @com.aliyun.core.annotation.NameInMap("BackupInputUrl")
        private String backupInputUrl;

        @com.aliyun.core.annotation.NameInMap("BackupMaxBitrate")
        private Integer backupMaxBitrate;

        @com.aliyun.core.annotation.NameInMap("BackupSrtLatency")
        private Integer backupSrtLatency;

        @com.aliyun.core.annotation.NameInMap("BackupSrtPassphrase")
        private String backupSrtPassphrase;

        @com.aliyun.core.annotation.NameInMap("BackupSrtPbkeyLen")
        private Integer backupSrtPbkeyLen;

        @com.aliyun.core.annotation.NameInMap("Cidrs")
        private String cidrs;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InnerInputUrl")
        private String innerInputUrl;

        @com.aliyun.core.annotation.NameInMap("InputName")
        private String inputName;

        @com.aliyun.core.annotation.NameInMap("InputProtocol")
        private String inputProtocol;

        @com.aliyun.core.annotation.NameInMap("InputStatus")
        private String inputStatus;

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
            this.backupCidrs = builder.backupCidrs;
            this.backupCreateTime = builder.backupCreateTime;
            this.backupInnerInputUrl = builder.backupInnerInputUrl;
            this.backupInputName = builder.backupInputName;
            this.backupInputStatus = builder.backupInputStatus;
            this.backupInputUrl = builder.backupInputUrl;
            this.backupMaxBitrate = builder.backupMaxBitrate;
            this.backupSrtLatency = builder.backupSrtLatency;
            this.backupSrtPassphrase = builder.backupSrtPassphrase;
            this.backupSrtPbkeyLen = builder.backupSrtPbkeyLen;
            this.cidrs = builder.cidrs;
            this.createTime = builder.createTime;
            this.innerInputUrl = builder.innerInputUrl;
            this.inputName = builder.inputName;
            this.inputProtocol = builder.inputProtocol;
            this.inputStatus = builder.inputStatus;
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
         * @return backupCidrs
         */
        public String getBackupCidrs() {
            return this.backupCidrs;
        }

        /**
         * @return backupCreateTime
         */
        public String getBackupCreateTime() {
            return this.backupCreateTime;
        }

        /**
         * @return backupInnerInputUrl
         */
        public String getBackupInnerInputUrl() {
            return this.backupInnerInputUrl;
        }

        /**
         * @return backupInputName
         */
        public String getBackupInputName() {
            return this.backupInputName;
        }

        /**
         * @return backupInputStatus
         */
        public String getBackupInputStatus() {
            return this.backupInputStatus;
        }

        /**
         * @return backupInputUrl
         */
        public String getBackupInputUrl() {
            return this.backupInputUrl;
        }

        /**
         * @return backupMaxBitrate
         */
        public Integer getBackupMaxBitrate() {
            return this.backupMaxBitrate;
        }

        /**
         * @return backupSrtLatency
         */
        public Integer getBackupSrtLatency() {
            return this.backupSrtLatency;
        }

        /**
         * @return backupSrtPassphrase
         */
        public String getBackupSrtPassphrase() {
            return this.backupSrtPassphrase;
        }

        /**
         * @return backupSrtPbkeyLen
         */
        public Integer getBackupSrtPbkeyLen() {
            return this.backupSrtPbkeyLen;
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
         * @return innerInputUrl
         */
        public String getInnerInputUrl() {
            return this.innerInputUrl;
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
         * @return inputStatus
         */
        public String getInputStatus() {
            return this.inputStatus;
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
            private String backupCidrs; 
            private String backupCreateTime; 
            private String backupInnerInputUrl; 
            private String backupInputName; 
            private String backupInputStatus; 
            private String backupInputUrl; 
            private Integer backupMaxBitrate; 
            private Integer backupSrtLatency; 
            private String backupSrtPassphrase; 
            private Integer backupSrtPbkeyLen; 
            private String cidrs; 
            private String createTime; 
            private String innerInputUrl; 
            private String inputName; 
            private String inputProtocol; 
            private String inputStatus; 
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
                this.backupCidrs = model.backupCidrs;
                this.backupCreateTime = model.backupCreateTime;
                this.backupInnerInputUrl = model.backupInnerInputUrl;
                this.backupInputName = model.backupInputName;
                this.backupInputStatus = model.backupInputStatus;
                this.backupInputUrl = model.backupInputUrl;
                this.backupMaxBitrate = model.backupMaxBitrate;
                this.backupSrtLatency = model.backupSrtLatency;
                this.backupSrtPassphrase = model.backupSrtPassphrase;
                this.backupSrtPbkeyLen = model.backupSrtPbkeyLen;
                this.cidrs = model.cidrs;
                this.createTime = model.createTime;
                this.innerInputUrl = model.innerInputUrl;
                this.inputName = model.inputName;
                this.inputProtocol = model.inputProtocol;
                this.inputStatus = model.inputStatus;
                this.inputUrl = model.inputUrl;
                this.maxBitrate = model.maxBitrate;
                this.pairFlowId = model.pairFlowId;
                this.pairOutputName = model.pairOutputName;
                this.srtLatency = model.srtLatency;
                this.srtPassphrase = model.srtPassphrase;
                this.srtPbkeyLen = model.srtPbkeyLen;
            } 

            /**
             * <p>The IP address whitelist for the backup input.</p>
             * 
             * <strong>example:</strong>
             * <p>10.211.0.0/17</p>
             */
            public Builder backupCidrs(String backupCidrs) {
                this.backupCidrs = backupCidrs;
                return this;
            }

            /**
             * <p>The time when the backup input was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-18T01:29:24Z</p>
             */
            public Builder backupCreateTime(String backupCreateTime) {
                this.backupCreateTime = backupCreateTime;
                return this;
            }

            /**
             * <p>The internal IP address for backup stream ingestion. This field is valid only when cloud access is established over an Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder backupInnerInputUrl(String backupInnerInputUrl) {
                this.backupInnerInputUrl = backupInnerInputUrl;
                return this;
            }

            /**
             * <p>The backup input name.</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestInput-sub</p>
             */
            public Builder backupInputName(String backupInputName) {
                this.backupInputName = backupInputName;
                return this;
            }

            /**
             * <p>The backup input status, which indicates whether the backup stream is being ingested.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder backupInputStatus(String backupInputStatus) {
                this.backupInputStatus = backupInputStatus;
                return this;
            }

            /**
             * <p>The backup input URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://1.2.3.4:1935/live/AliTestInput_8666ec062190f00e263012666319a5be_backup</p>
             */
            public Builder backupInputUrl(String backupInputUrl) {
                this.backupInputUrl = backupInputUrl;
                return this;
            }

            /**
             * <p>The maximum bitrate for the backup input.</p>
             * 
             * <strong>example:</strong>
             * <p>2000000</p>
             */
            public Builder backupMaxBitrate(Integer backupMaxBitrate) {
                this.backupMaxBitrate = backupMaxBitrate;
                return this;
            }

            /**
             * <p>The SRT latency for the backup input.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder backupSrtLatency(Integer backupSrtLatency) {
                this.backupSrtLatency = backupSrtLatency;
                return this;
            }

            /**
             * <p>The SRT encryption passphrase for the backup input.</p>
             * 
             * <strong>example:</strong>
             * <p>FICUBPX4Q77DYHRF</p>
             */
            public Builder backupSrtPassphrase(String backupSrtPassphrase) {
                this.backupSrtPassphrase = backupSrtPassphrase;
                return this;
            }

            /**
             * <p>The SRT encryption key length for the backup input.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder backupSrtPbkeyLen(Integer backupSrtPbkeyLen) {
                this.backupSrtPbkeyLen = backupSrtPbkeyLen;
                return this;
            }

            /**
             * <p>The IP address whitelist in CIDR format. Multiple CIDR blocks are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>10.211.0.0/17</p>
             */
            public Builder cidrs(String cidrs) {
                this.cidrs = cidrs;
                return this;
            }

            /**
             * <p>The time when the input was created. The time is displayed in ISO 8601 format in UTC (ending with Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-18T01:29:24Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The internal IP address for stream ingestion. This field is valid only when cloud access is established over an Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder innerInputUrl(String innerInputUrl) {
                this.innerInputUrl = innerInputUrl;
                return this;
            }

            /**
             * <p>The input name.</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestInput</p>
             */
            public Builder inputName(String inputName) {
                this.inputName = inputName;
                return this;
            }

            /**
             * <p>The input protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>RTMP-PUSH</p>
             */
            public Builder inputProtocol(String inputProtocol) {
                this.inputProtocol = inputProtocol;
                return this;
            }

            /**
             * <p>The input status, which indicates whether the primary stream is being ingested.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder inputStatus(String inputStatus) {
                this.inputStatus = inputStatus;
                return this;
            }

            /**
             * <p>The input URL.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://1.2.3.4:1935/live/AliTestInput_8666ec062190f00e263012666319a5be</p>
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * <p>The maximum input bitrate, in bps.</p>
             * 
             * <strong>example:</strong>
             * <p>2000000</p>
             */
            public Builder maxBitrate(Integer maxBitrate) {
                this.maxBitrate = maxBitrate;
                return this;
            }

            /**
             * <p>The peer flow instance ID. This field is required when the output type is Flow.</p>
             * 
             * <strong>example:</strong>
             * <p>05c3adf4-aa0e-421d-a991-48ceae3e642e</p>
             */
            public Builder pairFlowId(String pairFlowId) {
                this.pairFlowId = pairFlowId;
                return this;
            }

            /**
             * <p>The output name of the peer flow. This field is required only when the input type is Flow.</p>
             * 
             * <strong>example:</strong>
             * <p>AliTestOutput</p>
             */
            public Builder pairOutputName(String pairOutputName) {
                this.pairOutputName = pairOutputName;
                return this;
            }

            /**
             * <p>The SRT latency, in milliseconds. This field is required only when the input type is SRT-Listener or SRT-Caller.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder srtLatency(Integer srtLatency) {
                this.srtLatency = srtLatency;
                return this;
            }

            /**
             * <p>The SRT encryption passphrase. This field is required only when the input type is SRT-Listener or SRT-Caller.</p>
             * 
             * <strong>example:</strong>
             * <p>FICUBPX4Q77DYHRF</p>
             */
            public Builder srtPassphrase(String srtPassphrase) {
                this.srtPassphrase = srtPassphrase;
                return this;
            }

            /**
             * <p>The SRT encryption key length. This field is required only when the input type is SRT-Listener or SRT-Caller.</p>
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
