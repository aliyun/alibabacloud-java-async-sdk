// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ResizeColdStorageSizeRequest} extends {@link RequestModel}
 *
 * <p>ResizeColdStorageSizeRequest</p>
 */
public class ResizeColdStorageSizeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdStorageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100000000)
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

        private Builder(ResizeColdStorageSizeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.coldStorageSize = request.coldStorageSize;
        } 

        /**
         * <p>The ID of the HBase instance. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp169l540vc6c****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cold storage capacity after the change. Unit: GB. Valid values: <strong>800</strong> to <strong>1000000</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
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
