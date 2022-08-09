// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardInfoRequest} extends {@link RequestModel}
 *
 * <p>ListCardInfoRequest</p>
 */
public class ListCardInfoRequest extends Request {
    @Query
    @NameInMap("ActiveTimeEnd")
    private String activeTimeEnd;

    @Query
    @NameInMap("ActiveTimeStart")
    private String activeTimeStart;

    @Query
    @NameInMap("AliFee")
    private String aliFee;

    @Query
    @NameInMap("AliyunOrderId")
    private String aliyunOrderId;

    @Query
    @NameInMap("ApnName")
    private String apnName;

    @Query
    @NameInMap("CertifyType")
    private String certifyType;

    @Query
    @NameInMap("CredentialNo")
    private String credentialNo;

    @Query
    @NameInMap("DataLevel")
    private String dataLevel;

    @Query
    @NameInMap("DataType")
    private String dataType;

    @Query
    @NameInMap("DirectionalGroupId")
    private String directionalGroupId;

    @Query
    @NameInMap("ExpireTimeEnd")
    private String expireTimeEnd;

    @Query
    @NameInMap("ExpireTimeStart")
    private String expireTimeStart;

    @Query
    @NameInMap("Iccid")
    private String iccid;

    @Query
    @NameInMap("Imsi")
    private String imsi;

    @Query
    @NameInMap("IsAutoRecharge")
    private Boolean isAutoRecharge;

    @Query
    @NameInMap("MaxFlow")
    private String maxFlow;

    @Query
    @NameInMap("MinFlow")
    private String minFlow;

    @Query
    @NameInMap("Msisdn")
    private String msisdn;

    @Query
    @NameInMap("NotifyId")
    private String notifyId;

    @Query
    @NameInMap("OsStatus")
    private String osStatus;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("PoolId")
    private String poolId;

