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
 * {@link RemoveKnowledgeUploadUserRequest} extends {@link RequestModel}
 *
 * <p>RemoveKnowledgeUploadUserRequest</p>
 */
public class RemoveKnowledgeUploadUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileLocation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private String users;

    private RemoveKnowledgeUploadUserRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.fileLocation = builder.fileLocation;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveKnowledgeUploadUserRequest create() {
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
     * @return users
     */
    public String getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<RemoveKnowledgeUploadUserRequest, Builder> {
        private String DBClusterId; 
        private String fileLocation; 
        private String users; 

        private Builder() {
            super();
        } 

        private Builder(RemoveKnowledgeUploadUserRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.fileLocation = request.fileLocation;
            this.users = request.users;
        } 

        /**
         * <p>The ID of the ADB instance.</p>
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
         * <p>The location of the knowledge base document.</p>
         * <p>This parameter is required.</p>
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
         * <p>The JSON string of the array of authorized users to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;alice&quot;,&quot;bob&quot;]</p>
         */
        public Builder users(String users) {
            this.putQueryParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public RemoveKnowledgeUploadUserRequest build() {
            return new RemoveKnowledgeUploadUserRequest(this);
        } 

    } 

}
