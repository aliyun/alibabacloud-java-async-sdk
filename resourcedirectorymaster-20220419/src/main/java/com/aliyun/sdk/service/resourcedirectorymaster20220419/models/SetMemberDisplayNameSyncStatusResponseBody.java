// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link SetMemberDisplayNameSyncStatusResponseBody} extends {@link TeaModel}
 *
 * <p>SetMemberDisplayNameSyncStatusResponseBody</p>
 */
public class SetMemberDisplayNameSyncStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MemberAccountDisplayNameSyncStatus")
    private String memberAccountDisplayNameSyncStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetMemberDisplayNameSyncStatusResponseBody(Builder builder) {
        this.memberAccountDisplayNameSyncStatus = builder.memberAccountDisplayNameSyncStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetMemberDisplayNameSyncStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return memberAccountDisplayNameSyncStatus
     */
    public String getMemberAccountDisplayNameSyncStatus() {
        return this.memberAccountDisplayNameSyncStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String memberAccountDisplayNameSyncStatus; 
        private String requestId; 

        /**
         * <p>The status of the Member Display Name Synchronization feature. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder memberAccountDisplayNameSyncStatus(String memberAccountDisplayNameSyncStatus) {
            this.memberAccountDisplayNameSyncStatus = memberAccountDisplayNameSyncStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetMemberDisplayNameSyncStatusResponseBody build() {
            return new SetMemberDisplayNameSyncStatusResponseBody(this);
        } 

    } 

}
