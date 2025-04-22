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
 * {@link TrashFileResponseBody} extends {@link TeaModel}
 *
 * <p>TrashFileResponseBody</p>
 */
public class TrashFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    private String asyncTaskId;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    private TrashFileResponseBody(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrashFileResponseBody create() {
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
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    public static final class Builder {
        private String asyncTaskId; 
        private String domainId; 
        private String driveId; 
        private String fileId; 

        private Builder() {
        } 

        private Builder(TrashFileResponseBody model) {
            this.asyncTaskId = model.asyncTaskId;
            this.domainId = model.domainId;
            this.driveId = model.driveId;
            this.fileId = model.fileId;
        } 

        /**
         * <p>The ID of the asynchronous task.</p>
         * <p>If an empty string is returned, the file or folder is moved to the recycle bin.</p>
         * <p>If a non-empty string is returned, an asynchronous task is required. You can call the GetAsyncTask operation to obtain the information about an asynchronous task based on the task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13ebd3a24dba4166b1527add676ef2866051b4d5dele16</p>
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
         * <p>The ID of the file or folder.</p>
         * 
         * <strong>example:</strong>
         * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d317406</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public TrashFileResponseBody build() {
            return new TrashFileResponseBody(this);
        } 

    } 

}
