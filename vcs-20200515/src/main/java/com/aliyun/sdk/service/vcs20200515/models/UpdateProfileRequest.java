// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProfileRequest} extends {@link RequestModel}
 *
 * <p>UpdateProfileRequest</p>
 */
public class UpdateProfileRequest extends Request {
    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("CatalogId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long catalogId;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("FaceUrl")
    private String faceUrl;

    @Body
    @NameInMap("Gender")
    @Validation(maximum = 2, minimum = 1)
    private Integer gender;

    @Body
    @NameInMap("IdNumber")
    private String idNumber;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    @Body
    @NameInMap("LiveAddress")
    private String liveAddress;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PhoneNo")
    private String phoneNo;

    @Body
    @NameInMap("PlateNo")
    private String plateNo;

    @Body
    @NameInMap("ProfileId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long profileId;

    @Body
    @NameInMap("SceneType")
    private String sceneType;

    private UpdateProfileRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.catalogId = builder.catalogId;
        this.corpId = builder.corpId;
        this.faceUrl = builder.faceUrl;
        this.gender = builder.gender;
        this.idNumber = builder.idNumber;
        this.isvSubId = builder.isvSubId;
        this.liveAddress = builder.liveAddress;
        this.name = builder.name;
        this.phoneNo = builder.phoneNo;
        this.plateNo = builder.plateNo;
        this.profileId = builder.profileId;
        this.sceneType = builder.sceneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProfileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return catalogId
     */
    public Long getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return faceUrl
     */
    public String getFaceUrl() {
        return this.faceUrl;
    }

    /**
     * @return gender
     */
    public Integer getGender() {
        return this.gender;
    }

    /**
     * @return idNumber
     */
    public String getIdNumber() {
        return this.idNumber;
    }

    /**
     * @return isvSubId
     */
    public String getIsvSubId() {
        return this.isvSubId;
    }

    /**
     * @return liveAddress
     */
    public String getLiveAddress() {
        return this.liveAddress;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phoneNo
     */
    public String getPhoneNo() {
        return this.phoneNo;
    }

    /**
     * @return plateNo
     */
    public String getPlateNo() {
        return this.plateNo;
    }

    /**
     * @return profileId
     */
    public Long getProfileId() {
        return this.profileId;
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    public static final class Builder extends Request.Builder<UpdateProfileRequest, Builder> {
        private String bizId; 
        private Long catalogId; 
        private String corpId; 
        private String faceUrl; 
        private Integer gender; 
        private String idNumber; 
        private String isvSubId; 
        private String liveAddress; 
        private String name; 
        private String phoneNo; 
        private String plateNo; 
        private Long profileId; 
        private String sceneType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProfileRequest response) {
            super(response);
            this.bizId = response.bizId;
            this.catalogId = response.catalogId;
            this.corpId = response.corpId;
            this.faceUrl = response.faceUrl;
            this.gender = response.gender;
            this.idNumber = response.idNumber;
            this.isvSubId = response.isvSubId;
            this.liveAddress = response.liveAddress;
            this.name = response.name;
            this.phoneNo = response.phoneNo;
            this.plateNo = response.plateNo;
            this.profileId = response.profileId;
            this.sceneType = response.sceneType;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CatalogId.
         */
        public Builder catalogId(Long catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * FaceUrl.
         */
        public Builder faceUrl(String faceUrl) {
            this.putBodyParameter("FaceUrl", faceUrl);
            this.faceUrl = faceUrl;
            return this;
        }

        /**
         * Gender.
         */
        public Builder gender(Integer gender) {
            this.putBodyParameter("Gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * IdNumber.
         */
        public Builder idNumber(String idNumber) {
            this.putBodyParameter("IdNumber", idNumber);
            this.idNumber = idNumber;
            return this;
        }

        /**
         * IsvSubId.
         */
        public Builder isvSubId(String isvSubId) {
            this.putBodyParameter("IsvSubId", isvSubId);
            this.isvSubId = isvSubId;
            return this;
        }

        /**
         * LiveAddress.
         */
        public Builder liveAddress(String liveAddress) {
            this.putBodyParameter("LiveAddress", liveAddress);
            this.liveAddress = liveAddress;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PhoneNo.
         */
        public Builder phoneNo(String phoneNo) {
            this.putBodyParameter("PhoneNo", phoneNo);
            this.phoneNo = phoneNo;
            return this;
        }

        /**
         * PlateNo.
         */
        public Builder plateNo(String plateNo) {
            this.putBodyParameter("PlateNo", plateNo);
            this.plateNo = plateNo;
            return this;
        }

        /**
         * ProfileId.
         */
        public Builder profileId(Long profileId) {
            this.putBodyParameter("ProfileId", profileId);
            this.profileId = profileId;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(String sceneType) {
            this.putBodyParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        @Override
        public UpdateProfileRequest build() {
            return new UpdateProfileRequest(this);
        } 

    } 

}
