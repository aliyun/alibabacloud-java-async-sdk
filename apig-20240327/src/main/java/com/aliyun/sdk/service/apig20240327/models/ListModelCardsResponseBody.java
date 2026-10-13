// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListModelCardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelCardsResponseBody</p>
 */
public class ListModelCardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListModelCardsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelCardsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListModelCardsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListModelCardsResponseBody build() {
            return new ListModelCardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelCardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelCardsResponseBody</p>
     */
    public static class AvailablePaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AvailablePaths(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailablePaths create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(AvailablePaths model) {
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>The request path of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/chat/completions</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The type identifier of the available path record. The valid values are not specified in the API definition.</p>
             * 
             * <strong>example:</strong>
             * <p>type-xxxxxxxx</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AvailablePaths build() {
                return new AvailablePaths(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelCardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelCardsResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        private Meta(Builder builder) {
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String description; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.description = model.description;
            } 

            /**
             * <p>The description text of the model card.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample description text for the model card</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelCardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelCardsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("availablePaths")
        private java.util.List<AvailablePaths> availablePaths;

        @com.aliyun.core.annotation.NameInMap("features")
        private java.util.Map<String, ?> features;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("pricing")
        private java.util.Map<String, ?> pricing;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("snapshots")
        private java.util.List<java.util.Map<String, ?>> snapshots;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        private Data(Builder builder) {
            this.availablePaths = builder.availablePaths;
            this.features = builder.features;
            this.meta = builder.meta;
            this.modelName = builder.modelName;
            this.pricing = builder.pricing;
            this.provider = builder.provider;
            this.snapshots = builder.snapshots;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availablePaths
         */
        public java.util.List<AvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        /**
         * @return features
         */
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        /**
         * @return meta
         */
        public Meta getMeta() {
            return this.meta;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return pricing
         */
        public java.util.Map<String, ?> getPricing() {
            return this.pricing;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return snapshots
         */
        public java.util.List<java.util.Map<String, ?>> getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.List<AvailablePaths> availablePaths; 
            private java.util.Map<String, ?> features; 
            private Meta meta; 
            private String modelName; 
            private java.util.Map<String, ?> pricing; 
            private String provider; 
            private java.util.List<java.util.Map<String, ?>> snapshots; 
            private String source; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.availablePaths = model.availablePaths;
                this.features = model.features;
                this.meta = model.meta;
                this.modelName = model.modelName;
                this.pricing = model.pricing;
                this.provider = model.provider;
                this.snapshots = model.snapshots;
                this.source = model.source;
            } 

            /**
             * <p>The list of available paths for the model card. Each element consists of a path and a type member. The API definition does not specify the criteria for determining availability.</p>
             */
            public Builder availablePaths(java.util.List<AvailablePaths> availablePaths) {
                this.availablePaths = availablePaths;
                return this;
            }

            /**
             * <p>The feature configuration of the model card in a key-value pair map structure. The set of keys is not specified in the API definition.</p>
             */
            public Builder features(java.util.Map<String, ?> features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The metadata container of the model card. Only the description member is declared in the API definition.</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The pricing information of the model card in a key-value pair map structure. The set of keys and billing criteria are not specified in the API definition.</p>
             */
            public Builder pricing(java.util.Map<String, ?> pricing) {
                this.pricing = pricing;
                return this;
            }

            /**
             * <p>The identifier of the model provider for the model card.</p>
             * 
             * <strong>example:</strong>
             * <p>provider-xxxxxxxx</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The list of snapshots for the model card. Array items are map structures with unspecified members. The API definition does not specify the snapshot content or generation rules.</p>
             */
            public Builder snapshots(java.util.List<java.util.Map<String, ?>> snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The source identifier of the model card. The valid values are not specified in the API definition.</p>
             * 
             * <strong>example:</strong>
             * <p>source-xxxxxxxx</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
