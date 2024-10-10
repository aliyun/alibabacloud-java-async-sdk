// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryPushRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPushRecordsResponseBody</p>
 */
public class QueryPushRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PushInfos")
    private PushInfos pushInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private QueryPushRecordsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.pushInfos = builder.pushInfos;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pushInfos
     */
    public PushInfos getPushInfos() {
        return this.pushInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer page; 
        private Integer pageSize; 
        private PushInfos pushInfos; 
        private String requestId; 
        private Integer total; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PushInfos.
         */
        public Builder pushInfos(PushInfos pushInfos) {
            this.pushInfos = pushInfos;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryPushRecordsResponseBody build() {
            return new QueryPushRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPushRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPushRecordsResponseBody</p>
     */
    public static class PushInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("PushTime")
        private String pushTime;

        @com.aliyun.core.annotation.NameInMap("PushType")
        private String pushType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private PushInfo(Builder builder) {
            this.appKey = builder.appKey;
            this.body = builder.body;
            this.deviceType = builder.deviceType;
            this.messageId = builder.messageId;
            this.pushTime = builder.pushTime;
            this.pushType = builder.pushType;
            this.source = builder.source;
            this.status = builder.status;
            this.target = builder.target;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushInfo create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return pushTime
         */
        public String getPushTime() {
            return this.pushTime;
        }

        /**
         * @return pushType
         */
        public String getPushType() {
            return this.pushType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long appKey; 
            private String body; 
            private String deviceType; 
            private String messageId; 
            private String pushTime; 
            private String pushType; 
            private String source; 
            private String status; 
            private String target; 
            private String title; 

            /**
             * AppKey.
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * Body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * PushTime.
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * PushType.
             */
            public Builder pushType(String pushType) {
                this.pushType = pushType;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public PushInfo build() {
                return new PushInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryPushRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPushRecordsResponseBody</p>
     */
    public static class PushInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushInfo")
        private java.util.List < PushInfo> pushInfo;

        private PushInfos(Builder builder) {
            this.pushInfo = builder.pushInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushInfos create() {
            return builder().build();
        }

        /**
         * @return pushInfo
         */
        public java.util.List < PushInfo> getPushInfo() {
            return this.pushInfo;
        }

        public static final class Builder {
            private java.util.List < PushInfo> pushInfo; 

            /**
             * PushInfo.
             */
            public Builder pushInfo(java.util.List < PushInfo> pushInfo) {
                this.pushInfo = pushInfo;
                return this;
            }

            public PushInfos build() {
                return new PushInfos(this);
            } 

        } 

    }
}
