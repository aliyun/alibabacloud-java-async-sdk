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
 * {@link FileIDInfo} extends {@link TeaModel}
 *
 * <p>FileIDInfo</p>
 */
public class FileIDInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private FileIDInfo(Builder builder) {
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileIDInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String driveId; 
        private String fileId; 
        private String type; 

        private Builder() {
        } 

        private Builder(FileIDInfo model) {
            this.driveId = model.driveId;
            this.fileId = model.fileId;
            this.type = model.type;
        } 

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * file_id.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public FileIDInfo build() {
            return new FileIDInfo(this);
        } 

    } 

}
