// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDynamicImageJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitDynamicImageJobRequest</p>
 */
public class SubmitDynamicImageJobRequest extends Request {
    @Query
    @NameInMap("DynamicImageTemplateId")
    @Validation(required = true)
    private String dynamicImageTemplateId;

    @Query
    @NameInMap("OverrideParams")
    private String overrideParams;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private SubmitDynamicImageJobRequest(Builder builder) {
        super(builder);
        this.dynamicImageTemplateId = builder.dynamicImageTemplateId;
        this.overrideParams = builder.overrideParams;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDynamicImageJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicImageTemplateId
     */
    public String getDynamicImageTemplateId() {
        return this.dynamicImageTemplateId;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitDynamicImageJobRequest, Builder> {
        private String dynamicImageTemplateId; 
        private String overrideParams; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDynamicImageJobRequest request) {
            super(request);
            this.dynamicImageTemplateId = request.dynamicImageTemplateId;
            this.overrideParams = request.overrideParams;
            this.videoId = request.videoId;
        } 

        /**
         * DynamicImageTemplateId.
         */
        public Builder dynamicImageTemplateId(String dynamicImageTemplateId) {
            this.putQueryParameter("DynamicImageTemplateId", dynamicImageTemplateId);
            this.dynamicImageTemplateId = dynamicImageTemplateId;
            return this;
        }

        /**
         * OverrideParams.
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * VideoId.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitDynamicImageJobRequest build() {
            return new SubmitDynamicImageJobRequest(this);
        } 

    } 

}
