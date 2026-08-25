// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetFileUploadInfoRequest} extends {@link RequestModel}
 *
 * <p>GetFileUploadInfoRequest</p>
 */
public class GetFileUploadInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    private GetFileUploadInfoRequest(Builder builder) {
        super(builder);
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileUploadInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    public static final class Builder extends Request.Builder<GetFileUploadInfoRequest, Builder> {
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(GetFileUploadInfoRequest request) {
            super(request);
            this.fileType = request.fileType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BrowserBookmarks</p>
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        @Override
        public GetFileUploadInfoRequest build() {
            return new GetFileUploadInfoRequest(this);
        } 

    } 

}
