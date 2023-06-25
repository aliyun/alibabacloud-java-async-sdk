// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowTagRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowTagRequest</p>
 */
public class CreateFlowTagRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("color")
    @Validation(required = true)
    private String color;

    @Query
    @NameInMap("flowTagGroupId")
    @Validation(required = true)
    private Long flowTagGroupId;

    @Query
    @NameInMap("name")
    @Validation(required = true, maxLength = 20)
    private String name;

    private CreateFlowTagRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.color = builder.color;
        this.flowTagGroupId = builder.flowTagGroupId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @return flowTagGroupId
     */
    public Long getFlowTagGroupId() {
        return this.flowTagGroupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateFlowTagRequest, Builder> {
        private String organizationId; 
        private String color; 
        private Long flowTagGroupId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowTagRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.color = request.color;
            this.flowTagGroupId = request.flowTagGroupId;
            this.name = request.name;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * color.
         */
        public Builder color(String color) {
            this.putQueryParameter("color", color);
            this.color = color;
            return this;
        }

        /**
         * flowTagGroupId.
         */
        public Builder flowTagGroupId(Long flowTagGroupId) {
            this.putQueryParameter("flowTagGroupId", flowTagGroupId);
            this.flowTagGroupId = flowTagGroupId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateFlowTagRequest build() {
            return new CreateFlowTagRequest(this);
        } 

    } 

}
