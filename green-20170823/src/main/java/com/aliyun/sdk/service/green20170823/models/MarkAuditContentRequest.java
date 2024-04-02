// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MarkAuditContentRequest} extends {@link RequestModel}
 *
 * <p>MarkAuditContentRequest</p>
 */
public class MarkAuditContentRequest extends Request {
    @Query
    @NameInMap("AuditIllegalReasons")
    private String auditIllegalReasons;

    @Query
    @NameInMap("AuditResult")
    private String auditResult;

    @Query
    @NameInMap("BizTypes")
    @Validation(required = true)
    private String bizTypes;

    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private String ids;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private MarkAuditContentRequest(Builder builder) {
        super(builder);
        this.auditIllegalReasons = builder.auditIllegalReasons;
        this.auditResult = builder.auditResult;
        this.bizTypes = builder.bizTypes;
        this.ids = builder.ids;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkAuditContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditIllegalReasons
     */
    public String getAuditIllegalReasons() {
        return this.auditIllegalReasons;
    }

    /**
     * @return auditResult
     */
    public String getAuditResult() {
        return this.auditResult;
    }

    /**
     * @return bizTypes
     */
    public String getBizTypes() {
        return this.bizTypes;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<MarkAuditContentRequest, Builder> {
        private String auditIllegalReasons; 
        private String auditResult; 
        private String bizTypes; 
        private String ids; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(MarkAuditContentRequest request) {
            super(request);
            this.auditIllegalReasons = request.auditIllegalReasons;
            this.auditResult = request.auditResult;
            this.bizTypes = request.bizTypes;
            this.ids = request.ids;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * AuditIllegalReasons.
         */
        public Builder auditIllegalReasons(String auditIllegalReasons) {
            this.putQueryParameter("AuditIllegalReasons", auditIllegalReasons);
            this.auditIllegalReasons = auditIllegalReasons;
            return this;
        }

        /**
         * AuditResult.
         */
        public Builder auditResult(String auditResult) {
            this.putQueryParameter("AuditResult", auditResult);
            this.auditResult = auditResult;
            return this;
        }

        /**
         * BizTypes.
         */
        public Builder bizTypes(String bizTypes) {
            this.putQueryParameter("BizTypes", bizTypes);
            this.bizTypes = bizTypes;
            return this;
        }

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public MarkAuditContentRequest build() {
            return new MarkAuditContentRequest(this);
        } 

    } 

}
