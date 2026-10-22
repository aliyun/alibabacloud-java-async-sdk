// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListProjectNotifyReceiversResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectNotifyReceiversResponseBody</p>
 */
public class ListProjectNotifyReceiversResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProjectNotifyReceiversResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectNotifyReceiversResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProjectNotifyReceiversResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of recipients.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The value of the MaxResults request parameter passed in the request if a valid parameter value was specified. Otherwise, the default value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next request. Use this value for the NextToken request parameter in the next paged query. If this field is empty in the response, no more data is available. This parameter is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81500666-d7f5-4143-8329-0223cc738105</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of recipients returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectNotifyReceiversResponseBody build() {
            return new ListProjectNotifyReceiversResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectNotifyReceiversResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectNotifyReceiversResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("ReceiverId")
        private String receiverId;

        private Items(Builder builder) {
            this.email = builder.email;
            this.name = builder.name;
            this.phone = builder.phone;
            this.receiverId = builder.receiverId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return receiverId
         */
        public String getReceiverId() {
            return this.receiverId;
        }

        public static final class Builder {
            private String email; 
            private String name; 
            private String phone; 
            private String receiverId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.email = model.email;
                this.name = model.name;
                this.phone = model.phone;
                this.receiverId = model.receiverId;
            } 

            /**
             * <p>The email address of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>6291****@qq.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The name of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The phone number of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>131****6412</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The ID of the notification recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder receiverId(String receiverId) {
                this.receiverId = receiverId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
