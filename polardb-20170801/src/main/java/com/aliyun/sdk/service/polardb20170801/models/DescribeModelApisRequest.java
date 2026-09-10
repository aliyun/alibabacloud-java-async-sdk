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
 * {@link DescribeModelApisRequest} extends {@link RequestModel}
 *
 * <p>DescribeModelApisRequest</p>
 */
public class DescribeModelApisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelApiIds")
    private String modelApiIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCategory")
    private String modelCategory;

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
    @com.aliyun.core.annotation.NameInMap("PathPrefix")
    private String pathPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeModelApisRequest(Builder builder) {
        super(builder);
        this.gwClusterId = builder.gwClusterId;
        this.modelApiIds = builder.modelApiIds;
        this.modelCategory = builder.modelCategory;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pathPrefix = builder.pathPrefix;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelApisRequest create() {
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
     * @return modelApiIds
     */
    public String getModelApiIds() {
        return this.modelApiIds;
    }

    /**
     * @return modelCategory
     */
    public String getModelCategory() {
        return this.modelCategory;
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
     * @return pathPrefix
     */
    public String getPathPrefix() {
        return this.pathPrefix;
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

    public static final class Builder extends Request.Builder<DescribeModelApisRequest, Builder> {
        private String gwClusterId; 
        private String modelApiIds; 
        private String modelCategory; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pathPrefix; 
        private String protocol; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeModelApisRequest request) {
            super(request);
            this.gwClusterId = request.gwClusterId;
            this.modelApiIds = request.modelApiIds;
            this.modelCategory = request.modelCategory;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pathPrefix = request.pathPrefix;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * <p>The gateway instance ID.</p>
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
         * <p>The model API IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-xxx,mi-xxxx</p>
         */
        public Builder modelApiIds(String modelApiIds) {
            this.putQueryParameter("ModelApiIds", modelApiIds);
            this.modelApiIds = modelApiIds;
            return this;
        }

        /**
         * <p>The model category. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>embedding</strong></li>
         * <li><strong>rerank</strong></li>
         * </ul>
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
         * <p>The model API name.</p>
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
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
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
         * <p>The API path prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        public Builder pathPrefix(String pathPrefix) {
            this.putQueryParameter("PathPrefix", pathPrefix);
            this.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>openai</strong></li>
         * <li><strong>anthropic</strong></li>
         * <li><strong>bailian</strong></li>
         * <li><strong>vllm</strong></li>
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
         * <p>The region ID.</p>
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
         * <p>The model API status.</p>
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
        public DescribeModelApisRequest build() {
            return new DescribeModelApisRequest(this);
        } 

    } 

}
