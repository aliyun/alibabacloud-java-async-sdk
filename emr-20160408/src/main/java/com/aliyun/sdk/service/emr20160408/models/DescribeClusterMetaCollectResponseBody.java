// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterMetaCollectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterMetaCollectResponseBody</p>
 */
public class DescribeClusterMetaCollectResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("MetaStoreType")
    private String metaStoreType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeClusterMetaCollectResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.metaStoreType = builder.metaStoreType;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterMetaCollectResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return metaStoreType
     */
    public String getMetaStoreType() {
        return this.metaStoreType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String clusterId; 
        private String metaStoreType; 
        private String requestId; 
        private String status; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * MetaStoreType.
         */
        public Builder metaStoreType(String metaStoreType) {
            this.metaStoreType = metaStoreType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeClusterMetaCollectResponseBody build() {
            return new DescribeClusterMetaCollectResponseBody(this);
        } 

    } 

}
