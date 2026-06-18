// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link E2BVolumeMount} extends {@link TeaModel}
 *
 * <p>E2BVolumeMount</p>
 */
public class E2BVolumeMount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    private E2BVolumeMount(Builder builder) {
        this.name = builder.name;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BVolumeMount create() {
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

        private Builder(E2BVolumeMount model) {
            this.name = model.name;
            this.path = model.path;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public E2BVolumeMount build() {
            return new E2BVolumeMount(this);
        } 

    } 

}
