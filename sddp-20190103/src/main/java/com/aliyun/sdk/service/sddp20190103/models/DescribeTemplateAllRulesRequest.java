// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateAllRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplateAllRulesRequest</p>
 */
public class DescribeTemplateAllRulesRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    private DescribeTemplateAllRulesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateAllRulesRequest create() {
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeTemplateAllRulesRequest, Builder> {
        private String lang; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplateAllRulesRequest request) {
            super(request);
            this.lang = request.lang;
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
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeTemplateAllRulesRequest build() {
            return new DescribeTemplateAllRulesRequest(this);
        } 

    } 

}
