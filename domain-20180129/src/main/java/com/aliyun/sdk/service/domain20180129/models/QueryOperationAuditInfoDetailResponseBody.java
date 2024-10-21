// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryOperationAuditInfoDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOperationAuditInfoDetailResponseBody</p>
 */
public class QueryOperationAuditInfoDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private String auditInfo;

    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    private Integer auditStatus;

    @com.aliyun.core.annotation.NameInMap("AuditType")
    private Integer auditType;

    @com.aliyun.core.annotation.NameInMap("BusinessName")
    private String businessName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

    private QueryOperationAuditInfoDetailResponseBody(Builder builder) {
        this.auditInfo = builder.auditInfo;
        this.auditStatus = builder.auditStatus;
        this.auditType = builder.auditType;
        this.businessName = builder.businessName;
        this.createTime = builder.createTime;
        this.domainName = builder.domainName;
        this.id = builder.id;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOperationAuditInfoDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditInfo
     */
    public String getAuditInfo() {
        return this.auditInfo;
    }

    /**
     * @return auditStatus
     */
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return auditType
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * @return businessName
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String auditInfo; 
        private Integer auditStatus; 
        private Integer auditType; 
        private String businessName; 
        private Long createTime; 
        private String domainName; 
        private String id; 
        private String remark; 
        private String requestId; 
        private Long updateTime; 

        /**
         * AuditInfo.
         */
        public Builder auditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * AuditStatus.
         */
        public Builder auditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * AuditType.
         */
        public Builder auditType(Integer auditType) {
            this.auditType = auditType;
            return this;
        }

        /**
         * BusinessName.
         */
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
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
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public QueryOperationAuditInfoDetailResponseBody build() {
            return new QueryOperationAuditInfoDetailResponseBody(this);
        } 

    } 

}
