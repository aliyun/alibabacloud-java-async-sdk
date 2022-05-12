// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigMapRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigMapRequest</p>
 */
public class UpdateConfigMapRequest extends Request {
    @Query
    @NameInMap("ConfigMapId")
    @Validation(required = true)
    private Long configMapId;

    @Query
    @NameInMap("Description")
    private String description;

    private UpdateConfigMapRequest(Builder builder) {
        super(builder);
        this.configMapId = builder.configMapId;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigMapRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configMapId
     */
    public Long getConfigMapId() {
        return this.configMapId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateConfigMapRequest, Builder> {
        private Long configMapId; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigMapRequest request) {
            super(request);
            this.configMapId = request.configMapId;
            this.description = request.description;
        } 

        /**
         * ConfigMapId.
         */
        public Builder configMapId(Long configMapId) {
            this.putQueryParameter("ConfigMapId", configMapId);
            this.configMapId = configMapId;
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
        public UpdateConfigMapRequest build() {
            return new UpdateConfigMapRequest(this);
        } 

    } 

}
