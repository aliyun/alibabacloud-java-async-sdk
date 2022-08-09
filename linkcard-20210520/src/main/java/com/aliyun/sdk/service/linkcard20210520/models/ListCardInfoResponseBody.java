// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListCardInfoResponseBody</p>
 */
public class ListCardInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("LocalizedMessage")
    private String localizedMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCardInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.localizedMessage = builder.localizedMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardInfoResponseBody create() {
        return builder().build();
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return localizedMessage
     */
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String localizedMessage; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * LocalizedMessage.
         */
        public Builder localizedMessage(String localizedMessage) {
            this.localizedMessage = localizedMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCardInfoResponseBody build() {
            return new ListCardInfoResponseBody(this);
        } 

    } 

    public static class TagList extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("TagName")
        private String tagName;

        private TagList(Builder builder) {
            this.id = builder.id;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private Long id; 
            private String tagName; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("ActiveTime")
        private String activeTime;

        @NameInMap("ActiveType")
        private String activeType;

        @NameInMap("AliFee")
        private String aliFee;

        @NameInMap("AliyunOrderId")
        private String aliyunOrderId;

        @NameInMap("ApnName")
        private String apnName;

        @NameInMap("CertifyType")
        private String certifyType;

        @NameInMap("CredentialInstanceId")
        private String credentialInstanceId;

        @NameInMap("CredentialNo")
        private String credentialNo;

        @NameInMap("CredentialType")
        private String credentialType;

        @NameInMap("DataLevel")
        private String dataLevel;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("DirectionalGroupId")
        private Long directionalGroupId;

        @NameInMap("DirectionalGroupName")
        private String directionalGroupName;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("Iccid")
        private String iccid;

        @NameInMap("Imsi")
        private java.util.List < String > imsi;

        @NameInMap("IsAutoRecharge")
        private Boolean isAutoRecharge;

        @NameInMap("Msisdn")
        private java.util.List < String > msisdn;

        @NameInMap("NotifyId")
        private String notifyId;

        @NameInMap("OpenAccountTime")
        private String openAccountTime;

        @NameInMap("OsStatus")
        private String osStatus;

        @NameInMap("Period")
        private String period;

        @NameInMap("PeriodAddFlow")
        private String periodAddFlow;

        @NameInMap("PeriodRestFlow")
        private String periodRestFlow;

        @NameInMap("PeriodSmsUse")
        private String periodSmsUse;

        @NameInMap("PrivateNetworkSegment")
        private String privateNetworkSegment;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("SimType")
        private String simType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TagList")
        private java.util.List < TagList> tagList;

        @NameInMap("Vendor")
        private String vendor;

        @NameInMap("VsimInstanceId")
        private Long vsimInstanceId;

        private List(Builder builder) {
            this.activeTime = builder.activeTime;
            this.activeType = builder.activeType;
            this.aliFee = builder.aliFee;
            this.aliyunOrderId = builder.aliyunOrderId;
            this.apnName = builder.apnName;
            this.certifyType = builder.certifyType;
            this.credentialInstanceId = builder.credentialInstanceId;
            this.credentialNo = builder.credentialNo;
            this.credentialType = builder.credentialType;
            this.dataLevel = builder.dataLevel;
            this.dataType = builder.dataType;
            this.directionalGroupId = builder.directionalGroupId;
            this.directionalGroupName = builder.directionalGroupName;
            this.expireTime = builder.expireTime;
            this.iccid = builder.iccid;
            this.imsi = builder.imsi;
            this.isAutoRecharge = builder.isAutoRecharge;
            this.msisdn = builder.msisdn;
            this.notifyId = builder.notifyId;
            this.openAccountTime = builder.openAccountTime;
            this.osStatus = builder.osStatus;
            this.period = builder.period;
            this.periodAddFlow = builder.periodAddFlow;
            this.periodRestFlow = builder.periodRestFlow;
            this.periodSmsUse = builder.periodSmsUse;
            this.privateNetworkSegment = builder.privateNetworkSegment;
            this.remark = builder.remark;
            this.simType = builder.simType;
            this.status = builder.status;
            this.tagList = builder.tagList;
            this.vendor = builder.vendor;
            this.vsimInstanceId = builder.vsimInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public String getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return activeType
         */
        public String getActiveType() {
            return this.activeType;
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
         * @return credentialInstanceId
         */
        public String getCredentialInstanceId() {
            return this.credentialInstanceId;
        }

        /**
         * @return credentialNo
         */
        public String getCredentialNo() {
            return this.credentialNo;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
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
        public Long getDirectionalGroupId() {
            return this.directionalGroupId;
        }

        /**
         * @return directionalGroupName
         */
        public String getDirectionalGroupName() {
            return this.directionalGroupName;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
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
        public java.util.List < String > getImsi() {
            return this.imsi;
        }

        /**
         * @return isAutoRecharge
         */
        public Boolean getIsAutoRecharge() {
            return this.isAutoRecharge;
        }

        /**
         * @return msisdn
         */
        public java.util.List < String > getMsisdn() {
            return this.msisdn;
        }

        /**
         * @return notifyId
         */
        public String getNotifyId() {
            return this.notifyId;
        }

        /**
         * @return openAccountTime
         */
        public String getOpenAccountTime() {
            return this.openAccountTime;
        }

        /**
         * @return osStatus
         */
        public String getOsStatus() {
            return this.osStatus;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return periodAddFlow
         */
        public String getPeriodAddFlow() {
            return this.periodAddFlow;
        }

        /**
         * @return periodRestFlow
         */
        public String getPeriodRestFlow() {
            return this.periodRestFlow;
        }

        /**
         * @return periodSmsUse
         */
        public String getPeriodSmsUse() {
            return this.periodSmsUse;
        }

        /**
         * @return privateNetworkSegment
         */
        public String getPrivateNetworkSegment() {
            return this.privateNetworkSegment;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
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
         * @return tagList
         */
        public java.util.List < TagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        /**
         * @return vsimInstanceId
         */
        public Long getVsimInstanceId() {
            return this.vsimInstanceId;
        }

        public static final class Builder {
            private String activeTime; 
            private String activeType; 
            private String aliFee; 
            private String aliyunOrderId; 
            private String apnName; 
            private String certifyType; 
            private String credentialInstanceId; 
            private String credentialNo; 
            private String credentialType; 
            private String dataLevel; 
            private String dataType; 
            private Long directionalGroupId; 
            private String directionalGroupName; 
            private String expireTime; 
            private String iccid; 
            private java.util.List < String > imsi; 
            private Boolean isAutoRecharge; 
            private java.util.List < String > msisdn; 
            private String notifyId; 
            private String openAccountTime; 
            private String osStatus; 
            private String period; 
            private String periodAddFlow; 
            private String periodRestFlow; 
            private String periodSmsUse; 
            private String privateNetworkSegment; 
            private String remark; 
            private String simType; 
            private String status; 
            private java.util.List < TagList> tagList; 
            private String vendor; 
            private Long vsimInstanceId; 

            /**
             * ActiveTime.
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * ActiveType.
             */
            public Builder activeType(String activeType) {
                this.activeType = activeType;
                return this;
            }

            /**
             * AliFee.
             */
            public Builder aliFee(String aliFee) {
                this.aliFee = aliFee;
                return this;
            }

            /**
             * AliyunOrderId.
             */
            public Builder aliyunOrderId(String aliyunOrderId) {
                this.aliyunOrderId = aliyunOrderId;
                return this;
            }

            /**
             * ApnName.
             */
            public Builder apnName(String apnName) {
                this.apnName = apnName;
                return this;
            }

            /**
             * CertifyType.
             */
            public Builder certifyType(String certifyType) {
                this.certifyType = certifyType;
                return this;
            }

            /**
             * CredentialInstanceId.
             */
            public Builder credentialInstanceId(String credentialInstanceId) {
                this.credentialInstanceId = credentialInstanceId;
                return this;
            }

            /**
             * CredentialNo.
             */
            public Builder credentialNo(String credentialNo) {
                this.credentialNo = credentialNo;
                return this;
            }

            /**
             * CredentialType.
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * DataLevel.
             */
            public Builder dataLevel(String dataLevel) {
                this.dataLevel = dataLevel;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * DirectionalGroupId.
             */
            public Builder directionalGroupId(Long directionalGroupId) {
                this.directionalGroupId = directionalGroupId;
                return this;
            }

            /**
             * DirectionalGroupName.
             */
            public Builder directionalGroupName(String directionalGroupName) {
                this.directionalGroupName = directionalGroupName;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Iccid.
             */
            public Builder iccid(String iccid) {
                this.iccid = iccid;
                return this;
            }

            /**
             * Imsi.
             */
            public Builder imsi(java.util.List < String > imsi) {
                this.imsi = imsi;
                return this;
            }

            /**
             * IsAutoRecharge.
             */
            public Builder isAutoRecharge(Boolean isAutoRecharge) {
                this.isAutoRecharge = isAutoRecharge;
                return this;
            }

            /**
             * Msisdn.
             */
            public Builder msisdn(java.util.List < String > msisdn) {
                this.msisdn = msisdn;
                return this;
            }

            /**
             * NotifyId.
             */
            public Builder notifyId(String notifyId) {
                this.notifyId = notifyId;
                return this;
            }

            /**
             * OpenAccountTime.
             */
            public Builder openAccountTime(String openAccountTime) {
                this.openAccountTime = openAccountTime;
                return this;
            }

            /**
             * OsStatus.
             */
            public Builder osStatus(String osStatus) {
                this.osStatus = osStatus;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodAddFlow.
             */
            public Builder periodAddFlow(String periodAddFlow) {
                this.periodAddFlow = periodAddFlow;
                return this;
            }

            /**
             * PeriodRestFlow.
             */
            public Builder periodRestFlow(String periodRestFlow) {
                this.periodRestFlow = periodRestFlow;
                return this;
            }

            /**
             * PeriodSmsUse.
             */
            public Builder periodSmsUse(String periodSmsUse) {
                this.periodSmsUse = periodSmsUse;
                return this;
            }

            /**
             * PrivateNetworkSegment.
             */
            public Builder privateNetworkSegment(String privateNetworkSegment) {
                this.privateNetworkSegment = privateNetworkSegment;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SimType.
             */
            public Builder simType(String simType) {
                this.simType = simType;
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
             * TagList.
             */
            public Builder tagList(java.util.List < TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * VsimInstanceId.
             */
            public Builder vsimInstanceId(Long vsimInstanceId) {
                this.vsimInstanceId = vsimInstanceId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageCount = builder.pageCount;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageCount; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
