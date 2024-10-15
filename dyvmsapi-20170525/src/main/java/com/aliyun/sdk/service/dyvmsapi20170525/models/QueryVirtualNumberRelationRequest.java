// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryVirtualNumberRelationRequest} extends {@link RequestModel}
 *
 * <p>QueryVirtualNumberRelationRequest</p>
 */
public class QueryVirtualNumberRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNum")
    private String phoneNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    private Long qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNameCity")
    private String regionNameCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedNum")
    private String relatedNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteType")
    private Integer routeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecId")
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The virtual number.</p>
         * 
         * <strong>example:</strong>
         * <p>05516214****</p>
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * <p>The service name. Default value: <strong>dyvms</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>dyvms</p>
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * <p>The qualification ID.</p>
         * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Qualifications&amp;Communication Scripts &gt; Qualification Management</strong>, and then click <strong>Details</strong> in the Actions column to view the qualification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000542****</p>
         */
        public Builder qualificationId(Long qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * <p>The city to which the virtual number belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        public Builder regionNameCity(String regionNameCity) {
            this.putQueryParameter("RegionNameCity", regionNameCity);
            this.regionNameCity = regionNameCity;
            return this;
        }

        /**
         * <p>The real number.</p>
         * 
         * <strong>example:</strong>
         * <p>1705559****</p>
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
         * <p>The route type. Valid values:</p>
         * <p><strong>0</strong>: number location first. <strong>1</strong>: random.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder routeType(Integer routeType) {
            this.putQueryParameter("RouteType", routeType);
            this.routeType = routeType;
            return this;
        }

        /**
         * <p>The number type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: the number provided by a virtual network operator, in the 05710000**** format.</li>
         * <li><strong>2</strong>: the number provided by an Internet service provider (ISP).</li>
         * <li><strong>3</strong>: a 5-digit phone number that starts with 95.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
