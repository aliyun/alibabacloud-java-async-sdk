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
 * {@link OpenStructIdpSyncTask} extends {@link TeaModel}
 *
 * <p>OpenStructIdpSyncTask</p>
 */
public class OpenStructIdpSyncTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DepartmentFailed")
    private Long departmentFailed;

    @com.aliyun.core.annotation.NameInMap("DepartmentTotal")
    private Long departmentTotal;

    @com.aliyun.core.annotation.NameInMap("EndTimeUnix")
    private Long endTimeUnix;

    @com.aliyun.core.annotation.NameInMap("FailType")
    private String failType;

    @com.aliyun.core.annotation.NameInMap("IdpConfigId")
    private byte[] idpConfigId;

    @com.aliyun.core.annotation.NameInMap("StartTimeUnix")
    private Long startTimeUnix;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SyncTaskId")
    private String syncTaskId;

    @com.aliyun.core.annotation.NameInMap("UpdateTimeUnix")
    private Long updateTimeUnix;

    @com.aliyun.core.annotation.NameInMap("UserFailed")
    private Long userFailed;

    @com.aliyun.core.annotation.NameInMap("UserTotal")
    private Long userTotal;

    private OpenStructIdpSyncTask(Builder builder) {
        this.departmentFailed = builder.departmentFailed;
        this.departmentTotal = builder.departmentTotal;
        this.endTimeUnix = builder.endTimeUnix;
        this.failType = builder.failType;
        this.idpConfigId = builder.idpConfigId;
        this.startTimeUnix = builder.startTimeUnix;
        this.status = builder.status;
        this.syncTaskId = builder.syncTaskId;
        this.updateTimeUnix = builder.updateTimeUnix;
        this.userFailed = builder.userFailed;
        this.userTotal = builder.userTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructIdpSyncTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departmentFailed
     */
    public Long getDepartmentFailed() {
        return this.departmentFailed;
    }

    /**
     * @return departmentTotal
     */
    public Long getDepartmentTotal() {
        return this.departmentTotal;
    }

    /**
     * @return endTimeUnix
     */
    public Long getEndTimeUnix() {
        return this.endTimeUnix;
    }

    /**
     * @return failType
     */
    public String getFailType() {
        return this.failType;
    }

    /**
     * @return idpConfigId
     */
    public byte[] getIdpConfigId() {
        return this.idpConfigId;
    }

    /**
     * @return startTimeUnix
     */
    public Long getStartTimeUnix() {
        return this.startTimeUnix;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

    /**
     * @return updateTimeUnix
     */
    public Long getUpdateTimeUnix() {
        return this.updateTimeUnix;
    }

    /**
     * @return userFailed
     */
    public Long getUserFailed() {
        return this.userFailed;
    }

    /**
     * @return userTotal
     */
    public Long getUserTotal() {
        return this.userTotal;
    }

    public static final class Builder {
        private Long departmentFailed; 
        private Long departmentTotal; 
        private Long endTimeUnix; 
        private String failType; 
        private byte[] idpConfigId; 
        private Long startTimeUnix; 
        private String status; 
        private String syncTaskId; 
        private Long updateTimeUnix; 
        private Long userFailed; 
        private Long userTotal; 

        private Builder() {
        } 

        private Builder(OpenStructIdpSyncTask model) {
            this.departmentFailed = model.departmentFailed;
            this.departmentTotal = model.departmentTotal;
            this.endTimeUnix = model.endTimeUnix;
            this.failType = model.failType;
            this.idpConfigId = model.idpConfigId;
            this.startTimeUnix = model.startTimeUnix;
            this.status = model.status;
            this.syncTaskId = model.syncTaskId;
            this.updateTimeUnix = model.updateTimeUnix;
            this.userFailed = model.userFailed;
            this.userTotal = model.userTotal;
        } 

        /**
         * DepartmentFailed.
         */
        public Builder departmentFailed(Long departmentFailed) {
            this.departmentFailed = departmentFailed;
            return this;
        }

        /**
         * DepartmentTotal.
         */
        public Builder departmentTotal(Long departmentTotal) {
            this.departmentTotal = departmentTotal;
            return this;
        }

        /**
         * EndTimeUnix.
         */
        public Builder endTimeUnix(Long endTimeUnix) {
            this.endTimeUnix = endTimeUnix;
            return this;
        }

        /**
         * FailType.
         */
        public Builder failType(String failType) {
            this.failType = failType;
            return this;
        }

        /**
         * IdpConfigId.
         */
        public Builder idpConfigId(byte[] idpConfigId) {
            this.idpConfigId = idpConfigId;
            return this;
        }

        /**
         * StartTimeUnix.
         */
        public Builder startTimeUnix(Long startTimeUnix) {
            this.startTimeUnix = startTimeUnix;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * UpdateTimeUnix.
         */
        public Builder updateTimeUnix(Long updateTimeUnix) {
            this.updateTimeUnix = updateTimeUnix;
            return this;
        }

        /**
         * UserFailed.
         */
        public Builder userFailed(Long userFailed) {
            this.userFailed = userFailed;
            return this;
        }

        /**
         * UserTotal.
         */
        public Builder userTotal(Long userTotal) {
            this.userTotal = userTotal;
            return this;
        }

        public OpenStructIdpSyncTask build() {
            return new OpenStructIdpSyncTask(this);
        } 

    } 

}
