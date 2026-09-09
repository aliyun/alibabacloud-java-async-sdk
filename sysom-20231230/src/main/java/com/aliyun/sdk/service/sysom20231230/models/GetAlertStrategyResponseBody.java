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
         * <p>The status code.</p>
         * <ul>
         * <li><code>code == Success</code> indicates that the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization failed. If the authorization fails, check the <code>message</code> field for the detailed fault information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>If <code>code == Success</code>, this field is empty.</li>
         * <li>Otherwise, this field contains the request error information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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

        @com.aliyun.core.annotation.NameInMap("destinations")
        private Object destinations;

        @com.aliyun.core.annotation.NameInMap("items")
        private Object items;

        private Strategy(Builder builder) {
            this.clusters = builder.clusters;
            this.destinations = builder.destinations;
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
         * @return destinations
         */
        public Object getDestinations() {
            return this.destinations;
        }

        /**
         * @return items
         */
        public Object getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<String> clusters; 
            private Object destinations; 
            private Object items; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.clusters = model.clusters;
                this.destinations = model.destinations;
                this.items = model.items;
            } 

            /**
             * <p>The collection of clusters for which alerts are received.</p>
             */
            public Builder clusters(java.util.List<String> clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * <p>The alert contacts.</p>
             */
            public Builder destinations(Object destinations) {
                this.destinations = destinations;
                return this;
            }

            /**
             * <p>The list of anomaly items for which alerts are received.</p>
             * 
             * <strong>example:</strong>
             * <p>Node CPU utilization detection</p>
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1751520976660</p>
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Indicates whether the alert policy is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The alert policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The Kubernetes label.</p>
             */
            public Builder k8sLabel(Boolean k8sLabel) {
                this.k8sLabel = k8sLabel;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>strategy1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The alert policy details.</p>
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1222933234714935</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1751254826285</p>
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
