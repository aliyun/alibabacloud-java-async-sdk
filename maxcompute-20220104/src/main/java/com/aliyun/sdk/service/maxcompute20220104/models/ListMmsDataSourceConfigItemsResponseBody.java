// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListMmsDataSourceConfigItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMmsDataSourceConfigItemsResponseBody</p>
 */
public class ListMmsDataSourceConfigItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMmsDataSourceConfigItemsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsDataSourceConfigItemsResponseBody create() {
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

        private Builder(ListMmsDataSourceConfigItemsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of configuration items.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>688003E1-D1B4-5468-957E-2FFB3AC8D79B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMmsDataSourceConfigItemsResponseBody build() {
            return new ListMmsDataSourceConfigItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsDataSourceConfigItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsDataSourceConfigItemsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("enums")
        private java.util.List<String> enums;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("placeHolder")
        private String placeHolder;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("subItems")
        private java.util.Map<String, ?> subItems;

        @com.aliyun.core.annotation.NameInMap("subType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private Data(Builder builder) {
            this.desc = builder.desc;
            this.enums = builder.enums;
            this.group = builder.group;
            this.key = builder.key;
            this.name = builder.name;
            this.placeHolder = builder.placeHolder;
            this.required = builder.required;
            this.subItems = builder.subItems;
            this.subType = builder.subType;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return enums
         */
        public java.util.List<String> getEnums() {
            return this.enums;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
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
         * @return placeHolder
         */
        public String getPlaceHolder() {
            return this.placeHolder;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return subItems
         */
        public java.util.Map<String, ?> getSubItems() {
            return this.subItems;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List<String> enums; 
            private String group; 
            private String key; 
            private String name; 
            private String placeHolder; 
            private Boolean required; 
            private java.util.Map<String, ?> subItems; 
            private String subType; 
            private String type; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.desc = model.desc;
                this.enums = model.enums;
                this.group = model.group;
                this.key = model.key;
                this.name = model.name;
                this.placeHolder = model.placeHolder;
                this.required = model.required;
                this.subItems = model.subItems;
                this.subType = model.subType;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The description of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute Default Project</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The enumerated values for the configuration item.</p>
             */
            public Builder enums(java.util.List<String> enums) {
                this.enums = enums;
                return this;
            }

            /**
             * <p>The group to which the configuration item belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>group.basic</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The key of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>mc.default.project</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The name of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute Default Project</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The placeholder for the configuration value.</p>
             * 
             * <strong>example:</strong>
             * <p>project</p>
             */
            public Builder placeHolder(String placeHolder) {
                this.placeHolder = placeHolder;
                return this;
            }

            /**
             * <p>Indicates whether the configuration item is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The sub-items of the configuration item.</p>
             */
            public Builder subItems(java.util.Map<String, ?> subItems) {
                this.subItems = subItems;
                return this;
            }

            /**
             * <p>The file type. This parameter is valid only when <code>type</code> is <code>file</code>. For example, .keytab.</p>
             * 
             * <strong>example:</strong>
             * <p>.keytab</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The data type of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>p1=1/p2=abc</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
