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
 * {@link KnowledgeFileItem} extends {@link TeaModel}
 *
 * <p>KnowledgeFileItem</p>
 */
public class KnowledgeFileItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    private KnowledgeFileItem(Builder builder) {
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeFileItem create() {
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

    public static final class Builder {
        private String driveId; 
        private String fileId; 

        private Builder() {
        } 

        private Builder(KnowledgeFileItem model) {
            this.driveId = model.driveId;
            this.fileId = model.fileId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public KnowledgeFileItem build() {
            return new KnowledgeFileItem(this);
        } 

    } 

}
