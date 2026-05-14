// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkDescribeRecordFileUrlResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkDescribeRecordFileUrlResponseBody</p>
 */
public class ClinkDescribeRecordFileUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ClinkDescribeRecordFileUrlResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkDescribeRecordFileUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ClinkDescribeRecordFileUrlResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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

        public ClinkDescribeRecordFileUrlResponseBody build() {
            return new ClinkDescribeRecordFileUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkDescribeRecordFileUrlResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDescribeRecordFileUrlResponseBody</p>
     */
    public static class AudioFlows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Node")
        private Long node;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private AudioFlows(Builder builder) {
            this.node = builder.node;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioFlows create() {
            return builder().build();
        }

        /**
         * @return node
         */
        public Long getNode() {
            return this.node;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private Long node; 
            private Long timestamp; 
            private Long type; 

            private Builder() {
            } 

            private Builder(AudioFlows model) {
                this.node = model.node;
                this.timestamp = model.timestamp;
                this.type = model.type;
            } 

            /**
             * <p>节点，1：录音，2：保持，3：静音，4：咨询</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder node(Long node) {
                this.node = node;
                return this;
            }

            /**
             * <p>时间戳，单位：秒</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>类型，0：开始，1：结束</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public AudioFlows build() {
                return new AudioFlows(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkDescribeRecordFileUrlResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDescribeRecordFileUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioFlows")
        private java.util.List<AudioFlows> audioFlows;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        @com.aliyun.core.annotation.NameInMap("RecordFileUrl")
        private String recordFileUrl;

        private Data(Builder builder) {
            this.audioFlows = builder.audioFlows;
            this.clinkRequestId = builder.clinkRequestId;
            this.recordFileUrl = builder.recordFileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioFlows
         */
        public java.util.List<AudioFlows> getAudioFlows() {
            return this.audioFlows;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        /**
         * @return recordFileUrl
         */
        public String getRecordFileUrl() {
            return this.recordFileUrl;
        }

        public static final class Builder {
            private java.util.List<AudioFlows> audioFlows; 
            private String clinkRequestId; 
            private String recordFileUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.audioFlows = model.audioFlows;
                this.clinkRequestId = model.clinkRequestId;
                this.recordFileUrl = model.recordFileUrl;
            } 

            /**
             * <p>录音流程列表。仅当获取 mp3 格式通话录音时返回（不传 recordSide 且 recordType 为 &quot;record&quot; 或未传）。</p>
             */
            public Builder audioFlows(java.util.List<AudioFlows> audioFlows) {
                this.audioFlows = audioFlows;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            /**
             * <p>通话录音地址</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder recordFileUrl(String recordFileUrl) {
                this.recordFileUrl = recordFileUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
