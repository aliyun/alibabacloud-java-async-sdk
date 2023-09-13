// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescDomainResponseBody</p>
 */
public class DescDomainResponseBody extends TeaModel {
    @NameInMap("CnameAuthStatus")
    private String cnameAuthStatus;

    @NameInMap("CnameConfirmStatus")
    private String cnameConfirmStatus;

    @NameInMap("CnameRecord")
    private String cnameRecord;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DefaultDomain")
    private String defaultDomain;

    @NameInMap("DkimAuthStatus")
    private String dkimAuthStatus;

    @NameInMap("DkimPublicKey")
    private String dkimPublicKey;

    @NameInMap("DkimRR")
    private String dkimRR;

    @NameInMap("DnsMx")
    private String dnsMx;

    @NameInMap("DnsSpf")
    private String dnsSpf;

    @NameInMap("DnsTxt")
    private String dnsTxt;

    @NameInMap("DomainId")
    private String domainId;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("DomainStatus")
    private String domainStatus;

    @NameInMap("DomainType")
    private String domainType;

    @NameInMap("HostRecord")
    private String hostRecord;

    @NameInMap("IcpStatus")
    private String icpStatus;

    @NameInMap("MxAuthStatus")
    private String mxAuthStatus;

    @NameInMap("MxRecord")
    private String mxRecord;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpfAuthStatus")
    private String spfAuthStatus;

    @NameInMap("SpfRecord")
    private String spfRecord;

    @NameInMap("SpfRecordV2")
    private String spfRecordV2;

    @NameInMap("TlDomainName")
    private String tlDomainName;

    @NameInMap("TracefRecord")
    private String tracefRecord;

