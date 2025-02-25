// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 100000000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("seriesCodes")
    private java.util.List<String> seriesCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("storageSecretKey")
    private String storageSecretKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.seriesCodes = builder.seriesCodes;
        this.storageSecretKey = builder.storageSecretKey;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return seriesCodes
     */
    public java.util.List<String> getSeriesCodes() {
        return this.seriesCodes;
    }

    /**
     * @return storageSecretKey
     */
    public String getStorageSecretKey() {
        return this.storageSecretKey;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String filter; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private java.util.List<String> seriesCodes; 
        private String storageSecretKey; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest request) {
            super(request);
            this.filter = request.filter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.seriesCodes = request.seriesCodes;
            this.storageSecretKey = request.storageSecretKey;
            this.tags = request.tags;
        } 

        /**
         * <p>The filter condition that is used to query instances. If you do not configure this parameter, all instances are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Valid values: 1 to 100000000.</p>
         * <p>If you set this parameter to a value smaller than 1, the system uses 1 as the value. If you set this parameter to a value greater than 100000000, the system uses 100000000 as the value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Value values: 10 to 200.</p>
         * <p>If you set this parameter to a value smaller than 10, the system uses 10 as the value. If you set this parameter to a value greater than 200, the system uses 200 as the value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmx7caj******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The primary edition of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard: Standard Edition</li>
         * <li>ultimate: Enterprise Platinum Edition</li>
         * <li>professional: Professional Edition</li>
         * </ul>
         */
        public Builder seriesCodes(java.util.List<String> seriesCodes) {
            String seriesCodesShrink = shrink(seriesCodes, "seriesCodes", "simple");
            this.putQueryParameter("seriesCodes", seriesCodesShrink);
            this.seriesCodes = seriesCodes;
            return this;
        }

        /**
         * <p>The storage encryption key.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder storageSecretKey(String storageSecretKey) {
            this.putQueryParameter("storageSecretKey", storageSecretKey);
            this.storageSecretKey = storageSecretKey;
            return this;
        }

        /**
         * <p>The tags that are used to filter instances.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;: &quot;rmq-test&quot;, &quot;value&quot;: &quot;test&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
