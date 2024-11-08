// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidateTemplateContentRequest} extends {@link RequestModel}
 *
 * <p>ValidateTemplateContentRequest</p>
 */
public class ValidateTemplateContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    private ValidateTemplateContentRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.regionId = builder.regionId;
        this.templateURL = builder.templateURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTemplateContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    public static final class Builder extends Request.Builder<ValidateTemplateContentRequest, Builder> {
        private String content; 
        private String regionId; 
        private String templateURL; 

        private Builder() {
            super();
        } 

        private Builder(ValidateTemplateContentRequest request) {
            super(request);
            this.content = request.content;
            this.regionId = request.regionId;
            this.templateURL = request.templateURL;
        } 

        /**
         * <p>The content of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FormatVersion&quot;: &quot;OOS-2019-06-01&quot;, &quot;Description&quot;: &quot;Describe instances of given status&quot;, &quot;Parameters&quot;: {&quot;Status&quot;: {&quot;Type&quot;: &quot;String&quot;, &quot;Description&quot;: &quot;(Required) The status of the Ecs instance.&quot;}}, &quot;Tasks&quot;: [{&quot;Properties&quot;: {&quot;Parameters&quot;: {&quot;Status&quot;: &quot;{{ Status }}&quot;}, &quot;API&quot;: &quot;DescribeInstances&quot;, &quot;Service&quot;: &quot;Ecs&quot;}, &quot;Name&quot;: &quot;foo&quot;, &quot;Action&quot;: &quot;ACS::ExecuteApi&quot;}]}</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The URL that is used to store the content of the Operation Orchestration Service (OOS) template in the Alibaba Cloud Object Storage Service (OSS). Only the public-read URL is supported. You can use this parameter to specify the tasks that you want to run. This way, you do not need to create a template before you start an execution. If you select an existing template, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>http:/oos-template.cn-hangzhou.oss.aliyun-inc.com/oos-template.json</p>
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        @Override
        public ValidateTemplateContentRequest build() {
            return new ValidateTemplateContentRequest(this);
        } 

    } 

}
