// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOperationAuditInfoDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryOperationAuditInfoDetailRequest</p>
 */
public class QueryOperationAuditInfoDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditRecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long auditRecordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private QueryOperationAuditInfoDetailRequest(Builder builder) {
        super(builder);
        this.auditRecordId = builder.auditRecordId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOperationAuditInfoDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditRecordId
     */
    public Long getAuditRecordId() {
        return this.auditRecordId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<QueryOperationAuditInfoDetailRequest, Builder> {
        private Long auditRecordId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(QueryOperationAuditInfoDetailRequest request) {
            super(request);
            this.auditRecordId = request.auditRecordId;
            this.lang = request.lang;
        } 

        /**
         * AuditRecordId.
         */
        public Builder auditRecordId(Long auditRecordId) {
            this.putQueryParameter("AuditRecordId", auditRecordId);
            this.auditRecordId = auditRecordId;
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
        public QueryOperationAuditInfoDetailRequest build() {
            return new QueryOperationAuditInfoDetailRequest(this);
        } 

    } 

}
