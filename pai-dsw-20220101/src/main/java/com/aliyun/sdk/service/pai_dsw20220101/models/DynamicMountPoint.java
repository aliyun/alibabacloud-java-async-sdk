// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link DynamicMountPoint} extends {@link TeaModel}
 *
 * <p>DynamicMountPoint</p>
 */
public class DynamicMountPoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.NameInMap("RootPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rootPath;

    private DynamicMountPoint(Builder builder) {
        this.options = builder.options;
        this.rootPath = builder.rootPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DynamicMountPoint create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return rootPath
     */
    public String getRootPath() {
        return this.rootPath;
    }

    public static final class Builder {
        private String options; 
        private String rootPath; 

        private Builder() {
        } 

        private Builder(DynamicMountPoint model) {
            this.options = model.options;
            this.rootPath = model.rootPath;
        } 

        /**
         * Options.
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder rootPath(String rootPath) {
            this.rootPath = rootPath;
            return this;
        }

        public DynamicMountPoint build() {
            return new DynamicMountPoint(this);
        } 

    } 

}
