// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetDocExtractionResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocExtractionResultResponseBody</p>
 */
public class GetDocExtractionResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDocExtractionResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocExtractionResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDocExtractionResultResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned data structure.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDocExtractionResultResponseBody build() {
            return new GetDocExtractionResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDocExtractionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocExtractionResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Confidence model) {
                this.keyConfidence = model.keyConfidence;
                this.valueConfidence = model.valueConfidence;
            } 

            /**
             * <p>Key confidence level</p>
             * 
             * <strong>example:</strong>
             * <p>0.9994202852249146</p>
             */
            public Builder keyConfidence(Double keyConfidence) {
                this.keyConfidence = keyConfidence;
                return this;
            }

            /**
             * <p>value confidence level</p>
             * 
             * <strong>example:</strong>
             * <p>0.9794202852249146</p>
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
    /**
     * 
     * {@link GetDocExtractionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocExtractionResultResponseBody</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("confidence")
        private Confidence confidence;

        @com.aliyun.core.annotation.NameInMap("key")
        private java.util.List<ContentItem> key;

        @com.aliyun.core.annotation.NameInMap("value")
        private java.util.List<ContentItem> value;

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
        public java.util.List<ContentItem> getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public java.util.List<ContentItem> getValue() {
            return this.value;
        }

        public static final class Builder {
            private Confidence confidence; 
            private java.util.List<ContentItem> key; 
            private java.util.List<ContentItem> value; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.confidence = model.confidence;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Confidence level</p>
             */
            public Builder confidence(Confidence confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>Details of key recall information</p>
             */
            public Builder key(java.util.List<ContentItem> key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Details of value recall information</p>
             */
            public Builder value(java.util.List<ContentItem> value) {
                this.value = value;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDocExtractionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocExtractionResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(KvListInfo model) {
                this.context = model.context;
                this.keyName = model.keyName;
                this.keyValue = model.keyValue;
            } 

            /**
             * <p>Recalled content</p>
             */
            public Builder context(Context context) {
                this.context = context;
                return this;
            }

            /**
             * <p>Field key name</p>
             * 
             * <strong>example:</strong>
             * <p>Tenant</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>Field key value</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud XXX Co., Ltd.</p>
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
    /**
     * 
     * {@link GetDocExtractionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDocExtractionResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("kvListInfo")
        private java.util.List<KvListInfo> kvListInfo;

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
        public java.util.List<KvListInfo> getKvListInfo() {
            return this.kvListInfo;
        }

        public static final class Builder {
            private java.util.List<KvListInfo> kvListInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.kvListInfo = model.kvListInfo;
            } 

            /**
             * <p>Details of document parsing results</p>
             */
            public Builder kvListInfo(java.util.List<KvListInfo> kvListInfo) {
                this.kvListInfo = kvListInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
