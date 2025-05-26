// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DescDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescDomainResponseBody</p>
 */
public class DescDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CnameAuthStatus")
    private String cnameAuthStatus;

    @com.aliyun.core.annotation.NameInMap("CnameConfirmStatus")
    private String cnameConfirmStatus;

    @com.aliyun.core.annotation.NameInMap("CnameRecord")
    private String cnameRecord;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DefaultDomain")
    private String defaultDomain;

    @com.aliyun.core.annotation.NameInMap("DkimAuthStatus")
    private String dkimAuthStatus;

    @com.aliyun.core.annotation.NameInMap("DkimPublicKey")
    private String dkimPublicKey;

    @com.aliyun.core.annotation.NameInMap("DkimRR")
    private String dkimRR;

    @com.aliyun.core.annotation.NameInMap("DmarcAuthStatus")
    private Integer dmarcAuthStatus;

    @com.aliyun.core.annotation.NameInMap("DmarcHostRecord")
    private String dmarcHostRecord;

    @com.aliyun.core.annotation.NameInMap("DmarcRecord")
    private String dmarcRecord;

    @com.aliyun.core.annotation.NameInMap("DnsDmarc")
    private String dnsDmarc;

    @com.aliyun.core.annotation.NameInMap("DnsMx")
    private String dnsMx;

    @com.aliyun.core.annotation.NameInMap("DnsSpf")
    private String dnsSpf;

    @com.aliyun.core.annotation.NameInMap("DnsTxt")
    private String dnsTxt;

    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomainStatus")
    private String domainStatus;

    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.NameInMap("HostRecord")
    private String hostRecord;

    @com.aliyun.core.annotation.NameInMap("IcpStatus")
    private String icpStatus;

    @com.aliyun.core.annotation.NameInMap("MxAuthStatus")
    private String mxAuthStatus;

    @com.aliyun.core.annotation.NameInMap("MxRecord")
    private String mxRecord;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpfAuthStatus")
    private String spfAuthStatus;

    @com.aliyun.core.annotation.NameInMap("SpfRecord")
    private String spfRecord;

    @com.aliyun.core.annotation.NameInMap("SpfRecordV2")
    private String spfRecordV2;

    @com.aliyun.core.annotation.NameInMap("TlDomainName")
    private String tlDomainName;

    @com.aliyun.core.annotation.NameInMap("TracefRecord")
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
        this.dmarcAuthStatus = builder.dmarcAuthStatus;
        this.dmarcHostRecord = builder.dmarcHostRecord;
        this.dmarcRecord = builder.dmarcRecord;
        this.dnsDmarc = builder.dnsDmarc;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return dmarcAuthStatus
     */
    public Integer getDmarcAuthStatus() {
        return this.dmarcAuthStatus;
    }

    /**
     * @return dmarcHostRecord
     */
    public String getDmarcHostRecord() {
        return this.dmarcHostRecord;
    }

    /**
     * @return dmarcRecord
     */
    public String getDmarcRecord() {
        return this.dmarcRecord;
    }

    /**
     * @return dnsDmarc
     */
    public String getDnsDmarc() {
        return this.dnsDmarc;
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
        private Integer dmarcAuthStatus; 
        private String dmarcHostRecord; 
        private String dmarcRecord; 
        private String dnsDmarc; 
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

        private Builder() {
        } 

        private Builder(DescDomainResponseBody model) {
            this.cnameAuthStatus = model.cnameAuthStatus;
            this.cnameConfirmStatus = model.cnameConfirmStatus;
            this.cnameRecord = model.cnameRecord;
            this.createTime = model.createTime;
            this.defaultDomain = model.defaultDomain;
            this.dkimAuthStatus = model.dkimAuthStatus;
            this.dkimPublicKey = model.dkimPublicKey;
            this.dkimRR = model.dkimRR;
            this.dmarcAuthStatus = model.dmarcAuthStatus;
            this.dmarcHostRecord = model.dmarcHostRecord;
            this.dmarcRecord = model.dmarcRecord;
            this.dnsDmarc = model.dnsDmarc;
            this.dnsMx = model.dnsMx;
            this.dnsSpf = model.dnsSpf;
            this.dnsTxt = model.dnsTxt;
            this.domainId = model.domainId;
            this.domainName = model.domainName;
            this.domainStatus = model.domainStatus;
            this.domainType = model.domainType;
            this.hostRecord = model.hostRecord;
            this.icpStatus = model.icpStatus;
            this.mxAuthStatus = model.mxAuthStatus;
            this.mxRecord = model.mxRecord;
            this.requestId = model.requestId;
            this.spfAuthStatus = model.spfAuthStatus;
            this.spfRecord = model.spfRecord;
            this.spfRecordV2 = model.spfRecordV2;
            this.tlDomainName = model.tlDomainName;
            this.tracefRecord = model.tracefRecord;
        } 

        /**
         * <p>CNAME verification flag, 0 for success, 1 for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cnameAuthStatus(String cnameAuthStatus) {
            this.cnameAuthStatus = cnameAuthStatus;
            return this;
        }

        /**
         * <p>Indicates whether the CNAME host record has been modified, 1 for modified (reverting to the original value also counts as modification), 0 for not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cnameConfirmStatus(String cnameConfirmStatus) {
            this.cnameConfirmStatus = cnameConfirmStatus;
            return this;
        }

        /**
         * <p>Custom part of the CNAME host record</p>
         * 
         * <strong>example:</strong>
         * <p>dmtrace</p>
         */
        public Builder cnameRecord(String cnameRecord) {
            this.cnameRecord = cnameRecord;
            return this;
        }

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-19T12:49Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Whether it is the default domain,</p>
         * <p>Value: 0 No (this field is deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder defaultDomain(String defaultDomain) {
            this.defaultDomain = defaultDomain;
            return this;
        }

        /**
         * <p>DKIM verification flag, indicating whether the DKIM record set by the user in DNS has passed validation, 0: Passed, 1: Not passed</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dkimAuthStatus(String dkimAuthStatus) {
            this.dkimAuthStatus = dkimAuthStatus;
            return this;
        }

        /**
         * <p>DKIM public key value, the value that users need to set for the DKIM record in DNS</p>
         * 
         * <strong>example:</strong>
         * <p>v=DKIM1; k=rsa; p=MIGfMA0GCSqGSI...</p>
         */
        public Builder dkimPublicKey(String dkimPublicKey) {
            this.dkimPublicKey = dkimPublicKey;
            return this;
        }

        /**
         * <p>DKIM host record, the key that the user needs to set in the DNS for the DKIM record</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cn-hangzhou._domainkey.hangzhou26</p>
         */
        public Builder dkimRR(String dkimRR) {
            this.dkimRR = dkimRR;
            return this;
        }

        /**
         * <p>DMARC verification flag, indicating whether the DMARC record set by the user in DNS has passed validation, 0: Passed, 1: Not passed</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dmarcAuthStatus(Integer dmarcAuthStatus) {
            this.dmarcAuthStatus = dmarcAuthStatus;
            return this;
        }

        /**
         * <p>DMARC host record value</p>
         * 
         * <strong>example:</strong>
         * <p>_dmarc.xxx</p>
         */
        public Builder dmarcHostRecord(String dmarcHostRecord) {
            this.dmarcHostRecord = dmarcHostRecord;
            return this;
        }

        /**
         * <p>DMARC record value</p>
         * 
         * <strong>example:</strong>
         * <p>v=DMARC1;p=none;rua=mailto:<a href="mailto:dmarc_report@service.aliyun.com">dmarc_report@service.aliyun.com</a></p>
         */
        public Builder dmarcRecord(String dmarcRecord) {
            this.dmarcRecord = dmarcRecord;
            return this;
        }

        /**
         * <p>DMARC record value resolved through the public domain name</p>
         * 
         * <strong>example:</strong>
         * <p>v=DMARC1;p=none;rua=mailto:<a href="mailto:dmarc_report@service.aliyun.com">dmarc_report@service.aliyun.com</a></p>
         */
        public Builder dnsDmarc(String dnsDmarc) {
            this.dnsDmarc = dnsDmarc;
            return this;
        }

        /**
         * <p>MX record value resolved from the public network domain</p>
         * 
         * <strong>example:</strong>
         * <p>mx01.dm.aliyun.com</p>
         */
        public Builder dnsMx(String dnsMx) {
            this.dnsMx = dnsMx;
            return this;
        }

        /**
         * <p>SPF record value resolved from the public network domain</p>
         * 
         * <strong>example:</strong>
         * <p>v=xxxx</p>
         */
        public Builder dnsSpf(String dnsSpf) {
            this.dnsSpf = dnsSpf;
            return this;
        }

        /**
         * <p>Ownership record value resolved from the public network domain</p>
         * 
         * <strong>example:</strong>
         * <p>0c40d5f125af4e42892a</p>
         */
        public Builder dnsTxt(String dnsTxt) {
            this.dnsTxt = dnsTxt;
            return this;
        }

        /**
         * <p>Domain ID</p>
         * 
         * <strong>example:</strong>
         * <p>158910</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>Domain name</p>
         * 
         * <strong>example:</strong>
         * <p>test.example.net</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Domain status. Indicates whether the verification was successful, with values:</p>
         * <ul>
         * <li><strong>0</strong>: Available, verified successfully</li>
         * <li><strong>1</strong>: Unavailable, verification failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder domainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * <p>Ownership record provided by the email push console</p>
         * 
         * <strong>example:</strong>
         * <p>0c40d5f125af4e42892a</p>
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>Host record</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder hostRecord(String hostRecord) {
            this.hostRecord = hostRecord;
            return this;
        }

        /**
         * <p>Filing status. <strong>1</strong> indicates filed, <strong>0</strong> indicates not filed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder icpStatus(String icpStatus) {
            this.icpStatus = icpStatus;
            return this;
        }

        /**
         * <p>MX verification flag, 0 for success, 1 for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mxAuthStatus(String mxAuthStatus) {
            this.mxAuthStatus = mxAuthStatus;
            return this;
        }

        /**
         * <p>MX record value provided by the email push console</p>
         * 
         * <strong>example:</strong>
         * <p>mx01.dm.aliyun.com</p>
         */
        public Builder mxRecord(String mxRecord) {
            this.mxRecord = mxRecord;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>51B74264-46B4-43C8-A9A0-6B8E8BC04F34</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SPF verification flag, 0 for success, 1 for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spfAuthStatus(String spfAuthStatus) {
            this.spfAuthStatus = spfAuthStatus;
            return this;
        }

        /**
         * <p>SPF record value provided by the email push console</p>
         * 
         * <strong>example:</strong>
         * <p>include:spf1.dm.aliyun.com</p>
         */
        public Builder spfRecord(String spfRecord) {
            this.spfRecord = spfRecord;
            return this;
        }

        /**
         * <p>SPF record. Previously, the SPF display content needed to be calculated by the calling end based on the spfRecord in the response. The new field spfRecordV2 replaces spfRecord, and the calling end can directly display this field after obtaining it;</p>
         * 
         * <strong>example:</strong>
         * <p>v=spf1 include:spf1.dm.aliyun.com -all</p>
         */
        public Builder spfRecordV2(String spfRecordV2) {
            this.spfRecordV2 = spfRecordV2;
            return this;
        }

        /**
         * <p>Primary domain</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder tlDomainName(String tlDomainName) {
            this.tlDomainName = tlDomainName;
            return this;
        }

        /**
         * <p>CNAME record value provided by the email push console</p>
         * 
         * <strong>example:</strong>
         * <p>tracedm.aliyuncs.com</p>
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
