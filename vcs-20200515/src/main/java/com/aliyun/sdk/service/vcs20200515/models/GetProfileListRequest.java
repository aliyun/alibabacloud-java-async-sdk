// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProfileListRequest} extends {@link RequestModel}
 *
 * <p>GetProfileListRequest</p>
 */
public class GetProfileListRequest extends Request {
    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("CatalogId")
    @Validation(maximum = 9999999999999D, minimum = 1)
    private Long catalogId;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("FaceImageId")
    private String faceImageId;

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
    @NameInMap("MatchingRateThreshold")
    private String matchingRateThreshold;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Long pageSize;

    @Body
    @NameInMap("PersonIdList")
    private java.util.Map < String, ? > personIdList;

    @Body
    @NameInMap("PhoneNo")
    private String phoneNo;

    @Body
    @NameInMap("PlateNo")
    private String plateNo;

    @Body
    @NameInMap("ProfileIdList")
    private java.util.Map < String, ? > profileIdList;

    @Body
    @NameInMap("SceneType")
    private String sceneType;

    private GetProfileListRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.catalogId = builder.catalogId;
        this.corpId = builder.corpId;
        this.faceImageId = builder.faceImageId;
        this.faceUrl = builder.faceUrl;
        this.gender = builder.gender;
        this.idNumber = builder.idNumber;
        this.isvSubId = builder.isvSubId;
        this.liveAddress = builder.liveAddress;
        this.matchingRateThreshold = builder.matchingRateThreshold;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.personIdList = builder.personIdList;
        this.phoneNo = builder.phoneNo;
        this.plateNo = builder.plateNo;
        this.profileIdList = builder.profileIdList;
        this.sceneType = builder.sceneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProfileListRequest create() {
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
     * @return faceImageId
     */
    public String getFaceImageId() {
        return this.faceImageId;
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
     * @return matchingRateThreshold
     */
    public String getMatchingRateThreshold() {
        return this.matchingRateThreshold;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return personIdList
     */
    public java.util.Map < String, ? > getPersonIdList() {
        return this.personIdList;
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
     * @return profileIdList
     */
    public java.util.Map < String, ? > getProfileIdList() {
        return this.profileIdList;
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    public static final class Builder extends Request.Builder<GetProfileListRequest, Builder> {
        private String bizId; 
        private Long catalogId; 
        private String corpId; 
        private String faceImageId; 
        private String faceUrl; 
        private Integer gender; 
        private String idNumber; 
        private String isvSubId; 
        private String liveAddress; 
        private String matchingRateThreshold; 
        private String name; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.Map < String, ? > personIdList; 
        private String phoneNo; 
        private String plateNo; 
        private java.util.Map < String, ? > profileIdList; 
        private String sceneType; 

        private Builder() {
            super();
        } 

        private Builder(GetProfileListRequest response) {
            super(response);
            this.bizId = response.bizId;
            this.catalogId = response.catalogId;
            this.corpId = response.corpId;
            this.faceImageId = response.faceImageId;
            this.faceUrl = response.faceUrl;
            this.gender = response.gender;
            this.idNumber = response.idNumber;
            this.isvSubId = response.isvSubId;
            this.liveAddress = response.liveAddress;
            this.matchingRateThreshold = response.matchingRateThreshold;
            this.name = response.name;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.personIdList = response.personIdList;
            this.phoneNo = response.phoneNo;
            this.plateNo = response.plateNo;
            this.profileIdList = response.profileIdList;
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
         * FaceImageId.
         */
        public Builder faceImageId(String faceImageId) {
            this.putBodyParameter("FaceImageId", faceImageId);
            this.faceImageId = faceImageId;
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
         * MatchingRateThreshold.
         */
        public Builder matchingRateThreshold(String matchingRateThreshold) {
            this.putBodyParameter("MatchingRateThreshold", matchingRateThreshold);
            this.matchingRateThreshold = matchingRateThreshold;
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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PersonIdList.
         */
        public Builder personIdList(java.util.Map < String, ? > personIdList) {
            this.putBodyParameter("PersonIdList", personIdList);
            this.personIdList = personIdList;
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
         * ProfileIdList.
         */
        public Builder profileIdList(java.util.Map < String, ? > profileIdList) {
            this.putBodyParameter("ProfileIdList", profileIdList);
            this.profileIdList = profileIdList;
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
        public GetProfileListRequest build() {
            return new GetProfileListRequest(this);
        } 

    } 

}
