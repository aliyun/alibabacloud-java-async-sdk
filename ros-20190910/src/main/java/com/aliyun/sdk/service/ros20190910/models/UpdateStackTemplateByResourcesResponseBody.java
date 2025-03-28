// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateStackTemplateByResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateStackTemplateByResourcesResponseBody</p>
 */
public class UpdateStackTemplateByResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NewTemplateBody")
    private String newTemplateBody;

    @com.aliyun.core.annotation.NameInMap("OldTemplateBody")
    private String oldTemplateBody;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateStackTemplateByResourcesResponseBody(Builder builder) {
        this.newTemplateBody = builder.newTemplateBody;
        this.oldTemplateBody = builder.oldTemplateBody;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackTemplateByResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newTemplateBody
     */
    public String getNewTemplateBody() {
        return this.newTemplateBody;
    }

    /**
     * @return oldTemplateBody
     */
    public String getOldTemplateBody() {
        return this.oldTemplateBody;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String newTemplateBody; 
        private String oldTemplateBody; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateStackTemplateByResourcesResponseBody model) {
            this.newTemplateBody = model.newTemplateBody;
            this.oldTemplateBody = model.oldTemplateBody;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The template content after correction.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;, &quot;Resources&quot;: {&quot;Vpc&quot;: {&quot;Type&quot;: &quot;ALIYUN::ECS::VPC&quot;, &quot;Properties&quot;: {&quot;VpcName&quot;: &quot;test&quot;, &quot;CidrBlock&quot;: &quot;192.168.0.0/16&quot;, &quot;Description&quot;: &quot;test2&quot;}}}, &quot;Outputs&quot;: {&quot;VpcId&quot;: {&quot;Value&quot;: {&quot;Fn::GetAtt&quot;: [&quot;Vpc&quot;, &quot;VpcId&quot;]}}}}</p>
         */
        public Builder newTemplateBody(String newTemplateBody) {
            this.newTemplateBody = newTemplateBody;
            return this;
        }

        /**
         * <p>The template content before correction.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;, &quot;Resources&quot;: {&quot;Vpc&quot;: {&quot;Type&quot;: &quot;ALIYUN::ECS::VPC&quot;, &quot;Properties&quot;: {&quot;VpcName&quot;: &quot;test&quot;, &quot;CidrBlock&quot;: &quot;192.168.0.0/16&quot;, &quot;Description&quot;: &quot;test1&quot;}}}, &quot;Outputs&quot;: {&quot;VpcId&quot;: {&quot;Value&quot;: {&quot;Fn::GetAtt&quot;: [&quot;Vpc&quot;, &quot;VpcId&quot;]}}}}</p>
         */
        public Builder oldTemplateBody(String oldTemplateBody) {
            this.oldTemplateBody = oldTemplateBody;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateStackTemplateByResourcesResponseBody build() {
            return new UpdateStackTemplateByResourcesResponseBody(this);
        } 

    } 

}
