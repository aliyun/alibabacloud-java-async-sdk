// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitOperationAuditInfoRequest} extends {@link RequestModel}
 *
 * <p>SubmitOperationAuditInfoRequest</p>
 */
public class SubmitOperationAuditInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditInfo")
    private String auditInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer auditType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private SubmitOperationAuditInfoRequest(Builder builder) {
        super(builder);
        this.auditInfo = builder.auditInfo;
        this.auditType = builder.auditType;
        this.domainName = builder.domainName;
        this.id = builder.id;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitOperationAuditInfoRequest create() {
        return builder().build();
    }

    @Override
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
     * @return auditType
     */
    public Integer getAuditType() {
        return this.auditType;
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
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<SubmitOperationAuditInfoRequest, Builder> {
        private String auditInfo; 
        private Integer auditType; 
        private String domainName; 
        private Long id; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(SubmitOperationAuditInfoRequest request) {
            super(request);
            this.auditInfo = request.auditInfo;
            this.auditType = request.auditType;
            this.domainName = request.domainName;
            this.id = request.id;
            this.lang = request.lang;
        } 

        /**
         * AuditInfo.
         */
        public Builder auditInfo(String auditInfo) {
            this.putQueryParameter("AuditInfo", auditInfo);
            this.auditInfo = auditInfo;
            return this;
        }

        /**
         * AuditType.
         */
        public Builder auditType(Integer auditType) {
            this.putQueryParameter("AuditType", auditType);
            this.auditType = auditType;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        @Override
        public SubmitOperationAuditInfoRequest build() {
            return new SubmitOperationAuditInfoRequest(this);
        } 

    } 

}
