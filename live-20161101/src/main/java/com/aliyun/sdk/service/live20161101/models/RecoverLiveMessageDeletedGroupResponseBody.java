// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link RecoverLiveMessageDeletedGroupResponseBody} extends {@link TeaModel}
 *
 * <p>RecoverLiveMessageDeletedGroupResponseBody</p>
 */
public class RecoverLiveMessageDeletedGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RecoverLiveMessageDeletedGroupResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverLiveMessageDeletedGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RecoverLiveMessageDeletedGroupResponseBody model) {
            this.groupId = model.groupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the group that was restored.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B95BE680-5A6A-1CAD-8AB1-09DFF5D6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RecoverLiveMessageDeletedGroupResponseBody build() {
            return new RecoverLiveMessageDeletedGroupResponseBody(this);
        } 

    } 

}
