// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAttachedMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAttachedMediaInfoRequest</p>
 */
public class GetAttachedMediaInfoRequest extends Request {
    @Query
    @NameInMap("AuthTimeout")
    private Long authTimeout;

    @Query
    @NameInMap("MediaIds")
    @Validation(required = true)
    private String mediaIds;

    @Query
    @NameInMap("OutputType")
    private String outputType;

    private GetAttachedMediaInfoRequest(Builder builder) {
        super(builder);
        this.authTimeout = builder.authTimeout;
        this.mediaIds = builder.mediaIds;
        this.outputType = builder.outputType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttachedMediaInfoRequest create() {
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
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    public static final class Builder extends Request.Builder<GetAttachedMediaInfoRequest, Builder> {
        private Long authTimeout; 
        private String mediaIds; 
        private String outputType; 

        private Builder() {
            super();
        } 

        private Builder(GetAttachedMediaInfoRequest response) {
            super(response);
            this.authTimeout = response.authTimeout;
            this.mediaIds = response.mediaIds;
            this.outputType = response.outputType;
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
         * MediaIds.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
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
        public GetAttachedMediaInfoRequest build() {
            return new GetAttachedMediaInfoRequest(this);
        } 

    } 

}
