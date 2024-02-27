// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskLevelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskLevelsRequest</p>
 */
public class DescribeRiskLevelsRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    private DescribeRiskLevelsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskLevelsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRiskLevelsRequest, Builder> {
        private String lang; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskLevelsRequest request) {
            super(request);
            this.lang = request.lang;
            this.templateId = request.templateId;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   zh_cn: Chinese (default)
         * *   en_us: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the industry-specific rule template.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeRiskLevelsRequest build() {
            return new DescribeRiskLevelsRequest(this);
        } 

    } 

}
