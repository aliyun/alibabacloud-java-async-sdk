// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GenerateTemplateByScratchResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateTemplateByScratchResponseBody</p>
 */
public class GenerateTemplateByScratchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourcesToImport")
    private java.util.List < ResourcesToImport> resourcesToImport;

    @NameInMap("TemplateBody")
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcesToImport
     */
    public java.util.List < ResourcesToImport> getResourcesToImport() {
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
        private java.util.List < ResourcesToImport> resourcesToImport; 
        private String templateBody; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ResourcesToImport.</p>
         */
        public Builder resourcesToImport(java.util.List < ResourcesToImport> resourcesToImport) {
            this.resourcesToImport = resourcesToImport;
            return this;
        }

        /**
         * <p>TemplateBody.</p>
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        public GenerateTemplateByScratchResponseBody build() {
            return new GenerateTemplateByScratchResponseBody(this);
        } 

    } 

    public static class ResourcesToImport extends TeaModel {
        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("ResourceIdentifier")
        private java.util.Map < String, ? > resourceIdentifier;

        @NameInMap("ResourceType")
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
        public java.util.Map < String, ? > getResourceIdentifier() {
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
            private java.util.Map < String, ? > resourceIdentifier; 
            private String resourceType; 

            /**
             * <p>LogicalResourceId.</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>ResourceIdentifier.</p>
             */
            public Builder resourceIdentifier(java.util.Map < String, ? > resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            /**
             * <p>ResourceType.</p>
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
