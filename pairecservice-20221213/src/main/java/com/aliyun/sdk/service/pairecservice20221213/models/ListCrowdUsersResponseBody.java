// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListCrowdUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrowdUsersResponseBody</p>
 */
public class ListCrowdUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<String> users;

    private ListCrowdUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrowdUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return users
     */
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List<String> users; 

        private Builder() {
        } 

        private Builder(ListCrowdUsersResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.users = model.users;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F0AB6527-093F-5C44-B3BD-42C8C210C619</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List<String> users) {
            this.users = users;
            return this;
        }

        public ListCrowdUsersResponseBody build() {
            return new ListCrowdUsersResponseBody(this);
        } 

    } 

}
