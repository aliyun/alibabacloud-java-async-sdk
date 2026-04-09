// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BoundToolApi} extends {@link TeaModel}
 *
 * <p>BoundToolApi</p>
 */
public class BoundToolApi extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    private BoundToolApi(Builder builder) {
        this.method = builder.method;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BoundToolApi create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder {
        private String method; 
        private String path; 

        private Builder() {
        } 

        private Builder(BoundToolApi model) {
            this.method = model.method;
            this.path = model.path;
        } 

        /**
         * method.
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public BoundToolApi build() {
            return new BoundToolApi(this);
        } 

    } 

}