    @Query
    @NameInMap("SimType")
    private String simType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TagName")
    private String tagName;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private ListCardInfoRequest(Builder builder) {
        super(builder);
        this.activeTimeEnd = builder.activeTimeEnd;
        this.activeTimeStart = builder.activeTimeStart;
        this.aliFee = builder.aliFee;
        this.aliyunOrderId = builder.aliyunOrderId;
        this.apnName = builder.apnName;
        this.certifyType = builder.certifyType;
        this.credentialNo = builder.credentialNo;
        this.dataLevel = builder.dataLevel;
        this.dataType = builder.dataType;
        this.directionalGroupId = builder.directionalGroupId;
        this.expireTimeEnd = builder.expireTimeEnd;
        this.expireTimeStart = builder.expireTimeStart;
        this.iccid = builder.iccid;
        this.imsi = builder.imsi;
        this.isAutoRecharge = builder.isAutoRecharge;
        this.maxFlow = builder.maxFlow;
        this.minFlow = builder.minFlow;
        this.msisdn = builder.msisdn;
        this.notifyId = builder.notifyId;
        this.osStatus = builder.osStatus;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.period = builder.period;
        this.poolId = builder.poolId;
        this.simType = builder.simType;
        this.status = builder.status;
        this.tagName = builder.tagName;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeTimeEnd
     */
    public String getActiveTimeEnd() {
        return this.activeTimeEnd;
    }

    /**
     * @return activeTimeStart
     */
    public String getActiveTimeStart() {
        return this.activeTimeStart;
    }

    /**
     * @return aliFee
     */
    public String getAliFee() {
        return this.aliFee;
    }

    /**
     * @return aliyunOrderId
     */
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    /**
     * @return apnName
     */
    public String getApnName() {
        return this.apnName;
    }

    /**
     * @return certifyType
     */
    public String getCertifyType() {
        return this.certifyType;
    }

    /**
     * @return credentialNo
     */
    public String getCredentialNo() {
        return this.credentialNo;
    }

    /**
     * @return dataLevel
     */
    public String getDataLevel() {
        return this.dataLevel;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return directionalGroupId
     */
    public String getDirectionalGroupId() {
        return this.directionalGroupId;
    }

    /**
     * @return expireTimeEnd
     */
    public String getExpireTimeEnd() {
        return this.expireTimeEnd;
    }

    /**
     * @return expireTimeStart
     */
    public String getExpireTimeStart() {
        return this.expireTimeStart;
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    /**
     * @return imsi
     */
    public String getImsi() {
        return this.imsi;
    }

    /**
     * @return isAutoRecharge
     */
    public Boolean getIsAutoRecharge() {
        return this.isAutoRecharge;
    }

    /**
     * @return maxFlow
     */
    public String getMaxFlow() {
        return this.maxFlow;
    }

    /**
     * @return minFlow
     */
    public String getMinFlow() {
        return this.minFlow;
    }

    /**
     * @return msisdn
     */
    public String getMsisdn() {
        return this.msisdn;
    }

    /**
     * @return notifyId
     */
    public String getNotifyId() {
        return this.notifyId;
    }

    /**
     * @return osStatus
     */
    public String getOsStatus() {
        return this.osStatus;
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
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return poolId
     */
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * @return simType
     */
    public String getSimType() {
        return this.simType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ListCardInfoRequest, Builder> {
        private String activeTimeEnd; 
        private String activeTimeStart; 
        private String aliFee; 
        private String aliyunOrderId; 
        private String apnName; 
        private String certifyType; 
        private String credentialNo; 
        private String dataLevel; 
        private String dataType; 
        private String directionalGroupId; 
        private String expireTimeEnd; 
        private String expireTimeStart; 
        private String iccid; 
        private String imsi; 
        private Boolean isAutoRecharge; 
        private String maxFlow; 
        private String minFlow; 
        private String msisdn; 
        private String notifyId; 
        private String osStatus; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String period; 
        private String poolId; 
        private String simType; 
        private String status; 
        private String tagName; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListCardInfoRequest request) {
            super(request);
            this.activeTimeEnd = request.activeTimeEnd;
            this.activeTimeStart = request.activeTimeStart;
            this.aliFee = request.aliFee;
            this.aliyunOrderId = request.aliyunOrderId;
            this.apnName = request.apnName;
            this.certifyType = request.certifyType;
            this.credentialNo = request.credentialNo;
            this.dataLevel = request.dataLevel;
            this.dataType = request.dataType;
            this.directionalGroupId = request.directionalGroupId;
            this.expireTimeEnd = request.expireTimeEnd;
            this.expireTimeStart = request.expireTimeStart;
            this.iccid = request.iccid;
            this.imsi = request.imsi;
            this.isAutoRecharge = request.isAutoRecharge;
            this.maxFlow = request.maxFlow;
            this.minFlow = request.minFlow;
            this.msisdn = request.msisdn;
            this.notifyId = request.notifyId;
            this.osStatus = request.osStatus;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.period = request.period;
            this.poolId = request.poolId;
            this.simType = request.simType;
            this.status = request.status;
            this.tagName = request.tagName;
            this.vendor = request.vendor;
        } 

        /**
         * ActiveTimeEnd.
         */
        public Builder activeTimeEnd(String activeTimeEnd) {
            this.putQueryParameter("ActiveTimeEnd", activeTimeEnd);
            this.activeTimeEnd = activeTimeEnd;
            return this;
        }

        /**
         * ActiveTimeStart.
         */
        public Builder activeTimeStart(String activeTimeStart) {
            this.putQueryParameter("ActiveTimeStart", activeTimeStart);
            this.activeTimeStart = activeTimeStart;
            return this;
        }

        /**
         * AliFee.
         */
        public Builder aliFee(String aliFee) {
            this.putQueryParameter("AliFee", aliFee);
            this.aliFee = aliFee;
            return this;
        }

        /**
         * AliyunOrderId.
         */
        public Builder aliyunOrderId(String aliyunOrderId) {
            this.putQueryParameter("AliyunOrderId", aliyunOrderId);
            this.aliyunOrderId = aliyunOrderId;
            return this;
        }

        /**
         * ApnName.
         */
        public Builder apnName(String apnName) {
            this.putQueryParameter("ApnName", apnName);
            this.apnName = apnName;
            return this;
        }

        /**
         * CertifyType.
         */
        public Builder certifyType(String certifyType) {
            this.putQueryParameter("CertifyType", certifyType);
            this.certifyType = certifyType;
            return this;
        }

        /**
         * CredentialNo.
         */
        public Builder credentialNo(String credentialNo) {
            this.putQueryParameter("CredentialNo", credentialNo);
            this.credentialNo = credentialNo;
            return this;
        }

        /**
         * DataLevel.
         */
        public Builder dataLevel(String dataLevel) {
            this.putQueryParameter("DataLevel", dataLevel);
            this.dataLevel = dataLevel;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * DirectionalGroupId.
         */
        public Builder directionalGroupId(String directionalGroupId) {
            this.putQueryParameter("DirectionalGroupId", directionalGroupId);
            this.directionalGroupId = directionalGroupId;
            return this;
        }

        /**
         * ExpireTimeEnd.
         */
        public Builder expireTimeEnd(String expireTimeEnd) {
            this.putQueryParameter("ExpireTimeEnd", expireTimeEnd);
            this.expireTimeEnd = expireTimeEnd;
            return this;
        }

        /**
         * ExpireTimeStart.
         */
        public Builder expireTimeStart(String expireTimeStart) {
            this.putQueryParameter("ExpireTimeStart", expireTimeStart);
            this.expireTimeStart = expireTimeStart;
            return this;
        }

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        /**
         * Imsi.
         */
        public Builder imsi(String imsi) {
            this.putQueryParameter("Imsi", imsi);
            this.imsi = imsi;
            return this;
        }

        /**
         * IsAutoRecharge.
         */
        public Builder isAutoRecharge(Boolean isAutoRecharge) {
            this.putQueryParameter("IsAutoRecharge", isAutoRecharge);
            this.isAutoRecharge = isAutoRecharge;
            return this;
        }

        /**
         * MaxFlow.
         */
        public Builder maxFlow(String maxFlow) {
            this.putQueryParameter("MaxFlow", maxFlow);
            this.maxFlow = maxFlow;
            return this;
        }

        /**
         * MinFlow.
         */
        public Builder minFlow(String minFlow) {
            this.putQueryParameter("MinFlow", minFlow);
            this.minFlow = minFlow;
            return this;
        }

        /**
         * Msisdn.
         */
        public Builder msisdn(String msisdn) {
            this.putQueryParameter("Msisdn", msisdn);
            this.msisdn = msisdn;
            return this;
        }

        /**
         * NotifyId.
         */
        public Builder notifyId(String notifyId) {
            this.putQueryParameter("NotifyId", notifyId);
            this.notifyId = notifyId;
            return this;
        }

        /**
         * OsStatus.
         */
        public Builder osStatus(String osStatus) {
            this.putQueryParameter("OsStatus", osStatus);
            this.osStatus = osStatus;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PoolId.
         */
        public Builder poolId(String poolId) {
            this.putQueryParameter("PoolId", poolId);
            this.poolId = poolId;
            return this;
        }

        /**
         * SimType.
         */
        public Builder simType(String simType) {
            this.putQueryParameter("SimType", simType);
            this.simType = simType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListCardInfoRequest build() {
            return new ListCardInfoRequest(this);
        } 

    } 

}
