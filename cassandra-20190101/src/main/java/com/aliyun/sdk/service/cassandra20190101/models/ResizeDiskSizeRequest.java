// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

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
    @NameInMap("DataCenterId")
    @Validation(required = true)
    private String dataCenterId;

    @Query
    @NameInMap("DiskSize")
    @Validation(required = true)
    private Integer diskSize;

    private ResizeDiskSizeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dataCenterId = builder.dataCenterId;
        this.diskSize = builder.diskSize;
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
     * @return dataCenterId
     */
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public static final class Builder extends Request.Builder<ResizeDiskSizeRequest, Builder> {
        private String clusterId; 
        private String dataCenterId; 
        private Integer diskSize; 

        private Builder() {
            super();
        } 

        private Builder(ResizeDiskSizeRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.dataCenterId = response.dataCenterId;
            this.diskSize = response.diskSize;
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
         * DataCenterId.
         */
        public Builder dataCenterId(String dataCenterId) {
            this.putQueryParameter("DataCenterId", dataCenterId);
            this.dataCenterId = dataCenterId;
            return this;
        }

        /**
         * DiskSize.
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        @Override
        public ResizeDiskSizeRequest build() {
            return new ResizeDiskSizeRequest(this);
        } 

    } 

}
