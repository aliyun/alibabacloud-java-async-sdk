// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockchainSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBlockchainSchemaResponseBody</p>
 */
public class DescribeBlockchainSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeBlockchainSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlockchainSchemaResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeBlockchainSchemaResponseBody build() {
            return new DescribeBlockchainSchemaResponseBody(this);
        } 

    } 

    public static class DataSource extends TeaModel {
        @NameInMap("AllowNull")
        private Integer allowNull;

        @NameInMap("Annotation")
        private String annotation;

        @NameInMap("Field")
        private String field;

        @NameInMap("Indexes")
        private Integer indexes;

        @NameInMap("Key")
        private Integer key;

        @NameInMap("Length")
        private Integer length;

        @NameInMap("Reg")
        private String reg;

        @NameInMap("Type")
        private String type;

        private DataSource(Builder builder) {
            this.allowNull = builder.allowNull;
            this.annotation = builder.annotation;
            this.field = builder.field;
            this.indexes = builder.indexes;
            this.key = builder.key;
            this.length = builder.length;
            this.reg = builder.reg;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return allowNull
         */
        public Integer getAllowNull() {
            return this.allowNull;
        }

        /**
         * @return annotation
         */
        public String getAnnotation() {
            return this.annotation;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return indexes
         */
        public Integer getIndexes() {
            return this.indexes;
        }

        /**
         * @return key
         */
        public Integer getKey() {
            return this.key;
        }

        /**
         * @return length
         */
        public Integer getLength() {
            return this.length;
        }

        /**
         * @return reg
         */
        public String getReg() {
            return this.reg;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer allowNull; 
            private String annotation; 
            private String field; 
            private Integer indexes; 
            private Integer key; 
            private Integer length; 
            private String reg; 
            private String type; 

            /**
             * AllowNull.
             */
            public Builder allowNull(Integer allowNull) {
                this.allowNull = allowNull;
                return this;
            }

            /**
             * Annotation.
             */
            public Builder annotation(String annotation) {
                this.annotation = annotation;
                return this;
            }

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * Indexes.
             */
            public Builder indexes(Integer indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(Integer key) {
                this.key = key;
                return this;
            }

            /**
             * Length.
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * Reg.
             */
            public Builder reg(String reg) {
                this.reg = reg;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("DataSource")
        private java.util.List < DataSource> dataSource;

        private Properties(Builder builder) {
            this.count = builder.count;
            this.dataSource = builder.dataSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return dataSource
         */
        public java.util.List < DataSource> getDataSource() {
            return this.dataSource;
        }

        public static final class Builder {
            private Integer count; 
            private java.util.List < DataSource> dataSource; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(java.util.List < DataSource> dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class Responses extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("Description")
        private String description;

        @NameInMap("Properties")
        private Properties properties;

        private Responses(Builder builder) {
            this.category = builder.category;
            this.categoryName = builder.categoryName;
            this.description = builder.description;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Responses create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String category; 
            private String categoryName; 
            private String description; 
            private Properties properties; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            public Responses build() {
                return new Responses(this);
            } 

        } 

    }
    public static class Schema extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsTemplate")
        private Boolean isTemplate;

        @NameInMap("Name")
        private String name;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("Version")
        private Long version;

        private Schema(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.isTemplate = builder.isTemplate;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schema create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private Long id; 
            private Boolean isTemplate; 
            private String name; 
            private Long updateTime; 
            private Long version; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsTemplate.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Responses")
        private java.util.List < Responses> responses;

        @NameInMap("Schema")
        private Schema schema;

        private Result(Builder builder) {
            this.responses = builder.responses;
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return responses
         */
        public java.util.List < Responses> getResponses() {
            return this.responses;
        }

        /**
         * @return schema
         */
        public Schema getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private java.util.List < Responses> responses; 
            private Schema schema; 

            /**
             * Responses.
             */
            public Builder responses(java.util.List < Responses> responses) {
                this.responses = responses;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(Schema schema) {
                this.schema = schema;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
