// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeColdStorageSizeRequest} extends {@link RequestModel}
 *
 * <p>ResizeColdStorageSizeRequest</p>
 */
public class ResizeColdStorageSizeRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ColdStorageSize")
    @Validation(required = true, maximum = 2048000, minimum = 800)
    private Integer coldStorageSize;

    private ResizeColdStorageSizeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.coldStorageSize = builder.coldStorageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeColdStorageSizeRequest create() {
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
     * @return coldStorageSize
     */
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

    public static final class Builder extends Request.Builder<ResizeColdStorageSizeRequest, Builder> {
        private String clusterId; 
        private Integer coldStorageSize; 

        private Builder() {
            super();
        } 

        private Builder(ResizeColdStorageSizeRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.coldStorageSize = response.coldStorageSize;
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
         * ColdStorageSize.
         */
        public Builder coldStorageSize(Integer coldStorageSize) {
            this.putQueryParameter("ColdStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        @Override
        public ResizeColdStorageSizeRequest build() {
            return new ResizeColdStorageSizeRequest(this);
        } 

    } 

}
