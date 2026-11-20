// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListConfigsRequest</p>
 */
public class ListConfigsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListConfigsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configType = builder.configType;
        this.name = builder.name;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListConfigsRequest, Builder> {
        private String clusterId; 
        private String configType; 
        private String name; 
        private Integer page; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.configType = request.configType;
            this.name = request.name;
            this.page = request.page;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p><strong>The region of the service</strong> (Required)</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p><strong>The configuration type</strong> (Required). Currently, only <code>service</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        public Builder configType(String configType) {
            this.putPathParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * <p><strong>The service name</strong> (Required)</p>
         * 
         * <strong>example:</strong>
         * <p>my-llm-service</p>
         */
        public Builder name(String name) {
            this.putPathParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p><strong>The page number</strong>. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p><strong>The number of entries per page</strong>. Default value: 100. Maximum value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListConfigsRequest build() {
            return new ListConfigsRequest(this);
        } 

    } 

}
