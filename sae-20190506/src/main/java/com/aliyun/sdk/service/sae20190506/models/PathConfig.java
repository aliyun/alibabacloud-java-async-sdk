// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link PathConfig} extends {@link TeaModel}
 *
 * <p>PathConfig</p>
 */
public class PathConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicationName")
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    private PathConfig(Builder builder) {
        this.applicationName = builder.applicationName;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PathConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder {
        private String applicationName; 
        private String path; 

        private Builder() {
        } 

        private Builder(PathConfig model) {
            this.applicationName = model.applicationName;
            this.path = model.path;
        } 

        /**
         * applicationName.
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public PathConfig build() {
            return new PathConfig(this);
        } 

    } 

}
