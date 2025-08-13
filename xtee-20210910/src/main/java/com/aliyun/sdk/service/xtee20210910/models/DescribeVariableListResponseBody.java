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
 * {@link DescribeVariableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVariableListResponseBody</p>
 */
public class DescribeVariableListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeVariableListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableListResponseBody create() {
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
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
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
        private String requestId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List<ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeVariableListResponseBody model) {
            this.requestId = model.requestId;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Returned object.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeVariableListResponseBody build() {
            return new DescribeVariableListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVariableListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVariableListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private String defineId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("extendInfo")
        private java.util.Map<String, ?> extendInfo;

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

        @com.aliyun.core.annotation.NameInMap("outputsType")
        private String outputsType;

        @com.aliyun.core.annotation.NameInMap("refObjId")
        private String refObjId;

        @com.aliyun.core.annotation.NameInMap("refObjName")
        private String refObjName;

        @com.aliyun.core.annotation.NameInMap("refObjType")
        private String refObjType;

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
            this.defineId = builder.defineId;
            this.description = builder.description;
            this.extendInfo = builder.extendInfo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.leftCapacity = builder.leftCapacity;
            this.name = builder.name;
            this.outputsType = builder.outputsType;
            this.refObjId = builder.refObjId;
            this.refObjName = builder.refObjName;
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
         * @return defineId
         */
        public String getDefineId() {
            return this.defineId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extendInfo
         */
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
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
         * @return outputsType
         */
        public String getOutputsType() {
            return this.outputsType;
        }

        /**
         * @return refObjId
         */
        public String getRefObjId() {
            return this.refObjId;
        }

        /**
         * @return refObjName
         */
        public String getRefObjName() {
            return this.refObjName;
        }

        /**
         * @return refObjType
         */
        public String getRefObjType() {
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
            private String defineId; 
            private String description; 
            private java.util.Map<String, ?> extendInfo; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Long leftCapacity; 
            private String name; 
            private String outputsType; 
            private String refObjId; 
            private String refObjName; 
            private String refObjType; 
            private String sourceType; 
            private String title; 
            private String type; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.capacity = model.capacity;
                this.defineId = model.defineId;
                this.description = model.description;
                this.extendInfo = model.extendInfo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.leftCapacity = model.leftCapacity;
                this.name = model.name;
                this.outputsType = model.outputsType;
                this.refObjId = model.refObjId;
                this.refObjName = model.refObjName;
                this.refObjType = model.refObjType;
                this.sourceType = model.sourceType;
                this.title = model.title;
                this.type = model.type;
                this.userId = model.userId;
            } 

            /**
             * <p>Capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>Variable definition ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder defineId(String defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * <p>Description information.</p>
             * 
             * <strong>example:</strong>
             * <p>变量描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Extended information.</p>
             * 
             * <strong>example:</strong>
             * <p>暂无</p>
             */
            public Builder extendInfo(java.util.Map<String, ?> extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1621578648000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1565701886000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Variable ID.</p>
             * 
             * <strong>example:</strong>
             * <p>497</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Remaining capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder leftCapacity(Long leftCapacity) {
                this.leftCapacity = leftCapacity;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p><strong>ipLocationCityCode</strong></p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Variable output type</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder outputsType(String outputsType) {
                this.outputsType = outputsType;
                return this;
            }

            /**
             * <p>Associated event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>de_agdxgz0246</p>
             */
            public Builder refObjId(String refObjId) {
                this.refObjId = refObjId;
                return this;
            }

            /**
             * <p>Associated event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册事件</p>
             */
            public Builder refObjName(String refObjName) {
                this.refObjName = refObjName;
                return this;
            }

            /**
             * <p>Associated object type of the variable</p>
             * 
             * <strong>example:</strong>
             * <p>EVENT</p>
             */
            public Builder refObjType(String refObjType) {
                this.refObjType = refObjType;
                return this;
            }

            /**
             * <p>Source type.</p>
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
             * <p>设备风险识别_标签</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Variable type.</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>User ID to which the data belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
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
