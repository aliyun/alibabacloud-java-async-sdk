// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFileInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileInfoRequest</p>
 */
public class UpdateFileInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    private UpdateFileInfoRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fileId = builder.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    public static final class Builder extends Request.Builder<UpdateFileInfoRequest, Builder> {
        private String description; 
        private String fileId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileInfoRequest request) {
            super(request);
            this.description = request.description;
            this.fileId = request.fileId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        @Override
        public UpdateFileInfoRequest build() {
            return new UpdateFileInfoRequest(this);
        } 

    } 

}
