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
 * {@link QueryStandardProtocolListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStandardProtocolListNewResponseBody</p>
 */
public class QueryStandardProtocolListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QueryStandardProtocolListNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStandardProtocolListNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QueryStandardProtocolListNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryStandardProtocolListNewResponseBody build() {
            return new QueryStandardProtocolListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryStandardProtocolListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStandardProtocolListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditOrderId")
        private String auditOrderId;

        @com.aliyun.core.annotation.NameInMap("CorpCode")
        private String corpCode;

        @com.aliyun.core.annotation.NameInMap("EffIpWhiteList")
        private String effIpWhiteList;

        @com.aliyun.core.annotation.NameInMap("FeatureCode")
        private Integer featureCode;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IpAuditStatus")
        private Integer ipAuditStatus;

        @com.aliyun.core.annotation.NameInMap("IpWhiteList")
        private String ipWhiteList;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private Long partnerId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ProfileId")
        private Long profileId;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private Integer protocolType;

        @com.aliyun.core.annotation.NameInMap("ProtocolTypeStr")
        private String protocolTypeStr;

        @com.aliyun.core.annotation.NameInMap("RealNameInsId")
        private Long realNameInsId;

        @com.aliyun.core.annotation.NameInMap("ResCode")
        private String resCode;

        @com.aliyun.core.annotation.NameInMap("SmsSign")
        private String smsSign;

        @com.aliyun.core.annotation.NameInMap("SmsType")
        private String smsType;

        @com.aliyun.core.annotation.NameInMap("SpCode")
        private String spCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("UserLimit")
        private Integer userLimit;

        @com.aliyun.core.annotation.NameInMap("UserMaxChannel")
        private Integer userMaxChannel;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("UserPwd")
        private String userPwd;

        private List(Builder builder) {
            this.auditOrderId = builder.auditOrderId;
            this.corpCode = builder.corpCode;
            this.effIpWhiteList = builder.effIpWhiteList;
            this.featureCode = builder.featureCode;
            this.ip = builder.ip;
            this.ipAuditStatus = builder.ipAuditStatus;
            this.ipWhiteList = builder.ipWhiteList;
            this.partnerId = builder.partnerId;
            this.port = builder.port;
            this.profileId = builder.profileId;
            this.protocolType = builder.protocolType;
            this.protocolTypeStr = builder.protocolTypeStr;
            this.realNameInsId = builder.realNameInsId;
            this.resCode = builder.resCode;
            this.smsSign = builder.smsSign;
            this.smsType = builder.smsType;
            this.spCode = builder.spCode;
            this.status = builder.status;
            this.templateCode = builder.templateCode;
            this.userLimit = builder.userLimit;
            this.userMaxChannel = builder.userMaxChannel;
            this.userName = builder.userName;
            this.userPwd = builder.userPwd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return auditOrderId
         */
        public String getAuditOrderId() {
            return this.auditOrderId;
        }

        /**
         * @return corpCode
         */
        public String getCorpCode() {
            return this.corpCode;
        }

        /**
         * @return effIpWhiteList
         */
        public String getEffIpWhiteList() {
            return this.effIpWhiteList;
        }

        /**
         * @return featureCode
         */
        public Integer getFeatureCode() {
            return this.featureCode;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipAuditStatus
         */
        public Integer getIpAuditStatus() {
            return this.ipAuditStatus;
        }

        /**
         * @return ipWhiteList
         */
        public String getIpWhiteList() {
            return this.ipWhiteList;
        }

        /**
         * @return partnerId
         */
        public Long getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return profileId
         */
        public Long getProfileId() {
            return this.profileId;
        }

        /**
         * @return protocolType
         */
        public Integer getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return protocolTypeStr
         */
        public String getProtocolTypeStr() {
            return this.protocolTypeStr;
        }

        /**
         * @return realNameInsId
         */
        public Long getRealNameInsId() {
            return this.realNameInsId;
        }

        /**
         * @return resCode
         */
        public String getResCode() {
            return this.resCode;
        }

        /**
         * @return smsSign
         */
        public String getSmsSign() {
            return this.smsSign;
        }

        /**
         * @return smsType
         */
        public String getSmsType() {
            return this.smsType;
        }

        /**
         * @return spCode
         */
        public String getSpCode() {
            return this.spCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return userLimit
         */
        public Integer getUserLimit() {
            return this.userLimit;
        }

        /**
         * @return userMaxChannel
         */
        public Integer getUserMaxChannel() {
            return this.userMaxChannel;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userPwd
         */
        public String getUserPwd() {
            return this.userPwd;
        }

        public static final class Builder {
            private String auditOrderId; 
            private String corpCode; 
            private String effIpWhiteList; 
            private Integer featureCode; 
            private String ip; 
            private Integer ipAuditStatus; 
            private String ipWhiteList; 
            private Long partnerId; 
            private String port; 
            private Long profileId; 
            private Integer protocolType; 
            private String protocolTypeStr; 
            private Long realNameInsId; 
            private String resCode; 
            private String smsSign; 
            private String smsType; 
            private String spCode; 
            private String status; 
            private String templateCode; 
            private Integer userLimit; 
            private Integer userMaxChannel; 
            private String userName; 
            private String userPwd; 

            private Builder() {
            } 

            private Builder(List model) {
                this.auditOrderId = model.auditOrderId;
                this.corpCode = model.corpCode;
                this.effIpWhiteList = model.effIpWhiteList;
                this.featureCode = model.featureCode;
                this.ip = model.ip;
                this.ipAuditStatus = model.ipAuditStatus;
                this.ipWhiteList = model.ipWhiteList;
                this.partnerId = model.partnerId;
                this.port = model.port;
                this.profileId = model.profileId;
                this.protocolType = model.protocolType;
                this.protocolTypeStr = model.protocolTypeStr;
                this.realNameInsId = model.realNameInsId;
                this.resCode = model.resCode;
                this.smsSign = model.smsSign;
                this.smsType = model.smsType;
                this.spCode = model.spCode;
                this.status = model.status;
                this.templateCode = model.templateCode;
                this.userLimit = model.userLimit;
                this.userMaxChannel = model.userMaxChannel;
                this.userName = model.userName;
                this.userPwd = model.userPwd;
            } 

            /**
             * AuditOrderId.
             */
            public Builder auditOrderId(String auditOrderId) {
                this.auditOrderId = auditOrderId;
                return this;
            }

            /**
             * CorpCode.
             */
            public Builder corpCode(String corpCode) {
                this.corpCode = corpCode;
                return this;
            }

            /**
             * EffIpWhiteList.
             */
            public Builder effIpWhiteList(String effIpWhiteList) {
                this.effIpWhiteList = effIpWhiteList;
                return this;
            }

            /**
             * FeatureCode.
             */
            public Builder featureCode(Integer featureCode) {
                this.featureCode = featureCode;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * IpAuditStatus.
             */
            public Builder ipAuditStatus(Integer ipAuditStatus) {
                this.ipAuditStatus = ipAuditStatus;
                return this;
            }

            /**
             * IpWhiteList.
             */
            public Builder ipWhiteList(String ipWhiteList) {
                this.ipWhiteList = ipWhiteList;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(Long partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * ProfileId.
             */
            public Builder profileId(Long profileId) {
                this.profileId = profileId;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(Integer protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * ProtocolTypeStr.
             */
            public Builder protocolTypeStr(String protocolTypeStr) {
                this.protocolTypeStr = protocolTypeStr;
                return this;
            }

            /**
             * RealNameInsId.
             */
            public Builder realNameInsId(Long realNameInsId) {
                this.realNameInsId = realNameInsId;
                return this;
            }

            /**
             * ResCode.
             */
            public Builder resCode(String resCode) {
                this.resCode = resCode;
                return this;
            }

            /**
             * SmsSign.
             */
            public Builder smsSign(String smsSign) {
                this.smsSign = smsSign;
                return this;
            }

            /**
             * SmsType.
             */
            public Builder smsType(String smsType) {
                this.smsType = smsType;
                return this;
            }

            /**
             * SpCode.
             */
            public Builder spCode(String spCode) {
                this.spCode = spCode;
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
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * UserLimit.
             */
            public Builder userLimit(Integer userLimit) {
                this.userLimit = userLimit;
                return this;
            }

            /**
             * UserMaxChannel.
             */
            public Builder userMaxChannel(Integer userMaxChannel) {
                this.userMaxChannel = userMaxChannel;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserPwd.
             */
            public Builder userPwd(String userPwd) {
                this.userPwd = userPwd;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
