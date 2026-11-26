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
 * {@link RLJobModelConfig} extends {@link TeaModel}
 *
 * <p>RLJobModelConfig</p>
 */
public class RLJobModelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    private RLJobModelConfig(Builder builder) {
        this.name = builder.name;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobModelConfig create() {
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

        private Builder(RLJobModelConfig model) {
            this.name = model.name;
            this.path = model.path;
        } 

        /**
         * <p>The model name, which must be unique within the Models list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>actor</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The absolute path of the model in the working container. It can be located in a DataSources mount directory or preset in the image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/input/models/qwen</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public RLJobModelConfig build() {
            return new RLJobModelConfig(this);
        } 

    } 

}
