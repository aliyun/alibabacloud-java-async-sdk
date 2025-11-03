// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetAlertStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlertStrategyResponseBody</p>
 */
public class GetAlertStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAlertStrategyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertStrategyResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAlertStrategyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAlertStrategyResponseBody build() {
            return new GetAlertStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlertStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertStrategyResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusters")
        private java.util.List<String> clusters;

        @com.aliyun.core.annotation.NameInMap("items")
        private Object items;

        private Strategy(Builder builder) {
            this.clusters = builder.clusters;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return clusters
         */
        public java.util.List<String> getClusters() {
            return this.clusters;
        }

        /**
         * @return items
         */
        public Object getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<String> clusters; 
            private Object items; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.clusters = model.clusters;
                this.items = model.items;
            } 

            /**
             * clusters.
             */
            public Builder clusters(java.util.List<String> clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * items.
             */
            public Builder items(Object items) {
                this.items = items;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAlertStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlertStrategyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private Long createdAt;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("k8sLabel")
        private Boolean k8sLabel;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("strategy")
        private Strategy strategy;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private Long updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.k8sLabel = builder.k8sLabel;
            this.name = builder.name;
            this.strategy = builder.strategy;
            this.uid = builder.uid;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return k8sLabel
         */
        public Boolean getK8sLabel() {
            return this.k8sLabel;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Long createdAt; 
            private Boolean enabled; 
            private Long id; 
            private Boolean k8sLabel; 
            private String name; 
            private Strategy strategy; 
            private String uid; 
            private Long updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.enabled = model.enabled;
                this.id = model.id;
                this.k8sLabel = model.k8sLabel;
                this.name = model.name;
                this.strategy = model.strategy;
                this.uid = model.uid;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * createdAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * k8sLabel.
             */
            public Builder k8sLabel(Boolean k8sLabel) {
                this.k8sLabel = k8sLabel;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * strategy.
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
