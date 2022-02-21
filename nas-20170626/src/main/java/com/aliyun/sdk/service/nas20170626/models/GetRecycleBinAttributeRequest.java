// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecycleBinAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetRecycleBinAttributeRequest</p>
 */
public class GetRecycleBinAttributeRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    private GetRecycleBinAttributeRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecycleBinAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<GetRecycleBinAttributeRequest, Builder> {
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(GetRecycleBinAttributeRequest response) {
            super(response);
            this.fileSystemId = response.fileSystemId;
        } 

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public GetRecycleBinAttributeRequest build() {
            return new GetRecycleBinAttributeRequest(this);
        } 

    } 

}
