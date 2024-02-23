// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVirtualNumberRelationRequest} extends {@link RequestModel}
 *
 * <p>QueryVirtualNumberRelationRequest</p>
 */
public class QueryVirtualNumberRelationRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PhoneNum")
    private String phoneNum;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("QualificationId")
    private Long qualificationId;

    @Query
    @NameInMap("RegionNameCity")
    private String regionNameCity;

    @Query
    @NameInMap("RelatedNum")
    private String relatedNum;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteType")
    private Integer routeType;

    @Query
    @NameInMap("SpecId")
    private Long specId;

    private QueryVirtualNumberRelationRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.phoneNum = builder.phoneNum;
        this.prodCode = builder.prodCode;
        this.qualificationId = builder.qualificationId;
        this.regionNameCity = builder.regionNameCity;
        this.relatedNum = builder.relatedNum;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeType = builder.routeType;
        this.specId = builder.specId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVirtualNumberRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return phoneNum
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return qualificationId
     */
    public Long getQualificationId() {
        return this.qualificationId;
    }

    /**
     * @return regionNameCity
     */
    public String getRegionNameCity() {
        return this.regionNameCity;
    }

    /**
     * @return relatedNum
     */
    public String getRelatedNum() {
        return this.relatedNum;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return routeType
     */
    public Integer getRouteType() {
        return this.routeType;
    }

    /**
     * @return specId
     */
    public Long getSpecId() {
        return this.specId;
    }

    public static final class Builder extends Request.Builder<QueryVirtualNumberRelationRequest, Builder> {
        private Long ownerId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String phoneNum; 
        private String prodCode; 
        private Long qualificationId; 
        private String regionNameCity; 
        private String relatedNum; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer routeType; 
        private Long specId; 

        private Builder() {
            super();
        } 

        private Builder(QueryVirtualNumberRelationRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.phoneNum = request.phoneNum;
            this.prodCode = request.prodCode;
            this.qualificationId = request.qualificationId;
            this.regionNameCity = request.regionNameCity;
            this.relatedNum = request.relatedNum;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeType = request.routeType;
            this.specId = request.specId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The virtual number.
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * The service name. Default value: **dyvms**.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * The qualification ID.
         * <p>
         * 
         * You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Qualifications\&Communication Scripts > Qualification Management**, and then click **Details** in the Actions column to view the qualification ID.
         */
        public Builder qualificationId(Long qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * The city to which the virtual number belongs.
         */
        public Builder regionNameCity(String regionNameCity) {
            this.putQueryParameter("RegionNameCity", regionNameCity);
            this.regionNameCity = regionNameCity;
            return this;
        }

        /**
         * The real number.
         */
        public Builder relatedNum(String relatedNum) {
            this.putQueryParameter("RelatedNum", relatedNum);
            this.relatedNum = relatedNum;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The route type. Valid values:
         * <p>
         * 
         * **0**: number location first. **1**: random.
         */
        public Builder routeType(Integer routeType) {
            this.putQueryParameter("RouteType", routeType);
            this.routeType = routeType;
            return this;
        }

        /**
         * The number type. Valid values:
         * <p>
         * 
         * *   **1**: the number provided by a virtual network operator, in the 05710000\*\*\*\* format.
         * *   **2**: the number provided by an Internet service provider (ISP).
         * *   **3**: a 5-digit phone number that starts with 95.
         */
        public Builder specId(Long specId) {
            this.putQueryParameter("SpecId", specId);
            this.specId = specId;
            return this;
        }

        @Override
        public QueryVirtualNumberRelationRequest build() {
            return new QueryVirtualNumberRelationRequest(this);
        } 

    } 

}
