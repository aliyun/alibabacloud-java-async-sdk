// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelRequest</p>
 */
public class UpdateModelRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Hardware")
    private String hardware;

    @Query
    @NameInMap("ModelId")
    @Validation(required = true)
    private Long modelId;

    @Query
    @NameInMap("Name")
    private String name;

    private UpdateModelRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.hardware = builder.hardware;
        this.modelId = builder.modelId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hardware
     */
    public String getHardware() {
        return this.hardware;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateModelRequest, Builder> {
        private String description; 
        private String hardware; 
        private Long modelId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelRequest response) {
            super(response);
            this.description = response.description;
            this.hardware = response.hardware;
            this.modelId = response.modelId;
            this.name = response.name;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Hardware.
         */
        public Builder hardware(String hardware) {
            this.putQueryParameter("Hardware", hardware);
            this.hardware = hardware;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(Long modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateModelRequest build() {
            return new UpdateModelRequest(this);
        } 

    } 

}
