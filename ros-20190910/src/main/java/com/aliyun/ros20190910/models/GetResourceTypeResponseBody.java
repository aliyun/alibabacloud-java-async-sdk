// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTypeResponseBody</p>
 */
public class GetResourceTypeResponseBody extends TeaModel {
    @NameInMap("Attributes")
    private java.util.Map < String, ? > attributes;

    @NameInMap("Properties")
    private java.util.Map < String, ? > properties;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("SupportDriftDetection")
    private Boolean supportDriftDetection;

    @NameInMap("SupportScratchDetection")
    private Boolean supportScratchDetection;


    private GetResourceTypeResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.properties = builder.properties;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.supportDriftDetection = builder.supportDriftDetection;
        this.supportScratchDetection = builder.supportScratchDetection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.Map < String, ? > getAttributes() {
        return this.attributes;
    }

    /**
     * @return properties
     */
    public java.util.Map < String, ? > getProperties() {
        return this.properties;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return supportDriftDetection
     */
    public Boolean getSupportDriftDetection() {
        return this.supportDriftDetection;
    }

    /**
     * @return supportScratchDetection
     */
    public Boolean getSupportScratchDetection() {
        return this.supportScratchDetection;
    }

    public static final class Builder {
        private java.util.Map < String, ? > attributes; 
        private java.util.Map < String, ? > properties; 
        private String requestId; 
        private String resourceType; 
        private Boolean supportDriftDetection; 
        private Boolean supportScratchDetection; 

        /**
         * <p>Attributes.</p>
         */
        public Builder attributes(java.util.Map < String, ? > attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>Properties.</p>
         */
        public Builder properties(java.util.Map < String, ? > properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ResourceType.</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>SupportDriftDetection.</p>
         */
        public Builder supportDriftDetection(Boolean supportDriftDetection) {
            this.supportDriftDetection = supportDriftDetection;
            return this;
        }

        /**
         * <p>SupportScratchDetection.</p>
         */
        public Builder supportScratchDetection(Boolean supportScratchDetection) {
            this.supportScratchDetection = supportScratchDetection;
            return this;
        }

        public GetResourceTypeResponseBody build() {
            return new GetResourceTypeResponseBody(this);
        } 

    } 

}
