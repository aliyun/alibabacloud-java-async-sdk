// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryOperationAuditInfoDetailResponseBody model) {
            this.auditInfo = model.auditInfo;
            this.auditStatus = model.auditStatus;
            this.auditType = model.auditType;
            this.businessName = model.businessName;
            this.createTime = model.createTime;
            this.domainName = model.domainName;
            this.id = model.id;
            this.remark = model.remark;
            this.requestId = model.requestId;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>Review information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regType&quot;:1,&quot;registrantName&quot;:&quot;张三&quot;,&quot;telephone&quot;:&quot;1390123****&quot;,&quot;account&quot;:&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;,&quot;reason&quot;:1,&quot;remark&quot;:&quot;账号丢失&quot;}</p>
         */
        public Builder auditInfo(String auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * <p>Review Status. Valid values:  </p>
         * <ul>
         * <li><strong>0</strong>: Pending supplementary information.  </li>
         * <li><strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>: Under review.  </li>
         * <li><strong>5</strong>: Review failed.  </li>
         * <li><strong>6</strong>: Review succeeded.  </li>
         * <li><strong>7</strong>: Review canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder auditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * <p>Review Type. Valid value:  </p>
         * <p><strong>1</strong>: Offline domain name transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder auditType(Integer auditType) {
            this.auditType = auditType;
            return this;
        }

        /**
         * <p>Name of the reviewed business.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com等域名线下转移</p>
         */
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        /**
         * <p>Record creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1581919010100</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Review record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Review remark.</p>
         * 
         * <strong>example:</strong>
         * <p>审核通过</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-40EC-8035-4B12FEFD7D1L</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Record update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1581919010101</p>
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
