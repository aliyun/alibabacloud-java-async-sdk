// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateExperimentConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExperimentConfigResponseBody</p>
 */
public class UpdateExperimentConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private UpdateExperimentConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateExperimentConfigResponseBody build() {
            return new UpdateExperimentConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateExperimentConfigResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExperimentConfigResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("experimentValue")
        private String experimentValue;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Config(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.experimentValue = builder.experimentValue;
            this.key = builder.key;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return experimentValue
         */
        public String getExperimentValue() {
            return this.experimentValue;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String defaultValue; 
            private String experimentValue; 
            private String key; 
            private String name; 

            /**
             * defaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * experimentValue.
             */
            public Builder experimentValue(String experimentValue) {
                this.experimentValue = experimentValue;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExperimentConfigResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExperimentConfigResponseBody</p>
     */
    public static class Algorithms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.List < Config> config;

        @com.aliyun.core.annotation.NameInMap("defaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("experimentValue")
        private String experimentValue;

        @com.aliyun.core.annotation.NameInMap("hasConfig")
        private Boolean hasConfig;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Algorithms(Builder builder) {
            this.category = builder.category;
            this.config = builder.config;
            this.defaultValue = builder.defaultValue;
            this.experimentValue = builder.experimentValue;
            this.hasConfig = builder.hasConfig;
            this.key = builder.key;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Algorithms create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return config
         */
        public java.util.List < Config> getConfig() {
            return this.config;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return experimentValue
         */
        public String getExperimentValue() {
            return this.experimentValue;
        }

        /**
         * @return hasConfig
         */
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private java.util.List < Config> config; 
            private String defaultValue; 
            private String experimentValue; 
            private Boolean hasConfig; 
            private String key; 
            private String name; 
            private String type; 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * config.
             */
            public Builder config(java.util.List < Config> config) {
                this.config = config;
                return this;
            }

            /**
             * defaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * experimentValue.
             */
            public Builder experimentValue(String experimentValue) {
                this.experimentValue = experimentValue;
                return this;
            }

            /**
             * hasConfig.
             */
            public Builder hasConfig(Boolean hasConfig) {
                this.hasConfig = hasConfig;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Algorithms build() {
                return new Algorithms(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateExperimentConfigResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateExperimentConfigResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("algorithms")
        private java.util.List < Algorithms> algorithms;

        @com.aliyun.core.annotation.NameInMap("base")
        private Boolean base;

        @com.aliyun.core.annotation.NameInMap("buckets")
        private java.util.List < String > buckets;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("experimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("offlineTime")
        private String offlineTime;

        @com.aliyun.core.annotation.NameInMap("onlineTime")
        private String onlineTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.algorithms = builder.algorithms;
            this.base = builder.base;
            this.buckets = builder.buckets;
            this.description = builder.description;
            this.experimentId = builder.experimentId;
            this.name = builder.name;
            this.offlineTime = builder.offlineTime;
            this.onlineTime = builder.onlineTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return algorithms
         */
        public java.util.List < Algorithms> getAlgorithms() {
            return this.algorithms;
        }

        /**
         * @return base
         */
        public Boolean getBase() {
            return this.base;
        }

        /**
         * @return buckets
         */
        public java.util.List < String > getBuckets() {
            return this.buckets;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return offlineTime
         */
        public String getOfflineTime() {
            return this.offlineTime;
        }

        /**
         * @return onlineTime
         */
        public String getOnlineTime() {
            return this.onlineTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Algorithms> algorithms; 
            private Boolean base; 
            private java.util.List < String > buckets; 
            private String description; 
            private String experimentId; 
            private String name; 
            private String offlineTime; 
            private String onlineTime; 
            private String status; 

            /**
             * algorithms.
             */
            public Builder algorithms(java.util.List < Algorithms> algorithms) {
                this.algorithms = algorithms;
                return this;
            }

            /**
             * base.
             */
            public Builder base(Boolean base) {
                this.base = base;
                return this;
            }

            /**
             * buckets.
             */
            public Builder buckets(java.util.List < String > buckets) {
                this.buckets = buckets;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * experimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
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
             * offlineTime.
             */
            public Builder offlineTime(String offlineTime) {
                this.offlineTime = offlineTime;
                return this;
            }

            /**
             * onlineTime.
             */
            public Builder onlineTime(String onlineTime) {
                this.onlineTime = onlineTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
