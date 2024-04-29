// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGroupIdByGroupNameResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGroupIdByGroupNameResponseBody</p>
 */
public class QueryGroupIdByGroupNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryGroupIdByGroupNameResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupIdByGroupNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long groupId; 
        private String requestId; 

        /**
         * The ID of the asset group.
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryGroupIdByGroupNameResponseBody build() {
            return new QueryGroupIdByGroupNameResponseBody(this);
        } 

    } 

}
