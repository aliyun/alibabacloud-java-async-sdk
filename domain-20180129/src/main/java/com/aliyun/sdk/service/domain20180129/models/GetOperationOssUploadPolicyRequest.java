// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOperationOssUploadPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetOperationOssUploadPolicyRequest</p>
 */
public class GetOperationOssUploadPolicyRequest extends Request {
    @Query
    @NameInMap("AuditType")
    private Integer auditType;

    @Query
    @NameInMap("Lang")
    private String lang;

    private GetOperationOssUploadPolicyRequest(Builder builder) {
        super(builder);
        this.auditType = builder.auditType;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationOssUploadPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditType
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<GetOperationOssUploadPolicyRequest, Builder> {
        private Integer auditType; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(GetOperationOssUploadPolicyRequest response) {
            super(response);
            this.auditType = response.auditType;
            this.lang = response.lang;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public GetOperationOssUploadPolicyRequest build() {
            return new GetOperationOssUploadPolicyRequest(this);
        } 

    } 

}
