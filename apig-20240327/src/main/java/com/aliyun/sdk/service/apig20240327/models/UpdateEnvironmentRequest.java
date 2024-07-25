// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvironmentRequest</p>
 */
public class UpdateEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("environmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private UpdateEnvironmentRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.alias = builder.alias;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<UpdateEnvironmentRequest, Builder> {
        private String environmentId; 
        private String alias; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvironmentRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.alias = request.alias;
            this.description = request.description;
        } 

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putPathParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.putBodyParameter("alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateEnvironmentRequest build() {
            return new UpdateEnvironmentRequest(this);
        } 

    } 

}
