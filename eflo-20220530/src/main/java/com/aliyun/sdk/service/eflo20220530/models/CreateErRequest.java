// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link CreateErRequest} extends {@link RequestModel}
 *
 * <p>CreateErRequest</p>
 */
public class CreateErRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String erName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MasterZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String masterZoneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateErRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.erName = builder.erName;
        this.masterZoneId = builder.masterZoneId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateErRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return erName
     */
    public String getErName() {
        return this.erName;
    }

    /**
     * @return masterZoneId
     */
    public String getMasterZoneId() {
        return this.masterZoneId;
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

    public static final class Builder extends Request.Builder<CreateErRequest, Builder> {
        private String description; 
        private String erName; 
        private String masterZoneId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateErRequest request) {
            super(request);
            this.description = request.description;
            this.erName = request.erName;
            this.masterZoneId = request.masterZoneId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The description of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Lingjun HUB Name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>er-wulanchabu-main</p>
         */
        public Builder erName(String erName) {
            this.putBodyParameter("ErName", erName);
            this.erName = erName;
            return this;
        }

        /**
         * <p>Primary Zone</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        public Builder masterZoneId(String masterZoneId) {
            this.putBodyParameter("MasterZoneId", masterZoneId);
            this.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyuzlx2iihcy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateErRequest build() {
            return new CreateErRequest(this);
        } 

    } 

}
