// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link CreateSecretParameterRequest} extends {@link RequestModel}
 *
 * <p>CreateSecretParameterRequest</p>
 */
public class CreateSecretParameterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Constraints")
    private String constraints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DKMSInstanceId")
    private String DKMSInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private CreateSecretParameterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.constraints = builder.constraints;
        this.DKMSInstanceId = builder.DKMSInstanceId;
        this.description = builder.description;
        this.keyId = builder.keyId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecretParameterRequest create() {
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
     * @return DKMSInstanceId
     */
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<CreateSecretParameterRequest, Builder> {
        private String clientToken; 
        private String constraints; 
        private String DKMSInstanceId; 
        private String description; 
        private String keyId; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.Map<String, ?> tags; 
        private String type; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecretParameterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.constraints = request.constraints;
            this.DKMSInstanceId = request.DKMSInstanceId;
            this.description = request.description;
            this.keyId = request.keyId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.type = request.type;
            this.value = request.value;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). For more information, see &quot;How to ensure idempotence&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The constraints of the encryption parameter. By default, this parameter is null. Valid values:</p>
         * <ul>
         * <li>AllowedValues: The value that is allowed for the encryption parameter. It must be an array string.</li>
         * <li>AllowedPattern: The pattern that is allowed for the encryption parameter. It must be a regular expression.</li>
         * <li>MinLength: The minimum length of the encryption parameter.</li>
         * <li>MaxLength: The maximum length of the encryption parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;&quot;AllowedValues&quot;:[&quot;secretparameter&quot;],&quot;AllowedPattern&quot;:&quot;secretparameter&quot;,&quot;MinLength&quot;:0,&quot;MaxLength&quot;:20}&quot;</p>
         */
        public Builder constraints(String constraints) {
            this.putQueryParameter("Constraints", constraints);
            this.constraints = constraints;
            return this;
        }

        /**
         * <p>The instance ID of the KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-hzz****</p>
         */
        public Builder DKMSInstanceId(String DKMSInstanceId) {
            this.putQueryParameter("DKMSInstanceId", DKMSInstanceId);
            this.DKMSInstanceId = DKMSInstanceId;
            return this;
        }

        /**
         * <p>The description of the encryption parameter. The description must be 1 to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>SecretParameter</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The key ID of Key Management Service (KMS) that is used to encrypt the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>80e9409f-78fa-42ab-84bd-83f40c******</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The name of the parameter. The name must be 1 to 180 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). It cannot start with ALIYUN, ACS, ALIBABA, ALICLOUD, or OOS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySecretParameter</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the parameter. Set the value to Secret.</p>
         * 
         * <strong>example:</strong>
         * <p>Secret</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The value of the encryption parameter. The value must be 1 to 4096 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SecretParameter</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public CreateSecretParameterRequest build() {
            return new CreateSecretParameterRequest(this);
        } 

    } 

}
