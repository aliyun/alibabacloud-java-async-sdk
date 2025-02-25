// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigBackupRemarkRequest} extends {@link RequestModel}
 *
 * <p>ConfigBackupRemarkRequest</p>
 */
public class ConfigBackupRemarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private ConfigBackupRemarkRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.name = builder.name;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigBackupRemarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ConfigBackupRemarkRequest, Builder> {
        private String backupId; 
        private String name; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ConfigBackupRemarkRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.name = request.name;
            this.remark = request.remark;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public ConfigBackupRemarkRequest build() {
            return new ConfigBackupRemarkRequest(this);
        } 

    } 

}
