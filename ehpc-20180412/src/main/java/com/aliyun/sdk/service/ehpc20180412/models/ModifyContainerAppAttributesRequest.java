// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyContainerAppAttributesRequest} extends {@link RequestModel}
 *
 * <p>ModifyContainerAppAttributesRequest</p>
 */
public class ModifyContainerAppAttributesRequest extends Request {
    @Query
    @NameInMap("ContainerId")
    @Validation(required = true)
    private String containerId;

    @Query
    @NameInMap("Description")
    private String description;

    private ModifyContainerAppAttributesRequest(Builder builder) {
        super(builder);
        this.containerId = builder.containerId;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyContainerAppAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<ModifyContainerAppAttributesRequest, Builder> {
        private String containerId; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(ModifyContainerAppAttributesRequest request) {
            super(request);
            this.containerId = request.containerId;
            this.description = request.description;
        } 

        /**
         * ContainerId.
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public ModifyContainerAppAttributesRequest build() {
            return new ModifyContainerAppAttributesRequest(this);
        } 

    } 

}
