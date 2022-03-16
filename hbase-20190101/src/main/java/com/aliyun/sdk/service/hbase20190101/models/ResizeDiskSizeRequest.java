// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDiskSizeRequest} extends {@link RequestModel}
 *
 * <p>ResizeDiskSizeRequest</p>
 */
public class ResizeDiskSizeRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("NodeDiskSize")
    @Validation(required = true)
    private Integer nodeDiskSize;

    private ResizeDiskSizeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodeDiskSize = builder.nodeDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeDiskSizeRequest create() {
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
     * @return nodeDiskSize
     */
    public Integer getNodeDiskSize() {
        return this.nodeDiskSize;
    }

    public static final class Builder extends Request.Builder<ResizeDiskSizeRequest, Builder> {
        private String clusterId; 
        private Integer nodeDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(ResizeDiskSizeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodeDiskSize = request.nodeDiskSize;
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
         * NodeDiskSize.
         */
        public Builder nodeDiskSize(Integer nodeDiskSize) {
            this.putQueryParameter("NodeDiskSize", nodeDiskSize);
            this.nodeDiskSize = nodeDiskSize;
            return this;
        }

        @Override
        public ResizeDiskSizeRequest build() {
            return new ResizeDiskSizeRequest(this);
        } 

    } 

}
