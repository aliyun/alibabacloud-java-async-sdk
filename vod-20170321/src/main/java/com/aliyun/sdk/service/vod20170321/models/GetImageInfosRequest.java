// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageInfosRequest} extends {@link RequestModel}
 *
 * <p>GetImageInfosRequest</p>
 */
public class GetImageInfosRequest extends Request {
    @Query
    @NameInMap("AuthTimeout")
    private Long authTimeout;

    @Query
    @NameInMap("ImageIds")
    @Validation(required = true)
    private String imageIds;

    @Query
    @NameInMap("OutputType")
    private String outputType;

    private GetImageInfosRequest(Builder builder) {
        super(builder);
        this.authTimeout = builder.authTimeout;
        this.imageIds = builder.imageIds;
        this.outputType = builder.outputType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authTimeout
     */
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return imageIds
     */
    public String getImageIds() {
        return this.imageIds;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    public static final class Builder extends Request.Builder<GetImageInfosRequest, Builder> {
        private Long authTimeout; 
        private String imageIds; 
        private String outputType; 

        private Builder() {
            super();
        } 

        private Builder(GetImageInfosRequest request) {
            super(request);
            this.authTimeout = request.authTimeout;
            this.imageIds = request.imageIds;
            this.outputType = request.outputType;
        } 

        /**
         * AuthTimeout.
         */
        public Builder authTimeout(Long authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * ImageIds.
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
            return this;
        }

        /**
         * OutputType.
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        @Override
        public GetImageInfosRequest build() {
            return new GetImageInfosRequest(this);
        } 

    } 

}
