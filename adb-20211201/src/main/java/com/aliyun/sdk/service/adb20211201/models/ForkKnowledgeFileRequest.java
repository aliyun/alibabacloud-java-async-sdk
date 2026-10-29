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
 * {@link ForkKnowledgeFileRequest} extends {@link RequestModel}
 *
 * <p>ForkKnowledgeFileRequest</p>
 */
public class ForkKnowledgeFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileLocation")
    private String fileLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadUser")
    private String uploadUser;

    private ForkKnowledgeFileRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.fileId = builder.fileId;
        this.fileLocation = builder.fileLocation;
        this.tags = builder.tags;
        this.uploadUser = builder.uploadUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForkKnowledgeFileRequest create() {
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
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileLocation
     */
    public String getFileLocation() {
        return this.fileLocation;
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

    public static final class Builder extends Request.Builder<ForkKnowledgeFileRequest, Builder> {
        private String DBClusterId; 
        private String fileId; 
        private String fileLocation; 
        private String tags; 
        private String uploadUser; 

        private Builder() {
            super();
        } 

        private Builder(ForkKnowledgeFileRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.fileId = request.fileId;
            this.fileLocation = request.fileLocation;
            this.tags = request.tags;
            this.uploadUser = request.uploadUser;
        } 

        /**
         * <p>The ADB instance ID.</p>
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
         * <p>The ID of the knowledge base file. You must specify either this parameter or FileLocation, but not both. Use a decimal positive integer string without leading zeros. Valid values: 1 to 9223372036854775807.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The address of a single file in the knowledge base. You must specify either this parameter or FileId, but not both. You cannot specify a directory. The address must uniquely locate an active file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/doc.pdf</p>
         */
        public Builder fileLocation(String fileLocation) {
            this.putQueryParameter("FileLocation", fileLocation);
            this.fileLocation = fileLocation;
            return this;
        }

        /**
         * <p>The initial business tags for the new record. Use a JSON string of a JSON object or an array of tag_key/tag_value objects. If omitted, the source tags are not inherited.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;biz.game&quot;:&quot;yys&quot;}</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The initial authorized user for the new record. You can pass a JSON string of a single user identifier or a user array. If omitted, no initial user authorization is applied, and the source authorization is not inherited.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;alice&quot;,&quot;bob&quot;]</p>
         */
        public Builder uploadUser(String uploadUser) {
            this.putQueryParameter("UploadUser", uploadUser);
            this.uploadUser = uploadUser;
            return this;
        }

        @Override
        public ForkKnowledgeFileRequest build() {
            return new ForkKnowledgeFileRequest(this);
        } 

    } 

}
