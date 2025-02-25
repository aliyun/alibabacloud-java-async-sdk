// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceResponseBody</p>
 */
public class ListDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Advice")
    private String advice;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Cost")
    private String cost;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDataSourceResponseBody(Builder builder) {
        this.advice = builder.advice;
        this.code = builder.code;
        this.cost = builder.cost;
        this.data = builder.data;
        this.errorDetail = builder.errorDetail;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return advice
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cost
     */
    public String getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String advice; 
        private String code; 
        private String cost; 
        private java.util.List < Data> data; 
        private ErrorDetail errorDetail; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Advice.
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Cost.
         */
        public Builder cost(String cost) {
            this.cost = cost;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorDetail.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataSourceResponseBody build() {
            return new ListDataSourceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Charset")
        private String charset;

        @com.aliyun.core.annotation.NameInMap("Cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("ConnExtraAttributes")
        private Object connExtraAttributes;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperatingSystem")
        private String operatingSystem;

        @com.aliyun.core.annotation.NameInMap("OracleNlsLengthSemantics")
        private String oracleNlsLengthSemantics;

        @com.aliyun.core.annotation.NameInMap("OracleSid")
        private String oracleSid;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private String partnerId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceOwner")
        private String resourceOwner;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Tenant")
        private String tenant;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.charset = builder.charset;
            this.cluster = builder.cluster;
            this.connExtraAttributes = builder.connExtraAttributes;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ip = builder.ip;
            this.name = builder.name;
            this.operatingSystem = builder.operatingSystem;
            this.oracleNlsLengthSemantics = builder.oracleNlsLengthSemantics;
            this.oracleSid = builder.oracleSid;
            this.owner = builder.owner;
            this.partnerId = builder.partnerId;
            this.port = builder.port;
            this.region = builder.region;
            this.resourceOwner = builder.resourceOwner;
            this.role = builder.role;
            this.schema = builder.schema;
            this.tenant = builder.tenant;
            this.timezone = builder.timezone;
            this.type = builder.type;
            this.userName = builder.userName;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return charset
         */
        public String getCharset() {
            return this.charset;
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return connExtraAttributes
         */
        public Object getConnExtraAttributes() {
            return this.connExtraAttributes;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operatingSystem
         */
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        /**
         * @return oracleNlsLengthSemantics
         */
        public String getOracleNlsLengthSemantics() {
            return this.oracleNlsLengthSemantics;
        }

        /**
         * @return oracleSid
         */
        public String getOracleSid() {
            return this.oracleSid;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return partnerId
         */
        public String getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceOwner
         */
        public String getResourceOwner() {
            return this.resourceOwner;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return tenant
         */
        public String getTenant() {
            return this.tenant;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String charset; 
            private String cluster; 
            private Object connExtraAttributes; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private String ip; 
            private String name; 
            private String operatingSystem; 
            private String oracleNlsLengthSemantics; 
            private String oracleSid; 
            private String owner; 
            private String partnerId; 
            private Integer port; 
            private String region; 
            private String resourceOwner; 
            private String role; 
            private String schema; 
            private String tenant; 
            private String timezone; 
            private String type; 
            private String userName; 
            private String version; 
            private String vpcId; 

            /**
             * Charset.
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * Cluster.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * ConnExtraAttributes.
             */
            public Builder connExtraAttributes(Object connExtraAttributes) {
                this.connExtraAttributes = connExtraAttributes;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OperatingSystem.
             */
            public Builder operatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
                return this;
            }

            /**
             * OracleNlsLengthSemantics.
             */
            public Builder oracleNlsLengthSemantics(String oracleNlsLengthSemantics) {
                this.oracleNlsLengthSemantics = oracleNlsLengthSemantics;
                return this;
            }

            /**
             * OracleSid.
             */
            public Builder oracleSid(String oracleSid) {
                this.oracleSid = oracleSid;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(String partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceOwner.
             */
            public Builder resourceOwner(String resourceOwner) {
                this.resourceOwner = resourceOwner;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * Tenant.
             */
            public Builder tenant(String tenant) {
                this.tenant = tenant;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ErrorDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ExtraContext")
        private java.util.Map < String, ? > extraContext;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsContext")
        private java.util.Map < String, String > messageMcmsContext;

        @com.aliyun.core.annotation.NameInMap("MessageMcmsKey")
        private String messageMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Proposal")
        private String proposal;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsContext")
        private java.util.Map < String, String > proposalMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ProposalMcmsKey")
        private String proposalMcmsKey;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsContext")
        private java.util.Map < String, String > reasonMcmsContext;

        @com.aliyun.core.annotation.NameInMap("ReasonMcmsKey")
        private String reasonMcmsKey;

        @com.aliyun.core.annotation.NameInMap("UpstreamErrorDetail")
        private Object upstreamErrorDetail;

        private ErrorDetail(Builder builder) {
            this.code = builder.code;
            this.extraContext = builder.extraContext;
            this.level = builder.level;
            this.message = builder.message;
            this.messageMcmsContext = builder.messageMcmsContext;
            this.messageMcmsKey = builder.messageMcmsKey;
            this.proposal = builder.proposal;
            this.proposalMcmsContext = builder.proposalMcmsContext;
            this.proposalMcmsKey = builder.proposalMcmsKey;
            this.reason = builder.reason;
            this.reasonMcmsContext = builder.reasonMcmsContext;
            this.reasonMcmsKey = builder.reasonMcmsKey;
            this.upstreamErrorDetail = builder.upstreamErrorDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetail create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return extraContext
         */
        public java.util.Map < String, ? > getExtraContext() {
            return this.extraContext;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return messageMcmsContext
         */
        public java.util.Map < String, String > getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        /**
         * @return messageMcmsKey
         */
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        /**
         * @return proposalMcmsContext
         */
        public java.util.Map < String, String > getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        /**
         * @return proposalMcmsKey
         */
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reasonMcmsContext
         */
        public java.util.Map < String, String > getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        /**
         * @return reasonMcmsKey
         */
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        /**
         * @return upstreamErrorDetail
         */
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

        public static final class Builder {
            private String code; 
            private java.util.Map < String, ? > extraContext; 
            private String level; 
            private String message; 
            private java.util.Map < String, String > messageMcmsContext; 
            private String messageMcmsKey; 
            private String proposal; 
            private java.util.Map < String, String > proposalMcmsContext; 
            private String proposalMcmsKey; 
            private String reason; 
            private java.util.Map < String, String > reasonMcmsContext; 
            private String reasonMcmsKey; 
            private Object upstreamErrorDetail; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ExtraContext.
             */
            public Builder extraContext(java.util.Map < String, ? > extraContext) {
                this.extraContext = extraContext;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
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
             * MessageMcmsContext.
             */
            public Builder messageMcmsContext(java.util.Map < String, String > messageMcmsContext) {
                this.messageMcmsContext = messageMcmsContext;
                return this;
            }

            /**
             * MessageMcmsKey.
             */
            public Builder messageMcmsKey(String messageMcmsKey) {
                this.messageMcmsKey = messageMcmsKey;
                return this;
            }

            /**
             * Proposal.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            /**
             * ProposalMcmsContext.
             */
            public Builder proposalMcmsContext(java.util.Map < String, String > proposalMcmsContext) {
                this.proposalMcmsContext = proposalMcmsContext;
                return this;
            }

            /**
             * ProposalMcmsKey.
             */
            public Builder proposalMcmsKey(String proposalMcmsKey) {
                this.proposalMcmsKey = proposalMcmsKey;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReasonMcmsContext.
             */
            public Builder reasonMcmsContext(java.util.Map < String, String > reasonMcmsContext) {
                this.reasonMcmsContext = reasonMcmsContext;
                return this;
            }

            /**
             * ReasonMcmsKey.
             */
            public Builder reasonMcmsKey(String reasonMcmsKey) {
                this.reasonMcmsKey = reasonMcmsKey;
                return this;
            }

            /**
             * UpstreamErrorDetail.
             */
            public Builder upstreamErrorDetail(Object upstreamErrorDetail) {
                this.upstreamErrorDetail = upstreamErrorDetail;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
