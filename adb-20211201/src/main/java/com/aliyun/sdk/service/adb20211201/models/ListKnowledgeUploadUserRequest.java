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
 * {@link ListKnowledgeUploadUserRequest} extends {@link RequestModel}
 *
 * <p>ListKnowledgeUploadUserRequest</p>
 */
public class ListKnowledgeUploadUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileLocation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileLocation;

    private ListKnowledgeUploadUserRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.fileLocation = builder.fileLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeUploadUserRequest create() {
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

    public static final class Builder extends Request.Builder<ListKnowledgeUploadUserRequest, Builder> {
        private String DBClusterId; 
        private String fileLocation; 

        private Builder() {
            super();
        } 

        private Builder(ListKnowledgeUploadUserRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.fileLocation = request.fileLocation;
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

        @Override
        public ListKnowledgeUploadUserRequest build() {
            return new ListKnowledgeUploadUserRequest(this);
        } 

    } 

}
