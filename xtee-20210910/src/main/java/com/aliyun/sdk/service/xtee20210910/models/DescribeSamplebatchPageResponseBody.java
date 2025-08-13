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
 * {@link DescribeSamplebatchPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSamplebatchPageResponseBody</p>
 */
public class DescribeSamplebatchPageResponseBody extends TeaModel {
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

    private DescribeSamplebatchPageResponseBody(Builder builder) {
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

    public static DescribeSamplebatchPageResponseBody create() {
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

        private Builder(DescribeSamplebatchPageResponseBody model) {
            this.requestId = model.requestId;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>ID of the request</p>
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
         * <p>Page size, with a default value of 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeSamplebatchPageResponseBody build() {
            return new DescribeSamplebatchPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSamplebatchPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSamplebatchPageResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batchName")
        private String batchName;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("dataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("initValidFileRow")
        private Long initValidFileRow;

        @com.aliyun.core.annotation.NameInMap("sampleBatchType")
        private String sampleBatchType;

        @com.aliyun.core.annotation.NameInMap("services")
        private String services;

        @com.aliyun.core.annotation.NameInMap("updator")
        private String updator;

        @com.aliyun.core.annotation.NameInMap("uuid")
        private String uuid;

        private ResultObject(Builder builder) {
            this.batchName = builder.batchName;
            this.creator = builder.creator;
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.initValidFileRow = builder.initValidFileRow;
            this.sampleBatchType = builder.sampleBatchType;
            this.services = builder.services;
            this.updator = builder.updator;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return batchName
         */
        public String getBatchName() {
            return this.batchName;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
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
         * @return initValidFileRow
         */
        public Long getInitValidFileRow() {
            return this.initValidFileRow;
        }

        /**
         * @return sampleBatchType
         */
        public String getSampleBatchType() {
            return this.sampleBatchType;
        }

        /**
         * @return services
         */
        public String getServices() {
            return this.services;
        }

        /**
         * @return updator
         */
        public String getUpdator() {
            return this.updator;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String batchName; 
            private String creator; 
            private String dataType; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long initValidFileRow; 
            private String sampleBatchType; 
            private String services; 
            private String updator; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.batchName = model.batchName;
                this.creator = model.creator;
                this.dataType = model.dataType;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.initValidFileRow = model.initValidFileRow;
                this.sampleBatchType = model.sampleBatchType;
                this.services = model.services;
                this.updator = model.updator;
                this.uuid = model.uuid;
            } 

            /**
             * <p>Sample batch name</p>
             * 
             * <strong>example:</strong>
             * <p>白样本</p>
             */
            public Builder batchName(String batchName) {
                this.batchName = batchName;
                return this;
            }

            /**
             * <p>Creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1519714049632764</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Data type</p>
             * 
             * <strong>example:</strong>
             * <p>mobile</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>Modification time</p>
             * 
             * <strong>example:</strong>
             * <p>1565701886000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Valid sample content data</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder initValidFileRow(Long initValidFileRow) {
                this.initValidFileRow = initValidFileRow;
                return this;
            }

            /**
             * <p>Specific type of the sample list</p>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder sampleBatchType(String sampleBatchType) {
                this.sampleBatchType = sampleBatchType;
                return this;
            }

            /**
             * <p>Service ID</p>
             * 
             * <strong>example:</strong>
             * <p>account_abuse</p>
             */
            public Builder services(String services) {
                this.services = services;
                return this;
            }

            /**
             * <p>Modifier</p>
             * 
             * <strong>example:</strong>
             * <p>1519714049632764</p>
             */
            public Builder updator(String updator) {
                this.updator = updator;
                return this;
            }

            /**
             * <p>Sample batch UUID</p>
             * 
             * <strong>example:</strong>
             * <p>203f1ae65c0a41a49dc4f8a47946caa2</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
