// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CMonitorAlertEventRequest} extends {@link RequestModel}
 *
 * <p>CMonitorAlertEventRequest</p>
 */
public class CMonitorAlertEventRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Kind")
    private String kind;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("Page")
    private String page;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("ProxyUserId")
    private String proxyUserId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CMonitorAlertEventRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.kind = builder.kind;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.proxyUserId = builder.proxyUserId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CMonitorAlertEventRequest create() {
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
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return proxyUserId
     */
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CMonitorAlertEventRequest, Builder> {
        private String clusterId; 
        private String kind; 
        private String name; 
        private String namespace; 
        private String page; 
        private String pageSize; 
        private String proxyUserId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CMonitorAlertEventRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.kind = response.kind;
            this.name = response.name;
            this.namespace = response.namespace;
            this.page = response.page;
            this.pageSize = response.pageSize;
            this.proxyUserId = response.proxyUserId;
            this.regionId = response.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Kind.
         */
        public Builder kind(String kind) {
            this.putQueryParameter("Kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(String page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProxyUserId.
         */
        public Builder proxyUserId(String proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CMonitorAlertEventRequest build() {
            return new CMonitorAlertEventRequest(this);
        } 

    } 

}
