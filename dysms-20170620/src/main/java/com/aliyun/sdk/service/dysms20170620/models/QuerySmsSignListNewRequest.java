// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsSignListNewRequest} extends {@link RequestModel}
 *
 * <p>QuerySmsSignListNewRequest</p>
 */
public class QuerySmsSignListNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatedRegisterStatus")
    private Integer aggregatedRegisterStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditState")
    private String auditState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsGlobeSign")
    private Integer isGlobeSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorCodes")
    private java.util.List<String> operatorCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorRegisterStatus")
    private Integer operatorRegisterStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationName")
    private String qualificationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegisterResult")
    private Integer registerResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignSource")
    private String signSource;

    private QuerySmsSignListNewRequest(Builder builder) {
        super(builder);
        this.aggregatedRegisterStatus = builder.aggregatedRegisterStatus;
        this.auditState = builder.auditState;
        this.bizType = builder.bizType;
        this.isGlobeSign = builder.isGlobeSign;
        this.operatorCodes = builder.operatorCodes;
        this.operatorRegisterStatus = builder.operatorRegisterStatus;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.prodCode = builder.prodCode;
        this.qualificationName = builder.qualificationName;
        this.registerResult = builder.registerResult;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceType = builder.serviceType;
        this.signName = builder.signName;
        this.signSource = builder.signSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsSignListNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatedRegisterStatus
     */
    public Integer getAggregatedRegisterStatus() {
        return this.aggregatedRegisterStatus;
    }

    /**
     * @return auditState
     */
    public String getAuditState() {
        return this.auditState;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return isGlobeSign
     */
    public Integer getIsGlobeSign() {
        return this.isGlobeSign;
    }

    /**
     * @return operatorCodes
     */
    public java.util.List<String> getOperatorCodes() {
        return this.operatorCodes;
    }

    /**
     * @return operatorRegisterStatus
     */
    public Integer getOperatorRegisterStatus() {
        return this.operatorRegisterStatus;
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
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return qualificationName
     */
    public String getQualificationName() {
        return this.qualificationName;
    }

    /**
     * @return registerResult
     */
    public Integer getRegisterResult() {
        return this.registerResult;
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
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signSource
     */
    public String getSignSource() {
        return this.signSource;
    }

    public static final class Builder extends Request.Builder<QuerySmsSignListNewRequest, Builder> {
        private Integer aggregatedRegisterStatus; 
        private String auditState; 
        private String bizType; 
        private Integer isGlobeSign; 
        private java.util.List<String> operatorCodes; 
        private Integer operatorRegisterStatus; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String prodCode; 
        private String qualificationName; 
        private Integer registerResult; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String serviceType; 
        private String signName; 
        private String signSource; 

        private Builder() {
            super();
        } 

        private Builder(QuerySmsSignListNewRequest request) {
            super(request);
            this.aggregatedRegisterStatus = request.aggregatedRegisterStatus;
            this.auditState = request.auditState;
            this.bizType = request.bizType;
            this.isGlobeSign = request.isGlobeSign;
            this.operatorCodes = request.operatorCodes;
            this.operatorRegisterStatus = request.operatorRegisterStatus;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.prodCode = request.prodCode;
            this.qualificationName = request.qualificationName;
            this.registerResult = request.registerResult;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serviceType = request.serviceType;
            this.signName = request.signName;
            this.signSource = request.signSource;
        } 

        /**
         * AggregatedRegisterStatus.
         */
        public Builder aggregatedRegisterStatus(Integer aggregatedRegisterStatus) {
            this.putQueryParameter("AggregatedRegisterStatus", aggregatedRegisterStatus);
            this.aggregatedRegisterStatus = aggregatedRegisterStatus;
            return this;
        }

        /**
         * AuditState.
         */
        public Builder auditState(String auditState) {
            this.putQueryParameter("AuditState", auditState);
            this.auditState = auditState;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * IsGlobeSign.
         */
        public Builder isGlobeSign(Integer isGlobeSign) {
            this.putQueryParameter("IsGlobeSign", isGlobeSign);
            this.isGlobeSign = isGlobeSign;
            return this;
        }

        /**
         * OperatorCodes.
         */
        public Builder operatorCodes(java.util.List<String> operatorCodes) {
            String operatorCodesShrink = shrink(operatorCodes, "OperatorCodes", "json");
            this.putQueryParameter("OperatorCodes", operatorCodesShrink);
            this.operatorCodes = operatorCodes;
            return this;
        }

        /**
         * OperatorRegisterStatus.
         */
        public Builder operatorRegisterStatus(Integer operatorRegisterStatus) {
            this.putQueryParameter("OperatorRegisterStatus", operatorRegisterStatus);
            this.operatorRegisterStatus = operatorRegisterStatus;
            return this;
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
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * QualificationName.
         */
        public Builder qualificationName(String qualificationName) {
            this.putQueryParameter("QualificationName", qualificationName);
            this.qualificationName = qualificationName;
            return this;
        }

        /**
         * RegisterResult.
         */
        public Builder registerResult(Integer registerResult) {
            this.putQueryParameter("RegisterResult", registerResult);
            this.registerResult = registerResult;
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
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * SignName.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * SignSource.
         */
        public Builder signSource(String signSource) {
            this.putQueryParameter("SignSource", signSource);
            this.signSource = signSource;
            return this;
        }

        @Override
        public QuerySmsSignListNewRequest build() {
            return new QuerySmsSignListNewRequest(this);
        } 

    } 

}
