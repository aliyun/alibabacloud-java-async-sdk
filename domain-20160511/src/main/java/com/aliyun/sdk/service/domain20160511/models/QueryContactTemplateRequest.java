// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link QueryContactTemplateRequest} extends {@link RequestModel}
 *
 * <p>QueryContactTemplateRequest</p>
 */
public class QueryContactTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    private String auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CCompany")
    private String cCompany;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    private Long contactTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultTemplate")
    private Boolean defaultTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ECompany")
    private String eCompany;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegType")
    private String regType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryContactTemplateRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.cCompany = builder.cCompany;
        this.contactTemplateId = builder.contactTemplateId;
        this.defaultTemplate = builder.defaultTemplate;
        this.eCompany = builder.eCompany;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.regType = builder.regType;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryContactTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return cCompany
     */
    public String getCCompany() {
        return this.cCompany;
    }

    /**
     * @return contactTemplateId
     */
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    /**
     * @return defaultTemplate
     */
    public Boolean getDefaultTemplate() {
        return this.defaultTemplate;
    }

    /**
     * @return eCompany
     */
    public String getECompany() {
        return this.eCompany;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regType
     */
    public String getRegType() {
        return this.regType;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryContactTemplateRequest, Builder> {
        private String auditStatus; 
        private String cCompany; 
        private Long contactTemplateId; 
        private Boolean defaultTemplate; 
        private String eCompany; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String regType; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryContactTemplateRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.cCompany = request.cCompany;
            this.contactTemplateId = request.contactTemplateId;
            this.defaultTemplate = request.defaultTemplate;
            this.eCompany = request.eCompany;
            this.lang = request.lang;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.regType = request.regType;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * AuditStatus.
         */
        public Builder auditStatus(String auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * CCompany.
         */
        public Builder cCompany(String cCompany) {
            this.putQueryParameter("CCompany", cCompany);
            this.cCompany = cCompany;
            return this;
        }

        /**
         * ContactTemplateId.
         */
        public Builder contactTemplateId(Long contactTemplateId) {
            this.putQueryParameter("ContactTemplateId", contactTemplateId);
            this.contactTemplateId = contactTemplateId;
            return this;
        }

        /**
         * DefaultTemplate.
         */
        public Builder defaultTemplate(Boolean defaultTemplate) {
            this.putQueryParameter("DefaultTemplate", defaultTemplate);
            this.defaultTemplate = defaultTemplate;
            return this;
        }

        /**
         * ECompany.
         */
        public Builder eCompany(String eCompany) {
            this.putQueryParameter("ECompany", eCompany);
            this.eCompany = eCompany;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegType.
         */
        public Builder regType(String regType) {
            this.putQueryParameter("RegType", regType);
            this.regType = regType;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryContactTemplateRequest build() {
            return new QueryContactTemplateRequest(this);
        } 

    } 

}
