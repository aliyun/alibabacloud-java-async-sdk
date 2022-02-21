// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationImageRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationImageRequest</p>
 */
public class DescribeApplicationImageRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ImageUrl")
    @Validation(required = true)
    private String imageUrl;

    private DescribeApplicationImageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.imageUrl = builder.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationImageRequest, Builder> {
        private String appId; 
        private String imageUrl; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationImageRequest response) {
            super(response);
            this.appId = response.appId;
            this.imageUrl = response.imageUrl;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        @Override
        public DescribeApplicationImageRequest build() {
            return new DescribeApplicationImageRequest(this);
        } 

    } 

}
