// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link CacheInfo} extends {@link TeaModel}
 *
 * <p>CacheInfo</p>
 */
public class CacheInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountPoint")
    private String mountPoint;

    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    private CacheInfo(Builder builder) {
        this.mountPoint = builder.mountPoint;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CacheInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountPoint
     */
    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    public static final class Builder {
        private String mountPoint; 
        private String port; 

        private Builder() {
        } 

        private Builder(CacheInfo model) {
            this.mountPoint = model.mountPoint;
            this.port = model.port;
        } 

        /**
         * <p>The mount point address of the datasource for service registration in the cache service, such as an OSS Bucket path or a CPFS path.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://your-bucket.oss-cn-wulanchabu-internal.aliyuncs.com/</p>
         */
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }

        /**
         * <p>The port number that the cache service provides for external access to the datasource. The client must access cached data through this port.</p>
         * 
         * <strong>example:</strong>
         * <p>10080</p>
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public CacheInfo build() {
            return new CacheInfo(this);
        } 

    } 

}
