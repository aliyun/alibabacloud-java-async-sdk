// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryOperationAuditInfoListRequest} extends {@link RequestModel}
 *
 * <p>QueryOperationAuditInfoListRequest</p>
 */
public class QueryOperationAuditInfoListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    private Integer auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditType")
    private Integer auditType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private QueryOperationAuditInfoListRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.auditType = builder.auditType;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOperationAuditInfoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<QueryOperationAuditInfoListRequest, Builder> {
        private Integer auditStatus; 
        private Integer auditType; 
        private String domainName; 
        private String lang; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryOperationAuditInfoListRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.auditType = request.auditType;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * AuditStatus.
         */
        public Builder auditStatus(Integer auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
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

        @Override
        public QueryOperationAuditInfoListRequest build() {
            return new QueryOperationAuditInfoListRequest(this);
        } 

    } 

}
