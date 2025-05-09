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
 * {@link FilePutUserTagsRequest} extends {@link RequestModel}
 *
 * <p>FilePutUserTagsRequest</p>
 */
public class FilePutUserTagsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<UserTags> userTags;

    private FilePutUserTagsRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.userTags = builder.userTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilePutUserTagsRequest create() {
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
     * @return userTags
     */
    public java.util.List<UserTags> getUserTags() {
        return this.userTags;
    }

    public static final class Builder extends Request.Builder<FilePutUserTagsRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private java.util.List<UserTags> userTags; 

        private Builder() {
            super();
        } 

        private Builder(FilePutUserTagsRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.userTags = request.userTags;
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
         * <p>The tags to be added to the file. You cannot leave this parameter empty. You can specify up to 1,000 tags. You cannot specify tags that have the same name.</p>
         * <p>This parameter is required.</p>
         */
        public Builder userTags(java.util.List<UserTags> userTags) {
            this.putBodyParameter("user_tags", userTags);
            this.userTags = userTags;
            return this;
        }

        @Override
        public FilePutUserTagsRequest build() {
            return new FilePutUserTagsRequest(this);
        } 

    } 

    /**
     * 
     * {@link FilePutUserTagsRequest} extends {@link TeaModel}
     *
     * <p>FilePutUserTagsRequest</p>
     */
    public static class UserTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private UserTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(UserTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the tag. The tag name cannot be empty and cannot contain number signs (#).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>tag</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. The tag value cannot contain number signs (#).</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UserTags build() {
                return new UserTags(this);
            } 

        } 

    }
}
