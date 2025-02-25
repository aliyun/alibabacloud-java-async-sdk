// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadOssUrlRequest} extends {@link RequestModel}
 *
 * <p>GetUploadOssUrlRequest</p>
 */
public class GetUploadOssUrlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EffectiveTimeMinutes")
    private Integer effectiveTimeMinutes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetUploadOssUrlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.effectiveTimeMinutes = builder.effectiveTimeMinutes;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadOssUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return effectiveTimeMinutes
     */
    public Integer getEffectiveTimeMinutes() {
        return this.effectiveTimeMinutes;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetUploadOssUrlRequest, Builder> {
        private String regionId; 
        private Integer effectiveTimeMinutes; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadOssUrlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.effectiveTimeMinutes = request.effectiveTimeMinutes;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EffectiveTimeMinutes.
         */
        public Builder effectiveTimeMinutes(Integer effectiveTimeMinutes) {
            this.putBodyParameter("EffectiveTimeMinutes", effectiveTimeMinutes);
            this.effectiveTimeMinutes = effectiveTimeMinutes;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetUploadOssUrlRequest build() {
            return new GetUploadOssUrlRequest(this);
        } 

    } 

}
