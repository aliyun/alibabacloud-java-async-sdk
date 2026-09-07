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
 * {@link DeleteKnowledgeFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteKnowledgeFileRequest</p>
 */
public class DeleteKnowledgeFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileLocation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileLocation;

    private DeleteKnowledgeFileRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.fileLocation = builder.fileLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKnowledgeFileRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteKnowledgeFileRequest, Builder> {
        private String DBClusterId; 
        private String fileLocation; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKnowledgeFileRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.fileLocation = request.fileLocation;
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

        @Override
        public DeleteKnowledgeFileRequest build() {
            return new DeleteKnowledgeFileRequest(this);
        } 

    } 

}
