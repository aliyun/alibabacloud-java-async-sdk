// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceInformationRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceInformationRequest</p>
 */
public class UpdateResourceInformationRequest extends Request {
    @Body
    @NameInMap("Information")
    private java.util.List < Information> information;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("ResourceAttribute")
    private String resourceAttribute;

    @Body
    @NameInMap("ResourceInformationId")
    @Validation(required = true)
    private String resourceInformationId;

    @Body
    @NameInMap("ResourceType")
    private String resourceType;

    private UpdateResourceInformationRequest(Builder builder) {
        super(builder);
        this.information = builder.information;
        this.instanceId = builder.instanceId;
        this.resourceAttribute = builder.resourceAttribute;
        this.resourceInformationId = builder.resourceInformationId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceInformationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return information
     */
    public java.util.List < Information> getInformation() {
        return this.information;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<UpdateResourceInformationRequest, Builder> {
        private java.util.List < Information> information; 
        private String instanceId; 
        private String resourceAttribute; 
        private String resourceInformationId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceInformationRequest request) {
            super(request);
            this.information = request.information;
            this.instanceId = request.instanceId;
            this.resourceAttribute = request.resourceAttribute;
            this.resourceInformationId = request.resourceInformationId;
            this.resourceType = request.resourceType;
        } 

        /**
         * 信息
         */
        public Builder information(java.util.List < Information> information) {
            String informationShrink = shrink(information, "Information", "json");
            this.putBodyParameter("Information", informationShrink);
            this.information = information;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 资源属性
         */
        public Builder resourceAttribute(String resourceAttribute) {
            this.putBodyParameter("ResourceAttribute", resourceAttribute);
            this.resourceAttribute = resourceAttribute;
            return this;
        }

        /**
         * ResourceInformationId.
         */
        public Builder resourceInformationId(String resourceInformationId) {
            this.putBodyParameter("ResourceInformationId", resourceInformationId);
            this.resourceInformationId = resourceInformationId;
            return this;
        }

        /**
         * 资源类型
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public UpdateResourceInformationRequest build() {
            return new UpdateResourceInformationRequest(this);
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

        @NameInMap("SetupProjectId")
        private String setupProjectId;

        private Information(Builder builder) {
            this.key = builder.key;
            this.keyAction = builder.keyAction;
            this.keyAttribute = builder.keyAttribute;
            this.keyDescription = builder.keyDescription;
            this.setupProjectId = builder.setupProjectId;
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

        /**
         * @return setupProjectId
         */
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        public static final class Builder {
            private String key; 
            private String keyAction; 
            private String keyAttribute; 
            private String keyDescription; 
            private String setupProjectId; 

            /**
             * 键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 键动作
             */
            public Builder keyAction(String keyAction) {
                this.keyAction = keyAction;
                return this;
            }

            /**
             * 键属性
             */
            public Builder keyAttribute(String keyAttribute) {
                this.keyAttribute = keyAttribute;
                return this;
            }

            /**
             * 键描述
             */
            public Builder keyDescription(String keyDescription) {
                this.keyDescription = keyDescription;
                return this;
            }

            /**
             * 建设项目id
             */
            public Builder setupProjectId(String setupProjectId) {
                this.setupProjectId = setupProjectId;
                return this;
            }

            public Information build() {
                return new Information(this);
            } 

        } 

    }
}
