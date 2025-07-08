// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryCardMessageQueueResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCardMessageQueueResponseBody</p>
 */
public class QueryCardMessageQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryCardMessageQueueResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardMessageQueueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryCardMessageQueueResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCardMessageQueueResponseBody build() {
            return new QueryCardMessageQueueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCardMessageQueueResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCardMessageQueueResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsCreated")
        private Boolean isCreated;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("QueueType")
        private String queueType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private List(Builder builder) {
            this.isCreated = builder.isCreated;
            this.queueName = builder.queueName;
            this.queueType = builder.queueType;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return isCreated
         */
        public Boolean getIsCreated() {
            return this.isCreated;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return queueType
         */
        public String getQueueType() {
            return this.queueType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Boolean isCreated; 
            private String queueName; 
            private String queueType; 
            private String region; 

            private Builder() {
            } 

            private Builder(List model) {
                this.isCreated = model.isCreated;
                this.queueName = model.queueName;
                this.queueType = model.queueType;
                this.region = model.region;
            } 

            /**
             * IsCreated.
             */
            public Builder isCreated(Boolean isCreated) {
                this.isCreated = isCreated;
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
             * QueueType.
             */
            public Builder queueType(String queueType) {
                this.queueType = queueType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
