// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeListPocResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListPocResponseBody</p>
 */
public class DescribeListPocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private Boolean resultObject;

    @com.aliyun.core.annotation.NameInMap("TotalItem")
    private String totalItem;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private String totalPage;

    private DescribeListPocResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListPocResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
    public Boolean getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public String getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public String getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private String currentPage; 
        private String httpStatusCode; 
        private String message; 
        private String pageSize; 
        private String requestId; 
        private Boolean resultObject; 
        private String totalItem; 
        private String totalPage; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultObject.
         */
        public Builder resultObject(Boolean resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * TotalItem.
         */
        public Builder totalItem(String totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(String totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeListPocResponseBody build() {
            return new DescribeListPocResponseBody(this);
        } 

    } 

}
