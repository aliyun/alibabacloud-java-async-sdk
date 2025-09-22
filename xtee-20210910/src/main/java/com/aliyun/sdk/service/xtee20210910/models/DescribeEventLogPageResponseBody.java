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
    private java.util.List<ResultObject> resultObject;

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

        private Builder(DescribeEventLogPageResponseBody model) {
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
         * <p>6</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeEventLogPageResponseBody build() {
            return new DescribeEventLogPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventLogPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventLogPageResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.accountId = model.accountId;
                this.email = model.email;
                this.ip = model.ip;
                this.mobile = model.mobile;
                this.nickName = model.nickName;
                this.requestId = model.requestId;
                this.score = model.score;
                this.service = model.service;
                this.tags = model.tags;
                this.timestamp = model.timestamp;
                this.umid = model.umid;
            } 

            /**
             * <p>Account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1631801314885832</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Email.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:xxxx@123.com">xxxx@123.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.200.5.100</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Mobile phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>13817606333</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>Nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>昵称</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>Request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>546F8063-0104-5271-9EB7-56FB3F375BAD</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>Score.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0</p>
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * <p>Event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册事件</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>Tags.</p>
             * 
             * <strong>example:</strong>
             * <p>rm0102</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Transaction time.</p>
             * 
             * <strong>example:</strong>
             * <p>1737101348000</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>Device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4239</p>
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
