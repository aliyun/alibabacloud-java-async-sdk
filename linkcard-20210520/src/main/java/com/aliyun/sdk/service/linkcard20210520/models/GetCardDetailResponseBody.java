// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCardDetailResponseBody</p>
 */
public class GetCardDetailResponseBody extends TeaModel {
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

    private GetCardDetailResponseBody(Builder builder) {
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

    public static GetCardDetailResponseBody create() {
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

        public GetCardDetailResponseBody build() {
            return new GetCardDetailResponseBody(this);
        } 

    } 

    public static class ListPsimCards extends TeaModel {
        @NameInMap("ApnName")
        private String apnName;

        @NameInMap("CertifyStatus")
        private String certifyStatus;

        @NameInMap("Iccid")
        private String iccid;

        @NameInMap("Imsi")
        private java.util.List < String > imsi;

        @NameInMap("Ip")
        private java.util.List < String > ip;

        @NameInMap("Msisdn")
        private java.util.List < String > msisdn;

        @NameInMap("OpenSms")
        private Boolean openSms;

        @NameInMap("OsStatus")
        private String osStatus;

        @NameInMap("PeriodAddFlow")
        private String periodAddFlow;

        @NameInMap("PeriodSmsUse")
        private String periodSmsUse;

        @NameInMap("PrivateNetworkSegment")
        private String privateNetworkSegment;

        @NameInMap("Status")
        private String status;

        @NameInMap("Vendor")
        private String vendor;

        private ListPsimCards(Builder builder) {
            this.apnName = builder.apnName;
            this.certifyStatus = builder.certifyStatus;
            this.iccid = builder.iccid;
            this.imsi = builder.imsi;
            this.ip = builder.ip;
            this.msisdn = builder.msisdn;
            this.openSms = builder.openSms;
            this.osStatus = builder.osStatus;
            this.periodAddFlow = builder.periodAddFlow;
            this.periodSmsUse = builder.periodSmsUse;
            this.privateNetworkSegment = builder.privateNetworkSegment;
            this.status = builder.status;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPsimCards create() {
            return builder().build();
        }

        /**
         * @return apnName
         */
        public String getApnName() {
            return this.apnName;
        }

        /**
         * @return certifyStatus
         */
        public String getCertifyStatus() {
            return this.certifyStatus;
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
         * @return ip
         */
        public java.util.List < String > getIp() {
            return this.ip;
        }

        /**
         * @return msisdn
         */
        public java.util.List < String > getMsisdn() {
            return this.msisdn;
        }

        /**
         * @return openSms
         */
        public Boolean getOpenSms() {
            return this.openSms;
        }

        /**
         * @return osStatus
         */
        public String getOsStatus() {
            return this.osStatus;
        }

        /**
         * @return periodAddFlow
         */
        public String getPeriodAddFlow() {
            return this.periodAddFlow;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String apnName; 
            private String certifyStatus; 
            private String iccid; 
            private java.util.List < String > imsi; 
            private java.util.List < String > ip; 
            private java.util.List < String > msisdn; 
            private Boolean openSms; 
            private String osStatus; 
            private String periodAddFlow; 
            private String periodSmsUse; 
            private String privateNetworkSegment; 
            private String status; 
            private String vendor; 

            /**
             * ApnName.
             */
            public Builder apnName(String apnName) {
                this.apnName = apnName;
                return this;
            }

            /**
             * CertifyStatus.
             */
            public Builder certifyStatus(String certifyStatus) {
                this.certifyStatus = certifyStatus;
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
             * Ip.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
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
             * OpenSms.
             */
            public Builder openSms(Boolean openSms) {
                this.openSms = openSms;
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
             * PeriodAddFlow.
             */
            public Builder periodAddFlow(String periodAddFlow) {
                this.periodAddFlow = periodAddFlow;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public ListPsimCards build() {
                return new ListPsimCards(this);
            } 

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
    public static class VsimCardInfo extends TeaModel {
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

        @NameInMap("AutoLimitResume")
        private Boolean autoLimitResume;

        @NameInMap("AutoRebindReuse")
        private Boolean autoRebindReuse;

        @NameInMap("CardLimitSpeedThreshold")
        private Integer cardLimitSpeedThreshold;

        @NameInMap("CardLimitStopThreshold")
        private Integer cardLimitStopThreshold;

        @NameInMap("CertifyStatus")
        private String certifyStatus;

        @NameInMap("CertifyType")
        private String certifyType;

        @NameInMap("CredentialInstanceId")
        private String credentialInstanceId;

        @NameInMap("CredentialLimitSpeedThreshold")
        private Integer credentialLimitSpeedThreshold;

        @NameInMap("CredentialLimitStopThreshold")
        private Integer credentialLimitStopThreshold;

        @NameInMap("CredentialNo")
        private String credentialNo;

        @NameInMap("CredentialType")
        private String credentialType;

        @NameInMap("DataLevel")
        private String dataLevel;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("DeviceImei")
        private String deviceImei;

        @NameInMap("DirectionalGroupId")
        private String directionalGroupId;

        @NameInMap("DirectionalGroupName")
        private String directionalGroupName;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FlowThresholdUnit")
        private String flowThresholdUnit;

        @NameInMap("Iccid")
        private String iccid;

        @NameInMap("Imsi")
        private java.util.List < String > imsi;

        @NameInMap("Ip")
        private java.util.List < String > ip;

        @NameInMap("IsAutoRecharge")
        private Boolean isAutoRecharge;

        @NameInMap("Msisdn")
        private java.util.List < String > msisdn;

        @NameInMap("NotifyId")
        private String notifyId;

        @NameInMap("OpenAccountTime")
        private String openAccountTime;

        @NameInMap("OpenSms")
        private Boolean openSms;

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

        @NameInMap("SimType")
        private String simType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TagList")
        private java.util.List < TagList> tagList;

        @NameInMap("Vendor")
        private String vendor;

        @NameInMap("VsimInstanceId")
        private Integer vsimInstanceId;

        private VsimCardInfo(Builder builder) {
            this.activeTime = builder.activeTime;
            this.activeType = builder.activeType;
            this.aliFee = builder.aliFee;
            this.aliyunOrderId = builder.aliyunOrderId;
            this.apnName = builder.apnName;
            this.autoLimitResume = builder.autoLimitResume;
            this.autoRebindReuse = builder.autoRebindReuse;
            this.cardLimitSpeedThreshold = builder.cardLimitSpeedThreshold;
            this.cardLimitStopThreshold = builder.cardLimitStopThreshold;
            this.certifyStatus = builder.certifyStatus;
            this.certifyType = builder.certifyType;
            this.credentialInstanceId = builder.credentialInstanceId;
            this.credentialLimitSpeedThreshold = builder.credentialLimitSpeedThreshold;
            this.credentialLimitStopThreshold = builder.credentialLimitStopThreshold;
            this.credentialNo = builder.credentialNo;
            this.credentialType = builder.credentialType;
            this.dataLevel = builder.dataLevel;
            this.dataType = builder.dataType;
            this.deviceImei = builder.deviceImei;
            this.directionalGroupId = builder.directionalGroupId;
            this.directionalGroupName = builder.directionalGroupName;
            this.expireTime = builder.expireTime;
            this.flowThresholdUnit = builder.flowThresholdUnit;
            this.iccid = builder.iccid;
            this.imsi = builder.imsi;
            this.ip = builder.ip;
            this.isAutoRecharge = builder.isAutoRecharge;
            this.msisdn = builder.msisdn;
            this.notifyId = builder.notifyId;
            this.openAccountTime = builder.openAccountTime;
            this.openSms = builder.openSms;
            this.osStatus = builder.osStatus;
            this.period = builder.period;
            this.periodAddFlow = builder.periodAddFlow;
            this.periodRestFlow = builder.periodRestFlow;
            this.periodSmsUse = builder.periodSmsUse;
            this.privateNetworkSegment = builder.privateNetworkSegment;
            this.simType = builder.simType;
            this.status = builder.status;
            this.tagList = builder.tagList;
            this.vendor = builder.vendor;
            this.vsimInstanceId = builder.vsimInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VsimCardInfo create() {
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
         * @return autoLimitResume
         */
        public Boolean getAutoLimitResume() {
            return this.autoLimitResume;
        }

        /**
         * @return autoRebindReuse
         */
        public Boolean getAutoRebindReuse() {
            return this.autoRebindReuse;
        }

        /**
         * @return cardLimitSpeedThreshold
         */
        public Integer getCardLimitSpeedThreshold() {
            return this.cardLimitSpeedThreshold;
        }

        /**
         * @return cardLimitStopThreshold
         */
        public Integer getCardLimitStopThreshold() {
            return this.cardLimitStopThreshold;
        }

        /**
         * @return certifyStatus
         */
        public String getCertifyStatus() {
            return this.certifyStatus;
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
         * @return credentialLimitSpeedThreshold
         */
        public Integer getCredentialLimitSpeedThreshold() {
            return this.credentialLimitSpeedThreshold;
        }

        /**
         * @return credentialLimitStopThreshold
         */
        public Integer getCredentialLimitStopThreshold() {
            return this.credentialLimitStopThreshold;
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
         * @return deviceImei
         */
        public String getDeviceImei() {
            return this.deviceImei;
        }

        /**
         * @return directionalGroupId
         */
        public String getDirectionalGroupId() {
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
         * @return flowThresholdUnit
         */
        public String getFlowThresholdUnit() {
            return this.flowThresholdUnit;
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
         * @return ip
         */
        public java.util.List < String > getIp() {
            return this.ip;
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
         * @return openSms
         */
        public Boolean getOpenSms() {
            return this.openSms;
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
        public Integer getVsimInstanceId() {
            return this.vsimInstanceId;
        }

        public static final class Builder {
            private String activeTime; 
            private String activeType; 
            private String aliFee; 
            private String aliyunOrderId; 
            private String apnName; 
            private Boolean autoLimitResume; 
            private Boolean autoRebindReuse; 
            private Integer cardLimitSpeedThreshold; 
            private Integer cardLimitStopThreshold; 
            private String certifyStatus; 
            private String certifyType; 
            private String credentialInstanceId; 
            private Integer credentialLimitSpeedThreshold; 
            private Integer credentialLimitStopThreshold; 
            private String credentialNo; 
            private String credentialType; 
            private String dataLevel; 
            private String dataType; 
            private String deviceImei; 
            private String directionalGroupId; 
            private String directionalGroupName; 
            private String expireTime; 
            private String flowThresholdUnit; 
            private String iccid; 
            private java.util.List < String > imsi; 
            private java.util.List < String > ip; 
            private Boolean isAutoRecharge; 
            private java.util.List < String > msisdn; 
            private String notifyId; 
            private String openAccountTime; 
            private Boolean openSms; 
            private String osStatus; 
            private String period; 
            private String periodAddFlow; 
            private String periodRestFlow; 
            private String periodSmsUse; 
            private String privateNetworkSegment; 
            private String simType; 
            private String status; 
            private java.util.List < TagList> tagList; 
            private String vendor; 
            private Integer vsimInstanceId; 

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
             * AutoLimitResume.
             */
            public Builder autoLimitResume(Boolean autoLimitResume) {
                this.autoLimitResume = autoLimitResume;
                return this;
            }

            /**
             * AutoRebindReuse.
             */
            public Builder autoRebindReuse(Boolean autoRebindReuse) {
                this.autoRebindReuse = autoRebindReuse;
                return this;
            }

            /**
             * CardLimitSpeedThreshold.
             */
            public Builder cardLimitSpeedThreshold(Integer cardLimitSpeedThreshold) {
                this.cardLimitSpeedThreshold = cardLimitSpeedThreshold;
                return this;
            }

            /**
             * CardLimitStopThreshold.
             */
            public Builder cardLimitStopThreshold(Integer cardLimitStopThreshold) {
                this.cardLimitStopThreshold = cardLimitStopThreshold;
                return this;
            }

            /**
             * CertifyStatus.
             */
            public Builder certifyStatus(String certifyStatus) {
                this.certifyStatus = certifyStatus;
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
             * CredentialLimitSpeedThreshold.
             */
            public Builder credentialLimitSpeedThreshold(Integer credentialLimitSpeedThreshold) {
                this.credentialLimitSpeedThreshold = credentialLimitSpeedThreshold;
                return this;
            }

            /**
             * CredentialLimitStopThreshold.
             */
            public Builder credentialLimitStopThreshold(Integer credentialLimitStopThreshold) {
                this.credentialLimitStopThreshold = credentialLimitStopThreshold;
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
             * DeviceImei.
             */
            public Builder deviceImei(String deviceImei) {
                this.deviceImei = deviceImei;
                return this;
            }

            /**
             * DirectionalGroupId.
             */
            public Builder directionalGroupId(String directionalGroupId) {
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
             * FlowThresholdUnit.
             */
            public Builder flowThresholdUnit(String flowThresholdUnit) {
                this.flowThresholdUnit = flowThresholdUnit;
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
             * Ip.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
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
             * OpenSms.
             */
            public Builder openSms(Boolean openSms) {
                this.openSms = openSms;
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
            public Builder vsimInstanceId(Integer vsimInstanceId) {
                this.vsimInstanceId = vsimInstanceId;
                return this;
            }

            public VsimCardInfo build() {
                return new VsimCardInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ListPsimCards")
        private java.util.List < ListPsimCards> listPsimCards;

        @NameInMap("VsimCardInfo")
        private VsimCardInfo vsimCardInfo;

        private Data(Builder builder) {
            this.listPsimCards = builder.listPsimCards;
            this.vsimCardInfo = builder.vsimCardInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return listPsimCards
         */
        public java.util.List < ListPsimCards> getListPsimCards() {
            return this.listPsimCards;
        }

        /**
         * @return vsimCardInfo
         */
        public VsimCardInfo getVsimCardInfo() {
            return this.vsimCardInfo;
        }

        public static final class Builder {
            private java.util.List < ListPsimCards> listPsimCards; 
            private VsimCardInfo vsimCardInfo; 

            /**
             * ListPsimCards.
             */
            public Builder listPsimCards(java.util.List < ListPsimCards> listPsimCards) {
                this.listPsimCards = listPsimCards;
                return this;
            }

            /**
             * VsimCardInfo.
             */
            public Builder vsimCardInfo(VsimCardInfo vsimCardInfo) {
                this.vsimCardInfo = vsimCardInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
