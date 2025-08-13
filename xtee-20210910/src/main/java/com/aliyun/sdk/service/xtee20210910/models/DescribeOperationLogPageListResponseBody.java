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
 * {@link DescribeOperationLogPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperationLogPageListResponseBody</p>
 */
public class DescribeOperationLogPageListResponseBody extends TeaModel {
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

    private DescribeOperationLogPageListResponseBody(Builder builder) {
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

    public static DescribeOperationLogPageListResponseBody create() {
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

        private Builder(DescribeOperationLogPageListResponseBody model) {
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
         * <p>Page size, default value is 10</p>
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
         * <p>3</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeOperationLogPageListResponseBody build() {
            return new DescribeOperationLogPageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOperationLogPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOperationLogPageListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("newContent")
        private String newContent;

        @com.aliyun.core.annotation.NameInMap("oldContent")
        private String oldContent;

        @com.aliyun.core.annotation.NameInMap("operationSummary")
        private String operationSummary;

        @com.aliyun.core.annotation.NameInMap("operationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private ResultObject(Builder builder) {
            this.clientIp = builder.clientIp;
            this.gmtCreate = builder.gmtCreate;
            this.newContent = builder.newContent;
            this.oldContent = builder.oldContent;
            this.operationSummary = builder.operationSummary;
            this.operationType = builder.operationType;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return newContent
         */
        public String getNewContent() {
            return this.newContent;
        }

        /**
         * @return oldContent
         */
        public String getOldContent() {
            return this.oldContent;
        }

        /**
         * @return operationSummary
         */
        public String getOperationSummary() {
            return this.operationSummary;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String clientIp; 
            private Long gmtCreate; 
            private String newContent; 
            private String oldContent; 
            private String operationSummary; 
            private String operationType; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.clientIp = model.clientIp;
                this.gmtCreate = model.gmtCreate;
                this.newContent = model.newContent;
                this.oldContent = model.oldContent;
                this.operationSummary = model.operationSummary;
                this.operationType = model.operationType;
                this.userName = model.userName;
            } 

            /**
             * <p>Client IP.</p>
             * 
             * <strong>example:</strong>
             * <p>100.68.***.166</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
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
             * <p>Content after operation</p>
             * 
             * <strong>example:</strong>
             * <p>@selfvariable_02</p>
             */
            public Builder newContent(String newContent) {
                this.newContent = newContent;
                return this;
            }

            /**
             * <p>Content before operation</p>
             * 
             * <strong>example:</strong>
             * <p>@selfvariable_02 + 1001</p>
             */
            public Builder oldContent(String oldContent) {
                this.oldContent = oldContent;
                return this;
            }

            /**
             * <p>Operation summary</p>
             * 
             * <strong>example:</strong>
             * <p>更新事件:决策引擎可观测性持续建设_事件A(de_afghcf6411)</p>
             */
            public Builder operationSummary(String operationSummary) {
                this.operationSummary = operationSummary;
                return this;
            }

            /**
             * <p>Operation type.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_EVENT</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>Operator</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
