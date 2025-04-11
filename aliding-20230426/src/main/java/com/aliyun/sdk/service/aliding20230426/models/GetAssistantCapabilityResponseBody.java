// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetAssistantCapabilityResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssistantCapabilityResponseBody</p>
 */
public class GetAssistantCapabilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("assistantDescription")
    private String assistantDescription;

    @com.aliyun.core.annotation.NameInMap("canHandle")
    private Boolean canHandle;

    @com.aliyun.core.annotation.NameInMap("capabilityAssessment")
    private CapabilityAssessment capabilityAssessment;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAssistantCapabilityResponseBody(Builder builder) {
        this.assistantDescription = builder.assistantDescription;
        this.canHandle = builder.canHandle;
        this.capabilityAssessment = builder.capabilityAssessment;
        this.id = builder.id;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssistantCapabilityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assistantDescription
     */
    public String getAssistantDescription() {
        return this.assistantDescription;
    }

    /**
     * @return canHandle
     */
    public Boolean getCanHandle() {
        return this.canHandle;
    }

    /**
     * @return capabilityAssessment
     */
    public CapabilityAssessment getCapabilityAssessment() {
        return this.capabilityAssessment;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String assistantDescription; 
        private Boolean canHandle; 
        private CapabilityAssessment capabilityAssessment; 
        private String id; 
        private java.util.Map<String, ?> metadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAssistantCapabilityResponseBody model) {
            this.assistantDescription = model.assistantDescription;
            this.canHandle = model.canHandle;
            this.capabilityAssessment = model.capabilityAssessment;
            this.id = model.id;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
        } 

        /**
         * assistantDescription.
         */
        public Builder assistantDescription(String assistantDescription) {
            this.assistantDescription = assistantDescription;
            return this;
        }

        /**
         * canHandle.
         */
        public Builder canHandle(Boolean canHandle) {
            this.canHandle = canHandle;
            return this;
        }

        /**
         * capabilityAssessment.
         */
        public Builder capabilityAssessment(CapabilityAssessment capabilityAssessment) {
            this.capabilityAssessment = capabilityAssessment;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAssistantCapabilityResponseBody build() {
            return new GetAssistantCapabilityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAssistantCapabilityResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssistantCapabilityResponseBody</p>
     */
    public static class CapabilityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capabilityOverview")
        private String capabilityOverview;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private CapabilityList(Builder builder) {
            this.capabilityOverview = builder.capabilityOverview;
            this.description = builder.description;
            this.metadata = builder.metadata;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapabilityList create() {
            return builder().build();
        }

        /**
         * @return capabilityOverview
         */
        public String getCapabilityOverview() {
            return this.capabilityOverview;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String capabilityOverview; 
            private String description; 
            private java.util.Map<String, ?> metadata; 
            private String name; 

            private Builder() {
            } 

            private Builder(CapabilityList model) {
                this.capabilityOverview = model.capabilityOverview;
                this.description = model.description;
                this.metadata = model.metadata;
                this.name = model.name;
            } 

            /**
             * capabilityOverview.
             */
            public Builder capabilityOverview(String capabilityOverview) {
                this.capabilityOverview = capabilityOverview;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * metadata.
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CapabilityList build() {
                return new CapabilityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAssistantCapabilityResponseBody} extends {@link TeaModel}
     *
     * <p>GetAssistantCapabilityResponseBody</p>
     */
    public static class CapabilityAssessment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("briefCapability")
        private String briefCapability;

        @com.aliyun.core.annotation.NameInMap("capabilityList")
        private java.util.List<CapabilityList> capabilityList;

        private CapabilityAssessment(Builder builder) {
            this.briefCapability = builder.briefCapability;
            this.capabilityList = builder.capabilityList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapabilityAssessment create() {
            return builder().build();
        }

        /**
         * @return briefCapability
         */
        public String getBriefCapability() {
            return this.briefCapability;
        }

        /**
         * @return capabilityList
         */
        public java.util.List<CapabilityList> getCapabilityList() {
            return this.capabilityList;
        }

        public static final class Builder {
            private String briefCapability; 
            private java.util.List<CapabilityList> capabilityList; 

            private Builder() {
            } 

            private Builder(CapabilityAssessment model) {
                this.briefCapability = model.briefCapability;
                this.capabilityList = model.capabilityList;
            } 

            /**
             * briefCapability.
             */
            public Builder briefCapability(String briefCapability) {
                this.briefCapability = briefCapability;
                return this;
            }

            /**
             * capabilityList.
             */
            public Builder capabilityList(java.util.List<CapabilityList> capabilityList) {
                this.capabilityList = capabilityList;
                return this;
            }

            public CapabilityAssessment build() {
                return new CapabilityAssessment(this);
            } 

        } 

    }
}
