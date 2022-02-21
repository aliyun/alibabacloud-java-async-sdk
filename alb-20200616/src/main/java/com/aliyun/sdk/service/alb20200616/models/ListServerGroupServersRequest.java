// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerGroupServersRequest} extends {@link RequestModel}
 *
 * <p>ListServerGroupServersRequest</p>
 */
public class ListServerGroupServersRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ServerGroupId")
    private String serverGroupId;

    @Query
    @NameInMap("ServerIds")
    private java.util.List < String > serverIds;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListServerGroupServersRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.serverGroupId = builder.serverGroupId;
        this.serverIds = builder.serverIds;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerGroupServersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    /**
     * @return serverIds
     */
    public java.util.List < String > getServerIds() {
        return this.serverIds;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListServerGroupServersRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String serverGroupId; 
        private java.util.List < String > serverIds; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListServerGroupServersRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.serverGroupId = response.serverGroupId;
            this.serverIds = response.serverIds;
            this.tag = response.tag;
        } 

        /**
         * 查询数量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 服务器组id
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putQueryParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * ServerIds.
         */
        public Builder serverIds(java.util.List < String > serverIds) {
            this.putQueryParameter("ServerIds", serverIds);
            this.serverIds = serverIds;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListServerGroupServersRequest build() {
            return new ListServerGroupServersRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 标签键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
