// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link PrometheusInstanceStoreConfig} extends {@link TeaModel}
 *
 * <p>PrometheusInstanceStoreConfig</p>
 */
public class PrometheusInstanceStoreConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parallelCountPerHost")
    private Integer parallelCountPerHost;

    @com.aliyun.core.annotation.NameInMap("parallelEnable")
    private Boolean parallelEnable;

    @com.aliyun.core.annotation.NameInMap("parallelMode")
    private String parallelMode;

    @com.aliyun.core.annotation.NameInMap("queryCacheEnable")
    private Boolean queryCacheEnable;

    @com.aliyun.core.annotation.NameInMap("totalParallelCount")
    private Integer totalParallelCount;

    private PrometheusInstanceStoreConfig(Builder builder) {
        this.parallelCountPerHost = builder.parallelCountPerHost;
        this.parallelEnable = builder.parallelEnable;
        this.parallelMode = builder.parallelMode;
        this.queryCacheEnable = builder.queryCacheEnable;
        this.totalParallelCount = builder.totalParallelCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrometheusInstanceStoreConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parallelCountPerHost
     */
    public Integer getParallelCountPerHost() {
        return this.parallelCountPerHost;
    }

    /**
     * @return parallelEnable
     */
    public Boolean getParallelEnable() {
        return this.parallelEnable;
    }

    /**
     * @return parallelMode
     */
    public String getParallelMode() {
        return this.parallelMode;
    }

    /**
     * @return queryCacheEnable
     */
    public Boolean getQueryCacheEnable() {
        return this.queryCacheEnable;
    }

    /**
     * @return totalParallelCount
     */
    public Integer getTotalParallelCount() {
        return this.totalParallelCount;
    }

    public static final class Builder {
        private Integer parallelCountPerHost; 
        private Boolean parallelEnable; 
        private String parallelMode; 
        private Boolean queryCacheEnable; 
        private Integer totalParallelCount; 

        private Builder() {
        } 

        private Builder(PrometheusInstanceStoreConfig model) {
            this.parallelCountPerHost = model.parallelCountPerHost;
            this.parallelEnable = model.parallelEnable;
            this.parallelMode = model.parallelMode;
            this.queryCacheEnable = model.queryCacheEnable;
            this.totalParallelCount = model.totalParallelCount;
        } 

        /**
         * parallelCountPerHost.
         */
        public Builder parallelCountPerHost(Integer parallelCountPerHost) {
            this.parallelCountPerHost = parallelCountPerHost;
            return this;
        }

        /**
         * parallelEnable.
         */
        public Builder parallelEnable(Boolean parallelEnable) {
            this.parallelEnable = parallelEnable;
            return this;
        }

        /**
         * parallelMode.
         */
        public Builder parallelMode(String parallelMode) {
            this.parallelMode = parallelMode;
            return this;
        }

        /**
         * queryCacheEnable.
         */
        public Builder queryCacheEnable(Boolean queryCacheEnable) {
            this.queryCacheEnable = queryCacheEnable;
            return this;
        }

        /**
         * totalParallelCount.
         */
        public Builder totalParallelCount(Integer totalParallelCount) {
            this.totalParallelCount = totalParallelCount;
            return this;
        }

        public PrometheusInstanceStoreConfig build() {
            return new PrometheusInstanceStoreConfig(this);
        } 

    } 

}
