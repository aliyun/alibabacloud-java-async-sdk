// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppWorkspaceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>GetAppWorkspaceDirectoryRequest</p>
 */
public class GetAppWorkspaceDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Deep")
    private Integer deep;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    private GetAppWorkspaceDirectoryRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.deep = builder.deep;
        this.filePath = builder.filePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppWorkspaceDirectoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return deep
     */
    public Integer getDeep() {
        return this.deep;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    public static final class Builder extends Request.Builder<GetAppWorkspaceDirectoryRequest, Builder> {
        private String conversationId; 
        private Integer deep; 
        private String filePath; 

        private Builder() {
            super();
        } 

        private Builder(GetAppWorkspaceDirectoryRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.deep = request.deep;
            this.filePath = request.filePath;
        } 

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * Deep.
         */
        public Builder deep(Integer deep) {
            this.putBodyParameter("Deep", deep);
            this.deep = deep;
            return this;
        }

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        @Override
        public GetAppWorkspaceDirectoryRequest build() {
            return new GetAppWorkspaceDirectoryRequest(this);
        } 

    } 

}
