// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublicParameterRequest} extends {@link RequestModel}
 *
 * <p>CreatePublicParameterRequest</p>
 */
public class CreatePublicParameterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Constraints")
    private String constraints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private CreatePublicParameterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.constraints = builder.constraints;
        this.description = builder.description;
        this.name = builder.name;
        this.parameterType = builder.parameterType;
        this.regionId = builder.regionId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublicParameterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return constraints
     */
    public String getConstraints() {
        return this.constraints;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameterType
     */
    public String getParameterType() {
        return this.parameterType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreatePublicParameterRequest, Builder> {
        private String clientToken; 
        private String constraints; 
        private String description; 
        private String name; 
        private String parameterType; 
        private String regionId; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublicParameterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.constraints = request.constraints;
            this.description = request.description;
            this.name = request.name;
            this.parameterType = request.parameterType;
            this.regionId = request.regionId;
            this.value = request.value;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Constraints.
         */
        public Builder constraints(String constraints) {
            this.putQueryParameter("Constraints", constraints);
            this.constraints = constraints;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParameterType.
         */
        public Builder parameterType(String parameterType) {
            this.putQueryParameter("ParameterType", parameterType);
            this.parameterType = parameterType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreatePublicParameterRequest build() {
            return new CreatePublicParameterRequest(this);
        } 

    } 

}
