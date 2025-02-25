// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNameListVariablePageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNameListVariablePageListResponseBody</p>
 */
public class DescribeNameListVariablePageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeNameListVariablePageListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNameListVariablePageListResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

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

        /**
         * totalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeNameListVariablePageListResponseBody build() {
            return new DescribeNameListVariablePageListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("leftCapacity")
        private Long leftCapacity;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameListType")
        private String nameListType;

        @com.aliyun.core.annotation.NameInMap("refObjId")
        private String refObjId;

        @com.aliyun.core.annotation.NameInMap("refObjType")
        private Long refObjType;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        private ResultObject(Builder builder) {
            this.capacity = builder.capacity;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.leftCapacity = builder.leftCapacity;
            this.name = builder.name;
            this.nameListType = builder.nameListType;
            this.refObjId = builder.refObjId;
            this.refObjType = builder.refObjType;
            this.sourceType = builder.sourceType;
            this.title = builder.title;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return leftCapacity
         */
        public Long getLeftCapacity() {
            return this.leftCapacity;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameListType
         */
        public String getNameListType() {
            return this.nameListType;
        }

        /**
         * @return refObjId
         */
        public String getRefObjId() {
            return this.refObjId;
        }

        /**
         * @return refObjType
         */
        public Long getRefObjType() {
            return this.refObjType;
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

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long capacity; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Long leftCapacity; 
            private String name; 
            private String nameListType; 
            private String refObjId; 
            private Long refObjType; 
            private String sourceType; 
            private String title; 
            private String type; 
            private Long userId; 

            /**
             * capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
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
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * leftCapacity.
             */
            public Builder leftCapacity(Long leftCapacity) {
                this.leftCapacity = leftCapacity;
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
             * nameListType.
             */
            public Builder nameListType(String nameListType) {
                this.nameListType = nameListType;
                return this;
            }

            /**
             * refObjId.
             */
            public Builder refObjId(String refObjId) {
                this.refObjId = refObjId;
                return this;
            }

            /**
             * refObjType.
             */
            public Builder refObjType(Long refObjType) {
                this.refObjType = refObjType;
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

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
