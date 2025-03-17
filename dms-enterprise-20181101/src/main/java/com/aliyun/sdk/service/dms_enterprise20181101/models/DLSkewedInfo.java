// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DLSkewedInfo} extends {@link TeaModel}
 *
 * <p>DLSkewedInfo</p>
 */
public class DLSkewedInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("SkewedColNames")
    private java.util.List<String> skewedColNames;

    @com.aliyun.core.annotation.NameInMap("SkewedColValueLocationMaps")
    private java.util.Map<String, ?> skewedColValueLocationMaps;

    @com.aliyun.core.annotation.NameInMap("SkewedColValues")
    private java.util.List<java.util.List<String>> skewedColValues;

    private DLSkewedInfo(Builder builder) {
        this.skewedColNames = builder.skewedColNames;
        this.skewedColValueLocationMaps = builder.skewedColValueLocationMaps;
        this.skewedColValues = builder.skewedColValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLSkewedInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return skewedColNames
     */
    public java.util.List<String> getSkewedColNames() {
        return this.skewedColNames;
    }

    /**
     * @return skewedColValueLocationMaps
     */
    public java.util.Map<String, ?> getSkewedColValueLocationMaps() {
        return this.skewedColValueLocationMaps;
    }

    /**
     * @return skewedColValues
     */
    public java.util.List<java.util.List<String>> getSkewedColValues() {
        return this.skewedColValues;
    }

    public static final class Builder {
        private java.util.List<String> skewedColNames; 
        private java.util.Map<String, ?> skewedColValueLocationMaps; 
        private java.util.List<java.util.List<String>> skewedColValues; 

        private Builder() {
        } 

        private Builder(DLSkewedInfo model) {
            this.skewedColNames = model.skewedColNames;
            this.skewedColValueLocationMaps = model.skewedColValueLocationMaps;
            this.skewedColValues = model.skewedColValues;
        } 

        /**
         * SkewedColNames.
         */
        public Builder skewedColNames(java.util.List<String> skewedColNames) {
            this.skewedColNames = skewedColNames;
            return this;
        }

        /**
         * SkewedColValueLocationMaps.
         */
        public Builder skewedColValueLocationMaps(java.util.Map<String, ?> skewedColValueLocationMaps) {
            this.skewedColValueLocationMaps = skewedColValueLocationMaps;
            return this;
        }

        /**
         * SkewedColValues.
         */
        public Builder skewedColValues(java.util.List<java.util.List<String>> skewedColValues) {
            this.skewedColValues = skewedColValues;
            return this;
        }

        public DLSkewedInfo build() {
            return new DLSkewedInfo(this);
        } 

    } 

}
