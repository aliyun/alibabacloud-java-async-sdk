// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeMultiZoneClusterDiskSizeRequest} extends {@link RequestModel}
 *
 * <p>ResizeMultiZoneClusterDiskSizeRequest</p>
 */
public class ResizeMultiZoneClusterDiskSizeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreDiskSize")
    @com.aliyun.core.annotation.Validation(maximum = 64000, minimum = 400)
    private Integer coreDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDiskSize")
    @com.aliyun.core.annotation.Validation(maximum = 64000, minimum = 400)
    private Integer logDiskSize;

    private ResizeMultiZoneClusterDiskSizeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.coreDiskSize = builder.coreDiskSize;
        this.logDiskSize = builder.logDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeMultiZoneClusterDiskSizeRequest create() {
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
     * @return coreDiskSize
     */
    public Integer getCoreDiskSize() {
        return this.coreDiskSize;
    }

    /**
     * @return logDiskSize
     */
    public Integer getLogDiskSize() {
        return this.logDiskSize;
    }

    public static final class Builder extends Request.Builder<ResizeMultiZoneClusterDiskSizeRequest, Builder> {
        private String clusterId; 
        private Integer coreDiskSize; 
        private Integer logDiskSize; 

        private Builder() {
            super();
        } 

        private Builder(ResizeMultiZoneClusterDiskSizeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.coreDiskSize = request.coreDiskSize;
            this.logDiskSize = request.logDiskSize;
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
         * CoreDiskSize.
         */
        public Builder coreDiskSize(Integer coreDiskSize) {
            this.putQueryParameter("CoreDiskSize", coreDiskSize);
            this.coreDiskSize = coreDiskSize;
            return this;
        }

        /**
         * LogDiskSize.
         */
        public Builder logDiskSize(Integer logDiskSize) {
            this.putQueryParameter("LogDiskSize", logDiskSize);
            this.logDiskSize = logDiskSize;
            return this;
        }

        @Override
        public ResizeMultiZoneClusterDiskSizeRequest build() {
            return new ResizeMultiZoneClusterDiskSizeRequest(this);
        } 

    } 

}
