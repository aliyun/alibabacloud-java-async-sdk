// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20200618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmartVerifyRequest} extends {@link RequestModel}
 *
 * <p>DescribeSmartVerifyRequest</p>
 */
public class DescribeSmartVerifyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CertifyId")
    private String certifyId;

    @Body
    @NameInMap("PictureReturnType")
    private String pictureReturnType;

    @Body
    @NameInMap("SceneId")
    private Long sceneId;

    private DescribeSmartVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.certifyId = builder.certifyId;
        this.pictureReturnType = builder.pictureReturnType;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartVerifyRequest create() {
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
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    /**
     * @return pictureReturnType
     */
    public String getPictureReturnType() {
        return this.pictureReturnType;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DescribeSmartVerifyRequest, Builder> {
        private String regionId; 
        private String certifyId; 
        private String pictureReturnType; 
        private Long sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSmartVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.certifyId = request.certifyId;
            this.pictureReturnType = request.pictureReturnType;
            this.sceneId = request.sceneId;
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
         * CertifyId.
         */
        public Builder certifyId(String certifyId) {
            this.putBodyParameter("CertifyId", certifyId);
            this.certifyId = certifyId;
            return this;
        }

        /**
         * PictureReturnType.
         */
        public Builder pictureReturnType(String pictureReturnType) {
            this.putBodyParameter("PictureReturnType", pictureReturnType);
            this.pictureReturnType = pictureReturnType;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(Long sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DescribeSmartVerifyRequest build() {
            return new DescribeSmartVerifyRequest(this);
        } 

    } 

}
