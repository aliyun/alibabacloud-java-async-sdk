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
 * {@link ListFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionsResponseBody</p>
 */
public class ListFunctionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListFunctionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsResponseBody create() {
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

        private Builder(ListFunctionsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0be3e0b716671885050924814e3623</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFunctionsResponseBody build() {
            return new ListFunctionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionsResponseBody</p>
     */
    public static class Functions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("class")
        private String _class;

        @com.aliyun.core.annotation.NameInMap("creationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("resources")
        private String resources;

        @com.aliyun.core.annotation.NameInMap("schema")
        private String schema;

        private Functions(Builder builder) {
            this._class = builder._class;
            this.creationTime = builder.creationTime;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.owner = builder.owner;
            this.resources = builder.resources;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return resources
         */
        public String getResources() {
            return this.resources;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private String _class; 
            private Long creationTime; 
            private String displayName; 
            private String name; 
            private String owner; 
            private String resources; 
            private String schema; 

            private Builder() {
            } 

            private Builder(Functions model) {
                this._class = model._class;
                this.creationTime = model.creationTime;
                this.displayName = model.displayName;
                this.name = model.name;
                this.owner = model.owner;
                this.resources = model.resources;
                this.schema = model.schema;
            } 

            /**
             * <p>The class in which the function was defined.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * <p>The time when the function was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1664505167000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The display name of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>getdate</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The name of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>getdate</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>odpsowner</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the resource that was associated with the function.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The schema of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("functions")
        private java.util.List<Functions> functions;

        @com.aliyun.core.annotation.NameInMap("marker")
        private String marker;

        @com.aliyun.core.annotation.NameInMap("maxItem")
        private Integer maxItem;

        private Data(Builder builder) {
            this.functions = builder.functions;
            this.marker = builder.marker;
            this.maxItem = builder.maxItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return functions
         */
        public java.util.List<Functions> getFunctions() {
            return this.functions;
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return maxItem
         */
        public Integer getMaxItem() {
            return this.maxItem;
        }

        public static final class Builder {
            private java.util.List<Functions> functions; 
            private String marker; 
            private Integer maxItem; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.functions = model.functions;
                this.marker = model.marker;
                this.maxItem = model.maxItem;
            } 

            /**
             * <p>The information about each function.</p>
             */
            public Builder functions(java.util.List<Functions> functions) {
                this.functions = functions;
                return this;
            }

            /**
             * <p>Indicates the marker after which the returned list begins.</p>
             * 
             * <strong>example:</strong>
             * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * <p>The maximum number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxItem(Integer maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
