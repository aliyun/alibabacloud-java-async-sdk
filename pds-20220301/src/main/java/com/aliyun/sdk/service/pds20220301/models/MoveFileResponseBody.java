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
 * {@link MoveFileResponseBody} extends {@link TeaModel}
 *
 * <p>MoveFileResponseBody</p>
 */
public class MoveFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    private String asyncTaskId;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("exist")
    private Boolean exist;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    private MoveFileResponseBody(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.exist = builder.exist;
        this.fileId = builder.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveFileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return exist
     */
    public Boolean getExist() {
        return this.exist;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    public static final class Builder {
        private String asyncTaskId; 
        private String domainId; 
        private String driveId; 
        private Boolean exist; 
        private String fileId; 

        private Builder() {
        } 

        private Builder(MoveFileResponseBody model) {
            this.asyncTaskId = model.asyncTaskId;
            this.domainId = model.domainId;
            this.driveId = model.driveId;
            this.exist = model.exist;
            this.fileId = model.fileId;
        } 

        /**
         * <p>The ID of the asynchronous task.</p>
         * <p>If an empty string is returned, the file is moved.</p>
         * <p>If a non-empty string is returned, an asynchronous task is required. You can call the GetAsyncTask operation to obtain the information about an asynchronous task based on the task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23ebd1a24dba4166b1527add476ef2866051b4d5del106</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bj1</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>Indicates whether the file already exists in the destination directory.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder exist(Boolean exist) {
            this.exist = exist;
            return this;
        }

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fileid1</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public MoveFileResponseBody build() {
            return new MoveFileResponseBody(this);
        } 

    } 

}
