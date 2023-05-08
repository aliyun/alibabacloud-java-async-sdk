// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageRiskRequest} extends {@link RequestModel}
 *
 * <p>ListImageRiskRequest</p>
 */
public class ListImageRiskRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListImageRiskRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.currentPage = builder.currentPage;
        this.imageName = builder.imageName;
        this.namespace = builder.namespace;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageRiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListImageRiskRequest, Builder> {
        private String appName; 
        private String clusterId; 
        private Integer currentPage; 
        private String imageName; 
        private String namespace; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListImageRiskRequest request) {
            super(request);
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.currentPage = request.currentPage;
            this.imageName = request.imageName;
            this.namespace = request.namespace;
            this.pageSize = request.pageSize;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListImageRiskRequest build() {
            return new ListImageRiskRequest(this);
        } 

    } 

}
