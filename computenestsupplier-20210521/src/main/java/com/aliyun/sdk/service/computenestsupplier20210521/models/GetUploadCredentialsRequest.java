// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadCredentialsRequest} extends {@link RequestModel}
 *
 * <p>GetUploadCredentialsRequest</p>
 */
public class GetUploadCredentialsRequest extends Request {
    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    private GetUploadCredentialsRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadCredentialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<GetUploadCredentialsRequest, Builder> {
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadCredentialsRequest request) {
            super(request);
            this.fileName = request.fileName;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public GetUploadCredentialsRequest build() {
            return new GetUploadCredentialsRequest(this);
        } 

    } 

}
