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
 * {@link DescribeLiveMessageGroupBandResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveMessageGroupBandResponseBody</p>
 */
public class DescribeLiveMessageGroupBandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BannedUserList")
    private java.util.List<String> bannedUserList;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("IsbannedAll")
    private Boolean isbannedAll;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnbannedUserList")
    private java.util.List<String> unbannedUserList;

    private DescribeLiveMessageGroupBandResponseBody(Builder builder) {
        this.bannedUserList = builder.bannedUserList;
        this.groupId = builder.groupId;
        this.isbannedAll = builder.isbannedAll;
        this.requestId = builder.requestId;
        this.unbannedUserList = builder.unbannedUserList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveMessageGroupBandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bannedUserList
     */
    public java.util.List<String> getBannedUserList() {
        return this.bannedUserList;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return isbannedAll
     */
    public Boolean getIsbannedAll() {
        return this.isbannedAll;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unbannedUserList
     */
    public java.util.List<String> getUnbannedUserList() {
        return this.unbannedUserList;
    }

    public static final class Builder {
        private java.util.List<String> bannedUserList; 
        private String groupId; 
        private Boolean isbannedAll; 
        private String requestId; 
        private java.util.List<String> unbannedUserList; 

        private Builder() {
        } 

        private Builder(DescribeLiveMessageGroupBandResponseBody model) {
            this.bannedUserList = model.bannedUserList;
            this.groupId = model.groupId;
            this.isbannedAll = model.isbannedAll;
            this.requestId = model.requestId;
            this.unbannedUserList = model.unbannedUserList;
        } 

        /**
         * <p>The list of users that were muted separately, but not by muting the entire group.</p>
         */
        public Builder bannedUserList(java.util.List<String> bannedUserList) {
            this.bannedUserList = bannedUserList;
            return this;
        }

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Indicates whether all users in the interactive messaging group are muted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isbannedAll(Boolean isbannedAll) {
            this.isbannedAll = isbannedAll;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>021D1FE7-2E87-16AC-9364-4E7EA47C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of users who were not muted when the entire group was muted.</p>
         */
        public Builder unbannedUserList(java.util.List<String> unbannedUserList) {
            this.unbannedUserList = unbannedUserList;
            return this;
        }

        public DescribeLiveMessageGroupBandResponseBody build() {
            return new DescribeLiveMessageGroupBandResponseBody(this);
        } 

    } 

}
