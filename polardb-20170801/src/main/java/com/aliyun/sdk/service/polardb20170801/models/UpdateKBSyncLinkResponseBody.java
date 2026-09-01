// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdateKBSyncLinkResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKBSyncLinkResponseBody</p>
 */
public class UpdateKBSyncLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LinkId")
    private String linkId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncSchedule")
    private String syncSchedule;

    private UpdateKBSyncLinkResponseBody(Builder builder) {
        this.linkId = builder.linkId;
        this.requestId = builder.requestId;
        this.syncSchedule = builder.syncSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKBSyncLinkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return linkId
     */
    public String getLinkId() {
        return this.linkId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return syncSchedule
     */
    public String getSyncSchedule() {
        return this.syncSchedule;
    }

    public static final class Builder {
        private String linkId; 
        private String requestId; 
        private String syncSchedule; 

        private Builder() {
        } 

        private Builder(UpdateKBSyncLinkResponseBody model) {
            this.linkId = model.linkId;
            this.requestId = model.requestId;
            this.syncSchedule = model.syncSchedule;
        } 

        /**
         * LinkId.
         */
        public Builder linkId(String linkId) {
            this.linkId = linkId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SyncSchedule.
         */
        public Builder syncSchedule(String syncSchedule) {
            this.syncSchedule = syncSchedule;
            return this;
        }

        public UpdateKBSyncLinkResponseBody build() {
            return new UpdateKBSyncLinkResponseBody(this);
        } 

    } 

}
