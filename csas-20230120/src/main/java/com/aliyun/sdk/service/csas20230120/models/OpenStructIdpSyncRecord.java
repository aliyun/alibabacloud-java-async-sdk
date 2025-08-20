// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link OpenStructIdpSyncRecord} extends {@link TeaModel}
 *
 * <p>OpenStructIdpSyncRecord</p>
 */
public class OpenStructIdpSyncRecord extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("IdpRawJson")
    private String idpRawJson;

    @com.aliyun.core.annotation.NameInMap("IdpResourceId")
    private String idpResourceId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RecordType")
    private String recordType;

    @com.aliyun.core.annotation.NameInMap("SaseRawJson")
    private String saseRawJson;

    @com.aliyun.core.annotation.NameInMap("SaseResourceId")
    private String saseResourceId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("SyncRecordId")
    private String syncRecordId;

    @com.aliyun.core.annotation.NameInMap("SyncTaskId")
    private String syncTaskId;

    @com.aliyun.core.annotation.NameInMap("TimeUnix")
    private String timeUnix;

    private OpenStructIdpSyncRecord(Builder builder) {
        this.action = builder.action;
        this.idpRawJson = builder.idpRawJson;
        this.idpResourceId = builder.idpResourceId;
        this.name = builder.name;
        this.recordType = builder.recordType;
        this.saseRawJson = builder.saseRawJson;
        this.saseResourceId = builder.saseResourceId;
        this.success = builder.success;
        this.syncRecordId = builder.syncRecordId;
        this.syncTaskId = builder.syncTaskId;
        this.timeUnix = builder.timeUnix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructIdpSyncRecord create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return idpRawJson
     */
    public String getIdpRawJson() {
        return this.idpRawJson;
    }

    /**
     * @return idpResourceId
     */
    public String getIdpResourceId() {
        return this.idpResourceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recordType
     */
    public String getRecordType() {
        return this.recordType;
    }

    /**
     * @return saseRawJson
     */
    public String getSaseRawJson() {
        return this.saseRawJson;
    }

    /**
     * @return saseResourceId
     */
    public String getSaseResourceId() {
        return this.saseResourceId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return syncRecordId
     */
    public String getSyncRecordId() {
        return this.syncRecordId;
    }

    /**
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    /**
     * @return timeUnix
     */
    public String getTimeUnix() {
        return this.timeUnix;
    }

    public static final class Builder {
        private String action; 
        private String idpRawJson; 
        private String idpResourceId; 
        private String name; 
        private String recordType; 
        private String saseRawJson; 
        private String saseResourceId; 
        private Boolean success; 
        private String syncRecordId; 
        private String syncTaskId; 
        private String timeUnix; 

        private Builder() {
        } 

        private Builder(OpenStructIdpSyncRecord model) {
            this.action = model.action;
            this.idpRawJson = model.idpRawJson;
            this.idpResourceId = model.idpResourceId;
            this.name = model.name;
            this.recordType = model.recordType;
            this.saseRawJson = model.saseRawJson;
            this.saseResourceId = model.saseResourceId;
            this.success = model.success;
            this.syncRecordId = model.syncRecordId;
            this.syncTaskId = model.syncTaskId;
            this.timeUnix = model.timeUnix;
        } 

        /**
         * Action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * IdpRawJson.
         */
        public Builder idpRawJson(String idpRawJson) {
            this.idpRawJson = idpRawJson;
            return this;
        }

        /**
         * IdpResourceId.
         */
        public Builder idpResourceId(String idpResourceId) {
            this.idpResourceId = idpResourceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RecordType.
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * SaseRawJson.
         */
        public Builder saseRawJson(String saseRawJson) {
            this.saseRawJson = saseRawJson;
            return this;
        }

        /**
         * SaseResourceId.
         */
        public Builder saseResourceId(String saseResourceId) {
            this.saseResourceId = saseResourceId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * SyncRecordId.
         */
        public Builder syncRecordId(String syncRecordId) {
            this.syncRecordId = syncRecordId;
            return this;
        }

        /**
         * SyncTaskId.
         */
        public Builder syncTaskId(String syncTaskId) {
            this.syncTaskId = syncTaskId;
            return this;
        }

        /**
         * TimeUnix.
         */
        public Builder timeUnix(String timeUnix) {
            this.timeUnix = timeUnix;
            return this;
        }

        public OpenStructIdpSyncRecord build() {
            return new OpenStructIdpSyncRecord(this);
        } 

    } 

}
