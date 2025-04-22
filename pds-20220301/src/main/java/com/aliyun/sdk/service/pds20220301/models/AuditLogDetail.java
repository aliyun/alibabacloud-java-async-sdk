// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link AuditLogDetail} extends {@link TeaModel}
 *
 * <p>AuditLogDetail</p>
 */
public class AuditLogDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_log_detail")
    private DriveLogDetail driveLogDetail;

    @com.aliyun.core.annotation.NameInMap("file_log_detail")
    private FileLogDetail fileLogDetail;

    @com.aliyun.core.annotation.NameInMap("user_log_detail")
    private UserLogDetail userLogDetail;

    private AuditLogDetail(Builder builder) {
        this.driveLogDetail = builder.driveLogDetail;
        this.fileLogDetail = builder.fileLogDetail;
        this.userLogDetail = builder.userLogDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditLogDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driveLogDetail
     */
    public DriveLogDetail getDriveLogDetail() {
        return this.driveLogDetail;
    }

    /**
     * @return fileLogDetail
     */
    public FileLogDetail getFileLogDetail() {
        return this.fileLogDetail;
    }

    /**
     * @return userLogDetail
     */
    public UserLogDetail getUserLogDetail() {
        return this.userLogDetail;
    }

    public static final class Builder {
        private DriveLogDetail driveLogDetail; 
        private FileLogDetail fileLogDetail; 
        private UserLogDetail userLogDetail; 

        private Builder() {
        } 

        private Builder(AuditLogDetail model) {
            this.driveLogDetail = model.driveLogDetail;
            this.fileLogDetail = model.fileLogDetail;
            this.userLogDetail = model.userLogDetail;
        } 

        /**
         * drive_log_detail.
         */
        public Builder driveLogDetail(DriveLogDetail driveLogDetail) {
            this.driveLogDetail = driveLogDetail;
            return this;
        }

        /**
         * file_log_detail.
         */
        public Builder fileLogDetail(FileLogDetail fileLogDetail) {
            this.fileLogDetail = fileLogDetail;
            return this;
        }

        /**
         * user_log_detail.
         */
        public Builder userLogDetail(UserLogDetail userLogDetail) {
            this.userLogDetail = userLogDetail;
            return this;
        }

        public AuditLogDetail build() {
            return new AuditLogDetail(this);
        } 

    } 

}
