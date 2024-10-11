// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDefaultAlgorithmsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefaultAlgorithmsResponseBody</p>
 */
public class DescribeDefaultAlgorithmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private DescribeDefaultAlgorithmsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultAlgorithmsResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F60021C4-57AF-5F46-9B3E-FCEF1C7A1459</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeDefaultAlgorithmsResponseBody build() {
            return new DescribeDefaultAlgorithmsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefaultAlgorithmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefaultAlgorithmsResponseBody</p>
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
             * <p>The default value of the algorithm configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>swing;commoni2i;pcategory;scategory</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The custom value of the algorithm configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder experimentValue(String experimentValue) {
                this.experimentValue = experimentValue;
                return this;
            }

            /**
             * <p>The key of the algorithm configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>I2I-truncedquantity</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The name of the algorithm configuration item. (Note: If you use the default algorithm, the console obtains the algorithm name from Medusa. If you customize an algorithm for the experiment, the algorithm name is directly returned.)</p>
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
     * {@link DescribeDefaultAlgorithmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefaultAlgorithmsResponseBody</p>
     */
    public static class Result extends TeaModel {
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

        private Result(Builder builder) {
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

        public static Result create() {
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
             * <p>The algorithm category. Valid values: RECALL and RANK.</p>
             * 
             * <strong>example:</strong>
             * <p>RECALL</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The information about the child configuration item.</p>
             */
            public Builder config(java.util.List < Config> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The default value of the algorithm. If you set key to i2i, hot, or new, the value of this parameter is true or false. If you set key to mtorder, the value of this parameter is a list of filtering algorithms ranked by priority.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The custom value of the algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder experimentValue(String experimentValue) {
                this.experimentValue = experimentValue;
                return this;
            }

            /**
             * <p>Indicates whether child configuration items exist. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasConfig(Boolean hasConfig) {
                this.hasConfig = hasConfig;
                return this;
            }

            /**
             * <p>The algorithm key. Valid values: i2i: the I2I filtering algorithm. u2x2i: the U2X2I filtering algorithm. hot: the filtering algorithm for popular items. new: the filtering algorithm for new items. embedding: the vector filtering algorithm. mtorder: the priority of the filtering algorithm. rankservice: the ranking service.</p>
             * 
             * <strong>example:</strong>
             * <p>I2I</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The algorithm name. (Note: If you use the default algorithm, the console obtains the algorithm name from Medusa. If you customize an algorithm for the experiment, the algorithm name is directly returned.)</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The algorithm type. Valid values: SYSTEM and CUSTOM.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
