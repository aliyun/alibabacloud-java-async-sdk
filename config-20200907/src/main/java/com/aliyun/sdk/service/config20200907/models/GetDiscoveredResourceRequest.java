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
 * {@link GetDiscoveredResourceRequest} extends {@link RequestModel}
 *
 * <p>GetDiscoveredResourceRequest</p>
 */
public class GetDiscoveredResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComplianceOption")
    private Integer complianceOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private GetDiscoveredResourceRequest(Builder builder) {
        super(builder);
        this.complianceOption = builder.complianceOption;
        this.region = builder.region;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetDiscoveredResourceRequest, Builder> {
        private Integer complianceOption; 
        private String region; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetDiscoveredResourceRequest request) {
            super(request);
            this.complianceOption = request.complianceOption;
            this.region = request.region;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
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
         * <p>For more information about how to query the region ID of a resource, see <a href="https://help.aliyun.com/document_detail/411702.html">ListDiscoveredResources</a>.</p>
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
         * <p>The resource ID.</p>
         * <p>For more information about how to obtain the ID of a resource, see <a href="https://help.aliyun.com/document_detail/411702.html">ListDiscoveredResources</a>.</p>
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
         * <p>The type of the resource.</p>
         * <p>For more information about how to obtain the type of a resource, see <a href="https://help.aliyun.com/document_detail/411702.html">ListDiscoveredResources</a>.</p>
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
        public GetDiscoveredResourceRequest build() {
            return new GetDiscoveredResourceRequest(this);
        } 

    } 

}
