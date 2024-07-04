// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRabbitmqPublisherResponseBody} extends {@link TeaModel}
 *
 * <p>GetRabbitmqPublisherResponseBody</p>
 */
public class GetRabbitmqPublisherResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("publisher")
    private Publisher publisher;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRabbitmqPublisherResponseBody(Builder builder) {
        this.publisher = builder.publisher;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRabbitmqPublisherResponseBody create() {
        return builder().build();
    }

    /**
     * @return publisher
     */
    public Publisher getPublisher() {
        return this.publisher;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Publisher publisher; 
        private String requestId; 

        /**
         * publisher.
         */
        public Builder publisher(Publisher publisher) {
            this.publisher = publisher;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRabbitmqPublisherResponseBody build() {
            return new GetRabbitmqPublisherResponseBody(this);
        } 

    } 

    public static class Publisher extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("exchangeName")
        private String exchangeName;

        @com.aliyun.core.annotation.NameInMap("exchangeType")
        private String exchangeType;

        @com.aliyun.core.annotation.NameInMap("hostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("publisherId")
        private String publisherId;

        @com.aliyun.core.annotation.NameInMap("taskIds")
        private java.util.List < String > taskIds;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("virtualHost")
        private String virtualHost;

        private Publisher(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.exchangeName = builder.exchangeName;
            this.exchangeType = builder.exchangeType;
            this.hostName = builder.hostName;
            this.name = builder.name;
            this.port = builder.port;
            this.publisherId = builder.publisherId;
            this.taskIds = builder.taskIds;
            this.userName = builder.userName;
            this.virtualHost = builder.virtualHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Publisher create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return exchangeName
         */
        public String getExchangeName() {
            return this.exchangeName;
        }

        /**
         * @return exchangeType
         */
        public String getExchangeType() {
            return this.exchangeType;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return publisherId
         */
        public String getPublisherId() {
            return this.publisherId;
        }

        /**
         * @return taskIds
         */
        public java.util.List < String > getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return virtualHost
         */
        public String getVirtualHost() {
            return this.virtualHost;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String exchangeName; 
            private String exchangeType; 
            private String hostName; 
            private String name; 
            private Long port; 
            private String publisherId; 
            private java.util.List < String > taskIds; 
            private String userName; 
            private String virtualHost; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * exchangeName.
             */
            public Builder exchangeName(String exchangeName) {
                this.exchangeName = exchangeName;
                return this;
            }

            /**
             * exchangeType.
             */
            public Builder exchangeType(String exchangeType) {
                this.exchangeType = exchangeType;
                return this;
            }

            /**
             * hostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * publisherId.
             */
            public Builder publisherId(String publisherId) {
                this.publisherId = publisherId;
                return this;
            }

            /**
             * taskIds.
             */
            public Builder taskIds(java.util.List < String > taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * virtualHost.
             */
            public Builder virtualHost(String virtualHost) {
                this.virtualHost = virtualHost;
                return this;
            }

            public Publisher build() {
                return new Publisher(this);
            } 

        } 

    }
}
