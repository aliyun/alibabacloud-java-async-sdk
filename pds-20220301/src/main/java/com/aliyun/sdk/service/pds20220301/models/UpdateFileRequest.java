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
 * {@link UpdateFileRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileRequest</p>
 */
public class UpdateFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("check_name_mode")
    private String checkNameMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hidden")
    private Boolean hidden;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.List<String> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("local_modified_at")
    private String localModifiedAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(maxLength = 102, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("starred")
    private Boolean starred;

    private UpdateFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.checkNameMode = builder.checkNameMode;
        this.description = builder.description;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.hidden = builder.hidden;
        this.labels = builder.labels;
        this.localModifiedAt = builder.localModifiedAt;
        this.name = builder.name;
        this.starred = builder.starred;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return checkNameMode
     */
    public String getCheckNameMode() {
        return this.checkNameMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return hidden
     */
    public Boolean getHidden() {
        return this.hidden;
    }

    /**
     * @return labels
     */
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    /**
     * @return localModifiedAt
     */
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return starred
     */
    public Boolean getStarred() {
        return this.starred;
    }

    public static final class Builder extends Request.Builder<UpdateFileRequest, Builder> {
        private String domainId; 
        private String checkNameMode; 
        private String description; 
        private String driveId; 
        private String fileId; 
        private Boolean hidden; 
        private java.util.List<String> labels; 
        private String localModifiedAt; 
        private String name; 
        private Boolean starred; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.checkNameMode = request.checkNameMode;
            this.description = request.description;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.hidden = request.hidden;
            this.labels = request.labels;
            this.localModifiedAt = request.localModifiedAt;
            this.name = request.name;
            this.starred = request.starred;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The processing method that is used if the file that you want to modify has the same name as an existing file on the cloud. Valid values:</p>
         * <p>ignore: allows you to modify the file by using the same name as an existing file on the cloud.</p>
         * <p>auto_rename: automatically renames the file that has the same name on the cloud. By default, the current point in time is added to the end of the file name. Example: xxx_20060102_150405.</p>
         * <p>refuse: does not modify the file that you want to modify but returns the information about the file that has the same name on the cloud.</p>
         * <p>Default value: ignore.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder checkNameMode(String checkNameMode) {
            this.putBodyParameter("check_name_mode", checkNameMode);
            this.checkNameMode = checkNameMode;
            return this;
        }

        /**
         * <p>The description of the file. The description can be up to 1,024 characters in length.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9520943DC264</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>Specifies whether to hide the file.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hidden(Boolean hidden) {
            this.putBodyParameter("hidden", hidden);
            this.hidden = hidden;
            return this;
        }

        /**
         * <p>The tags of the file. You can specify up to 100 tags.</p>
         */
        public Builder labels(java.util.List<String> labels) {
            this.putBodyParameter("labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The local time when the file was modified. The time is in the yyyy-MM-ddTHH:mm:ssZ format based on the UTC+0 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-20T06:51:27.292Z</p>
         */
        public Builder localModifiedAt(String localModifiedAt) {
            this.putBodyParameter("local_modified_at", localModifiedAt);
            this.localModifiedAt = localModifiedAt;
            return this;
        }

        /**
         * <p>The name of the file. The name can be up to 1,024 bytes in length based on the UTF-8 encoding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>a.jpg</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether to add the file to favorites.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder starred(Boolean starred) {
            this.putBodyParameter("starred", starred);
            this.starred = starred;
            return this;
        }

        @Override
        public UpdateFileRequest build() {
            return new UpdateFileRequest(this);
        } 

    } 

}
