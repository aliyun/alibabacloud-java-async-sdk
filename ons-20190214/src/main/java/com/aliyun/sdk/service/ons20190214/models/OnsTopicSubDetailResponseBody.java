// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

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
 * {@link OnsTopicSubDetailResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTopicSubDetailResponseBody</p>
 */
public class OnsTopicSubDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OnsTopicSubDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTopicSubDetailResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>87B6207F-2908-42B5-A134-84956DCA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTopicSubDetailResponseBody build() {
            return new OnsTopicSubDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsTopicSubDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTopicSubDetailResponseBody</p>
     */
    public static class SubscriptionDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("MessageModel")
        private String messageModel;

        @com.aliyun.core.annotation.NameInMap("Online")
        private String online;

        @com.aliyun.core.annotation.NameInMap("SubString")
        private String subString;

        private SubscriptionDataList(Builder builder) {
            this.groupId = builder.groupId;
            this.messageModel = builder.messageModel;
            this.online = builder.online;
            this.subString = builder.subString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionDataList create() {
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
        public String getOnline() {
            return this.online;
        }

        /**
         * @return subString
         */
        public String getSubString() {
            return this.subString;
        }

        public static final class Builder {
            private String groupId; 
            private String messageModel; 
            private String online; 
            private String subString; 

            /**
             * <p>The ID of the consumer group that subscribes to the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The consumption mode. Valid values:</p>
             * <ul>
             * <li><strong>CLUSTERING</strong>: the clustering consumption mode</li>
             * <li><strong>BROADCASTING</strong>: the broadcasting consumption mode</li>
             * </ul>
             * <p>For more information about consumption modes, see <a href="https://help.aliyun.com/document_detail/43163.html">Clustering consumption and broadcasting consumption</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CLUSTERING</p>
             */
            public Builder messageModel(String messageModel) {
                this.messageModel = messageModel;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(String online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The expression based on which consumers in the consumer group subscribe to the topic.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder subString(String subString) {
                this.subString = subString;
                return this;
            }

            public SubscriptionDataList build() {
                return new SubscriptionDataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsTopicSubDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTopicSubDetailResponseBody</p>
     */
    public static class DataSubscriptionDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubscriptionDataList")
        private java.util.List<SubscriptionDataList> subscriptionDataList;

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
        public java.util.List<SubscriptionDataList> getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

        public static final class Builder {
            private java.util.List<SubscriptionDataList> subscriptionDataList; 

            /**
             * SubscriptionDataList.
             */
            public Builder subscriptionDataList(java.util.List<SubscriptionDataList> subscriptionDataList) {
                this.subscriptionDataList = subscriptionDataList;
                return this;
            }

            public DataSubscriptionDataList build() {
                return new DataSubscriptionDataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsTopicSubDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTopicSubDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubscriptionDataList")
        private DataSubscriptionDataList subscriptionDataList;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private Data(Builder builder) {
            this.subscriptionDataList = builder.subscriptionDataList;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return subscriptionDataList
         */
        public DataSubscriptionDataList getSubscriptionDataList() {
            return this.subscriptionDataList;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private DataSubscriptionDataList subscriptionDataList; 
            private String topic; 

            /**
             * <p>The information about the online consumer groups that subscribe to the topic.</p>
             */
            public Builder subscriptionDataList(DataSubscriptionDataList subscriptionDataList) {
                this.subscriptionDataList = subscriptionDataList;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
