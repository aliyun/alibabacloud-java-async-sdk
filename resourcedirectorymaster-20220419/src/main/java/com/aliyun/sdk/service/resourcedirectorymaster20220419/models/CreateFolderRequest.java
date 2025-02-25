// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link CreateFolderRequest} extends {@link RequestModel}
 *
 * <p>CreateFolderRequest</p>
 */
public class CreateFolderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FolderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    private String parentFolderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateFolderRequest(Builder builder) {
        super(builder);
        this.folderName = builder.folderName;
        this.parentFolderId = builder.parentFolderId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFolderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderName
     */
    public String getFolderName() {
        return this.folderName;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateFolderRequest, Builder> {
        private String folderName; 
        private String parentFolderId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateFolderRequest request) {
            super(request);
            this.folderName = request.folderName;
            this.parentFolderId = request.parentFolderId;
            this.tag = request.tag;
        } 

        /**
         * <p>The name of the folder.</p>
         * <p>The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.),and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rdFolder</p>
         */
        public Builder folderName(String folderName) {
            this.putQueryParameter("FolderName", folderName);
            this.folderName = folderName;
            return this;
        }

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>r-b1****</p>
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * <p>The tag to add to the folder.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateFolderRequest build() {
            return new CreateFolderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFolderRequest} extends {@link TeaModel}
     *
     * <p>CreateFolderRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
