// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link Runtime} extends {@link TeaModel}
 *
 * <p>Runtime</p>
 */
public class Runtime extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private Runtime(Builder builder) {
        this.name = builder.name;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Runtime create() {
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String name; 
        private String version; 

        private Builder() {
        } 

        private Builder(Runtime model) {
            this.name = model.name;
            this.version = model.version;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Runtime build() {
            return new Runtime(this);
        } 

    } 

}
