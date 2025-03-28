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
 * {@link GenerateTemplateByScratchResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTemplateByScratchResponseBody</p>
 */
public class GenerateTemplateByScratchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcesToImport")
    private java.util.List<ResourcesToImport> resourcesToImport;

    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    private GenerateTemplateByScratchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcesToImport = builder.resourcesToImport;
        this.templateBody = builder.templateBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTemplateByScratchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcesToImport
     */
    public java.util.List<ResourcesToImport> getResourcesToImport() {
        return this.resourcesToImport;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourcesToImport> resourcesToImport; 
        private String templateBody; 

        private Builder() {
        } 

        private Builder(GenerateTemplateByScratchResponseBody model) {
            this.requestId = model.requestId;
            this.resourcesToImport = model.resourcesToImport;
            this.templateBody = model.templateBody;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D22C1D13-D74E-558C-AF68-1B4C05FA6F1A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources that you want to import into a stack in the resource management scenario.</p>
         * <blockquote>
         * <p>This parameter is returned only for a resource management scenario.</p>
         * </blockquote>
         */
        public Builder resourcesToImport(java.util.List<ResourcesToImport> resourcesToImport) {
            this.resourcesToImport = resourcesToImport;
            return this;
        }

        /**
         * <p>The template content of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;, &quot;Resources&quot;: {&quot;ECSVPC_001&quot;: {&quot;DeletionPolicy&quot;: &quot;Retain&quot;, &quot;Type&quot;: &quot;ALIYUN::ECS::VPC&quot;, &quot;Properties&quot;: {&quot;CidrBlock&quot;: &quot;172.16.0.0/12&quot;, &quot;VpcName&quot;: &quot;MyTestVpc&quot;, &quot;EnableIpv6&quot;: false}}}}</p>
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        public GenerateTemplateByScratchResponseBody build() {
            return new GenerateTemplateByScratchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateTemplateByScratchResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateTemplateByScratchResponseBody</p>
     */
    public static class ResourcesToImport extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceIdentifier")
        private java.util.Map<String, ?> resourceIdentifier;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ResourcesToImport(Builder builder) {
            this.logicalResourceId = builder.logicalResourceId;
            this.resourceIdentifier = builder.resourceIdentifier;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesToImport create() {
            return builder().build();
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return resourceIdentifier
         */
        public java.util.Map<String, ?> getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String logicalResourceId; 
            private java.util.Map<String, ?> resourceIdentifier; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourcesToImport model) {
                this.logicalResourceId = model.logicalResourceId;
                this.resourceIdentifier = model.resourceIdentifier;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The logical ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ECSVPC_001</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The key-value mapping between strings. The value is a JSON string that identifies the resource that you want to import into a stack.<br>A key is an identifier for a resource, and a value is an assignment of data to the key. For example, VpcId is a key that indicates the ID of a virtual private cloud (VPC), and <code>vpc-bp1m6fww66xbntjyc****&quot;</code> is a value that is assigned to VpcId.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VpcId&quot;: &quot;vpc-bp1m6fww66xbntjyc****&quot; }</p>
             */
            public Builder resourceIdentifier(java.util.Map<String, ?> resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::VPC</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourcesToImport build() {
                return new ResourcesToImport(this);
            } 

        } 

    }
}
