// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppInstanceDomainsResponseBody</p>
 */
public class ListAppInstanceDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListAppInstanceDomainsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.maxResults = builder.maxResults;
        this.module = builder.module;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstanceDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Integer maxResults; 
        private Module module; 
        private String nextToken; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListAppInstanceDomainsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.maxResults = model.maxResults;
            this.module = model.module;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * <p>Detailed reason for access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Whether retry is allowed</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>App name.</p>
         * 
         * <strong>example:</strong>
         * <p>dewuApp</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>Dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>Dynamic error message, used to replace <code>%s</code> in the error message of the returned parameter <strong>ErrMessage</strong>.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong>, and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it means that the input request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>Returned error parameters</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>Number of results per query.</p>
         * <p>Range: 10~100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Response data</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>下一个查询开始的Token。没有下一个查询时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>dw+qdTi1EjVSWX/INJdYNw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>Exception message</p>
         * 
         * <strong>example:</strong>
         * <p>系统异常</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public ListAppInstanceDomainsResponseBody build() {
            return new ListAppInstanceDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Certificate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CertificateStatus")
        private String certificateStatus;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        private Certificate(Builder builder) {
            this.certificateName = builder.certificateName;
            this.certificateStatus = builder.certificateStatus;
            this.certificateType = builder.certificateType;
            this.endTime = builder.endTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificate create() {
            return builder().build();
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return certificateStatus
         */
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        public static final class Builder {
            private String certificateName; 
            private String certificateStatus; 
            private String certificateType; 
            private String endTime; 

            private Builder() {
            } 

            private Builder(Certificate model) {
                this.certificateName = model.certificateName;
                this.certificateStatus = model.certificateStatus;
                this.certificateType = model.certificateType;
                this.endTime = model.endTime;
            } 

            /**
             * <p>Certificate name.</p>
             * 
             * <strong>example:</strong>
             * <p>2024</p>
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * <p>Certificate status</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder certificateStatus(String certificateStatus) {
                this.certificateStatus = certificateStatus;
                return this;
            }

            /**
             * <p>Certificate type</p>
             * 
             * <strong>example:</strong>
             * <p>self-signed</p>
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * <p>Certificate expiration date</p>
             * 
             * <strong>example:</strong>
             * <p>4885718400000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            public Certificate build() {
                return new Certificate(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Records(Builder builder) {
            this.host = builder.host;
            this.recordType = builder.recordType;
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String host; 
            private String recordType; 
            private String status; 
            private String value; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.host = model.host;
                this.recordType = model.recordType;
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * RecordType.
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class DnsConflict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanAutoResolve")
        private Boolean canAutoResolve;

        @com.aliyun.core.annotation.NameInMap("HasConflict")
        private Boolean hasConflict;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        private DnsConflict(Builder builder) {
            this.canAutoResolve = builder.canAutoResolve;
            this.hasConflict = builder.hasConflict;
            this.message = builder.message;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConflict create() {
            return builder().build();
        }

        /**
         * @return canAutoResolve
         */
        public Boolean getCanAutoResolve() {
            return this.canAutoResolve;
        }

        /**
         * @return hasConflict
         */
        public Boolean getHasConflict() {
            return this.hasConflict;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private Boolean canAutoResolve; 
            private Boolean hasConflict; 
            private String message; 
            private java.util.List<Records> records; 

            private Builder() {
            } 

            private Builder(DnsConflict model) {
                this.canAutoResolve = model.canAutoResolve;
                this.hasConflict = model.hasConflict;
                this.message = model.message;
                this.records = model.records;
            } 

            /**
             * CanAutoResolve.
             */
            public Builder canAutoResolve(Boolean canAutoResolve) {
                this.canAutoResolve = canAutoResolve;
                return this;
            }

            /**
             * HasConflict.
             */
            public Builder hasConflict(Boolean hasConflict) {
                this.hasConflict = hasConflict;
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
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            public DnsConflict build() {
                return new DnsConflict(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Migration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MigrationStatus")
        private String migrationStatus;

        @com.aliyun.core.annotation.NameInMap("PreviousDomain")
        private Object previousDomain;

        private Migration(Builder builder) {
            this.migrationStatus = builder.migrationStatus;
            this.previousDomain = builder.previousDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Migration create() {
            return builder().build();
        }

        /**
         * @return migrationStatus
         */
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        /**
         * @return previousDomain
         */
        public Object getPreviousDomain() {
            return this.previousDomain;
        }

        public static final class Builder {
            private String migrationStatus; 
            private Object previousDomain; 

            private Builder() {
            } 

            private Builder(Migration model) {
                this.migrationStatus = model.migrationStatus;
                this.previousDomain = model.previousDomain;
            } 

            /**
             * MigrationStatus.
             */
            public Builder migrationStatus(String migrationStatus) {
                this.migrationStatus = migrationStatus;
                return this;
            }

            /**
             * PreviousDomain.
             */
            public Builder previousDomain(Object previousDomain) {
                this.previousDomain = previousDomain;
                return this;
            }

            public Migration build() {
                return new Migration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Ownership extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("RootDomain")
        private String rootDomain;

        private Ownership(Builder builder) {
            this.account = builder.account;
            this.provider = builder.provider;
            this.rootDomain = builder.rootDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ownership create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return rootDomain
         */
        public String getRootDomain() {
            return this.rootDomain;
        }

        public static final class Builder {
            private String account; 
            private String provider; 
            private String rootDomain; 

            private Builder() {
            } 

            private Builder(Ownership model) {
                this.account = model.account;
                this.provider = model.provider;
                this.rootDomain = model.rootDomain;
            } 

            /**
             * <p>Account owner type: CURRENT OTHER</p>
             * 
             * <strong>example:</strong>
             * <p>1813244684017878</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>Registrar type: ALIYUN OTHER</p>
             * 
             * <strong>example:</strong>
             * <p>ROS</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The root domain name of the domain.</p>
             * 
             * <strong>example:</strong>
             * <p>tjouya.cn</p>
             */
            public Builder rootDomain(String rootDomain) {
                this.rootDomain = rootDomain;
                return this;
            }

            public Ownership build() {
                return new Ownership(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Qualification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IcpRecordNumber")
        private String icpRecordNumber;

        @com.aliyun.core.annotation.NameInMap("IcpSiteRecordNumber")
        private String icpSiteRecordNumber;

        @com.aliyun.core.annotation.NameInMap("PoliceRecordNumber")
        private String policeRecordNumber;

        private Qualification(Builder builder) {
            this.icpRecordNumber = builder.icpRecordNumber;
            this.icpSiteRecordNumber = builder.icpSiteRecordNumber;
            this.policeRecordNumber = builder.policeRecordNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Qualification create() {
            return builder().build();
        }

        /**
         * @return icpRecordNumber
         */
        public String getIcpRecordNumber() {
            return this.icpRecordNumber;
        }

        /**
         * @return icpSiteRecordNumber
         */
        public String getIcpSiteRecordNumber() {
            return this.icpSiteRecordNumber;
        }

        /**
         * @return policeRecordNumber
         */
        public String getPoliceRecordNumber() {
            return this.policeRecordNumber;
        }

        public static final class Builder {
            private String icpRecordNumber; 
            private String icpSiteRecordNumber; 
            private String policeRecordNumber; 

            private Builder() {
            } 

            private Builder(Qualification model) {
                this.icpRecordNumber = model.icpRecordNumber;
                this.icpSiteRecordNumber = model.icpSiteRecordNumber;
                this.policeRecordNumber = model.policeRecordNumber;
            } 

            /**
             * IcpRecordNumber.
             */
            public Builder icpRecordNumber(String icpRecordNumber) {
                this.icpRecordNumber = icpRecordNumber;
                return this;
            }

            /**
             * IcpSiteRecordNumber.
             */
            public Builder icpSiteRecordNumber(String icpSiteRecordNumber) {
                this.icpSiteRecordNumber = icpSiteRecordNumber;
                return this;
            }

            /**
             * PoliceRecordNumber.
             */
            public Builder policeRecordNumber(String policeRecordNumber) {
                this.policeRecordNumber = policeRecordNumber;
                return this;
            }

            public Qualification build() {
                return new Qualification(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class DnsRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DnsRecord(Builder builder) {
            this.host = builder.host;
            this.recordType = builder.recordType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsRecord create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String host; 
            private String recordType; 
            private String value; 

            private Builder() {
            } 

            private Builder(DnsRecord model) {
                this.host = model.host;
                this.recordType = model.recordType;
                this.value = model.value;
            } 

            /**
             * <p>Host record</p>
             * 
             * <strong>example:</strong>
             * <p>portal-dev.bambulab.net</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Record type</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>Record value</p>
             * 
             * <strong>example:</strong>
             * <p>Maintenance</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DnsRecord build() {
                return new DnsRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Resolution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsRecord")
        private DnsRecord dnsRecord;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ResolutionStatus")
        private String resolutionStatus;

        private Resolution(Builder builder) {
            this.dnsRecord = builder.dnsRecord;
            this.errorMsg = builder.errorMsg;
            this.resolutionStatus = builder.resolutionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resolution create() {
            return builder().build();
        }

        /**
         * @return dnsRecord
         */
        public DnsRecord getDnsRecord() {
            return this.dnsRecord;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return resolutionStatus
         */
        public String getResolutionStatus() {
            return this.resolutionStatus;
        }

        public static final class Builder {
            private DnsRecord dnsRecord; 
            private String errorMsg; 
            private String resolutionStatus; 

            private Builder() {
            } 

            private Builder(Resolution model) {
                this.dnsRecord = model.dnsRecord;
                this.errorMsg = model.errorMsg;
                this.resolutionStatus = model.resolutionStatus;
            } 

            /**
             * <p>DNS record information</p>
             */
            public Builder dnsRecord(DnsRecord dnsRecord) {
                this.dnsRecord = dnsRecord;
                return this;
            }

            /**
             * <p>Error message</p>
             * 
             * <strong>example:</strong>
             * <p>code: 400, invalid unionId request id: 09CC0F8B-49C2-7EFB-81E8-9AEF49068D02</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Domain resolution status</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESSFUL</p>
             */
            public Builder resolutionStatus(String resolutionStatus) {
                this.resolutionStatus = resolutionStatus;
                return this;
            }

            public Resolution build() {
                return new Resolution(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class VerificationDnsRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private VerificationDnsRecord(Builder builder) {
            this.host = builder.host;
            this.recordType = builder.recordType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VerificationDnsRecord create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String host; 
            private String recordType; 
            private String value; 

            private Builder() {
            } 

            private Builder(VerificationDnsRecord model) {
                this.host = model.host;
                this.recordType = model.recordType;
                this.value = model.value;
            } 

            /**
             * <p>Host record</p>
             * 
             * <strong>example:</strong>
             * <p>${host}</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Record type</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>Record value</p>
             * 
             * <strong>example:</strong>
             * <p>159.138.94.138</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public VerificationDnsRecord build() {
                return new VerificationDnsRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Verification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsRecord")
        private VerificationDnsRecord dnsRecord;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("VerificationStatus")
        private String verificationStatus;

        @com.aliyun.core.annotation.NameInMap("VerificationStatusCode")
        private String verificationStatusCode;

        private Verification(Builder builder) {
            this.dnsRecord = builder.dnsRecord;
            this.errorMsg = builder.errorMsg;
            this.verificationStatus = builder.verificationStatus;
            this.verificationStatusCode = builder.verificationStatusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Verification create() {
            return builder().build();
        }

        /**
         * @return dnsRecord
         */
        public VerificationDnsRecord getDnsRecord() {
            return this.dnsRecord;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return verificationStatus
         */
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        /**
         * @return verificationStatusCode
         */
        public String getVerificationStatusCode() {
            return this.verificationStatusCode;
        }

        public static final class Builder {
            private VerificationDnsRecord dnsRecord; 
            private String errorMsg; 
            private String verificationStatus; 
            private String verificationStatusCode; 

            private Builder() {
            } 

            private Builder(Verification model) {
                this.dnsRecord = model.dnsRecord;
                this.errorMsg = model.errorMsg;
                this.verificationStatus = model.verificationStatus;
                this.verificationStatusCode = model.verificationStatusCode;
            } 

            /**
             * <p>DNS record guide that the user needs to configure.</p>
             */
            public Builder dnsRecord(VerificationDnsRecord dnsRecord) {
                this.dnsRecord = dnsRecord;
                return this;
            }

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>code: 400, invalid unionId request id: 2270AB0B-6FD0-7F72-9DC5-7A02B67CBB3B</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Ownership verification status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESSFUL</p>
             */
            public Builder verificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
                return this;
            }

            /**
             * <p>Ownership verification status</p>
             * 
             * <strong>example:</strong>
             * <p>NoAliyunServiceRoleForWebsiteBuildPublishAuth</p>
             */
            public Builder verificationStatusCode(String verificationStatusCode) {
                this.verificationStatusCode = verificationStatusCode;
                return this;
            }

            public Verification build() {
                return new Verification(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificate")
        private Certificate certificate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("DnsConflict")
        private DnsConflict dnsConflict;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("IcpFilingStatus")
        private String icpFilingStatus;

        @com.aliyun.core.annotation.NameInMap("Migration")
        private Migration migration;

        @com.aliyun.core.annotation.NameInMap("Offline")
        private Boolean offline;

        @com.aliyun.core.annotation.NameInMap("OverallStatus")
        private String overallStatus;

        @com.aliyun.core.annotation.NameInMap("Ownership")
        private Ownership ownership;

        @com.aliyun.core.annotation.NameInMap("Qualification")
        private Qualification qualification;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private Resolution resolution;

        @com.aliyun.core.annotation.NameInMap("Verification")
        private Verification verification;

        private Data(Builder builder) {
            this.certificate = builder.certificate;
            this.createTime = builder.createTime;
            this.deployType = builder.deployType;
            this.dnsConflict = builder.dnsConflict;
            this.domainName = builder.domainName;
            this.domainType = builder.domainType;
            this.icpFilingStatus = builder.icpFilingStatus;
            this.migration = builder.migration;
            this.offline = builder.offline;
            this.overallStatus = builder.overallStatus;
            this.ownership = builder.ownership;
            this.qualification = builder.qualification;
            this.resolution = builder.resolution;
            this.verification = builder.verification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certificate
         */
        public Certificate getCertificate() {
            return this.certificate;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return dnsConflict
         */
        public DnsConflict getDnsConflict() {
            return this.dnsConflict;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return icpFilingStatus
         */
        public String getIcpFilingStatus() {
            return this.icpFilingStatus;
        }

        /**
         * @return migration
         */
        public Migration getMigration() {
            return this.migration;
        }

        /**
         * @return offline
         */
        public Boolean getOffline() {
            return this.offline;
        }

        /**
         * @return overallStatus
         */
        public String getOverallStatus() {
            return this.overallStatus;
        }

        /**
         * @return ownership
         */
        public Ownership getOwnership() {
            return this.ownership;
        }

        /**
         * @return qualification
         */
        public Qualification getQualification() {
            return this.qualification;
        }

        /**
         * @return resolution
         */
        public Resolution getResolution() {
            return this.resolution;
        }

        /**
         * @return verification
         */
        public Verification getVerification() {
            return this.verification;
        }

        public static final class Builder {
            private Certificate certificate; 
            private String createTime; 
            private String deployType; 
            private DnsConflict dnsConflict; 
            private String domainName; 
            private String domainType; 
            private String icpFilingStatus; 
            private Migration migration; 
            private Boolean offline; 
            private String overallStatus; 
            private Ownership ownership; 
            private Qualification qualification; 
            private Resolution resolution; 
            private Verification verification; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.certificate = model.certificate;
                this.createTime = model.createTime;
                this.deployType = model.deployType;
                this.dnsConflict = model.dnsConflict;
                this.domainName = model.domainName;
                this.domainType = model.domainType;
                this.icpFilingStatus = model.icpFilingStatus;
                this.migration = model.migration;
                this.offline = model.offline;
                this.overallStatus = model.overallStatus;
                this.ownership = model.ownership;
                this.qualification = model.qualification;
                this.resolution = model.resolution;
                this.verification = model.verification;
            } 

            /**
             * <p>Domain SSL certificate information</p>
             */
            public Builder certificate(Certificate certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * <p>Instance creation time (required, format: yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>1683256054000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * DnsConflict.
             */
            public Builder dnsConflict(DnsConflict dnsConflict) {
                this.dnsConflict = dnsConflict;
                return this;
            }

            /**
             * <p>Domain name</p>
             * 
             * <strong>example:</strong>
             * <p>kaibaidu.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * IcpFilingStatus.
             */
            public Builder icpFilingStatus(String icpFilingStatus) {
                this.icpFilingStatus = icpFilingStatus;
                return this;
            }

            /**
             * Migration.
             */
            public Builder migration(Migration migration) {
                this.migration = migration;
                return this;
            }

            /**
             * Offline.
             */
            public Builder offline(Boolean offline) {
                this.offline = offline;
                return this;
            }

            /**
             * <p>Binding overall status</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder overallStatus(String overallStatus) {
                this.overallStatus = overallStatus;
                return this;
            }

            /**
             * <p>Domain ownership information</p>
             */
            public Builder ownership(Ownership ownership) {
                this.ownership = ownership;
                return this;
            }

            /**
             * Qualification.
             */
            public Builder qualification(Qualification qualification) {
                this.qualification = qualification;
                return this;
            }

            /**
             * <p>Domain resolution information</p>
             */
            public Builder resolution(Resolution resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>Domain verification information</p>
             */
            public Builder verification(Verification verification) {
                this.verification = verification;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class NextCertificate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CertificateStatus")
        private String certificateStatus;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        private NextCertificate(Builder builder) {
            this.certificateName = builder.certificateName;
            this.certificateStatus = builder.certificateStatus;
            this.certificateType = builder.certificateType;
            this.endTime = builder.endTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextCertificate create() {
            return builder().build();
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return certificateStatus
         */
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        public static final class Builder {
            private String certificateName; 
            private String certificateStatus; 
            private String certificateType; 
            private String endTime; 

            private Builder() {
            } 

            private Builder(NextCertificate model) {
                this.certificateName = model.certificateName;
                this.certificateStatus = model.certificateStatus;
                this.certificateType = model.certificateType;
                this.endTime = model.endTime;
            } 

            /**
             * <p>Certificate name.</p>
             * 
             * <strong>example:</strong>
             * <p>jfztkg202502</p>
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * <p>Certificate status</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder certificateStatus(String certificateStatus) {
                this.certificateStatus = certificateStatus;
                return this;
            }

            /**
             * <p>Certificate type</p>
             * 
             * <strong>example:</strong>
             * <p>Server</p>
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * <p>证书的到期日期</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-15T02:04:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            public NextCertificate build() {
                return new NextCertificate(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class DnsConflictRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DnsConflictRecords(Builder builder) {
            this.host = builder.host;
            this.recordType = builder.recordType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConflictRecords create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String host; 
            private String recordType; 
            private String value; 

            private Builder() {
            } 

            private Builder(DnsConflictRecords model) {
                this.host = model.host;
                this.recordType = model.recordType;
                this.value = model.value;
            } 

            /**
             * <p>Host record</p>
             * 
             * <strong>example:</strong>
             * <p>${host}</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Record type</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>Record value</p>
             * 
             * <strong>example:</strong>
             * <p>159.138.94.138</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DnsConflictRecords build() {
                return new DnsConflictRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class NextDnsConflict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanAutoResolve")
        private Boolean canAutoResolve;

        @com.aliyun.core.annotation.NameInMap("HasConflict")
        private Boolean hasConflict;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<DnsConflictRecords> records;

        private NextDnsConflict(Builder builder) {
            this.canAutoResolve = builder.canAutoResolve;
            this.hasConflict = builder.hasConflict;
            this.message = builder.message;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextDnsConflict create() {
            return builder().build();
        }

        /**
         * @return canAutoResolve
         */
        public Boolean getCanAutoResolve() {
            return this.canAutoResolve;
        }

        /**
         * @return hasConflict
         */
        public Boolean getHasConflict() {
            return this.hasConflict;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return records
         */
        public java.util.List<DnsConflictRecords> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private Boolean canAutoResolve; 
            private Boolean hasConflict; 
            private String message; 
            private java.util.List<DnsConflictRecords> records; 

            private Builder() {
            } 

            private Builder(NextDnsConflict model) {
                this.canAutoResolve = model.canAutoResolve;
                this.hasConflict = model.hasConflict;
                this.message = model.message;
                this.records = model.records;
            } 

            /**
             * CanAutoResolve.
             */
            public Builder canAutoResolve(Boolean canAutoResolve) {
                this.canAutoResolve = canAutoResolve;
                return this;
            }

            /**
             * HasConflict.
             */
            public Builder hasConflict(Boolean hasConflict) {
                this.hasConflict = hasConflict;
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
             * Records.
             */
            public Builder records(java.util.List<DnsConflictRecords> records) {
                this.records = records;
                return this;
            }

            public NextDnsConflict build() {
                return new NextDnsConflict(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class NextMigration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MigrationStatus")
        private String migrationStatus;

        @com.aliyun.core.annotation.NameInMap("PreviousDomain")
        private Object previousDomain;

        private NextMigration(Builder builder) {
            this.migrationStatus = builder.migrationStatus;
            this.previousDomain = builder.previousDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextMigration create() {
            return builder().build();
        }

        /**
         * @return migrationStatus
         */
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        /**
         * @return previousDomain
         */
        public Object getPreviousDomain() {
            return this.previousDomain;
        }

        public static final class Builder {
            private String migrationStatus; 
            private Object previousDomain; 

            private Builder() {
            } 

            private Builder(NextMigration model) {
                this.migrationStatus = model.migrationStatus;
                this.previousDomain = model.previousDomain;
            } 

            /**
             * MigrationStatus.
             */
            public Builder migrationStatus(String migrationStatus) {
                this.migrationStatus = migrationStatus;
                return this;
            }

            /**
             * PreviousDomain.
             */
            public Builder previousDomain(Object previousDomain) {
                this.previousDomain = previousDomain;
                return this;
            }

            public NextMigration build() {
                return new NextMigration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class NextOwnership extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("RootDomain")
        private String rootDomain;

        private NextOwnership(Builder builder) {
            this.account = builder.account;
            this.provider = builder.provider;
            this.rootDomain = builder.rootDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextOwnership create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return rootDomain
         */
        public String getRootDomain() {
            return this.rootDomain;
        }

        public static final class Builder {
            private String account; 
            private String provider; 
            private String rootDomain; 

            private Builder() {
            } 

            private Builder(NextOwnership model) {
                this.account = model.account;
                this.provider = model.provider;
                this.rootDomain = model.rootDomain;
            } 

            /**
             * <p>Account owner type: CURRENT OTHER</p>
             * 
             * <strong>example:</strong>
             * <p>拾肆gavin</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>Registrar type: ALIYUN OTHER</p>
             * 
             * <strong>example:</strong>
             * <p>pai</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The root domain name of the domain.</p>
             * 
             * <strong>example:</strong>
             * <p>tjouya.cn</p>
             */
            public Builder rootDomain(String rootDomain) {
                this.rootDomain = rootDomain;
                return this;
            }

            public NextOwnership build() {
                return new NextOwnership(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class NextQualification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IcpRecordNumber")
        private String icpRecordNumber;

        @com.aliyun.core.annotation.NameInMap("IcpSiteRecordNumber")
        private String icpSiteRecordNumber;

        @com.aliyun.core.annotation.NameInMap("PoliceRecordNumber")
        private String policeRecordNumber;

        private NextQualification(Builder builder) {
            this.icpRecordNumber = builder.icpRecordNumber;
            this.icpSiteRecordNumber = builder.icpSiteRecordNumber;
            this.policeRecordNumber = builder.policeRecordNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextQualification create() {
            return builder().build();
        }

        /**
         * @return icpRecordNumber
         */
        public String getIcpRecordNumber() {
            return this.icpRecordNumber;
        }

        /**
         * @return icpSiteRecordNumber
         */
        public String getIcpSiteRecordNumber() {
            return this.icpSiteRecordNumber;
        }

        /**
         * @return policeRecordNumber
         */
        public String getPoliceRecordNumber() {
            return this.policeRecordNumber;
        }

        public static final class Builder {
            private String icpRecordNumber; 
            private String icpSiteRecordNumber; 
            private String policeRecordNumber; 

            private Builder() {
            } 

            private Builder(NextQualification model) {
                this.icpRecordNumber = model.icpRecordNumber;
                this.icpSiteRecordNumber = model.icpSiteRecordNumber;
                this.policeRecordNumber = model.policeRecordNumber;
            } 

            /**
             * IcpRecordNumber.
             */
            public Builder icpRecordNumber(String icpRecordNumber) {
                this.icpRecordNumber = icpRecordNumber;
                return this;
            }

            /**
             * IcpSiteRecordNumber.
             */
            public Builder icpSiteRecordNumber(String icpSiteRecordNumber) {
                this.icpSiteRecordNumber = icpSiteRecordNumber;
                return this;
            }

            /**
             * PoliceRecordNumber.
             */
            public Builder policeRecordNumber(String policeRecordNumber) {
                this.policeRecordNumber = policeRecordNumber;
                return this;
            }

            public NextQualification build() {
                return new NextQualification(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class ResolutionDnsRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ResolutionDnsRecord(Builder builder) {
            this.host = builder.host;
            this.recordType = builder.recordType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResolutionDnsRecord create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String host; 
            private String recordType; 
            private String value; 

            private Builder() {
            } 

            private Builder(ResolutionDnsRecord model) {
                this.host = model.host;
                this.recordType = model.recordType;
                this.value = model.value;
            } 

            /**
             * <p>Host record</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.6.1</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Record type</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>Record value</p>
             * 
             * <strong>example:</strong>
             * <p>2025032000000054nuba0r0b0a79y70c1c983tsz09xw9hg3p04kqxmbt4g2p65h</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResolutionDnsRecord build() {
                return new ResolutionDnsRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class NextResolution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsRecord")
        private ResolutionDnsRecord dnsRecord;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ResolutionStatus")
        private String resolutionStatus;

        private NextResolution(Builder builder) {
            this.dnsRecord = builder.dnsRecord;
            this.errorMsg = builder.errorMsg;
            this.resolutionStatus = builder.resolutionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextResolution create() {
            return builder().build();
        }

        /**
         * @return dnsRecord
         */
        public ResolutionDnsRecord getDnsRecord() {
            return this.dnsRecord;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return resolutionStatus
         */
        public String getResolutionStatus() {
            return this.resolutionStatus;
        }

        public static final class Builder {
            private ResolutionDnsRecord dnsRecord; 
            private String errorMsg; 
            private String resolutionStatus; 

            private Builder() {
            } 

            private Builder(NextResolution model) {
                this.dnsRecord = model.dnsRecord;
                this.errorMsg = model.errorMsg;
                this.resolutionStatus = model.resolutionStatus;
            } 

            /**
             * <p>DNS record information</p>
             */
            public Builder dnsRecord(ResolutionDnsRecord dnsRecord) {
                this.dnsRecord = dnsRecord;
                return this;
            }

            /**
             * <p>Error message</p>
             * 
             * <strong>example:</strong>
             * <p>aliuid:1133664521498319 assumeOssRole not exist,serviceName:aliyunesarealtimelogpushossrole</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Domain resolution status</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESSFUL</p>
             */
            public Builder resolutionStatus(String resolutionStatus) {
                this.resolutionStatus = resolutionStatus;
                return this;
            }

            public NextResolution build() {
                return new NextResolution(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class NextVerificationDnsRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private NextVerificationDnsRecord(Builder builder) {
            this.host = builder.host;
            this.recordType = builder.recordType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextVerificationDnsRecord create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String host; 
            private String recordType; 
            private String value; 

            private Builder() {
            } 

            private Builder(NextVerificationDnsRecord model) {
                this.host = model.host;
                this.recordType = model.recordType;
                this.value = model.value;
            } 

            /**
             * <p>Host record</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.abc.com">www.abc.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Record type</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>Record value</p>
             * 
             * <strong>example:</strong>
             * <p>faHuBlyPcodSjBvBJYpm3-9W_cCSowLLQ4zAUyguEGM</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NextVerificationDnsRecord build() {
                return new NextVerificationDnsRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class NextVerification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsRecord")
        private NextVerificationDnsRecord dnsRecord;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("VerificationStatus")
        private String verificationStatus;

        @com.aliyun.core.annotation.NameInMap("VerificationStatusCode")
        private String verificationStatusCode;

        private NextVerification(Builder builder) {
            this.dnsRecord = builder.dnsRecord;
            this.errorMsg = builder.errorMsg;
            this.verificationStatus = builder.verificationStatus;
            this.verificationStatusCode = builder.verificationStatusCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextVerification create() {
            return builder().build();
        }

        /**
         * @return dnsRecord
         */
        public NextVerificationDnsRecord getDnsRecord() {
            return this.dnsRecord;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return verificationStatus
         */
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        /**
         * @return verificationStatusCode
         */
        public String getVerificationStatusCode() {
            return this.verificationStatusCode;
        }

        public static final class Builder {
            private NextVerificationDnsRecord dnsRecord; 
            private String errorMsg; 
            private String verificationStatus; 
            private String verificationStatusCode; 

            private Builder() {
            } 

            private Builder(NextVerification model) {
                this.dnsRecord = model.dnsRecord;
                this.errorMsg = model.errorMsg;
                this.verificationStatus = model.verificationStatus;
                this.verificationStatusCode = model.verificationStatusCode;
            } 

            /**
             * <p>Guide for DNS records that the user needs to configure.</p>
             */
            public Builder dnsRecord(NextVerificationDnsRecord dnsRecord) {
                this.dnsRecord = dnsRecord;
                return this;
            }

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>aliuid:1133664521498319 assumeOssRole not exist,serviceName:aliyunesarealtimelogpushossrole</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Ownership verification status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESSFUL</p>
             */
            public Builder verificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
                return this;
            }

            /**
             * <p>Ownership verification status</p>
             * 
             * <strong>example:</strong>
             * <p>NoAliyunServiceRoleForWebsiteBuildPublishAuth</p>
             */
            public Builder verificationStatusCode(String verificationStatusCode) {
                this.verificationStatusCode = verificationStatusCode;
                return this;
            }

            public NextVerification build() {
                return new NextVerification(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Next extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificate")
        private NextCertificate certificate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("DnsConflict")
        private NextDnsConflict dnsConflict;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("IcpFilingStatus")
        private String icpFilingStatus;

        @com.aliyun.core.annotation.NameInMap("Migration")
        private NextMigration migration;

        @com.aliyun.core.annotation.NameInMap("Offline")
        private Boolean offline;

        @com.aliyun.core.annotation.NameInMap("OverallStatus")
        private String overallStatus;

        @com.aliyun.core.annotation.NameInMap("Ownership")
        private NextOwnership ownership;

        @com.aliyun.core.annotation.NameInMap("Qualification")
        private NextQualification qualification;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private NextResolution resolution;

        @com.aliyun.core.annotation.NameInMap("Verification")
        private NextVerification verification;

        private Next(Builder builder) {
            this.certificate = builder.certificate;
            this.createTime = builder.createTime;
            this.deployType = builder.deployType;
            this.dnsConflict = builder.dnsConflict;
            this.domainName = builder.domainName;
            this.domainType = builder.domainType;
            this.icpFilingStatus = builder.icpFilingStatus;
            this.migration = builder.migration;
            this.offline = builder.offline;
            this.overallStatus = builder.overallStatus;
            this.ownership = builder.ownership;
            this.qualification = builder.qualification;
            this.resolution = builder.resolution;
            this.verification = builder.verification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Next create() {
            return builder().build();
        }

        /**
         * @return certificate
         */
        public NextCertificate getCertificate() {
            return this.certificate;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return dnsConflict
         */
        public NextDnsConflict getDnsConflict() {
            return this.dnsConflict;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return icpFilingStatus
         */
        public String getIcpFilingStatus() {
            return this.icpFilingStatus;
        }

        /**
         * @return migration
         */
        public NextMigration getMigration() {
            return this.migration;
        }

        /**
         * @return offline
         */
        public Boolean getOffline() {
            return this.offline;
        }

        /**
         * @return overallStatus
         */
        public String getOverallStatus() {
            return this.overallStatus;
        }

        /**
         * @return ownership
         */
        public NextOwnership getOwnership() {
            return this.ownership;
        }

        /**
         * @return qualification
         */
        public NextQualification getQualification() {
            return this.qualification;
        }

        /**
         * @return resolution
         */
        public NextResolution getResolution() {
            return this.resolution;
        }

        /**
         * @return verification
         */
        public NextVerification getVerification() {
            return this.verification;
        }

        public static final class Builder {
            private NextCertificate certificate; 
            private String createTime; 
            private String deployType; 
            private NextDnsConflict dnsConflict; 
            private String domainName; 
            private String domainType; 
            private String icpFilingStatus; 
            private NextMigration migration; 
            private Boolean offline; 
            private String overallStatus; 
            private NextOwnership ownership; 
            private NextQualification qualification; 
            private NextResolution resolution; 
            private NextVerification verification; 

            private Builder() {
            } 

            private Builder(Next model) {
                this.certificate = model.certificate;
                this.createTime = model.createTime;
                this.deployType = model.deployType;
                this.dnsConflict = model.dnsConflict;
                this.domainName = model.domainName;
                this.domainType = model.domainType;
                this.icpFilingStatus = model.icpFilingStatus;
                this.migration = model.migration;
                this.offline = model.offline;
                this.overallStatus = model.overallStatus;
                this.ownership = model.ownership;
                this.qualification = model.qualification;
                this.resolution = model.resolution;
                this.verification = model.verification;
            } 

            /**
             * <p>Domain SSL certificate information</p>
             */
            public Builder certificate(NextCertificate certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * <p>Instance creation time (required, format: yyyy-MM-dd HH:mm:ss)</p>
             * 
             * <strong>example:</strong>
             * <p>1741572465000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * DnsConflict.
             */
            public Builder dnsConflict(NextDnsConflict dnsConflict) {
                this.dnsConflict = dnsConflict;
                return this;
            }

            /**
             * <p>Domain name</p>
             * 
             * <strong>example:</strong>
             * <p>usdcoin.xin</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * IcpFilingStatus.
             */
            public Builder icpFilingStatus(String icpFilingStatus) {
                this.icpFilingStatus = icpFilingStatus;
                return this;
            }

            /**
             * Migration.
             */
            public Builder migration(NextMigration migration) {
                this.migration = migration;
                return this;
            }

            /**
             * Offline.
             */
            public Builder offline(Boolean offline) {
                this.offline = offline;
                return this;
            }

            /**
             * <p>Binding overall status</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder overallStatus(String overallStatus) {
                this.overallStatus = overallStatus;
                return this;
            }

            /**
             * <p>Domain ownership information</p>
             */
            public Builder ownership(NextOwnership ownership) {
                this.ownership = ownership;
                return this;
            }

            /**
             * Qualification.
             */
            public Builder qualification(NextQualification qualification) {
                this.qualification = qualification;
                return this;
            }

            /**
             * <p>Domain resolution information</p>
             */
            public Builder resolution(NextResolution resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * <p>Domain verification information</p>
             */
            public Builder verification(NextVerification verification) {
                this.verification = verification;
                return this;
            }

            public Next build() {
                return new Next(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceDomainsResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
        private Integer currentPageNum;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Next")
        private Next next;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private Boolean nextPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PrePage")
        private Boolean prePage;

        @com.aliyun.core.annotation.NameInMap("ResultLimit")
        private Boolean resultLimit;

        @com.aliyun.core.annotation.NameInMap("TotalItemNum")
        private Integer totalItemNum;

        @com.aliyun.core.annotation.NameInMap("TotalPageNum")
        private Integer totalPageNum;

        private Module(Builder builder) {
            this.currentPageNum = builder.currentPageNum;
            this.data = builder.data;
            this.next = builder.next;
            this.nextPage = builder.nextPage;
            this.pageSize = builder.pageSize;
            this.prePage = builder.prePage;
            this.resultLimit = builder.resultLimit;
            this.totalItemNum = builder.totalItemNum;
            this.totalPageNum = builder.totalPageNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return currentPageNum
         */
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return next
         */
        public Next getNext() {
            return this.next;
        }

        /**
         * @return nextPage
         */
        public Boolean getNextPage() {
            return this.nextPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return prePage
         */
        public Boolean getPrePage() {
            return this.prePage;
        }

        /**
         * @return resultLimit
         */
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        /**
         * @return totalItemNum
         */
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        /**
         * @return totalPageNum
         */
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

        public static final class Builder {
            private Integer currentPageNum; 
            private java.util.List<Data> data; 
            private Next next; 
            private Boolean nextPage; 
            private Integer pageSize; 
            private Boolean prePage; 
            private Boolean resultLimit; 
            private Integer totalItemNum; 
            private Integer totalPageNum; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.currentPageNum = model.currentPageNum;
                this.data = model.data;
                this.next = model.next;
                this.nextPage = model.nextPage;
                this.pageSize = model.pageSize;
                this.prePage = model.prePage;
                this.resultLimit = model.resultLimit;
                this.totalItemNum = model.totalItemNum;
                this.totalPageNum = model.totalPageNum;
            } 

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPageNum(Integer currentPageNum) {
                this.currentPageNum = currentPageNum;
                return this;
            }

            /**
             * <p>Query result.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Decision weight</p>
             */
            public Builder next(Next next) {
                this.next = next;
                return this;
            }

            /**
             * <p>Whether there is a next page.</p>
             */
            public Builder nextPage(Boolean nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Whether there is a previous page</p>
             */
            public Builder prePage(Boolean prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * <p>Apart from pagination limits, the server can process up to the most recent 1000 records. If the result exceeds 1000 records, <strong>ResultLimit</strong> will be <strong>true</strong>, please narrow down the time range and search again; otherwise, <strong>ResultLimit</strong> will be <strong>false</strong>.</p>
             */
            public Builder resultLimit(Boolean resultLimit) {
                this.resultLimit = resultLimit;
                return this;
            }

            /**
             * <p>Total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalItemNum(Integer totalItemNum) {
                this.totalItemNum = totalItemNum;
                return this;
            }

            /**
             * <p>Total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPageNum(Integer totalPageNum) {
                this.totalPageNum = totalPageNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
