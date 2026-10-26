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
 * {@link ListInstanceRdMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceRdMembersResponseBody</p>
 */
public class ListInstanceRdMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Members")
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstanceRdMembersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.members = builder.members;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRdMembersResponseBody create() {
        return builder().build();
    }

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
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
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

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<Members> members; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstanceRdMembersResponseBody model) {
            this.maxResults = model.maxResults;
            this.members = model.members;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The maximum number of entries returned per request. If a valid MaxResults value is specified in the request parameter, the specified value is returned. Otherwise, the default value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The list of member accounts.</p>
         */
        public Builder members(java.util.List<Members> members) {
            this.members = members;
            return this;
        }

        /**
         * <p>The token for the next request, which is used for paging. Specify this value in the NextToken request parameter for the next paged query. If this field is empty in the response, no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceRdMembersResponseBody build() {
            return new ListInstanceRdMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceRdMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceRdMembersResponseBody</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        private Members(Builder builder) {
            this.memberId = builder.memberId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        public static final class Builder {
            private String memberId; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.memberId = model.memberId;
            } 

            /**
             * <p>The UID of the member accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>1197234496852779</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
