// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceConfigTagResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterServiceConfigTagResponseBody</p>
 */
public class DescribeClusterServiceConfigTagResponseBody extends TeaModel {
    @NameInMap("ConfigTagList")
    private ConfigTagList configTagList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterServiceConfigTagResponseBody(Builder builder) {
        this.configTagList = builder.configTagList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterServiceConfigTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return configTagList
     */
    public ConfigTagList getConfigTagList() {
        return this.configTagList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigTagList configTagList; 
        private String requestId; 

        /**
         * ConfigTagList.
         */
        public Builder configTagList(ConfigTagList configTagList) {
            this.configTagList = configTagList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterServiceConfigTagResponseBody build() {
            return new DescribeClusterServiceConfigTagResponseBody(this);
        } 

    } 

    public static class Value extends TeaModel {
        @NameInMap("Value")
        private String value;

        @NameInMap("ValueDesc")
        private String valueDesc;

        private Value(Builder builder) {
            this.value = builder.value;
            this.valueDesc = builder.valueDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueDesc
         */
        public String getValueDesc() {
            return this.valueDesc;
        }

        public static final class Builder {
            private String value; 
            private String valueDesc; 

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueDesc.
             */
            public Builder valueDesc(String valueDesc) {
                this.valueDesc = valueDesc;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    public static class ValueList extends TeaModel {
        @NameInMap("Value")
        private java.util.List < Value> value;

        private ValueList(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueList create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public java.util.List < Value> getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List < Value> value; 

            /**
             * Value.
             */
            public Builder value(java.util.List < Value> value) {
                this.value = value;
                return this;
            }

            public ValueList build() {
                return new ValueList(this);
            } 

        } 

    }
    public static class ConfigTag extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        @NameInMap("TagDesc")
        private String tagDesc;

        @NameInMap("ValueList")
        private ValueList valueList;

        private ConfigTag(Builder builder) {
            this.tag = builder.tag;
            this.tagDesc = builder.tagDesc;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTag create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tagDesc
         */
        public String getTagDesc() {
            return this.tagDesc;
        }

        /**
         * @return valueList
         */
        public ValueList getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private String tag; 
            private String tagDesc; 
            private ValueList valueList; 

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * TagDesc.
             */
            public Builder tagDesc(String tagDesc) {
                this.tagDesc = tagDesc;
                return this;
            }

            /**
             * ValueList.
             */
            public Builder valueList(ValueList valueList) {
                this.valueList = valueList;
                return this;
            }

            public ConfigTag build() {
                return new ConfigTag(this);
            } 

        } 

    }
    public static class ConfigTagList extends TeaModel {
        @NameInMap("ConfigTag")
        private java.util.List < ConfigTag> configTag;

        private ConfigTagList(Builder builder) {
            this.configTag = builder.configTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTagList create() {
            return builder().build();
        }

        /**
         * @return configTag
         */
        public java.util.List < ConfigTag> getConfigTag() {
            return this.configTag;
        }

        public static final class Builder {
            private java.util.List < ConfigTag> configTag; 

            /**
             * ConfigTag.
             */
            public Builder configTag(java.util.List < ConfigTag> configTag) {
                this.configTag = configTag;
                return this;
            }

            public ConfigTagList build() {
                return new ConfigTagList(this);
            } 

        } 

    }
}
