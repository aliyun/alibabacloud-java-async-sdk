// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link CreateChatSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateChatSessionRequest</p>
 */
public class CreateChatSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("folderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private CreateChatSessionRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
        this.name = builder.name;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateChatSessionRequest, Builder> {
        private String folderId; 
        private String name; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatSessionRequest request) {
            super(request);
            this.folderId = request.folderId;
            this.name = request.name;
            this.userId = request.userId;
        } 

        /**
         * <p>Folder ID, to search for Q&amp;A content within the current folder and its subfolders.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1a851c4a-1d65-11ef-99a7-ssfsfdd</p>
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("folderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>Name of the current session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>analyzer_1744684195</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The unique identifier of the user. If not provided, the SDK calling account will be used as the user ID by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1233333</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateChatSessionRequest build() {
            return new CreateChatSessionRequest(this);
        } 

    } 

}
