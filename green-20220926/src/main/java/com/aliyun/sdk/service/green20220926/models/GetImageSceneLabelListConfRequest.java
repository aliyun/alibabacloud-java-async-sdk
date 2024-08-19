// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageSceneLabelListConfRequest} extends {@link RequestModel}
 *
 * <p>GetImageSceneLabelListConfRequest</p>
 */
public class GetImageSceneLabelListConfRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageServiceCode")
    private String imageServiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetImageSceneLabelListConfRequest(Builder builder) {
        super(builder);
        this.imageServiceCode = builder.imageServiceCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageSceneLabelListConfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageServiceCode
     */
    public String getImageServiceCode() {
        return this.imageServiceCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetImageSceneLabelListConfRequest, Builder> {
        private String imageServiceCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetImageSceneLabelListConfRequest request) {
            super(request);
            this.imageServiceCode = request.imageServiceCode;
            this.regionId = request.regionId;
        } 

        /**
         * ImageServiceCode.
         */
        public Builder imageServiceCode(String imageServiceCode) {
            this.putQueryParameter("ImageServiceCode", imageServiceCode);
            this.imageServiceCode = imageServiceCode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetImageSceneLabelListConfRequest build() {
            return new GetImageSceneLabelListConfRequest(this);
        } 

    } 

}
