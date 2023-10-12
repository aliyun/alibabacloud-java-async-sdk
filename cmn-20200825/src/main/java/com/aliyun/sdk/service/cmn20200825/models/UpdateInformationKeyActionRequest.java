// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInformationKeyActionRequest} extends {@link RequestModel}
 *
 * <p>UpdateInformationKeyActionRequest</p>
 */
public class UpdateInformationKeyActionRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Key")
    private String key;

    @Query
    @NameInMap("KeyAction")
    private String keyAction;

    @Query
    @NameInMap("ResourceInformationId")
    private String resourceInformationId;

    @Query
    @NameInMap("SetupProjectId")
    private String setupProjectId;

    @Query
    @NameInMap("Value")
    private String value;

    private UpdateInformationKeyActionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.key = builder.key;
        this.keyAction = builder.keyAction;
        this.resourceInformationId = builder.resourceInformationId;
        this.setupProjectId = builder.setupProjectId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInformationKeyActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return resourceInformationId
     */
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateInformationKeyActionRequest, Builder> {
        private String instanceId; 
        private String key; 
        private String keyAction; 
        private String resourceInformationId; 
        private String setupProjectId; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInformationKeyActionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.key = request.key;
            this.keyAction = request.keyAction;
            this.resourceInformationId = request.resourceInformationId;
            this.setupProjectId = request.setupProjectId;
            this.value = request.value;
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
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * KeyAction.
         */
        public Builder keyAction(String keyAction) {
            this.putQueryParameter("KeyAction", keyAction);
            this.keyAction = keyAction;
            return this;
        }

        /**
         * ResourceInformationId.
         */
        public Builder resourceInformationId(String resourceInformationId) {
            this.putQueryParameter("ResourceInformationId", resourceInformationId);
            this.resourceInformationId = resourceInformationId;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putQueryParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateInformationKeyActionRequest build() {
            return new UpdateInformationKeyActionRequest(this);
        } 

    } 

}
