// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectFaceAttributesRequest} extends {@link RequestModel}
 *
 * <p>DetectFaceAttributesRequest</p>
 */
public class DetectFaceAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaterialValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String materialValue;

    private DetectFaceAttributesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizType = builder.bizType;
        this.materialValue = builder.materialValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectFaceAttributesRequest create() {
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return materialValue
     */
    public String getMaterialValue() {
        return this.materialValue;
    }

    public static final class Builder extends Request.Builder<DetectFaceAttributesRequest, Builder> {
        private String regionId; 
        private String bizType; 
        private String materialValue; 

        private Builder() {
            super();
        } 

        private Builder(DetectFaceAttributesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizType = request.bizType;
            this.materialValue = request.materialValue;
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
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * MaterialValue.
         */
        public Builder materialValue(String materialValue) {
            this.putBodyParameter("MaterialValue", materialValue);
            this.materialValue = materialValue;
            return this;
        }

        @Override
        public DetectFaceAttributesRequest build() {
            return new DetectFaceAttributesRequest(this);
        } 

    } 

}
