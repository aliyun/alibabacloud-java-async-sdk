// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLJobDatasetConfig} extends {@link TeaModel}
 *
 * <p>RLJobDatasetConfig</p>
 */
public class RLJobDatasetConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    private RLJobDatasetConfig(Builder builder) {
        this.name = builder.name;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobDatasetConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder {
        private String name; 
        private String path; 

        private Builder() {
        } 

        private Builder(RLJobDatasetConfig model) {
            this.name = model.name;
            this.path = model.path;
        } 

        /**
         * <p>数据集名称，在 Datasets 列表内唯一</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gsm8k</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>工作容器内的数据集绝对路径；可指向目录或文件，可位于 DataSources 挂载目录内，也可由镜像预置</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/input/gsm8k</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public RLJobDatasetConfig build() {
            return new RLJobDatasetConfig(this);
        } 

    } 

}
