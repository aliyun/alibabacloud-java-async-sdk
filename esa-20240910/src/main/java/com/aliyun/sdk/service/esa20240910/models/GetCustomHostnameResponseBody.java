// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetCustomHostnameResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomHostnameResponseBody</p>
 */
public class GetCustomHostnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomHostnameModel")
    private CustomHostnameModel customHostnameModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCustomHostnameResponseBody(Builder builder) {
        this.customHostnameModel = builder.customHostnameModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomHostnameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customHostnameModel
     */
    public CustomHostnameModel getCustomHostnameModel() {
        return this.customHostnameModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CustomHostnameModel customHostnameModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCustomHostnameResponseBody model) {
            this.customHostnameModel = model.customHostnameModel;
            this.requestId = model.requestId;
        } 

        /**
         * CustomHostnameModel.
         */
        public Builder customHostnameModel(CustomHostnameModel customHostnameModel) {
            this.customHostnameModel = customHostnameModel;
            return this;
        }

        /**
         * <p>本次请求的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>7C414690-9D7B-5D66-9CD9-AD0B3F25ED49</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCustomHostnameResponseBody build() {
            return new GetCustomHostnameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomHostnameResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomHostnameResponseBody</p>
     */
    public static class CustomHostnameModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CasId")
        private Long casId;

        @com.aliyun.core.annotation.NameInMap("CertApplyCode")
        private Long certApplyCode;

        @com.aliyun.core.annotation.NameInMap("CertApplyMessage")
        private String certApplyMessage;

        @com.aliyun.core.annotation.NameInMap("CertHttpKey")
        private String certHttpKey;

        @com.aliyun.core.annotation.NameInMap("CertHttpValue")
        private String certHttpValue;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private String certId;

        @com.aliyun.core.annotation.NameInMap("CertNotAfter")
        private String certNotAfter;

        @com.aliyun.core.annotation.NameInMap("CertStatus")
        private String certStatus;

        @com.aliyun.core.annotation.NameInMap("CertTxtKey")
        private String certTxtKey;

        @com.aliyun.core.annotation.NameInMap("CertTxtValue")
        private String certTxtValue;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("Certificate")
        private String certificate;

        @com.aliyun.core.annotation.NameInMap("ConflictWith")
        private String conflictWith;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("HostnameId")
        private Long hostnameId;

        @com.aliyun.core.annotation.NameInMap("OfflineReason")
        private String offlineReason;

        @com.aliyun.core.annotation.NameInMap("PrivateKey")
        private String privateKey;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("SslFlag")
        private String sslFlag;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VerifyCode")
        private String verifyCode;

        @com.aliyun.core.annotation.NameInMap("VerifyHost")
        private String verifyHost;

        private CustomHostnameModel(Builder builder) {
            this.casId = builder.casId;
            this.certApplyCode = builder.certApplyCode;
            this.certApplyMessage = builder.certApplyMessage;
            this.certHttpKey = builder.certHttpKey;
            this.certHttpValue = builder.certHttpValue;
            this.certId = builder.certId;
            this.certNotAfter = builder.certNotAfter;
            this.certStatus = builder.certStatus;
            this.certTxtKey = builder.certTxtKey;
            this.certTxtValue = builder.certTxtValue;
            this.certType = builder.certType;
            this.certificate = builder.certificate;
            this.conflictWith = builder.conflictWith;
            this.createTime = builder.createTime;
            this.hostname = builder.hostname;
            this.hostnameId = builder.hostnameId;
            this.offlineReason = builder.offlineReason;
            this.privateKey = builder.privateKey;
            this.recordId = builder.recordId;
            this.recordName = builder.recordName;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
            this.sslFlag = builder.sslFlag;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.verifyCode = builder.verifyCode;
            this.verifyHost = builder.verifyHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomHostnameModel create() {
            return builder().build();
        }

        /**
         * @return casId
         */
        public Long getCasId() {
            return this.casId;
        }

        /**
         * @return certApplyCode
         */
        public Long getCertApplyCode() {
            return this.certApplyCode;
        }

        /**
         * @return certApplyMessage
         */
        public String getCertApplyMessage() {
            return this.certApplyMessage;
        }

        /**
         * @return certHttpKey
         */
        public String getCertHttpKey() {
            return this.certHttpKey;
        }

        /**
         * @return certHttpValue
         */
        public String getCertHttpValue() {
            return this.certHttpValue;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return certNotAfter
         */
        public String getCertNotAfter() {
            return this.certNotAfter;
        }

        /**
         * @return certStatus
         */
        public String getCertStatus() {
            return this.certStatus;
        }

        /**
         * @return certTxtKey
         */
        public String getCertTxtKey() {
            return this.certTxtKey;
        }

        /**
         * @return certTxtValue
         */
        public String getCertTxtValue() {
            return this.certTxtValue;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return certificate
         */
        public String getCertificate() {
            return this.certificate;
        }

        /**
         * @return conflictWith
         */
        public String getConflictWith() {
            return this.conflictWith;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return hostnameId
         */
        public Long getHostnameId() {
            return this.hostnameId;
        }

        /**
         * @return offlineReason
         */
        public String getOfflineReason() {
            return this.offlineReason;
        }

        /**
         * @return privateKey
         */
        public String getPrivateKey() {
            return this.privateKey;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        /**
         * @return sslFlag
         */
        public String getSslFlag() {
            return this.sslFlag;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return verifyCode
         */
        public String getVerifyCode() {
            return this.verifyCode;
        }

        /**
         * @return verifyHost
         */
        public String getVerifyHost() {
            return this.verifyHost;
        }

        public static final class Builder {
            private Long casId; 
            private Long certApplyCode; 
            private String certApplyMessage; 
            private String certHttpKey; 
            private String certHttpValue; 
            private String certId; 
            private String certNotAfter; 
            private String certStatus; 
            private String certTxtKey; 
            private String certTxtValue; 
            private String certType; 
            private String certificate; 
            private String conflictWith; 
            private String createTime; 
            private String hostname; 
            private Long hostnameId; 
            private String offlineReason; 
            private String privateKey; 
            private Long recordId; 
            private String recordName; 
            private Long siteId; 
            private String siteName; 
            private String sslFlag; 
            private String status; 
            private String updateTime; 
            private String verifyCode; 
            private String verifyHost; 

            private Builder() {
            } 

            private Builder(CustomHostnameModel model) {
                this.casId = model.casId;
                this.certApplyCode = model.certApplyCode;
                this.certApplyMessage = model.certApplyMessage;
                this.certHttpKey = model.certHttpKey;
                this.certHttpValue = model.certHttpValue;
                this.certId = model.certId;
                this.certNotAfter = model.certNotAfter;
                this.certStatus = model.certStatus;
                this.certTxtKey = model.certTxtKey;
                this.certTxtValue = model.certTxtValue;
                this.certType = model.certType;
                this.certificate = model.certificate;
                this.conflictWith = model.conflictWith;
                this.createTime = model.createTime;
                this.hostname = model.hostname;
                this.hostnameId = model.hostnameId;
                this.offlineReason = model.offlineReason;
                this.privateKey = model.privateKey;
                this.recordId = model.recordId;
                this.recordName = model.recordName;
                this.siteId = model.siteId;
                this.siteName = model.siteName;
                this.sslFlag = model.sslFlag;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.verifyCode = model.verifyCode;
                this.verifyHost = model.verifyHost;
            } 

            /**
             * CasId.
             */
            public Builder casId(Long casId) {
                this.casId = casId;
                return this;
            }

            /**
             * <p>免费证书申请错误码</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder certApplyCode(Long certApplyCode) {
                this.certApplyCode = certApplyCode;
                return this;
            }

            /**
             * <p>免费证书申请错误说明</p>
             * 
             * <strong>example:</strong>
             * <p>canceled</p>
             */
            public Builder certApplyMessage(String certApplyMessage) {
                this.certApplyMessage = certApplyMessage;
                return this;
            }

            /**
             * <p>证书校验HTTP名称</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://custom.site.com/.well-known/acme-challenge/jLmMHlEaZ3jb352Qo3ciaSoAC8KZ5Hk0F-4_1xLQtgc">http://custom.site.com/.well-known/acme-challenge/jLmMHlEaZ3jb352Qo3ciaSoAC8KZ5Hk0F-4_1xLQtgc</a></p>
             */
            public Builder certHttpKey(String certHttpKey) {
                this.certHttpKey = certHttpKey;
                return this;
            }

            /**
             * <p>证书校验HTTP内容</p>
             * 
             * <strong>example:</strong>
             * <p>jLmMHlEaZ3jb352Qo3ciaSoAC8KZ5Hk0F-4_1xLQtgc.GridYdfJJB5PgFEL-t89XfaFvMPB4f2-I9fwLpKl6e0</p>
             */
            public Builder certHttpValue(String certHttpValue) {
                this.certHttpValue = certHttpValue;
                return this;
            }

            /**
             * CertId.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>证书过期时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-19T11:15:20Z</p>
             */
            public Builder certNotAfter(String certNotAfter) {
                this.certNotAfter = certNotAfter;
                return this;
            }

            /**
             * <p>证书状态</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder certStatus(String certStatus) {
                this.certStatus = certStatus;
                return this;
            }

            /**
             * <p>证书校验TXT名称</p>
             * 
             * <strong>example:</strong>
             * <p>_acme-challenge.custom.site.com</p>
             */
            public Builder certTxtKey(String certTxtKey) {
                this.certTxtKey = certTxtKey;
                return this;
            }

            /**
             * <p>证书校验TXT内容</p>
             * 
             * <strong>example:</strong>
             * <p>lcKYad3UQXgrZLvMm_6TBUYKK4xTkGmninV0Mzx4gjM</p>
             */
            public Builder certTxtValue(String certTxtValue) {
                this.certTxtValue = certTxtValue;
                return this;
            }

            /**
             * <p>证书类型</p>
             * 
             * <strong>example:</strong>
             * <p>free</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>上传的证书公钥</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----</p>
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * ConflictWith.
             */
            public Builder conflictWith(String conflictWith) {
                this.conflictWith = conflictWith;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-19T11:15:20Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>用户自定义的主机名</p>
             * 
             * <strong>example:</strong>
             * <p>custom.site.com</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * HostnameId.
             */
            public Builder hostnameId(Long hostnameId) {
                this.hostnameId = hostnameId;
                return this;
            }

            /**
             * OfflineReason.
             */
            public Builder offlineReason(String offlineReason) {
                this.offlineReason = offlineReason;
                return this;
            }

            /**
             * PrivateKey.
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            /**
             * <p>绑定的源站记录ID</p>
             * 
             * <strong>example:</strong>
             * <p>4042843419650112</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>绑定的源站记录名</p>
             * 
             * <strong>example:</strong>
             * <p>origin.example.com</p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>与主机名关联的站点ID</p>
             * 
             * <strong>example:</strong>
             * <p>890601022130656</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>关联站点名称</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>SSL开关的状态</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder sslFlag(String sslFlag) {
                this.sslFlag = sslFlag;
                return this;
            }

            /**
             * <p>自定义主机名状态</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-19T11:15:20Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>归属校验TXT内容</p>
             * 
             * <strong>example:</strong>
             * <p>verify_16ab7f4d389d4dff6655f995c6a997bd</p>
             */
            public Builder verifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
                return this;
            }

            /**
             * <p>归属校验TXT名称</p>
             * 
             * <strong>example:</strong>
             * <p>_esa_custom_hostname.custom.site.com</p>
             */
            public Builder verifyHost(String verifyHost) {
                this.verifyHost = verifyHost;
                return this;
            }

            public CustomHostnameModel build() {
                return new CustomHostnameModel(this);
            } 

        } 

    }
}
