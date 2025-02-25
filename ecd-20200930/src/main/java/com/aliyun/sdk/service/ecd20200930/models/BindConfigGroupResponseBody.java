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
 * {@link BindConfigGroupResponseBody} extends {@link TeaModel}
 *
 * <p>BindConfigGroupResponseBody</p>
 */
public class BindConfigGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BindConfigGroupResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindConfigGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String groupId; 
        private String requestId; 

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BindConfigGroupResponseBody build() {
            return new BindConfigGroupResponseBody(this);
        } 

    } 

}
