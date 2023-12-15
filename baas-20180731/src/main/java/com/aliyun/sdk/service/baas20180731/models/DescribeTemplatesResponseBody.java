// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTemplatesResponseBody</p>
 */
public class DescribeTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplatesResponseBody create() {
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

        public DescribeTemplatesResponseBody build() {
            return new DescribeTemplatesResponseBody(this);
        } 

    } 

    public static class SchemaList extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsTemplate")
        private Integer isTemplate;

        @NameInMap("Name")
        private String name;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("Version")
        private Long version;

        private SchemaList(Builder builder) {
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

        public static SchemaList create() {
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
        public Integer getIsTemplate() {
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
            private Integer isTemplate; 
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
            public Builder isTemplate(Integer isTemplate) {
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

            public SchemaList build() {
                return new SchemaList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("SchemaList")
        private java.util.List < SchemaList> schemaList;

        private Result(Builder builder) {
            this.schemaList = builder.schemaList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return schemaList
         */
        public java.util.List < SchemaList> getSchemaList() {
            return this.schemaList;
        }

        public static final class Builder {
            private java.util.List < SchemaList> schemaList; 

            /**
             * SchemaList.
             */
            public Builder schemaList(java.util.List < SchemaList> schemaList) {
                this.schemaList = schemaList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
