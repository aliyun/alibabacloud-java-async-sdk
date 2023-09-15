// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOperationAuditRequest} extends {@link RequestModel}
 *
 * <p>CancelOperationAuditRequest</p>
 */
public class CancelOperationAuditRequest extends Request {
    @Query
    @NameInMap("AuditRecordId")
    @Validation(required = true)
    private Long auditRecordId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private CancelOperationAuditRequest(Builder builder) {
        super(builder);
        this.auditRecordId = builder.auditRecordId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOperationAuditRequest create() {
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

    public static final class Builder extends Request.Builder<CancelOperationAuditRequest, Builder> {
        private Long auditRecordId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(CancelOperationAuditRequest request) {
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
        public CancelOperationAuditRequest build() {
            return new CancelOperationAuditRequest(this);
        } 

    } 

}
