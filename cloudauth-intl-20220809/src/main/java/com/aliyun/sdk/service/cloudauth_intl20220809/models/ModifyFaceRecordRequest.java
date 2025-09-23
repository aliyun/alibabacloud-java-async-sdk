// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFaceRecordRequest} extends {@link RequestModel}
 *
 * <p>ModifyFaceRecordRequest</p>
 */
public class ModifyFaceRecordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceGroupCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String faceGroupCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImgOssInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imgOssInfos;

    private ModifyFaceRecordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.faceGroupCode = builder.faceGroupCode;
        this.imgOssInfos = builder.imgOssInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFaceRecordRequest create() {
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
     * @return faceGroupCode
     */
    public String getFaceGroupCode() {
        return this.faceGroupCode;
    }

    /**
     * @return imgOssInfos
     */
    public String getImgOssInfos() {
        return this.imgOssInfos;
    }

    public static final class Builder extends Request.Builder<ModifyFaceRecordRequest, Builder> {
        private String regionId; 
        private String faceGroupCode; 
        private String imgOssInfos; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFaceRecordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.faceGroupCode = request.faceGroupCode;
            this.imgOssInfos = request.imgOssInfos;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4EB35****87</p>
         */
        public Builder faceGroupCode(String faceGroupCode) {
            this.putBodyParameter("FaceGroupCode", faceGroupCode);
            this.faceGroupCode = faceGroupCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder imgOssInfos(String imgOssInfos) {
            this.putBodyParameter("ImgOssInfos", imgOssInfos);
            this.imgOssInfos = imgOssInfos;
            return this;
        }

        @Override
        public ModifyFaceRecordRequest build() {
            return new ModifyFaceRecordRequest(this);
        } 

    } 

}
