// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link AddKnowledgeFileRequest} extends {@link RequestModel}
 *
 * <p>AddKnowledgeFileRequest</p>
 */
public class AddKnowledgeFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileLocation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDir")
    private Boolean isDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadUser")
    private String uploadUser;

    private AddKnowledgeFileRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.fileLocation = builder.fileLocation;
        this.fileType = builder.fileType;
        this.isDir = builder.isDir;
        this.priority = builder.priority;
        this.tags = builder.tags;
        this.uploadUser = builder.uploadUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddKnowledgeFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return fileLocation
     */
    public String getFileLocation() {
        return this.fileLocation;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return isDir
     */
    public Boolean getIsDir() {
        return this.isDir;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return uploadUser
     */
    public String getUploadUser() {
        return this.uploadUser;
    }

    public static final class Builder extends Request.Builder<AddKnowledgeFileRequest, Builder> {
        private String DBClusterId; 
        private String fileLocation; 
        private String fileType; 
        private Boolean isDir; 
        private String priority; 
        private String tags; 
        private String uploadUser; 

        private Builder() {
            super();
        } 

        private Builder(AddKnowledgeFileRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.fileLocation = request.fileLocation;
            this.fileType = request.fileType;
            this.isDir = request.isDir;
            this.priority = request.priority;
            this.tags = request.tags;
            this.uploadUser = request.uploadUser;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp19aaaaaa****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket_name/file/path</p>
         */
        public Builder fileLocation(String fileLocation) {
            this.putQueryParameter("FileLocation", fileLocation);
            this.fileLocation = fileLocation;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * IsDir.
         */
        public Builder isDir(Boolean isDir) {
            this.putQueryParameter("IsDir", isDir);
            this.isDir = isDir;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * UploadUser.
         */
        public Builder uploadUser(String uploadUser) {
            this.putQueryParameter("UploadUser", uploadUser);
            this.uploadUser = uploadUser;
            return this;
        }

        @Override
        public AddKnowledgeFileRequest build() {
            return new AddKnowledgeFileRequest(this);
        } 

    } 

}
