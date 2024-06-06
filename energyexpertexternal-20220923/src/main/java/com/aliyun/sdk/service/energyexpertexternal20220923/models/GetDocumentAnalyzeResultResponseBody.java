// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentAnalyzeResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocumentAnalyzeResultResponseBody</p>
 */
public class GetDocumentAnalyzeResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDocumentAnalyzeResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentAnalyzeResultResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDocumentAnalyzeResultResponseBody build() {
            return new GetDocumentAnalyzeResultResponseBody(this);
        } 

    } 

    public static class Confidence extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("keyConfidence")
        private Double keyConfidence;

        @com.aliyun.core.annotation.NameInMap("valueConfidence")
        private Double valueConfidence;

        private Confidence(Builder builder) {
            this.keyConfidence = builder.keyConfidence;
            this.valueConfidence = builder.valueConfidence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Confidence create() {
            return builder().build();
        }

        /**
         * @return keyConfidence
         */
        public Double getKeyConfidence() {
            return this.keyConfidence;
        }

        /**
         * @return valueConfidence
         */
        public Double getValueConfidence() {
            return this.valueConfidence;
        }

        public static final class Builder {
            private Double keyConfidence; 
            private Double valueConfidence; 

            /**
             * keyConfidence.
             */
            public Builder keyConfidence(Double keyConfidence) {
                this.keyConfidence = keyConfidence;
                return this;
            }

            /**
             * valueConfidence.
             */
            public Builder valueConfidence(Double valueConfidence) {
                this.valueConfidence = valueConfidence;
                return this;
            }

            public Confidence build() {
                return new Confidence(this);
            } 

        } 

    }
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("confidence")
        private Confidence confidence;

        @com.aliyun.core.annotation.NameInMap("key")
        private java.util.List < ContentItem > key;

        @com.aliyun.core.annotation.NameInMap("value")
        private java.util.List < ContentItem > value;

        private Context(Builder builder) {
            this.confidence = builder.confidence;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Confidence getConfidence() {
            return this.confidence;
        }

        /**
         * @return key
         */
        public java.util.List < ContentItem > getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public java.util.List < ContentItem > getValue() {
            return this.value;
        }

        public static final class Builder {
            private Confidence confidence; 
            private java.util.List < ContentItem > key; 
            private java.util.List < ContentItem > value; 

            /**
             * confidence.
             */
            public Builder confidence(Confidence confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * key.
             */
            public Builder key(java.util.List < ContentItem > key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(java.util.List < ContentItem > value) {
                this.value = value;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    public static class KvListInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("context")
        private Context context;

        @com.aliyun.core.annotation.NameInMap("keyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("keyValue")
        private String keyValue;

        private KvListInfo(Builder builder) {
            this.context = builder.context;
            this.keyName = builder.keyName;
            this.keyValue = builder.keyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KvListInfo create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public Context getContext() {
            return this.context;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return keyValue
         */
        public String getKeyValue() {
            return this.keyValue;
        }

        public static final class Builder {
            private Context context; 
            private String keyName; 
            private String keyValue; 

            /**
             * context.
             */
            public Builder context(Context context) {
                this.context = context;
                return this;
            }

            /**
             * keyName.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * keyValue.
             */
            public Builder keyValue(String keyValue) {
                this.keyValue = keyValue;
                return this;
            }

            public KvListInfo build() {
                return new KvListInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("kvListInfo")
        private java.util.List < KvListInfo> kvListInfo;

        private Data(Builder builder) {
            this.kvListInfo = builder.kvListInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return kvListInfo
         */
        public java.util.List < KvListInfo> getKvListInfo() {
            return this.kvListInfo;
        }

        public static final class Builder {
            private java.util.List < KvListInfo> kvListInfo; 

            /**
             * kvListInfo.
             */
            public Builder kvListInfo(java.util.List < KvListInfo> kvListInfo) {
                this.kvListInfo = kvListInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
