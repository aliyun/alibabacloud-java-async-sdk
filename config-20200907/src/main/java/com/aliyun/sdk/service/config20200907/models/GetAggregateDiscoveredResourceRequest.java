// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateDiscoveredResourceRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateDiscoveredResourceRequest</p>
 */
public class GetAggregateDiscoveredResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComplianceOption")
    private Integer complianceOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAccountId")
    private Long resourceAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    @Deprecated
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private GetAggregateDiscoveredResourceRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.complianceOption = builder.complianceOption;
        this.region = builder.region;
        this.resourceAccountId = builder.resourceAccountId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateDiscoveredResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return complianceOption
     */
    public Integer getComplianceOption() {
        return this.complianceOption;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceAccountId
     */
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetAggregateDiscoveredResourceRequest, Builder> {
        private String aggregatorId; 
        private Integer complianceOption; 
        private String region; 
        private Long resourceAccountId; 
        private String resourceId; 
        private Long resourceOwnerId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateDiscoveredResourceRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.complianceOption = request.complianceOption;
            this.region = request.region;
            this.resourceAccountId = request.resourceAccountId;
            this.resourceId = request.resourceId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-5885626622af0008****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>Specifies whether to query the compliance results of the resource. Valid values:</p>
         * <ul>
         * <li>0 (default): does not query the compliance results of the resource.</li>
         * <li>1: queries the compliance results of the resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder complianceOption(Integer complianceOption) {
            this.putQueryParameter("ComplianceOption", complianceOption);
            this.complianceOption = complianceOption;
            return this;
        }

        /**
         * <p>The ID of the region in which the resource resides.</p>
         * <p>For more information about how to query the ID of a region in which the resource resides, see <a href="https://help.aliyun.com/document_detail/411691.html">ListAggregateDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>Required. The ID of the Alibaba Cloud account to which the specified resource belongs in the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        public Builder resourceAccountId(Long resourceAccountId) {
            this.putQueryParameter("ResourceAccountId", resourceAccountId);
            this.resourceAccountId = resourceAccountId;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * <p>For more information about how to obtain the ID of a resource, see <a href="https://help.aliyun.com/document_detail/411691.html">ListAggregateDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>new-bucket</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <p>For more information about how to obtain the type of a resource, see <a href="https://help.aliyun.com/document_detail/411691.html">ListAggregateDiscoveredResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::OSS::Bucket</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetAggregateDiscoveredResourceRequest build() {
            return new GetAggregateDiscoveredResourceRequest(this);
        } 

    } 

}
