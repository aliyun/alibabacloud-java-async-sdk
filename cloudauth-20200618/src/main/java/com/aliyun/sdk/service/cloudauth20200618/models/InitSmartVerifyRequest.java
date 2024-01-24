// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20200618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitSmartVerifyRequest} extends {@link RequestModel}
 *
 * <p>InitSmartVerifyRequest</p>
 */
public class InitSmartVerifyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CallbackToken")
    private String callbackToken;

    @Body
    @NameInMap("CallbackUrl")
    private String callbackUrl;

    @Body
    @NameInMap("CertName")
    private String certName;

    @Body
    @NameInMap("CertNo")
    private String certNo;

    @Body
    @NameInMap("CertType")
    private String certType;

    @Body
    @NameInMap("CertifyId")
    private String certifyId;

    @Body
    @NameInMap("FacePictureBase64")
    private String facePictureBase64;

    @Body
    @NameInMap("FacePictureUrl")
    private String facePictureUrl;

    @Body
    @NameInMap("IdName")
    private String idName;

    @Body
    @NameInMap("IdNo")
    private String idNo;

    @Body
    @NameInMap("Ip")
    private String ip;

    @Body
    @NameInMap("MetaInfo")
    private String metaInfo;

    @Body
    @NameInMap("Mobile")
    private String mobile;

    @Body
    @NameInMap("Mode")
    private String mode;

    @Body
    @NameInMap("Ocr")
    private String ocr;

    @Body
    @NameInMap("OssBucketName")
    private String ossBucketName;

    @Body
    @NameInMap("OssObjectName")
    private String ossObjectName;

    @Body
    @NameInMap("OuterOrderNo")
    private String outerOrderNo;

    @Body
    @NameInMap("SceneId")
    private Long sceneId;

    @Body
    @NameInMap("UserId")
    private String userId;

    private InitSmartVerifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callbackToken = builder.callbackToken;
        this.callbackUrl = builder.callbackUrl;
        this.certName = builder.certName;
        this.certNo = builder.certNo;
        this.certType = builder.certType;
        this.certifyId = builder.certifyId;
        this.facePictureBase64 = builder.facePictureBase64;
        this.facePictureUrl = builder.facePictureUrl;
        this.idName = builder.idName;
        this.idNo = builder.idNo;
        this.ip = builder.ip;
        this.metaInfo = builder.metaInfo;
        this.mobile = builder.mobile;
        this.mode = builder.mode;
        this.ocr = builder.ocr;
        this.ossBucketName = builder.ossBucketName;
        this.ossObjectName = builder.ossObjectName;
        this.outerOrderNo = builder.outerOrderNo;
        this.sceneId = builder.sceneId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitSmartVerifyRequest create() {
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
     * @return callbackToken
     */
    public String getCallbackToken() {
        return this.callbackToken;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certNo
     */
    public String getCertNo() {
        return this.certNo;
    }

    /**
     * @return certType
     */
    public String getCertType() {
        return this.certType;
    }

    /**
     * @return certifyId
     */
    public String getCertifyId() {
        return this.certifyId;
    }

    /**
     * @return facePictureBase64
     */
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    /**
     * @return facePictureUrl
     */
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    /**
     * @return idName
     */
    public String getIdName() {
        return this.idName;
    }

    /**
     * @return idNo
     */
    public String getIdNo() {
        return this.idNo;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return metaInfo
     */
    public String getMetaInfo() {
        return this.metaInfo;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return ocr
     */
    public String getOcr() {
        return this.ocr;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossObjectName
     */
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    /**
     * @return outerOrderNo
     */
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<InitSmartVerifyRequest, Builder> {
        private String regionId; 
        private String callbackToken; 
        private String callbackUrl; 
        private String certName; 
        private String certNo; 
        private String certType; 
        private String certifyId; 
        private String facePictureBase64; 
        private String facePictureUrl; 
        private String idName; 
        private String idNo; 
        private String ip; 
        private String metaInfo; 
        private String mobile; 
        private String mode; 
        private String ocr; 
        private String ossBucketName; 
        private String ossObjectName; 
        private String outerOrderNo; 
        private Long sceneId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(InitSmartVerifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callbackToken = request.callbackToken;
            this.callbackUrl = request.callbackUrl;
            this.certName = request.certName;
            this.certNo = request.certNo;
            this.certType = request.certType;
            this.certifyId = request.certifyId;
            this.facePictureBase64 = request.facePictureBase64;
            this.facePictureUrl = request.facePictureUrl;
            this.idName = request.idName;
            this.idNo = request.idNo;
            this.ip = request.ip;
            this.metaInfo = request.metaInfo;
            this.mobile = request.mobile;
            this.mode = request.mode;
            this.ocr = request.ocr;
            this.ossBucketName = request.ossBucketName;
            this.ossObjectName = request.ossObjectName;
            this.outerOrderNo = request.outerOrderNo;
            this.sceneId = request.sceneId;
            this.userId = request.userId;
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
         * CallbackToken.
         */
        public Builder callbackToken(String callbackToken) {
            this.putBodyParameter("CallbackToken", callbackToken);
            this.callbackToken = callbackToken;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putBodyParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putBodyParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * CertNo.
         */
        public Builder certNo(String certNo) {
            this.putBodyParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * CertType.
         */
        public Builder certType(String certType) {
            this.putBodyParameter("CertType", certType);
            this.certType = certType;
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
         * FacePictureBase64.
         */
        public Builder facePictureBase64(String facePictureBase64) {
            this.putBodyParameter("FacePictureBase64", facePictureBase64);
            this.facePictureBase64 = facePictureBase64;
            return this;
        }

        /**
         * FacePictureUrl.
         */
        public Builder facePictureUrl(String facePictureUrl) {
            this.putBodyParameter("FacePictureUrl", facePictureUrl);
            this.facePictureUrl = facePictureUrl;
            return this;
        }

        /**
         * IdName.
         */
        public Builder idName(String idName) {
            this.putBodyParameter("IdName", idName);
            this.idName = idName;
            return this;
        }

        /**
         * IdNo.
         */
        public Builder idNo(String idNo) {
            this.putBodyParameter("IdNo", idNo);
            this.idNo = idNo;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putBodyParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * MetaInfo.
         */
        public Builder metaInfo(String metaInfo) {
            this.putBodyParameter("MetaInfo", metaInfo);
            this.metaInfo = metaInfo;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Ocr.
         */
        public Builder ocr(String ocr) {
            this.putBodyParameter("Ocr", ocr);
            this.ocr = ocr;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putBodyParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssObjectName.
         */
        public Builder ossObjectName(String ossObjectName) {
            this.putBodyParameter("OssObjectName", ossObjectName);
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * OuterOrderNo.
         */
        public Builder outerOrderNo(String outerOrderNo) {
            this.putBodyParameter("OuterOrderNo", outerOrderNo);
            this.outerOrderNo = outerOrderNo;
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

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public InitSmartVerifyRequest build() {
            return new InitSmartVerifyRequest(this);
        } 

    } 

}
