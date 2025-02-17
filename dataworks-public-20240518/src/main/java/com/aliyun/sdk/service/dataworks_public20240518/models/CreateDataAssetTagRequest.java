// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateDataAssetTagRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAssetTagRequest</p>
 */
public class CreateDataAssetTagRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Managers")
    private java.util.List<String> managers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValueType")
    private String valueType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<String> values;

    private CreateDataAssetTagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.key = builder.key;
        this.managers = builder.managers;
        this.valueType = builder.valueType;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAssetTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return managers
     */
    public java.util.List<String> getManagers() {
        return this.managers;
    }

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder extends Request.Builder<CreateDataAssetTagRequest, Builder> {
        private String regionId; 
        private String description; 
        private String key; 
        private java.util.List<String> managers; 
        private String valueType; 
        private java.util.List<String> values; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAssetTagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.key = request.key;
            this.managers = request.managers;
            this.valueType = request.valueType;
            this.values = request.values;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The tag key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The tag administrators.</p>
         */
        public Builder managers(java.util.List<String> managers) {
            String managersShrink = shrink(managers, "Managers", "json");
            this.putQueryParameter("Managers", managersShrink);
            this.managers = managers;
            return this;
        }

        /**
         * <p>The type of the tag value. Valid values:</p>
         * <ul>
         * <li>Boolean</li>
         * <li>Int</li>
         * <li>String</li>
         * <li>Double</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        public Builder valueType(String valueType) {
            this.putQueryParameter("ValueType", valueType);
            this.valueType = valueType;
            return this;
        }

        /**
         * <p>The tag values.</p>
         */
        public Builder values(java.util.List<String> values) {
            String valuesShrink = shrink(values, "Values", "json");
            this.putQueryParameter("Values", valuesShrink);
            this.values = values;
            return this;
        }

        @Override
        public CreateDataAssetTagRequest build() {
            return new CreateDataAssetTagRequest(this);
        } 

    } 

}
