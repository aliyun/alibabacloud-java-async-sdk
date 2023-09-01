// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageRequest} extends {@link RequestModel}
 *
 * <p>GetImageRequest</p>
 */
public class GetImageRequest extends Request {
    @Path
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("Verbose")
    private Boolean verbose;

    private GetImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetImageRequest, Builder> {
        private String imageId; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.verbose = request.verbose;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putPathParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetImageRequest build() {
            return new GetImageRequest(this);
        } 

    } 

}
