// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListInstagramPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstagramPageResponseBody</p>
 */
public class ListInstagramPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListInstagramPageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstagramPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListInstagramPageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListInstagramPageResponseBody build() {
            return new ListInstagramPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstagramPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstagramPageResponseBody</p>
     */
    public static class AgentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentKeywords")
        private String agentKeywords;

        @com.aliyun.core.annotation.NameInMap("AgentNoKeywords")
        private String agentNoKeywords;

        private AgentInfo(Builder builder) {
            this.agentKeywords = builder.agentKeywords;
            this.agentNoKeywords = builder.agentNoKeywords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentInfo create() {
            return builder().build();
        }

        /**
         * @return agentKeywords
         */
        public String getAgentKeywords() {
            return this.agentKeywords;
        }

        /**
         * @return agentNoKeywords
         */
        public String getAgentNoKeywords() {
            return this.agentNoKeywords;
        }

        public static final class Builder {
            private String agentKeywords; 
            private String agentNoKeywords; 

            private Builder() {
            } 

            private Builder(AgentInfo model) {
                this.agentKeywords = model.agentKeywords;
                this.agentNoKeywords = model.agentNoKeywords;
            } 

            /**
             * AgentKeywords.
             */
            public Builder agentKeywords(String agentKeywords) {
                this.agentKeywords = agentKeywords;
                return this;
            }

            /**
             * AgentNoKeywords.
             */
            public Builder agentNoKeywords(String agentNoKeywords) {
                this.agentNoKeywords = agentNoKeywords;
                return this;
            }

            public AgentInfo build() {
                return new AgentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstagramPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstagramPageResponseBody</p>
     */
    public static class BeebotInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeebotInstanceId")
        private String beebotInstanceId;

        @com.aliyun.core.annotation.NameInMap("BeebotNamespaceId")
        private String beebotNamespaceId;

        private BeebotInfo(Builder builder) {
            this.beebotInstanceId = builder.beebotInstanceId;
            this.beebotNamespaceId = builder.beebotNamespaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeebotInfo create() {
            return builder().build();
        }

        /**
         * @return beebotInstanceId
         */
        public String getBeebotInstanceId() {
            return this.beebotInstanceId;
        }

        /**
         * @return beebotNamespaceId
         */
        public String getBeebotNamespaceId() {
            return this.beebotNamespaceId;
        }

        public static final class Builder {
            private String beebotInstanceId; 
            private String beebotNamespaceId; 

            private Builder() {
            } 

            private Builder(BeebotInfo model) {
                this.beebotInstanceId = model.beebotInstanceId;
                this.beebotNamespaceId = model.beebotNamespaceId;
            } 

            /**
             * BeebotInstanceId.
             */
            public Builder beebotInstanceId(String beebotInstanceId) {
                this.beebotInstanceId = beebotInstanceId;
                return this;
            }

            /**
             * BeebotNamespaceId.
             */
            public Builder beebotNamespaceId(String beebotNamespaceId) {
                this.beebotNamespaceId = beebotNamespaceId;
                return this;
            }

            public BeebotInfo build() {
                return new BeebotInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstagramPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstagramPageResponseBody</p>
     */
    public static class InstagramInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("HttpFlag")
        private String httpFlag;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private String pageId;

        @com.aliyun.core.annotation.NameInMap("PageName")
        private String pageName;

        @com.aliyun.core.annotation.NameInMap("QueueFlag")
        private String queueFlag;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("StatusCallbackUrl")
        private String statusCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("StatusQueue")
        private String statusQueue;

        @com.aliyun.core.annotation.NameInMap("UpCallbackUrl")
        private String upCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("UpQueue")
        private String upQueue;

        private InstagramInfo(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.connectionStatus = builder.connectionStatus;
            this.httpFlag = builder.httpFlag;
            this.pageId = builder.pageId;
            this.pageName = builder.pageName;
            this.queueFlag = builder.queueFlag;
            this.queueName = builder.queueName;
            this.statusCallbackUrl = builder.statusCallbackUrl;
            this.statusQueue = builder.statusQueue;
            this.upCallbackUrl = builder.upCallbackUrl;
            this.upQueue = builder.upQueue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstagramInfo create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return httpFlag
         */
        public String getHttpFlag() {
            return this.httpFlag;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        /**
         * @return pageName
         */
        public String getPageName() {
            return this.pageName;
        }

        /**
         * @return queueFlag
         */
        public String getQueueFlag() {
            return this.queueFlag;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return statusCallbackUrl
         */
        public String getStatusCallbackUrl() {
            return this.statusCallbackUrl;
        }

        /**
         * @return statusQueue
         */
        public String getStatusQueue() {
            return this.statusQueue;
        }

        /**
         * @return upCallbackUrl
         */
        public String getUpCallbackUrl() {
            return this.upCallbackUrl;
        }

        /**
         * @return upQueue
         */
        public String getUpQueue() {
            return this.upQueue;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private String connectionStatus; 
            private String httpFlag; 
            private String pageId; 
            private String pageName; 
            private String queueFlag; 
            private String queueName; 
            private String statusCallbackUrl; 
            private String statusQueue; 
            private String upCallbackUrl; 
            private String upQueue; 

            private Builder() {
            } 

            private Builder(InstagramInfo model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.connectionStatus = model.connectionStatus;
                this.httpFlag = model.httpFlag;
                this.pageId = model.pageId;
                this.pageName = model.pageName;
                this.queueFlag = model.queueFlag;
                this.queueName = model.queueName;
                this.statusCallbackUrl = model.statusCallbackUrl;
                this.statusQueue = model.statusQueue;
                this.upCallbackUrl = model.upCallbackUrl;
                this.upQueue = model.upQueue;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * HttpFlag.
             */
            public Builder httpFlag(String httpFlag) {
                this.httpFlag = httpFlag;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * PageName.
             */
            public Builder pageName(String pageName) {
                this.pageName = pageName;
                return this;
            }

            /**
             * QueueFlag.
             */
            public Builder queueFlag(String queueFlag) {
                this.queueFlag = queueFlag;
                return this;
            }

            /**
             * QueueName.
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * StatusCallbackUrl.
             */
            public Builder statusCallbackUrl(String statusCallbackUrl) {
                this.statusCallbackUrl = statusCallbackUrl;
                return this;
            }

            /**
             * StatusQueue.
             */
            public Builder statusQueue(String statusQueue) {
                this.statusQueue = statusQueue;
                return this;
            }

            /**
             * UpCallbackUrl.
             */
            public Builder upCallbackUrl(String upCallbackUrl) {
                this.upCallbackUrl = upCallbackUrl;
                return this;
            }

            /**
             * UpQueue.
             */
            public Builder upQueue(String upQueue) {
                this.upQueue = upQueue;
                return this;
            }

            public InstagramInfo build() {
                return new InstagramInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstagramPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstagramPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentInfo")
        private AgentInfo agentInfo;

        @com.aliyun.core.annotation.NameInMap("BeebotInfo")
        private BeebotInfo beebotInfo;

        @com.aliyun.core.annotation.NameInMap("InstagramInfo")
        private InstagramInfo instagramInfo;

        private Data(Builder builder) {
            this.agentInfo = builder.agentInfo;
            this.beebotInfo = builder.beebotInfo;
            this.instagramInfo = builder.instagramInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentInfo
         */
        public AgentInfo getAgentInfo() {
            return this.agentInfo;
        }

        /**
         * @return beebotInfo
         */
        public BeebotInfo getBeebotInfo() {
            return this.beebotInfo;
        }

        /**
         * @return instagramInfo
         */
        public InstagramInfo getInstagramInfo() {
            return this.instagramInfo;
        }

        public static final class Builder {
            private AgentInfo agentInfo; 
            private BeebotInfo beebotInfo; 
            private InstagramInfo instagramInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentInfo = model.agentInfo;
                this.beebotInfo = model.beebotInfo;
                this.instagramInfo = model.instagramInfo;
            } 

            /**
             * AgentInfo.
             */
            public Builder agentInfo(AgentInfo agentInfo) {
                this.agentInfo = agentInfo;
                return this;
            }

            /**
             * BeebotInfo.
             */
            public Builder beebotInfo(BeebotInfo beebotInfo) {
                this.beebotInfo = beebotInfo;
                return this;
            }

            /**
             * InstagramInfo.
             */
            public Builder instagramInfo(InstagramInfo instagramInfo) {
                this.instagramInfo = instagramInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
