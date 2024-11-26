// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClusterDeprecatedAPIRequest} extends {@link RequestModel}
 *
 * <p>ListClusterDeprecatedAPIRequest</p>
 */
public class ListClusterDeprecatedAPIRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_no")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("target_version")
    private String targetVersion;

    private ListClusterDeprecatedAPIRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterDeprecatedAPIRequest create() {
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
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder extends Request.Builder<ListClusterDeprecatedAPIRequest, Builder> {
        private String clusterId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String targetVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterDeprecatedAPIRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.targetVersion = request.targetVersion;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * page_no.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("page_no", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * target_version.
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("target_version", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        @Override
        public ListClusterDeprecatedAPIRequest build() {
            return new ListClusterDeprecatedAPIRequest(this);
        } 

    } 

}
