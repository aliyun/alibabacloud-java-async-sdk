// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListEnvironmentsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentsRequest</p>
 */
public class ListEnvironmentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonName")
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindResourceId")
    private String bindResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentType")
    private String environmentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeePackage")
    private String feePackage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterRegionIds")
    private String filterRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListEnvironmentsRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.bindResourceId = builder.bindResourceId;
        this.environmentType = builder.environmentType;
        this.feePackage = builder.feePackage;
        this.filterRegionIds = builder.filterRegionIds;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return bindResourceId
     */
    public String getBindResourceId() {
        return this.bindResourceId;
    }

    /**
     * @return environmentType
     */
    public String getEnvironmentType() {
        return this.environmentType;
    }

    /**
     * @return feePackage
     */
    public String getFeePackage() {
        return this.feePackage;
    }

    /**
     * @return filterRegionIds
     */
    public String getFilterRegionIds() {
        return this.filterRegionIds;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentsRequest, Builder> {
        private String addonName; 
        private String bindResourceId; 
        private String environmentType; 
        private String feePackage; 
        private String filterRegionIds; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentsRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.bindResourceId = request.bindResourceId;
            this.environmentType = request.environmentType;
            this.feePackage = request.feePackage;
            this.filterRegionIds = request.filterRegionIds;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * <p>The add-on name. You must specify at least one of the AddonName and EnvironmentType parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>trace-java</p>
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("AddonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cff30f0d67d7542dfb05bd114b4b1d7af</p>
         */
        public Builder bindResourceId(String bindResourceId) {
            this.putQueryParameter("BindResourceId", bindResourceId);
            this.bindResourceId = bindResourceId;
            return this;
        }

        /**
         * <p>The environment type. You must specify at least one of the AddonName and EnvironmentType parameters.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>CS</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Container Service for Kubernetes (ACK)</p>
         * <!-- -->
         * </li>
         * <li><p>ECS</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>Elastic Compute Service (ECS)</p>
         * <!-- -->
         * </li>
         * <li><p>Cloud</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>cloud service</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        public Builder environmentType(String environmentType) {
            this.putQueryParameter("EnvironmentType", environmentType);
            this.environmentType = environmentType;
            return this;
        }

        /**
         * <p>The payable resource plan.</p>
         * <ul>
         * <li>If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro. Default value: CS_Basic.</li>
         * <li>Otherwise, leave the parameter empty.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>CS_Pro: Container Monitoring Pro</li>
         * <li>CS_Basic: Container Monitoring Basic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CS_Pro</p>
         */
        public Builder feePackage(String feePackage) {
            this.putQueryParameter("FeePackage", feePackage);
            this.feePackage = feePackage;
            return this;
        }

        /**
         * <p>The region IDs.</p>
         */
        public Builder filterRegionIds(String filterRegionIds) {
            this.putQueryParameter("FilterRegionIds", filterRegionIds);
            this.filterRegionIds = filterRegionIds;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>rg-aekzfurdatohtka</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        @Override
        public ListEnvironmentsRequest build() {
            return new ListEnvironmentsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvironmentsRequest} extends {@link TeaModel}
     *
     * <p>ListEnvironmentsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>gfn_web_outbound_add</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
