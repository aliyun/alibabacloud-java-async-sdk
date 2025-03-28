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
 * {@link BuildConfig} extends {@link TeaModel}
 *
 * <p>BuildConfig</p>
 */
public class BuildConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("default")
    private DefaultBuilderConfig _default;

    private BuildConfig(Builder builder) {
        this._default = builder._default;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _default
     */
    public DefaultBuilderConfig get_default() {
        return this._default;
    }

    public static final class Builder {
        private DefaultBuilderConfig _default; 

        private Builder() {
        } 

        private Builder(BuildConfig model) {
            this._default = model._default;
        } 

        /**
         * default.
         */
        public Builder _default(DefaultBuilderConfig _default) {
            this._default = _default;
            return this;
        }

        public BuildConfig build() {
            return new BuildConfig(this);
        } 

    } 

}
