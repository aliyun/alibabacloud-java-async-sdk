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
 * {@link AddFolderRequest} extends {@link RequestModel}
 *
 * <p>AddFolderRequest</p>
 */
public class AddFolderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("folderName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentFolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentFolderId;

    private AddFolderRequest(Builder builder) {
        super(builder);
        this.folderName = builder.folderName;
        this.parentFolderId = builder.parentFolderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFolderRequest create() {
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

    public static final class Builder extends Request.Builder<AddFolderRequest, Builder> {
        private String folderName; 
        private String parentFolderId; 

        private Builder() {
            super();
        } 

        private Builder(AddFolderRequest request) {
            super(request);
            this.folderName = request.folderName;
            this.parentFolderId = request.parentFolderId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>“abc” “1234”</p>
         */
        public Builder folderName(String folderName) {
            this.putBodyParameter("folderName", folderName);
            this.folderName = folderName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;0&quot; ：parent folder is root
         * &quot;4b648f6d11344f258df876cbdc24dc1f&quot; ： folderId</p>
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putBodyParameter("parentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        @Override
        public AddFolderRequest build() {
            return new AddFolderRequest(this);
        } 

    } 

}
