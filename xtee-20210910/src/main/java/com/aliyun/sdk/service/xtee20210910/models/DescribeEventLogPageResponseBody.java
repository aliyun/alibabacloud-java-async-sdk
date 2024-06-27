// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventLogPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventLogPageResponseBody</p>
 */
public class DescribeEventLogPageResponseBody extends TeaModel {
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

    private DescribeEventLogPageResponseBody(Builder builder) {
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

    public static DescribeEventLogPageResponseBody create() {
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

        public DescribeEventLogPageResponseBody build() {
            return new DescribeEventLogPageResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("score")
        private String score;

        @com.aliyun.core.annotation.NameInMap("service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("umid")
        private String umid;

        private ResultObject(Builder builder) {
            this.accountId = builder.accountId;
            this.email = builder.email;
            this.ip = builder.ip;
            this.mobile = builder.mobile;
            this.nickName = builder.nickName;
            this.requestId = builder.requestId;
            this.score = builder.score;
            this.service = builder.service;
            this.tags = builder.tags;
            this.timestamp = builder.timestamp;
            this.umid = builder.umid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return umid
         */
        public String getUmid() {
            return this.umid;
        }

        public static final class Builder {
            private String accountId; 
            private String email; 
            private String ip; 
            private String mobile; 
            private String nickName; 
            private String requestId; 
            private String score; 
            private String service; 
            private String tags; 
            private String timestamp; 
            private String umid; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
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
             * score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * umid.
             */
            public Builder umid(String umid) {
                this.umid = umid;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
