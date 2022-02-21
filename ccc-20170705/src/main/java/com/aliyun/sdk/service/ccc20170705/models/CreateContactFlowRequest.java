// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContactFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateContactFlowRequest</p>
 */
public class CreateContactFlowRequest extends Request {
    @Body
    @NameInMap("Canvas")
    @Validation(required = true)
    private String canvas;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateContactFlowRequest(Builder builder) {
        super(builder);
        this.canvas = builder.canvas;
        this.content = builder.content;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContactFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canvas
     */
    public String getCanvas() {
        return this.canvas;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateContactFlowRequest, Builder> {
        private String canvas; 
        private String content; 
        private String description; 
        private String instanceId; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateContactFlowRequest response) {
            super(response);
            this.canvas = response.canvas;
            this.content = response.content;
            this.description = response.description;
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.type = response.type;
        } 

        /**
         * Canvas.
         */
        public Builder canvas(String canvas) {
            this.putBodyParameter("Canvas", canvas);
            this.canvas = canvas;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
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

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateContactFlowRequest build() {
            return new CreateContactFlowRequest(this);
        } 

    } 

}
