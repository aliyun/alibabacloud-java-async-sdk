// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebHostingUploadCredentialRequest} extends {@link RequestModel}
 *
 * <p>GetWebHostingUploadCredentialRequest</p>
 */
public class GetWebHostingUploadCredentialRequest extends Request {
    @Body
    @NameInMap("FilePath")
    @Validation(required = true)
    private String filePath;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private GetWebHostingUploadCredentialRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebHostingUploadCredentialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<GetWebHostingUploadCredentialRequest, Builder> {
        private String filePath; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetWebHostingUploadCredentialRequest request) {
            super(request);
            this.filePath = request.filePath;
            this.spaceId = request.spaceId;
        } 

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public GetWebHostingUploadCredentialRequest build() {
            return new GetWebHostingUploadCredentialRequest(this);
        } 

    } 

}
