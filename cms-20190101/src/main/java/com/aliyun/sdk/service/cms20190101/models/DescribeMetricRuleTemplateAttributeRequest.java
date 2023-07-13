// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleTemplateAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleTemplateAttributeRequest</p>
 */
public class DescribeMetricRuleTemplateAttributeRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    private DescribeMetricRuleTemplateAttributeRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleTemplateAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeMetricRuleTemplateAttributeRequest, Builder> {
        private String name; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricRuleTemplateAttributeRequest request) {
            super(request);
            this.name = request.name;
            this.templateId = request.templateId;
        } 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The error message.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeMetricRuleTemplateAttributeRequest build() {
            return new DescribeMetricRuleTemplateAttributeRequest(this);
        } 

    } 

}
