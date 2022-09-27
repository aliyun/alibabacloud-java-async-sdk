// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRequest</p>
 */
public class ListInstanceRequest extends Request {
    @Query
    @NameInMap("description")
    private String description;

    @Query
    @NameInMap("esVersion")
    private String esVersion;

    @Query
    @NameInMap("instanceCategory")
    private String instanceCategory;

    @Query
    @NameInMap("instanceId")
    private String instanceId;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("paymentType")
    private String paymentType;

    @Query
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("tags")
    private String tags;

    @Query
    @NameInMap("vpcId")
    private String vpcId;

    @Query
    @NameInMap("zoneId")
    private String zoneId;

    private ListInstanceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.esVersion = builder.esVersion;
        this.instanceCategory = builder.instanceCategory;
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.paymentType = builder.paymentType;
        this.resourceGroupId = builder.resourceGroupId;
        this.size = builder.size;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRequest create() {
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
     * @return esVersion
     */
    public String getEsVersion() {
        return this.esVersion;
    }

    /**
     * @return instanceCategory
     */
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListInstanceRequest, Builder> {
        private String description; 
        private String esVersion; 
        private String instanceCategory; 
        private String instanceId; 
        private Integer page; 
        private String paymentType; 
        private String resourceGroupId; 
        private Integer size; 
        private String tags; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRequest request) {
            super(request);
            this.description = request.description;
            this.esVersion = request.esVersion;
            this.instanceCategory = request.instanceCategory;
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.paymentType = request.paymentType;
            this.resourceGroupId = request.resourceGroupId;
            this.size = request.size;
            this.tags = request.tags;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * esVersion.
         */
        public Builder esVersion(String esVersion) {
            this.putQueryParameter("esVersion", esVersion);
            this.esVersion = esVersion;
            return this;
        }

        /**
         * instanceCategory.
         */
        public Builder instanceCategory(String instanceCategory) {
            this.putQueryParameter("instanceCategory", instanceCategory);
            this.instanceCategory = instanceCategory;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * paymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListInstanceRequest build() {
            return new ListInstanceRequest(this);
        } 

    } 

}
