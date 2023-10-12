// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceInformation} extends {@link TeaModel}
 *
 * <p>ResourceInformation</p>
 */
public class ResourceInformation extends TeaModel {
    @NameInMap("ArchitectureId")
    private String architectureId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Information")
    private java.util.List < Information> information;

    @NameInMap("ResourceAttribute")
    private String resourceAttribute;

    @NameInMap("ResourceInformationId")
    private String resourceInformationId;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("SetupProjectId")
    private String setupProjectId;

    @NameInMap("UpdateTime")
    private String updateTime;

    private ResourceInformation(Builder builder) {
        this.architectureId = builder.architectureId;
        this.createTime = builder.createTime;
        this.information = builder.information;
        this.resourceAttribute = builder.resourceAttribute;
        this.resourceInformationId = builder.resourceInformationId;
        this.resourceType = builder.resourceType;
        this.setupProjectId = builder.setupProjectId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceInformation create() {
        return builder().build();
    }

    /**
     * @return architectureId
     */
    public String getArchitectureId() {
        return this.architectureId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return information
     */
    public java.util.List < Information> getInformation() {
        return this.information;
    }

    /**
     * @return resourceAttribute
     */
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    /**
     * @return resourceInformationId
     */
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String architectureId; 
        private String createTime; 
        private java.util.List < Information> information; 
        private String resourceAttribute; 
        private String resourceInformationId; 
        private String resourceType; 
        private String setupProjectId; 
        private String updateTime; 

        /**
         * ArchitectureId.
         */
        public Builder architectureId(String architectureId) {
            this.architectureId = architectureId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Information.
         */
        public Builder information(java.util.List < Information> information) {
            this.information = information;
            return this;
        }

        /**
         * ResourceAttribute.
         */
        public Builder resourceAttribute(String resourceAttribute) {
            this.resourceAttribute = resourceAttribute;
            return this;
        }

        /**
         * ResourceInformationId.
         */
        public Builder resourceInformationId(String resourceInformationId) {
            this.resourceInformationId = resourceInformationId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ResourceInformation build() {
            return new ResourceInformation(this);
        } 

    } 

    public static class Information extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("KeyAction")
        private String keyAction;

        @NameInMap("KeyAttribute")
        private String keyAttribute;

        @NameInMap("KeyDescription")
        private String keyDescription;

        private Information(Builder builder) {
            this.key = builder.key;
            this.keyAction = builder.keyAction;
            this.keyAttribute = builder.keyAttribute;
            this.keyDescription = builder.keyDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Information create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyAction
         */
        public String getKeyAction() {
            return this.keyAction;
        }

        /**
         * @return keyAttribute
         */
        public String getKeyAttribute() {
            return this.keyAttribute;
        }

        /**
         * @return keyDescription
         */
        public String getKeyDescription() {
            return this.keyDescription;
        }

        public static final class Builder {
            private String key; 
            private String keyAction; 
            private String keyAttribute; 
            private String keyDescription; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * KeyAction.
             */
            public Builder keyAction(String keyAction) {
                this.keyAction = keyAction;
                return this;
            }

            /**
             * KeyAttribute.
             */
            public Builder keyAttribute(String keyAttribute) {
                this.keyAttribute = keyAttribute;
                return this;
            }

            /**
             * KeyDescription.
             */
            public Builder keyDescription(String keyDescription) {
                this.keyDescription = keyDescription;
                return this;
            }

            public Information build() {
                return new Information(this);
            } 

        } 

    }
}
