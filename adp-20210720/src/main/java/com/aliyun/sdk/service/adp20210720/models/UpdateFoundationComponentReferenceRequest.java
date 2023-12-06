// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFoundationComponentReferenceRequest} extends {@link RequestModel}
 *
 * <p>UpdateFoundationComponentReferenceRequest</p>
 */
public class UpdateFoundationComponentReferenceRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("componentReferenceUID")
    @Validation(required = true)
    private String componentReferenceUID;

    @Body
    @NameInMap("componentOrchestrationValues")
    private String componentOrchestrationValues;

    @Body
    @NameInMap("enable")
    private Boolean enable;

    private UpdateFoundationComponentReferenceRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.componentReferenceUID = builder.componentReferenceUID;
        this.componentOrchestrationValues = builder.componentOrchestrationValues;
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFoundationComponentReferenceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return componentReferenceUID
     */
    public String getComponentReferenceUID() {
        return this.componentReferenceUID;
    }

    /**
     * @return componentOrchestrationValues
     */
    public String getComponentOrchestrationValues() {
        return this.componentOrchestrationValues;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    public static final class Builder extends Request.Builder<UpdateFoundationComponentReferenceRequest, Builder> {
        private String uid; 
        private String componentReferenceUID; 
        private String componentOrchestrationValues; 
        private Boolean enable; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFoundationComponentReferenceRequest request) {
            super(request);
            this.uid = request.uid;
            this.componentReferenceUID = request.componentReferenceUID;
            this.componentOrchestrationValues = request.componentOrchestrationValues;
            this.enable = request.enable;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * componentReferenceUID.
         */
        public Builder componentReferenceUID(String componentReferenceUID) {
            this.putPathParameter("componentReferenceUID", componentReferenceUID);
            this.componentReferenceUID = componentReferenceUID;
            return this;
        }

        /**
         * componentOrchestrationValues.
         */
        public Builder componentOrchestrationValues(String componentOrchestrationValues) {
            this.putBodyParameter("componentOrchestrationValues", componentOrchestrationValues);
            this.componentOrchestrationValues = componentOrchestrationValues;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        @Override
        public UpdateFoundationComponentReferenceRequest build() {
            return new UpdateFoundationComponentReferenceRequest(this);
        } 

    } 

}
