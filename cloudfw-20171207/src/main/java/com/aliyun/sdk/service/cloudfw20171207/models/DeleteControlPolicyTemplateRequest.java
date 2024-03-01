// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteControlPolicyTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteControlPolicyTemplateRequest</p>
 */
public class DeleteControlPolicyTemplateRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private DeleteControlPolicyTemplateRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteControlPolicyTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DeleteControlPolicyTemplateRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteControlPolicyTemplateRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.templateId = request.templateId;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteControlPolicyTemplateRequest build() {
            return new DeleteControlPolicyTemplateRequest(this);
        } 

    } 

}
