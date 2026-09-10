// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeModelServicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelServicesRequest</p>
 */
public class DescribeModelServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCategory")
    private String modelCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelServiceIds")
    private String modelServiceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeModelServicesRequest(Builder builder) {
        super(builder);
        this.gwClusterId = builder.gwClusterId;
        this.modelCategory = builder.modelCategory;
        this.modelServiceIds = builder.modelServiceIds;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelServicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return modelCategory
     */
    public String getModelCategory() {
        return this.modelCategory;
    }

    /**
     * @return modelServiceIds
     */
    public String getModelServiceIds() {
        return this.modelServiceIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeModelServicesRequest, Builder> {
        private String gwClusterId; 
        private String modelCategory; 
        private String modelServiceIds; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String protocol; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelServicesRequest request) {
            super(request);
            this.gwClusterId = request.gwClusterId;
            this.modelCategory = request.modelCategory;
            this.modelServiceIds = request.modelServiceIds;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the gateway instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The model category.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder modelCategory(String modelCategory) {
            this.putQueryParameter("ModelCategory", modelCategory);
            this.modelCategory = modelCategory;
            return this;
        }

        /**
         * <p>The IDs of the model services. Separate multiple IDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ms-xxx,ms-xxxx</p>
         */
        public Builder modelServiceIds(String modelServiceIds) {
            this.putQueryParameter("ModelServiceIds", modelServiceIds);
            this.modelServiceIds = modelServiceIds;
            return this;
        }

        /**
         * <p>The name of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>openai</strong></p>
         * </li>
         * <li><p><strong>anthropic</strong></p>
         * </li>
         * <li><p><strong>bailian</strong>: Models from Model Studio.</p>
         * </li>
         * <li><p><strong>vllm</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The status of the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeModelServicesRequest build() {
            return new DescribeModelServicesRequest(this);
        } 

    } 

}
