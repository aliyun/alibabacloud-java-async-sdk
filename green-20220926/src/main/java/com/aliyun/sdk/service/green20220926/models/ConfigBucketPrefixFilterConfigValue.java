// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ConfigBucketPrefixFilterConfigValue} extends {@link TeaModel}
 *
 * <p>ConfigBucketPrefixFilterConfigValue</p>
 */
public class ConfigBucketPrefixFilterConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PrefixFilterType")
    private String prefixFilterType;

    @com.aliyun.core.annotation.NameInMap("PrefixFilters")
    private java.util.List<String> prefixFilters;

    private ConfigBucketPrefixFilterConfigValue(Builder builder) {
        this.prefixFilterType = builder.prefixFilterType;
        this.prefixFilters = builder.prefixFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigBucketPrefixFilterConfigValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prefixFilterType
     */
    public String getPrefixFilterType() {
        return this.prefixFilterType;
    }

    /**
     * @return prefixFilters
     */
    public java.util.List<String> getPrefixFilters() {
        return this.prefixFilters;
    }

    public static final class Builder {
        private String prefixFilterType; 
        private java.util.List<String> prefixFilters; 

        private Builder() {
        } 

        private Builder(ConfigBucketPrefixFilterConfigValue model) {
            this.prefixFilterType = model.prefixFilterType;
            this.prefixFilters = model.prefixFilters;
        } 

        /**
         * PrefixFilterType.
         */
        public Builder prefixFilterType(String prefixFilterType) {
            this.prefixFilterType = prefixFilterType;
            return this;
        }

        /**
         * PrefixFilters.
         */
        public Builder prefixFilters(java.util.List<String> prefixFilters) {
            this.prefixFilters = prefixFilters;
            return this;
        }

        public ConfigBucketPrefixFilterConfigValue build() {
            return new ConfigBucketPrefixFilterConfigValue(this);
        } 

    } 

}
