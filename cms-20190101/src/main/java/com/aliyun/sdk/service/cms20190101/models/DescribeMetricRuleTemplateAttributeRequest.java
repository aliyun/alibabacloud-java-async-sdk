// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleTemplateAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricRuleTemplateAttributeRequest</p>
 */
public class DescribeMetricRuleTemplateAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
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
         * <p>The name of the alert template. You must specify at least one of the <code>Name</code> and <code>TemplateId</code> parameters.</p>
         * <p>For information about how to obtain the name of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Template1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the alert template. You must specify at least one of the <code>Name</code> and <code>TemplateId</code> parameters.</p>
         * <p>For information about how to obtain the ID of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>70****</p>
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
