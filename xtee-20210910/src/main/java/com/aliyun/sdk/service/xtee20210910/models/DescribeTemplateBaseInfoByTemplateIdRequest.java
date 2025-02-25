// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateBaseInfoByTemplateIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplateBaseInfoByTemplateIdRequest</p>
 */
public class DescribeTemplateBaseInfoByTemplateIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateId")
    private Long templateId;

    private DescribeTemplateBaseInfoByTemplateIdRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateBaseInfoByTemplateIdRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeTemplateBaseInfoByTemplateIdRequest, Builder> {
        private String lang; 
        private String regId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplateBaseInfoByTemplateIdRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * templateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeTemplateBaseInfoByTemplateIdRequest build() {
            return new DescribeTemplateBaseInfoByTemplateIdRequest(this);
        } 

    } 

}
