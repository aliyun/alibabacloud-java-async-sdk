// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceInformationRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceInformationRequest</p>
 */
public class CreateResourceInformationRequest extends Request {
    @Body
    @NameInMap("ArchitectureId")
    private String architectureId;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

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
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private CreateResourceInformationRequest(Builder builder) {
        super(builder);
        this.architectureId = builder.architectureId;
        this.clientToken = builder.clientToken;
        this.information = builder.information;
        this.instanceId = builder.instanceId;
        this.resourceAttribute = builder.resourceAttribute;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceInformationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architectureId
     */
    public String getArchitectureId() {
        return this.architectureId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<CreateResourceInformationRequest, Builder> {
        private String architectureId; 
        private String clientToken; 
        private java.util.List < Information> information; 
        private String instanceId; 
        private String resourceAttribute; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceInformationRequest request) {
            super(request);
            this.architectureId = request.architectureId;
            this.clientToken = request.clientToken;
            this.information = request.information;
            this.instanceId = request.instanceId;
            this.resourceAttribute = request.resourceAttribute;
            this.resourceType = request.resourceType;
        } 

        /**
         * ArchitectureId.
         */
        public Builder architectureId(String architectureId) {
            this.putBodyParameter("ArchitectureId", architectureId);
            this.architectureId = architectureId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 信息
         */
        public Builder information(java.util.List < Information> information) {
            this.putBodyParameter("Information", information);
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
         * 资源类型
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public CreateResourceInformationRequest build() {
            return new CreateResourceInformationRequest(this);
        } 

    } 

    public static class Information extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
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

            public Information build() {
                return new Information(this);
            } 

        } 

    }
}
