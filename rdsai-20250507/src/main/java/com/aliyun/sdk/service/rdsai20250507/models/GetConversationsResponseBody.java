// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetConversationsResponseBody} extends {@link TeaModel}
 *
 * <p>GetConversationsResponseBody</p>
 */
public class GetConversationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private String hasMore;

    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetConversationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.hasMore = builder.hasMore;
        this.limit = builder.limit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConversationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return hasMore
     */
    public String getHasMore() {
        return this.hasMore;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String hasMore; 
        private Long limit; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetConversationsResponseBody model) {
            this.data = model.data;
            this.hasMore = model.hasMore;
            this.limit = model.limit;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(String hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query. Valid values: 1 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConversationsResponseBody build() {
            return new GetConversationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>GetConversationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Introduction")
        private String introduction;

        @com.aliyun.core.annotation.NameInMap("IsRunning")
        private Boolean isRunning;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.introduction = builder.introduction;
            this.isRunning = builder.isRunning;
            this.name = builder.name;
            this.status = builder.status;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return introduction
         */
        public String getIntroduction() {
            return this.introduction;
        }

        /**
         * @return isRunning
         */
        public Boolean getIsRunning() {
            return this.isRunning;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String id; 
            private String introduction; 
            private Boolean isRunning; 
            private String name; 
            private String status; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.id = model.id;
                this.introduction = model.introduction;
                this.isRunning = model.isRunning;
                this.name = model.name;
                this.status = model.status;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1764055092</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The historical conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>60b335ca-124d-4ee1-864b-de554987****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The conversation introduction.</p>
             * 
             * <strong>example:</strong>
             * <p>Test searching for RDS resources</p>
             */
            public Builder introduction(String introduction) {
                this.introduction = introduction;
                return this;
            }

            /**
             * IsRunning.
             */
            public Builder isRunning(Boolean isRunning) {
                this.isRunning = isRunning;
                return this;
            }

            /**
             * <p>The historical conversation name.</p>
             * 
             * <strong>example:</strong>
             * <p>Search for RDS resources</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The session status. Valid values:</p>
             * <ul>
             * <li>idle: The session is idle.</li>
             * <li>running: The session is generating a response.</li>
             * <li>pending_approval: The session is waiting for approval or manual review.</li>
             * </ul>
             * <p>If both pending_approval and running conditions are met, pending_approval is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>idle</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
