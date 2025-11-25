// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeClusterScannerListRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterScannerListRequest</p>
 */
public class DescribeClusterScannerListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIdList")
    private java.util.List<String> clusterIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    private DescribeClusterScannerListRequest(Builder builder) {
        super(builder);
        this.clusterIdList = builder.clusterIdList;
        this.lang = builder.lang;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterScannerListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIdList
     */
    public java.util.List<String> getClusterIdList() {
        return this.clusterIdList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<DescribeClusterScannerListRequest, Builder> {
        private java.util.List<String> clusterIdList; 
        private String lang; 
        private java.util.List<String> statusList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterScannerListRequest request) {
            super(request);
            this.clusterIdList = request.clusterIdList;
            this.lang = request.lang;
            this.statusList = request.statusList;
        } 

        /**
         * <p>List of cluster IDs.</p>
         */
        public Builder clusterIdList(java.util.List<String> clusterIdList) {
            this.putQueryParameter("ClusterIdList", clusterIdList);
            this.clusterIdList = clusterIdList;
            return this;
        }

        /**
         * <p>The language type for requests and responses.</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>List of scanner statuses. Values:</p>
         * <ul>
         * <li><strong>online</strong>: Running</li>
         * <li><strong>offline</strong>: Offline</li>
         * <li><strong>not_installed</strong>: Not Installed</li>
         * </ul>
         */
        public Builder statusList(java.util.List<String> statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public DescribeClusterScannerListRequest build() {
            return new DescribeClusterScannerListRequest(this);
        } 

    } 

}
