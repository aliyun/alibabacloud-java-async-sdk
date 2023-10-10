// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceListPageRequest} extends {@link RequestModel}
 *
 * <p>GetServiceListPageRequest</p>
 */
public class GetServiceListPageRequest extends Request {
    @Query
    @NameInMap("namespace")
    private String namespace;

    @Query
    @NameInMap("origin")
    private String origin;

    @Query
    @NameInMap("page")
    private Integer page;

    @Query
    @NameInMap("region")
    private String region;

    @Query
    @NameInMap("searchType")
    private String searchType;

    @Query
    @NameInMap("searchValue")
    private String searchValue;

    @Query
    @NameInMap("serviceType")
    private String serviceType;

    @Query
    @NameInMap("side")
    private String side;

    @Query
    @NameInMap("size")
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
         * The namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The source of the data. Valid values:
         * <p>
         * 
         * *   `agent`: Use this value if you use the service query feature of the latest version to pass the query result.
         * *   `registry`: Use this value if you use the service query feature of the earlier version to pass the query result.
         */
        public Builder origin(String origin) {
            this.putQueryParameter("origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * The number of the page to return. Pages start from Page 0.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * The type of the service. Valid values:
         * <p>
         * 
         * *   `app`: searches by application.
         * *   `service`: searches by service.
         * *   `providerIp`: searches by IP address.
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("searchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * The keyword used for the search.
         * <p>
         * 
         * *   Set this parameter to the ID of the application if you set the searchType parameter to app.``
         * *   Set this parameter to the name of the service if you set the serachType parameter to service.``
         * *   Set this parameter to the IP address of the application if you set the searchType parameter to providerIp.
         */
        public Builder searchValue(String searchValue) {
            this.putQueryParameter("searchValue", searchValue);
            this.searchValue = searchValue;
            return this;
        }

        /**
         * The type of the service. Valid values:
         * <p>
         * 
         * *   `dubbo`
         * *   `springCloud`
         * *   `hsf`
         * *   `istio`
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Specifies the provider side or the consumer side. Valid values:
         * <p>
         * 
         * *   provider
         * *   consumer
         */
        public Builder side(String side) {
            this.putQueryParameter("side", side);
            this.side = side;
            return this;
        }

        /**
         * The number of entries to return on each page.
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
