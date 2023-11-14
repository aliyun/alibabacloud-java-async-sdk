// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionsResponseBody</p>
 */
public class ListFunctionsResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
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

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFunctionsResponseBody build() {
            return new ListFunctionsResponseBody(this);
        } 

    } 

    public static class Functions extends TeaModel {
        @NameInMap("class")
        private String _class;

        @NameInMap("creationTime")
        private Long creationTime;

        @NameInMap("displayName")
        private String displayName;

        @NameInMap("name")
        private String name;

        @NameInMap("owner")
        private String owner;

        @NameInMap("resources")
        private String resources;

        @NameInMap("schema")
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

            /**
             * The class in which the function was defined.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * The time when the function was created. Unit: milliseconds.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The name of the function.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The owner of the function.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The name of the resource that was associated with the function.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The schema of the function.
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
    public static class Data extends TeaModel {
        @NameInMap("functions")
        private java.util.List < Functions> functions;

        @NameInMap("marker")
        private String marker;

        @NameInMap("maxItem")
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
        public java.util.List < Functions> getFunctions() {
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
            private java.util.List < Functions> functions; 
            private String marker; 
            private Integer maxItem; 

            /**
             * The information about each function.
             */
            public Builder functions(java.util.List < Functions> functions) {
                this.functions = functions;
                return this;
            }

            /**
             * Indicates the marker after which the returned list begins.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * The maximum number of entries returned per page.
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
