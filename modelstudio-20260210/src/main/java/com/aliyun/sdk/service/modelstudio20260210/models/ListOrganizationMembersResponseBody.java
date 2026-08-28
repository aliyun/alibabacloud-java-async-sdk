// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link ListOrganizationMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationMembersResponseBody</p>
 */
public class ListOrganizationMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListOrganizationMembersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationMembersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListOrganizationMembersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOrganizationMembersResponseBody build() {
            return new ListOrganizationMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOrganizationMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationMembersResponseBody</p>
     */
    public static class PackLimitInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableLimit")
        private Double availableLimit;

        @com.aliyun.core.annotation.NameInMap("CycleEndTime")
        private Long cycleEndTime;

        @com.aliyun.core.annotation.NameInMap("CycleStartTime")
        private Long cycleStartTime;

        @com.aliyun.core.annotation.NameInMap("FrozenCredits")
        private Double frozenCredits;

        @com.aliyun.core.annotation.NameInMap("HasShareLimit")
        private Boolean hasShareLimit;

        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private Boolean isAvailable;

        @com.aliyun.core.annotation.NameInMap("LastConfirmedTime")
        private Long lastConfirmedTime;

        @com.aliyun.core.annotation.NameInMap("UpperLimit")
        private Double upperLimit;

        @com.aliyun.core.annotation.NameInMap("UsedCredits")
        private Double usedCredits;

