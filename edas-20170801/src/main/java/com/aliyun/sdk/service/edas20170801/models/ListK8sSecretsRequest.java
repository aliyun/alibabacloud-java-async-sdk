// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListK8sSecretsRequest} extends {@link RequestModel}
 *
 * <p>ListK8sSecretsRequest</p>
 */
public class ListK8sSecretsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Condition")
    private String condition;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShowRelatedApps")
    private Boolean showRelatedApps;

    private ListK8sSecretsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.condition = builder.condition;
        this.namespace = builder.namespace;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.showRelatedApps = builder.showRelatedApps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListK8sSecretsRequest create() {
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
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return showRelatedApps
     */
    public Boolean getShowRelatedApps() {
        return this.showRelatedApps;
    }

    public static final class Builder extends Request.Builder<ListK8sSecretsRequest, Builder> {
        private String clusterId; 
        private String condition; 
        private String namespace; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionId; 
        private Boolean showRelatedApps; 

        private Builder() {
            super();
        } 

        private Builder(ListK8sSecretsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.condition = request.condition;
            this.namespace = request.namespace;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.showRelatedApps = request.showRelatedApps;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The filter conditions. Set this parameter to a JSON string in the format of {"field":"Name", "pattern":"configmap-"}.
         */
        public Builder condition(String condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * The namespace of the Kubernetes cluster.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The number of the page to return. Pages start from Page 0.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page. The value 0 indicates that all entries are returned on one page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to return a list of applications that use a Secret.
         */
        public Builder showRelatedApps(Boolean showRelatedApps) {
            this.putQueryParameter("ShowRelatedApps", showRelatedApps);
            this.showRelatedApps = showRelatedApps;
            return this;
        }

        @Override
        public ListK8sSecretsRequest build() {
            return new ListK8sSecretsRequest(this);
        } 

    } 

}
