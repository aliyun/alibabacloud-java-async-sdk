// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetChatModelResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatModelResponseBody</p>
 */
public class GetChatModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChatModelResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetChatModelResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatModelResponseBody build() {
            return new GetChatModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChatModelResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatModelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContextWindow")
        private Long contextWindow;

        @com.aliyun.core.annotation.NameInMap("Default")
        private Boolean _default;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<String> features;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("ThinkingLevels")
        private java.util.List<String> thinkingLevels;

        private Data(Builder builder) {
            this.contextWindow = builder.contextWindow;
            this._default = builder._default;
            this.features = builder.features;
            this.modelId = builder.modelId;
            this.thinkingLevels = builder.thinkingLevels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contextWindow
         */
        public Long getContextWindow() {
            return this.contextWindow;
        }

        /**
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return features
         */
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return thinkingLevels
         */
        public java.util.List<String> getThinkingLevels() {
            return this.thinkingLevels;
        }

        public static final class Builder {
            private Long contextWindow; 
            private Boolean _default; 
            private java.util.List<String> features; 
            private String modelId; 
            private java.util.List<String> thinkingLevels; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contextWindow = model.contextWindow;
                this._default = model._default;
                this.features = model.features;
                this.modelId = model.modelId;
                this.thinkingLevels = model.thinkingLevels;
            } 

            /**
             * ContextWindow.
             */
            public Builder contextWindow(Long contextWindow) {
                this.contextWindow = contextWindow;
                return this;
            }

            /**
             * Default.
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(java.util.List<String> features) {
                this.features = features;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ThinkingLevels.
             */
            public Builder thinkingLevels(java.util.List<String> thinkingLevels) {
                this.thinkingLevels = thinkingLevels;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
