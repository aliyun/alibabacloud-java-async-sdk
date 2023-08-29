// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkewedInfo} extends {@link TeaModel}
 *
 * <p>SkewedInfo</p>
 */
public class SkewedInfo extends TeaModel {
    @NameInMap("SkewedColNames")
    private java.util.List < String > skewedColNames;

    @NameInMap("SkewedColValueLocationMaps")
    private java.util.Map < String, String > skewedColValueLocationMaps;

    @NameInMap("SkewedColValues")
    private java.util.List < java.util.List < String > > skewedColValues;

    private SkewedInfo(Builder builder) {
        this.skewedColNames = builder.skewedColNames;
        this.skewedColValueLocationMaps = builder.skewedColValueLocationMaps;
        this.skewedColValues = builder.skewedColValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkewedInfo create() {
        return builder().build();
    }

    /**
     * @return skewedColNames
     */
    public java.util.List < String > getSkewedColNames() {
        return this.skewedColNames;
    }

    /**
     * @return skewedColValueLocationMaps
     */
    public java.util.Map < String, String > getSkewedColValueLocationMaps() {
        return this.skewedColValueLocationMaps;
    }

    /**
     * @return skewedColValues
     */
    public java.util.List < java.util.List < String > > getSkewedColValues() {
        return this.skewedColValues;
    }

    public static final class Builder {
        private java.util.List < String > skewedColNames; 
        private java.util.Map < String, String > skewedColValueLocationMaps; 
        private java.util.List < java.util.List < String > > skewedColValues; 

        /**
         * SkewedColNames.
         */
        public Builder skewedColNames(java.util.List < String > skewedColNames) {
            this.skewedColNames = skewedColNames;
            return this;
        }

        /**
         * SkewedColValueLocationMaps.
         */
        public Builder skewedColValueLocationMaps(java.util.Map < String, String > skewedColValueLocationMaps) {
            this.skewedColValueLocationMaps = skewedColValueLocationMaps;
            return this;
        }

        /**
         * SkewedColValues.
         */
        public Builder skewedColValues(java.util.List < java.util.List < String > > skewedColValues) {
            this.skewedColValues = skewedColValues;
            return this;
        }

        public SkewedInfo build() {
            return new SkewedInfo(this);
        } 

    } 

}
