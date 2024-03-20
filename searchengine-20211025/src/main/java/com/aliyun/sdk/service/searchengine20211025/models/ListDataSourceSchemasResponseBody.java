// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceSchemasResponseBody</p>
 */
public class ListDataSourceSchemasResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListDataSourceSchemasResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceSchemasResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result returned.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDataSourceSchemasResponseBody build() {
            return new ListDataSourceSchemasResponseBody(this);
        } 

    } 

    public static class PrimaryKey extends TeaModel {
        @NameInMap("hasPrimaryKeyAttribute")
        private Boolean hasPrimaryKeyAttribute;

        @NameInMap("isPrimaryKey")
        private Boolean isPrimaryKey;

        @NameInMap("isPrimaryKeySorted")
        private Boolean isPrimaryKeySorted;

        private PrimaryKey(Builder builder) {
            this.hasPrimaryKeyAttribute = builder.hasPrimaryKeyAttribute;
            this.isPrimaryKey = builder.isPrimaryKey;
            this.isPrimaryKeySorted = builder.isPrimaryKeySorted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrimaryKey create() {
            return builder().build();
        }

        /**
         * @return hasPrimaryKeyAttribute
         */
        public Boolean getHasPrimaryKeyAttribute() {
            return this.hasPrimaryKeyAttribute;
        }

        /**
         * @return isPrimaryKey
         */
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        /**
         * @return isPrimaryKeySorted
         */
        public Boolean getIsPrimaryKeySorted() {
            return this.isPrimaryKeySorted;
        }

        public static final class Builder {
            private Boolean hasPrimaryKeyAttribute; 
            private Boolean isPrimaryKey; 
            private Boolean isPrimaryKeySorted; 

            /**
             * Indicates whether it has the primary key property. **true** indicates that it has the primary key property, and **false** indicates that it does not have the primary key property.
             */
            public Builder hasPrimaryKeyAttribute(Boolean hasPrimaryKeyAttribute) {
                this.hasPrimaryKeyAttribute = hasPrimaryKeyAttribute;
                return this;
            }

            /**
             * Indicates whether it is the primary key. Valid values: true and false. **true** indicates that it is the primary key, and **false** indicates that it is not the primary key.
             */
            public Builder isPrimaryKey(Boolean isPrimaryKey) {
                this.isPrimaryKey = isPrimaryKey;
                return this;
            }

            /**
             * Indicates whether data is sorted based on the primary key. Valid values: true and false. **true** indicates that data is sorted based on the primary key, and **false** indicates that data is not sorted based on the primary key.
             */
            public Builder isPrimaryKeySorted(Boolean isPrimaryKeySorted) {
                this.isPrimaryKeySorted = isPrimaryKeySorted;
                return this;
            }

            public PrimaryKey build() {
                return new PrimaryKey(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("addIndex")
        private Boolean addIndex;

        @NameInMap("attribute")
        private Boolean attribute;

        @NameInMap("custom")
        private Boolean custom;

        @NameInMap("name")
        private String name;

        @NameInMap("primaryKey")
        private PrimaryKey primaryKey;

        @NameInMap("summary")
        private Boolean summary;

        @NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.addIndex = builder.addIndex;
            this.attribute = builder.attribute;
            this.custom = builder.custom;
            this.name = builder.name;
            this.primaryKey = builder.primaryKey;
            this.summary = builder.summary;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return addIndex
         */
        public Boolean getAddIndex() {
            return this.addIndex;
        }

        /**
         * @return attribute
         */
        public Boolean getAttribute() {
            return this.attribute;
        }

        /**
         * @return custom
         */
        public Boolean getCustom() {
            return this.custom;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primaryKey
         */
        public PrimaryKey getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return summary
         */
        public Boolean getSummary() {
            return this.summary;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean addIndex; 
            private Boolean attribute; 
            private Boolean custom; 
            private String name; 
            private PrimaryKey primaryKey; 
            private Boolean summary; 
            private String type; 

            /**
             * Indicates whether the index properties are added. Valid values: true and false. **true** indicates that the index properties are added, and **false** indicates that the index properties are not added.
             */
            public Builder addIndex(Boolean addIndex) {
                this.addIndex = addIndex;
                return this;
            }

            /**
             * Indicates whether it is an attribute field. Valid values: true and false. **true** indicates that it is an attribute field, and **false** indicates that it is not an attribute field.
             */
            public Builder attribute(Boolean attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * Indicates whether it is a custom field. Valid values: true and false. **true** indicates that it is a custom field, and **false** indicates that it is not a custom field.
             */
            public Builder custom(Boolean custom) {
                this.custom = custom;
                return this;
            }

            /**
             * The name of the field.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The primary key.
             */
            public Builder primaryKey(PrimaryKey primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * Indicates whether the information can be displayed. Valid values: true and false. **true** indicates that the information can be displayed, and **false** indicates that the information cannot be displayed.
             */
            public Builder summary(Boolean summary) {
                this.summary = summary;
                return this;
            }

            /**
             * The type of the field.
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
