// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link BuildCacheConfig} extends {@link TeaModel}
 *
 * <p>BuildCacheConfig</p>
 */
public class BuildCacheConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("keyPath")
    private java.util.Map<String, ?> keyPath;

    @com.aliyun.core.annotation.NameInMap("paths")
    private java.util.List<String> paths;

    private BuildCacheConfig(Builder builder) {
        this.keyPath = builder.keyPath;
        this.paths = builder.paths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildCacheConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyPath
     */
    public java.util.Map<String, ?> getKeyPath() {
        return this.keyPath;
    }

    /**
     * @return paths
     */
    public java.util.List<String> getPaths() {
        return this.paths;
    }

    public static final class Builder {
        private java.util.Map<String, ?> keyPath; 
        private java.util.List<String> paths; 

        private Builder() {
        } 

        private Builder(BuildCacheConfig model) {
            this.keyPath = model.keyPath;
            this.paths = model.paths;
        } 

        /**
         * keyPath.
         */
        public Builder keyPath(java.util.Map<String, ?> keyPath) {
            this.keyPath = keyPath;
            return this;
        }

        /**
         * paths.
         */
        public Builder paths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }

        public BuildCacheConfig build() {
            return new BuildCacheConfig(this);
        } 

    } 

}
