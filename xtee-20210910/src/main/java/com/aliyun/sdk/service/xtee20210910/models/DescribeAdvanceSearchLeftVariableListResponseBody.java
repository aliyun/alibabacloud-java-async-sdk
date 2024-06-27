// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvanceSearchLeftVariableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvanceSearchLeftVariableListResponseBody</p>
 */
public class DescribeAdvanceSearchLeftVariableListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAdvanceSearchLeftVariableListResponseBody build() {
            return new DescribeAdvanceSearchLeftVariableListResponseBody(this);
        } 

    } 

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

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * displayType.
             */
            public Builder displayType(String displayType) {
                this.displayType = displayType;
                return this;
            }

            /**
             * fieldRank.
             */
            public Builder fieldRank(Long fieldRank) {
                this.fieldRank = fieldRank;
                return this;
            }

            /**
             * fieldType.
             */
            public Builder fieldType(String fieldType) {
                this.fieldType = fieldType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * parentName.
             */
            public Builder parentName(String parentName) {
                this.parentName = parentName;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * type.
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
