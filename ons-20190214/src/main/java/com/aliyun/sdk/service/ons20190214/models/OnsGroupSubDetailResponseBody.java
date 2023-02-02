// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupSubDetailResponseBody} extends {@link TeaModel}
 *
 * <p>OnsGroupSubDetailResponseBody</p>
 */
public class OnsGroupSubDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsGroupSubDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsGroupSubDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsGroupSubDetailResponseBody build() {
            return new OnsGroupSubDetailResponseBody(this);
        } 

    } 

    public static class SubscriptionDataList extends TeaModel {
        @NameInMap("SubString")
        private String subString;

        @NameInMap("Topic")
        private String topic;

        private SubscriptionDataList(Builder builder) {
            this.subString = builder.subString;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionDataList create() {
            return builder().build();
        }

        /**
         * @return subString
         */
        public String getSubString() {
            return this.subString;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String subString; 
            private String topic; 

            /**
             * The expression based on which consumers in the consumer group subscribe to the topic.
             */
            public Builder subString(String subString) {
                this.subString = subString;
                return this;
            }

            /**
             * The name of the topic to which consumers in the consumer group subscribe.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public SubscriptionDataList build() {
                return new SubscriptionDataList(this);
            } 

        } 

    }
    public static class DataSubscriptionDataList extends TeaModel {
        @NameInMap("SubscriptionDataList")
        private java.util.List < SubscriptionDataList> subscriptionDataList;

        private DataSubscriptionDataList(Builder builder) {
            this.subscriptionDataList = builder.subscriptionDataList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSubscriptionDataList create() {
            return builder().build();
        }

        /**
         * @return subscriptionDataList
         */
        public java.util.List < SubscriptionDataList> getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

        public static final class Builder {
            private java.util.List < SubscriptionDataList> subscriptionDataList; 

            /**
             * SubscriptionDataList.
             */
            public Builder subscriptionDataList(java.util.List < SubscriptionDataList> subscriptionDataList) {
                this.subscriptionDataList = subscriptionDataList;
                return this;
            }

            public DataSubscriptionDataList build() {
                return new DataSubscriptionDataList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("MessageModel")
        private String messageModel;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("SubscriptionDataList")
        private DataSubscriptionDataList subscriptionDataList;

        private Data(Builder builder) {
            this.groupId = builder.groupId;
            this.messageModel = builder.messageModel;
            this.online = builder.online;
            this.subscriptionDataList = builder.subscriptionDataList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return messageModel
         */
        public String getMessageModel() {
            return this.messageModel;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return subscriptionDataList
         */
        public DataSubscriptionDataList getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

        public static final class Builder {
            private String groupId; 
            private String messageModel; 
            private Boolean online; 
            private DataSubscriptionDataList subscriptionDataList; 

            /**
             * The ID of the consumer group that you want to query.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The consumption mode. Valid values:
             * <p>
             * 
             * *   **CLUSTERING**: the clustering consumption mode
             * *   **BROADCASTING**: the broadcasting consumption mode
             * 
             * For more information about consumption modes, see [Clustering consumption and broadcasting consumption](~~43163~~).
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * Indicates whether consumers in the group are online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * The topics to which consumers in the consumer group subscribe. If all consumers in the specified group are offline, no topics are returned.
             */
            public Builder subscriptionDataList(DataSubscriptionDataList subscriptionDataList) {
                this.subscriptionDataList = subscriptionDataList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
