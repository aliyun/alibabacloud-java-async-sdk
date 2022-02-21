// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFlowTagRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowTagRequest</p>
 */
public class UpdateFlowTagRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("id")
    @Validation(required = true)
    private Long id;

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

    private UpdateFlowTagRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.id = builder.id;
        this.color = builder.color;
        this.flowTagGroupId = builder.flowTagGroupId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowTagRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateFlowTagRequest, Builder> {
        private String organizationId; 
        private Long id; 
        private String color; 
        private Long flowTagGroupId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowTagRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.id = response.id;
            this.color = response.color;
            this.flowTagGroupId = response.flowTagGroupId;
            this.name = response.name;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
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
        public UpdateFlowTagRequest build() {
            return new UpdateFlowTagRequest(this);
        } 

    } 

}
