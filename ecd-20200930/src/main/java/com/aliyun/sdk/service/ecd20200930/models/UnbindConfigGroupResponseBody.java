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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UnbindConfigGroupResponseBody model) {
            this.groupIds = model.groupIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the configuration groups.</p>
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AD0FF13D-FC7D-56AD-934F-91C8487*****</p>
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
