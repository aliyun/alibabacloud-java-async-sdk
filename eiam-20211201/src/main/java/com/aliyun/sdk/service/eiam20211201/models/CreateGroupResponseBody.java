// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupResponseBody</p>
 */
public class CreateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateGroupResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupResponseBody create() {
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
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGroupResponseBody build() {
            return new CreateGroupResponseBody(this);
        } 

    } 

}
