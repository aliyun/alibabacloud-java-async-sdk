// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFlowTagRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowTagRequest</p>
 */
public class CreateFlowTagRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("color")
    @com.aliyun.core.annotation.Validation(required = true)
    private String color;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("flowTagGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long flowTagGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 20)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>#1F9AEF</p>
         */
        public Builder color(String color) {
            this.putQueryParameter("color", color);
            this.color = color;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder flowTagGroupId(Long flowTagGroupId) {
            this.putQueryParameter("flowTagGroupId", flowTagGroupId);
            this.flowTagGroupId = flowTagGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
