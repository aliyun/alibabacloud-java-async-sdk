// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link InsertOrUpdateRegionRequest} extends {@link RequestModel}
 *
 * <p>InsertOrUpdateRegionRequest</p>
 */
public class InsertOrUpdateRegionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DebugEnable")
    private Boolean debugEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MseInstanceId")
    private String mseInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryType")
    private String registryType;

    private InsertOrUpdateRegionRequest(Builder builder) {
        super(builder);
        this.debugEnable = builder.debugEnable;
        this.description = builder.description;
        this.id = builder.id;
        this.mseInstanceId = builder.mseInstanceId;
        this.regionName = builder.regionName;
        this.regionTag = builder.regionTag;
        this.registryType = builder.registryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertOrUpdateRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return debugEnable
     */
    public Boolean getDebugEnable() {
        return this.debugEnable;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mseInstanceId
     */
    public String getMseInstanceId() {
        return this.mseInstanceId;
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    /**
     * @return regionTag
     */
    public String getRegionTag() {
        return this.regionTag;
    }

    /**
     * @return registryType
     */
    public String getRegistryType() {
        return this.registryType;
    }

    public static final class Builder extends Request.Builder<InsertOrUpdateRegionRequest, Builder> {
        private Boolean debugEnable; 
        private String description; 
        private Long id; 
        private String mseInstanceId; 
        private String regionName; 
        private String regionTag; 
        private String registryType; 

        private Builder() {
            super();
        } 

        private Builder(InsertOrUpdateRegionRequest request) {
            super(request);
            this.debugEnable = request.debugEnable;
            this.description = request.description;
            this.id = request.id;
            this.mseInstanceId = request.mseInstanceId;
            this.regionName = request.regionName;
            this.regionTag = request.regionTag;
            this.registryType = request.registryType;
        } 

        /**
         * <p>Specifies whether to enable remote debugging. Valid values:</p>
         * <ul>
         * <li>true: enables remote debugging.</li>
         * <li>false: disables remote debugging.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder debugEnable(Boolean debugEnable) {
            this.putQueryParameter("DebugEnable", debugEnable);
            this.debugEnable = debugEnable;
            return this;
        }

        /**
         * <p>The description of the namespace. The description can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to create or modify the namespace. If this parameter is left empty or is set to 0, the namespace is created. Otherwise, the namespace is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the MSE registry.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-tl32n******</p>
         */
        public Builder mseInstanceId(String mseInstanceId) {
            this.putQueryParameter("MseInstanceId", mseInstanceId);
            this.mseInstanceId = mseInstanceId;
            return this;
        }

        /**
         * <p>The name of the namespace. The name can be up to 63 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_region</p>
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * <ul>
         * <li>The ID of a custom namespace is in the <code>Region ID:Namespace identifier</code> format. Example: cn-beijing:tdy218.</li>
         * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: cn-beijing.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder regionTag(String regionTag) {
            this.putQueryParameter("RegionTag", regionTag);
            this.regionTag = regionTag;
            return this;
        }

        /**
         * <p>The type of the registry.</p>
         * <ul>
         * <li>default: the shared registry of Enterprise Distributed Application Service (EDAS)</li>
         * <li>exclusive_mse: a Microservices Engine (MSE) registry</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder registryType(String registryType) {
            this.putQueryParameter("RegistryType", registryType);
            this.registryType = registryType;
            return this;
        }

        @Override
        public InsertOrUpdateRegionRequest build() {
            return new InsertOrUpdateRegionRequest(this);
        } 

    } 

}
