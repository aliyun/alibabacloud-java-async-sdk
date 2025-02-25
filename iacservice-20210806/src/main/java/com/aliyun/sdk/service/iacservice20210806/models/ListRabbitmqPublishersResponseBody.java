// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRabbitmqPublishersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRabbitmqPublishersResponseBody</p>
 */
public class ListRabbitmqPublishersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorizations")
    private java.util.List < Authorizations> authorizations;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListRabbitmqPublishersResponseBody(Builder builder) {
        this.authorizations = builder.authorizations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRabbitmqPublishersResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizations
     */
    public java.util.List < Authorizations> getAuthorizations() {
        return this.authorizations;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Authorizations> authorizations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * authorizations.
         */
        public Builder authorizations(java.util.List < Authorizations> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRabbitmqPublishersResponseBody build() {
            return new ListRabbitmqPublishersResponseBody(this);
        } 

    } 

    public static class Authorizations extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("virtualHost")
        private String virtualHost;

        private Authorizations(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.exchangeName = builder.exchangeName;
            this.exchangeType = builder.exchangeType;
            this.hostName = builder.hostName;
            this.name = builder.name;
            this.port = builder.port;
            this.publisherId = builder.publisherId;
            this.userName = builder.userName;
            this.virtualHost = builder.virtualHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authorizations create() {
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

            public Authorizations build() {
                return new Authorizations(this);
            } 

        } 

    }
}
