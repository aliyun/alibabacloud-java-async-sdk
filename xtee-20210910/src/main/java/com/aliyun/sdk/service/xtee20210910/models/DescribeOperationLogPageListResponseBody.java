// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < ResultObject> resultObject;

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
        private String requestId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List < ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

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

        public DescribeOperationLogPageListResponseBody build() {
            return new DescribeOperationLogPageListResponseBody(this);
        } 

    } 

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

            /**
             * clientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
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
             * newContent.
             */
            public Builder newContent(String newContent) {
                this.newContent = newContent;
                return this;
            }

            /**
             * oldContent.
             */
            public Builder oldContent(String oldContent) {
                this.oldContent = oldContent;
                return this;
            }

            /**
             * operationSummary.
             */
            public Builder operationSummary(String operationSummary) {
                this.operationSummary = operationSummary;
                return this;
            }

            /**
             * operationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * userName.
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
