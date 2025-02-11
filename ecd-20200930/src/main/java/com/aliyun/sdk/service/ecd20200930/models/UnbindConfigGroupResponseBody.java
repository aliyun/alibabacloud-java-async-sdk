// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link UnbindConfigGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindConfigGroupResponseBody</p>
 */
public class UnbindConfigGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<String> groupIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UnbindConfigGroupResponseBody(Builder builder) {
        this.groupIds = builder.groupIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindConfigGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupIds
     */
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> groupIds; 
        private String requestId; 

        /**
         * GroupIds.
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnbindConfigGroupResponseBody build() {
            return new UnbindConfigGroupResponseBody(this);
        } 

    } 

}
