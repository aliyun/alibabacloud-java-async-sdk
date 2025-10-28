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
 * {@link GetServiceListPageRequest} extends {@link RequestModel}
 *
 * <p>GetServiceListPageRequest</p>
 */
public class GetServiceListPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("searchType")
    private String searchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("searchValue")
    private String searchValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("side")
    private String side;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    private GetServiceListPageRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.origin = builder.origin;
        this.page = builder.page;
        this.region = builder.region;
        this.searchType = builder.searchType;
        this.searchValue = builder.searchValue;
        this.serviceType = builder.serviceType;
        this.side = builder.side;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceListPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return searchValue
     */
    public String getSearchValue() {
        return this.searchValue;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return side
     */
    public String getSide() {
        return this.side;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<GetServiceListPageRequest, Builder> {
        private String namespace; 
        private String origin; 
        private Integer page; 
        private String region; 
        private String searchType; 
        private String searchValue; 
        private String serviceType; 
        private String side; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceListPageRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.origin = request.origin;
            this.page = request.page;
            this.region = request.region;
            this.searchType = request.searchType;
            this.searchValue = request.searchValue;
            this.serviceType = request.serviceType;
            this.side = request.side;
            this.size = request.size;
        } 

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:doc-test</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source of the data. Valid values:</p>
         * <ul>
         * <li><code>agent</code>: Use this value if you use the service query feature of the latest version to pass the query result.</li>
         * <li><code>registry</code>: Use this value if you use the service query feature of the earlier version to pass the query result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Agent</p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from Page 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li><code>app</code>: searches by application.</li>
         * <li><code>service</code>: searches by service.</li>
         * <li><code>providerIp</code>: searches by IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("searchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * <p>The keyword used for the search.</p>
         * <ul>
         * <li>Set this parameter to the ID of the application if you set the searchType parameter to app.``</li>
         * <li>Set this parameter to the name of the service if you set the serachType parameter to service.``</li>
         * <li>Set this parameter to the IP address of the application if you set the searchType parameter to providerIp.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>com.alibaba.edas.HelloService</p>
         */
        public Builder searchValue(String searchValue) {
            this.putQueryParameter("searchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li><code>dubbo</code></li>
         * <li><code>springCloud</code></li>
         * <li><code>hsf</code></li>
         * <li><code>istio</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SpringCloud</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>Specifies the provider side or the consumer side. Valid values:</p>
         * <ul>
         * <li>provider</li>
         * <li>consumer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>provider</p>
         */
        public Builder side(String side) {
            this.putQueryParameter("side", side);
            this.side = side;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public GetServiceListPageRequest build() {
            return new GetServiceListPageRequest(this);
        } 

    } 

}
