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
 * {@link ListK8sConfigMapsRequest} extends {@link RequestModel}
 *
 * <p>ListK8sConfigMapsRequest</p>
 */
public class ListK8sConfigMapsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowRelatedApps")
    private Boolean showRelatedApps;

    private ListK8sConfigMapsRequest(Builder builder) {
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

    public static ListK8sConfigMapsRequest create() {
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

    public static final class Builder extends Request.Builder<ListK8sConfigMapsRequest, Builder> {
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

        private Builder(ListK8sConfigMapsRequest request) {
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
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c0830281-366c-41b6-80fb-542e76******</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The filter conditions. Set this parameter to a JSON string in the format of {&quot;field&quot;:&quot;Name&quot;, &quot;pattern&quot;:&quot;configmap-&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;field&quot;:&quot;Name&quot;, &quot;pattern&quot;:&quot;configmap-&quot;}</p>
         */
        public Builder condition(String condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from Page 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to return a list of applications that use a ConfigMap. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showRelatedApps(Boolean showRelatedApps) {
            this.putQueryParameter("ShowRelatedApps", showRelatedApps);
            this.showRelatedApps = showRelatedApps;
            return this;
        }

        @Override
        public ListK8sConfigMapsRequest build() {
            return new ListK8sConfigMapsRequest(this);
        } 

    } 

}