        private PackLimitInfo(Builder builder) {
            this.availableLimit = builder.availableLimit;
            this.cycleEndTime = builder.cycleEndTime;
            this.cycleStartTime = builder.cycleStartTime;
            this.frozenCredits = builder.frozenCredits;
            this.hasShareLimit = builder.hasShareLimit;
            this.isAvailable = builder.isAvailable;
            this.lastConfirmedTime = builder.lastConfirmedTime;
            this.upperLimit = builder.upperLimit;
            this.usedCredits = builder.usedCredits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackLimitInfo create() {
            return builder().build();
        }

        /**
         * @return availableLimit
         */
        public Double getAvailableLimit() {
            return this.availableLimit;
        }

        /**
         * @return cycleEndTime
         */
        public Long getCycleEndTime() {
            return this.cycleEndTime;
        }

        /**
         * @return cycleStartTime
         */
        public Long getCycleStartTime() {
            return this.cycleStartTime;
        }

        /**
         * @return frozenCredits
         */
        public Double getFrozenCredits() {
            return this.frozenCredits;
        }

        /**
         * @return hasShareLimit
         */
        public Boolean getHasShareLimit() {
            return this.hasShareLimit;
        }

        /**
         * @return isAvailable
         */
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        /**
         * @return lastConfirmedTime
         */
        public Long getLastConfirmedTime() {
            return this.lastConfirmedTime;
        }

        /**
         * @return upperLimit
         */
        public Double getUpperLimit() {
            return this.upperLimit;
        }

        /**
         * @return usedCredits
         */
        public Double getUsedCredits() {
            return this.usedCredits;
        }

        public static final class Builder {
            private Double availableLimit; 
            private Long cycleEndTime; 
            private Long cycleStartTime; 
            private Double frozenCredits; 
            private Boolean hasShareLimit; 
            private Boolean isAvailable; 
            private Long lastConfirmedTime; 
            private Double upperLimit; 
            private Double usedCredits; 

            private Builder() {
            } 

            private Builder(PackLimitInfo model) {
                this.availableLimit = model.availableLimit;
                this.cycleEndTime = model.cycleEndTime;
                this.cycleStartTime = model.cycleStartTime;
                this.frozenCredits = model.frozenCredits;
                this.hasShareLimit = model.hasShareLimit;
                this.isAvailable = model.isAvailable;
                this.lastConfirmedTime = model.lastConfirmedTime;
                this.upperLimit = model.upperLimit;
                this.usedCredits = model.usedCredits;
            } 

            /**
             * AvailableLimit.
             */
            public Builder availableLimit(Double availableLimit) {
                this.availableLimit = availableLimit;
                return this;
            }

            /**
             * CycleEndTime.
             */
            public Builder cycleEndTime(Long cycleEndTime) {
                this.cycleEndTime = cycleEndTime;
                return this;
            }

            /**
             * CycleStartTime.
             */
            public Builder cycleStartTime(Long cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * FrozenCredits.
             */
            public Builder frozenCredits(Double frozenCredits) {
                this.frozenCredits = frozenCredits;
                return this;
            }

            /**
             * HasShareLimit.
             */
            public Builder hasShareLimit(Boolean hasShareLimit) {
                this.hasShareLimit = hasShareLimit;
                return this;
            }

            /**
             * IsAvailable.
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * LastConfirmedTime.
             */
            public Builder lastConfirmedTime(Long lastConfirmedTime) {
                this.lastConfirmedTime = lastConfirmedTime;
                return this;
            }

            /**
             * UpperLimit.
             */
            public Builder upperLimit(Double upperLimit) {
                this.upperLimit = upperLimit;
                return this;
            }

            /**
             * UsedCredits.
             */
            public Builder usedCredits(Double usedCredits) {
                this.usedCredits = usedCredits;
                return this;
            }

            public PackLimitInfo build() {
                return new PackLimitInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOrganizationMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationMembersResponseBody</p>
     */
    public static class EquityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleEndTime")
        private Long cycleEndTime;

        @com.aliyun.core.annotation.NameInMap("CycleStartTime")
        private Long cycleStartTime;

        @com.aliyun.core.annotation.NameInMap("CycleSurplusValue")
        private Double cycleSurplusValue;

        @com.aliyun.core.annotation.NameInMap("CycleTotalValue")
        private Double cycleTotalValue;

        @com.aliyun.core.annotation.NameInMap("EquityType")
        private String equityType;

        @com.aliyun.core.annotation.NameInMap("EquityUnit")
        private String equityUnit;

        private EquityList(Builder builder) {
            this.cycleEndTime = builder.cycleEndTime;
            this.cycleStartTime = builder.cycleStartTime;
            this.cycleSurplusValue = builder.cycleSurplusValue;
            this.cycleTotalValue = builder.cycleTotalValue;
            this.equityType = builder.equityType;
            this.equityUnit = builder.equityUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EquityList create() {
            return builder().build();
        }

        /**
         * @return cycleEndTime
         */
        public Long getCycleEndTime() {
            return this.cycleEndTime;
        }

        /**
         * @return cycleStartTime
         */
        public Long getCycleStartTime() {
            return this.cycleStartTime;
        }

        /**
         * @return cycleSurplusValue
         */
        public Double getCycleSurplusValue() {
            return this.cycleSurplusValue;
        }

        /**
         * @return cycleTotalValue
         */
        public Double getCycleTotalValue() {
            return this.cycleTotalValue;
        }

        /**
         * @return equityType
         */
        public String getEquityType() {
            return this.equityType;
        }

        /**
         * @return equityUnit
         */
        public String getEquityUnit() {
            return this.equityUnit;
        }

        public static final class Builder {
            private Long cycleEndTime; 
            private Long cycleStartTime; 
            private Double cycleSurplusValue; 
            private Double cycleTotalValue; 
            private String equityType; 
            private String equityUnit; 

            private Builder() {
            } 

            private Builder(EquityList model) {
                this.cycleEndTime = model.cycleEndTime;
                this.cycleStartTime = model.cycleStartTime;
                this.cycleSurplusValue = model.cycleSurplusValue;
                this.cycleTotalValue = model.cycleTotalValue;
                this.equityType = model.equityType;
                this.equityUnit = model.equityUnit;
            } 

            /**
             * CycleEndTime.
             */
            public Builder cycleEndTime(Long cycleEndTime) {
                this.cycleEndTime = cycleEndTime;
                return this;
            }

            /**
             * CycleStartTime.
             */
            public Builder cycleStartTime(Long cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * CycleSurplusValue.
             */
            public Builder cycleSurplusValue(Double cycleSurplusValue) {
                this.cycleSurplusValue = cycleSurplusValue;
                return this;
            }

            /**
             * CycleTotalValue.
             */
            public Builder cycleTotalValue(Double cycleTotalValue) {
                this.cycleTotalValue = cycleTotalValue;
                return this;
            }

            /**
             * EquityType.
             */
            public Builder equityType(String equityType) {
                this.equityType = equityType;
                return this;
            }

            /**
             * EquityUnit.
             */
            public Builder equityUnit(String equityUnit) {
                this.equityUnit = equityUnit;
                return this;
            }

            public EquityList build() {
                return new EquityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOrganizationMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationMembersResponseBody</p>
     */
    public static class SubscriptionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EquityList")
        private java.util.List<EquityList> equityList;

        @com.aliyun.core.annotation.NameInMap("InstanceCode")
        private String instanceCode;

        @com.aliyun.core.annotation.NameInMap("PayMode")
        private String payMode;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SubscriptionInfo(Builder builder) {
            this.endTime = builder.endTime;
            this.equityList = builder.equityList;
            this.instanceCode = builder.instanceCode;
            this.payMode = builder.payMode;
            this.productCode = builder.productCode;
            this.specType = builder.specType;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionInfo create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return equityList
         */
        public java.util.List<EquityList> getEquityList() {
            return this.equityList;
        }

        /**
         * @return instanceCode
         */
        public String getInstanceCode() {
            return this.instanceCode;
        }

        /**
         * @return payMode
         */
        public String getPayMode() {
            return this.payMode;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long endTime; 
            private java.util.List<EquityList> equityList; 
            private String instanceCode; 
            private String payMode; 
            private String productCode; 
            private String specType; 
            private Long startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(SubscriptionInfo model) {
                this.endTime = model.endTime;
                this.equityList = model.equityList;
                this.instanceCode = model.instanceCode;
                this.payMode = model.payMode;
                this.productCode = model.productCode;
                this.specType = model.specType;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EquityList.
             */
            public Builder equityList(java.util.List<EquityList> equityList) {
                this.equityList = equityList;
                return this;
            }

            /**
             * InstanceCode.
             */
            public Builder instanceCode(String instanceCode) {
                this.instanceCode = instanceCode;
                return this;
            }

            /**
             * PayMode.
             */
            public Builder payMode(String payMode) {
                this.payMode = payMode;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SubscriptionInfo build() {
                return new SubscriptionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOrganizationMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationMembersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountBizId")
        private String accountBizId;

        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("ApiKeyId")
        private String apiKeyId;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("MaskedApiKey")
        private String maskedApiKey;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("PackLimitInfo")
        private PackLimitInfo packLimitInfo;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<String> roles;

        @com.aliyun.core.annotation.NameInMap("SeatId")
        private String seatId;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubscriptionInfo")
        private SubscriptionInfo subscriptionInfo;

        private Data(Builder builder) {
            this.accountBizId = builder.accountBizId;
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.apiKeyId = builder.apiKeyId;
            this.email = builder.email;
            this.gmtCreate = builder.gmtCreate;
            this.maskedApiKey = builder.maskedApiKey;
            this.orgId = builder.orgId;
            this.packLimitInfo = builder.packLimitInfo;
            this.roles = builder.roles;
            this.seatId = builder.seatId;
            this.specType = builder.specType;
            this.status = builder.status;
            this.subscriptionInfo = builder.subscriptionInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountBizId
         */
        public String getAccountBizId() {
            return this.accountBizId;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return apiKeyId
         */
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return maskedApiKey
         */
        public String getMaskedApiKey() {
            return this.maskedApiKey;
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return packLimitInfo
         */
        public PackLimitInfo getPackLimitInfo() {
            return this.packLimitInfo;
        }

        /**
         * @return roles
         */
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        /**
         * @return seatId
         */
        public String getSeatId() {
            return this.seatId;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subscriptionInfo
         */
        public SubscriptionInfo getSubscriptionInfo() {
            return this.subscriptionInfo;
        }

        public static final class Builder {
            private String accountBizId; 
            private String accountId; 
            private String accountName; 
            private String apiKeyId; 
            private String email; 
            private String gmtCreate; 
            private String maskedApiKey; 
            private String orgId; 
            private PackLimitInfo packLimitInfo; 
            private java.util.List<String> roles; 
            private String seatId; 
            private String specType; 
            private String status; 
            private SubscriptionInfo subscriptionInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountBizId = model.accountBizId;
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.apiKeyId = model.apiKeyId;
                this.email = model.email;
                this.gmtCreate = model.gmtCreate;
                this.maskedApiKey = model.maskedApiKey;
                this.orgId = model.orgId;
                this.packLimitInfo = model.packLimitInfo;
                this.roles = model.roles;
                this.seatId = model.seatId;
                this.specType = model.specType;
                this.status = model.status;
                this.subscriptionInfo = model.subscriptionInfo;
            } 

            /**
             * AccountBizId.
             */
            public Builder accountBizId(String accountBizId) {
                this.accountBizId = accountBizId;
                return this;
            }

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>API Key ID</p>
             * 
             * <strong>example:</strong>
             * <p>key_123456789</p>
             */
            public Builder apiKeyId(String apiKeyId) {
                this.apiKeyId = apiKeyId;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * MaskedApiKey.
             */
            public Builder maskedApiKey(String maskedApiKey) {
                this.maskedApiKey = maskedApiKey;
                return this;
            }

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * PackLimitInfo.
             */
            public Builder packLimitInfo(PackLimitInfo packLimitInfo) {
                this.packLimitInfo = packLimitInfo;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(java.util.List<String> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * SeatId.
             */
            public Builder seatId(String seatId) {
                this.seatId = seatId;
                return this;
            }

            /**
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubscriptionInfo.
             */
            public Builder subscriptionInfo(SubscriptionInfo subscriptionInfo) {
                this.subscriptionInfo = subscriptionInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
