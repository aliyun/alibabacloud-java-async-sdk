// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventResultListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventResultListResponseBody</p>
 */
public class DescribeEventResultListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Long totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Long totalPage;

    private DescribeEventResultListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventResultListResponseBody create() {
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
    public Long getCurrentPage() {
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
    public Long getPageSize() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalItem
     */
    public Long getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private Long currentPage; 
        private String httpStatusCode; 
        private String message; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 
        private Boolean success; 
        private Long totalItem; 
        private Long totalPage; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalItem.
         */
        public Builder totalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeEventResultListResponseBody build() {
            return new DescribeEventResultListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("passNum")
        private Long passNum;

        @com.aliyun.core.annotation.NameInMap("pendingNum")
        private Long pendingNum;

        @com.aliyun.core.annotation.NameInMap("rejectNum")
        private Long rejectNum;

        @com.aliyun.core.annotation.NameInMap("totalNum")
        private Long totalNum;

        private ResultObject(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.passNum = builder.passNum;
            this.pendingNum = builder.pendingNum;
            this.rejectNum = builder.rejectNum;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return passNum
         */
        public Long getPassNum() {
            return this.passNum;
        }

        /**
         * @return pendingNum
         */
        public Long getPendingNum() {
            return this.pendingNum;
        }

        /**
         * @return rejectNum
         */
        public Long getRejectNum() {
            return this.rejectNum;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 
            private Long passNum; 
            private Long pendingNum; 
            private Long rejectNum; 
            private Long totalNum; 

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * passNum.
             */
            public Builder passNum(Long passNum) {
                this.passNum = passNum;
                return this;
            }

            /**
             * pendingNum.
             */
            public Builder pendingNum(Long pendingNum) {
                this.pendingNum = pendingNum;
                return this;
            }

            /**
             * rejectNum.
             */
            public Builder rejectNum(Long rejectNum) {
                this.rejectNum = rejectNum;
                return this;
            }

            /**
             * totalNum.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
