// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkItemRequest</p>
 */
public class UpdateWorkItemRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("identifier")
    @Validation(required = true)
    private String identifier;

    @Body
    @NameInMap("propertyKey")
    @Validation(required = true)
    private String propertyKey;

    @Body
    @NameInMap("propertyValue")
    private String propertyValue;

    private UpdateWorkItemRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.identifier = builder.identifier;
        this.propertyKey = builder.propertyKey;
        this.propertyValue = builder.propertyValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkItemRequest create() {
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
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return propertyKey
     */
    public String getPropertyKey() {
        return this.propertyKey;
    }

    /**
     * @return propertyValue
     */
    public String getPropertyValue() {
        return this.propertyValue;
    }

    public static final class Builder extends Request.Builder<UpdateWorkItemRequest, Builder> {
        private String organizationId; 
        private String identifier; 
        private String propertyKey; 
        private String propertyValue; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkItemRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.identifier = response.identifier;
            this.propertyKey = response.propertyKey;
            this.propertyValue = response.propertyValue;
        } 

        /**
         * 企业id
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 工作项id
         */
        public Builder identifier(String identifier) {
            this.putBodyParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * 更新的字段名
         */
        public Builder propertyKey(String propertyKey) {
            this.putBodyParameter("propertyKey", propertyKey);
            this.propertyKey = propertyKey;
            return this;
        }

        /**
         * 更新后的值
         */
        public Builder propertyValue(String propertyValue) {
            this.putBodyParameter("propertyValue", propertyValue);
            this.propertyValue = propertyValue;
            return this;
        }

        @Override
        public UpdateWorkItemRequest build() {
            return new UpdateWorkItemRequest(this);
        } 

    } 

}
