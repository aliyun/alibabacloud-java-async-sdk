// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeAdvanceSearchLeftVariableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvanceSearchLeftVariableListResponseBody</p>
 */
public class DescribeAdvanceSearchLeftVariableListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeAdvanceSearchLeftVariableListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvanceSearchLeftVariableListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(DescribeAdvanceSearchLeftVariableListResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBody build() {
            return new DescribeAdvanceSearchLeftVariableListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdvanceSearchLeftVariableListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvanceSearchLeftVariableListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayType")
        private String displayType;

        @com.aliyun.core.annotation.NameInMap("fieldRank")
        private Long fieldRank;

        @com.aliyun.core.annotation.NameInMap("fieldType")
        private String fieldType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parentName")
        private String parentName;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ResultObject(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.displayType = builder.displayType;
            this.fieldRank = builder.fieldRank;
            this.fieldType = builder.fieldType;
            this.id = builder.id;
            this.name = builder.name;
            this.parentName = builder.parentName;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayType
         */
        public String getDisplayType() {
            return this.displayType;
        }

        /**
         * @return fieldRank
         */
        public Long getFieldRank() {
            return this.fieldRank;
        }

        /**
         * @return fieldType
         */
        public String getFieldType() {
            return this.fieldType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentName
         */
        public String getParentName() {
            return this.parentName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String displayType; 
            private Long fieldRank; 
            private String fieldType; 
            private Long id; 
            private String name; 
            private String parentName; 
            private String sourceType; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.code = model.code;
                this.description = model.description;
                this.displayType = model.displayType;
                this.fieldRank = model.fieldRank;
                this.fieldType = model.fieldType;
                this.id = model.id;
                this.name = model.name;
                this.parentName = model.parentName;
                this.sourceType = model.sourceType;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>Variable code</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>年龄描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Display type and grouping label</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * <p>Variable return value type</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder fieldRank(Long fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * <p>Field table sorting</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * <p>Primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>2453</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Parent node</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * <p>Data source</p>
             * 
             * <strong>example:</strong>
             * <p>SAF</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>Title.</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Variable type</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