    private DescDomainResponseBody(Builder builder) {
        this.cnameAuthStatus = builder.cnameAuthStatus;
        this.cnameConfirmStatus = builder.cnameConfirmStatus;
        this.cnameRecord = builder.cnameRecord;
        this.createTime = builder.createTime;
        this.defaultDomain = builder.defaultDomain;
        this.dkimAuthStatus = builder.dkimAuthStatus;
        this.dkimPublicKey = builder.dkimPublicKey;
        this.dkimRR = builder.dkimRR;
        this.dnsMx = builder.dnsMx;
        this.dnsSpf = builder.dnsSpf;
        this.dnsTxt = builder.dnsTxt;
        this.domainId = builder.domainId;
        this.domainName = builder.domainName;
        this.domainStatus = builder.domainStatus;
        this.domainType = builder.domainType;
        this.hostRecord = builder.hostRecord;
        this.icpStatus = builder.icpStatus;
        this.mxAuthStatus = builder.mxAuthStatus;
        this.mxRecord = builder.mxRecord;
        this.requestId = builder.requestId;
        this.spfAuthStatus = builder.spfAuthStatus;
        this.spfRecord = builder.spfRecord;
        this.spfRecordV2 = builder.spfRecordV2;
        this.tlDomainName = builder.tlDomainName;
        this.tracefRecord = builder.tracefRecord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return cnameAuthStatus
     */
    public String getCnameAuthStatus() {
        return this.cnameAuthStatus;
    }

    /**
     * @return cnameConfirmStatus
     */
    public String getCnameConfirmStatus() {
        return this.cnameConfirmStatus;
    }

    /**
     * @return cnameRecord
     */
    public String getCnameRecord() {
        return this.cnameRecord;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return defaultDomain
     */
    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    /**
     * @return dkimAuthStatus
     */
    public String getDkimAuthStatus() {
        return this.dkimAuthStatus;
    }

    /**
     * @return dkimPublicKey
     */
    public String getDkimPublicKey() {
        return this.dkimPublicKey;
    }

    /**
     * @return dkimRR
     */
    public String getDkimRR() {
        return this.dkimRR;
    }

    /**
     * @return dnsMx
     */
    public String getDnsMx() {
        return this.dnsMx;
    }

    /**
     * @return dnsSpf
     */
    public String getDnsSpf() {
        return this.dnsSpf;
    }

    /**
     * @return dnsTxt
     */
    public String getDnsTxt() {
        return this.dnsTxt;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainStatus
     */
    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return hostRecord
     */
    public String getHostRecord() {
        return this.hostRecord;
    }

    /**
     * @return icpStatus
     */
    public String getIcpStatus() {
        return this.icpStatus;
    }

    /**
     * @return mxAuthStatus
     */
    public String getMxAuthStatus() {
        return this.mxAuthStatus;
    }

    /**
     * @return mxRecord
     */
    public String getMxRecord() {
        return this.mxRecord;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spfAuthStatus
     */
    public String getSpfAuthStatus() {
        return this.spfAuthStatus;
    }

    /**
     * @return spfRecord
     */
    public String getSpfRecord() {
        return this.spfRecord;
    }

    /**
     * @return spfRecordV2
     */
    public String getSpfRecordV2() {
        return this.spfRecordV2;
    }

    /**
     * @return tlDomainName
     */
    public String getTlDomainName() {
        return this.tlDomainName;
    }

    /**
     * @return tracefRecord
     */
    public String getTracefRecord() {
        return this.tracefRecord;
    }

    public static final class Builder {
        private String cnameAuthStatus; 
        private String cnameConfirmStatus; 
        private String cnameRecord; 
        private String createTime; 
        private String defaultDomain; 
        private String dkimAuthStatus; 
        private String dkimPublicKey; 
        private String dkimRR; 
        private String dnsMx; 
        private String dnsSpf; 
        private String dnsTxt; 
        private String domainId; 
        private String domainName; 
        private String domainStatus; 
        private String domainType; 
        private String hostRecord; 
        private String icpStatus; 
        private String mxAuthStatus; 
        private String mxRecord; 
        private String requestId; 
        private String spfAuthStatus; 
        private String spfRecord; 
        private String spfRecordV2; 
        private String tlDomainName; 
        private String tracefRecord; 

        /**
         * CnameAuthStatus.
         */
        public Builder cnameAuthStatus(String cnameAuthStatus) {
            this.cnameAuthStatus = cnameAuthStatus;
            return this;
        }

        /**
         * CnameConfirmStatus.
         */
        public Builder cnameConfirmStatus(String cnameConfirmStatus) {
            this.cnameConfirmStatus = cnameConfirmStatus;
            return this;
        }

        /**
         * CnameRecord.
         */
        public Builder cnameRecord(String cnameRecord) {
            this.cnameRecord = cnameRecord;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DefaultDomain.
         */
        public Builder defaultDomain(String defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }

        /**
         * DkimAuthStatus.
         */
        public Builder dkimAuthStatus(String dkimAuthStatus) {
            this.dkimAuthStatus = dkimAuthStatus;
            return this;
        }

        /**
         * DkimPublicKey.
         */
        public Builder dkimPublicKey(String dkimPublicKey) {
            this.dkimPublicKey = dkimPublicKey;
            return this;
        }

        /**
         * DkimRR.
         */
        public Builder dkimRR(String dkimRR) {
            this.dkimRR = dkimRR;
            return this;
        }

        /**
         * DnsMx.
         */
        public Builder dnsMx(String dnsMx) {
            this.dnsMx = dnsMx;
            return this;
        }

        /**
         * DnsSpf.
         */
        public Builder dnsSpf(String dnsSpf) {
            this.dnsSpf = dnsSpf;
            return this;
        }

        /**
         * DnsTxt.
         */
        public Builder dnsTxt(String dnsTxt) {
            this.dnsTxt = dnsTxt;
            return this;
        }

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainStatus.
         */
        public Builder domainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
            return this;
        }

        /**
         * HostRecord.
         */
        public Builder hostRecord(String hostRecord) {
            this.hostRecord = hostRecord;
            return this;
        }

        /**
         * IcpStatus.
         */
        public Builder icpStatus(String icpStatus) {
            this.icpStatus = icpStatus;
            return this;
        }

        /**
         * MxAuthStatus.
         */
        public Builder mxAuthStatus(String mxAuthStatus) {
            this.mxAuthStatus = mxAuthStatus;
            return this;
        }

        /**
         * MxRecord.
         */
        public Builder mxRecord(String mxRecord) {
            this.mxRecord = mxRecord;
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
         * SpfAuthStatus.
         */
        public Builder spfAuthStatus(String spfAuthStatus) {
            this.spfAuthStatus = spfAuthStatus;
            return this;
        }

        /**
         * SpfRecord.
         */
        public Builder spfRecord(String spfRecord) {
            this.spfRecord = spfRecord;
            return this;
        }

        /**
         * SpfRecordV2.
         */
        public Builder spfRecordV2(String spfRecordV2) {
            this.spfRecordV2 = spfRecordV2;
            return this;
        }

        /**
         * TlDomainName.
         */
        public Builder tlDomainName(String tlDomainName) {
            this.tlDomainName = tlDomainName;
            return this;
        }

        /**
         * TracefRecord.
         */
        public Builder tracefRecord(String tracefRecord) {
            this.tracefRecord = tracefRecord;
            return this;
        }

        public DescDomainResponseBody build() {
            return new DescDomainResponseBody(this);
        } 

    } 

}
