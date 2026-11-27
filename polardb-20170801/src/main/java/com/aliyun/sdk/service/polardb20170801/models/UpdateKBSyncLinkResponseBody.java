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

    @com.aliyun.core.annotation.NameInMap("SelectionMode")
    private String selectionMode;

    @com.aliyun.core.annotation.NameInMap("SelectionRules")
    private String selectionRules;

    @com.aliyun.core.annotation.NameInMap("SyncSchedule")
    private String syncSchedule;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private UpdateKBSyncLinkResponseBody(Builder builder) {
        this.linkId = builder.linkId;
        this.requestId = builder.requestId;
        this.selectionMode = builder.selectionMode;
        this.selectionRules = builder.selectionRules;
        this.syncSchedule = builder.syncSchedule;
        this.taskId = builder.taskId;
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
     * @return selectionMode
     */
    public String getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * @return selectionRules
     */
    public String getSelectionRules() {
        return this.selectionRules;
    }

    /**
     * @return syncSchedule
     */
    public String getSyncSchedule() {
        return this.syncSchedule;
    }

    /**
     * @return taskId
     */
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String linkId; 
        private String requestId; 
        private String selectionMode; 
        private String selectionRules; 
        private String syncSchedule; 
        private Integer taskId; 

        private Builder() {
        } 

        private Builder(UpdateKBSyncLinkResponseBody model) {
            this.linkId = model.linkId;
            this.requestId = model.requestId;
            this.selectionMode = model.selectionMode;
            this.selectionRules = model.selectionRules;
            this.syncSchedule = model.syncSchedule;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The ID of the synchronization link.</p>
         * 
         * <strong>example:</strong>
         * <p>pkbl-xxxxx</p>
         */
        public Builder linkId(String linkId) {
            this.linkId = linkId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the current configuration, which does not indicate that the synchronization is complete. This parameter may not be returned if it is not set.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECTED</p>
         */
        public Builder selectionMode(String selectionMode) {
            this.selectionMode = selectionMode;
            return this;
        }

        /**
         * <p>Returns the current configuration, which does not indicate that the synchronization is complete. This parameter may not be returned if it is not set.</p>
         */
        public Builder selectionRules(String selectionRules) {
            this.selectionRules = selectionRules;
            return this;
        }

        /**
         * <p>The scheduled time of the synchronization task.</p>
         */
        public Builder syncSchedule(String syncSchedule) {
            this.syncSchedule = syncSchedule;
            return this;
        }

        /**
         * <p>The ID of the asynchronous configuration task.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public UpdateKBSyncLinkResponseBody build() {
            return new UpdateKBSyncLinkResponseBody(this);
        } 

    } 

}
