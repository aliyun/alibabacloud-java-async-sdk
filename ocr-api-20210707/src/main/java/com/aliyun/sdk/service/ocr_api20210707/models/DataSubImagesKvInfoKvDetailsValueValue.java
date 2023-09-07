// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSubImagesKvInfoKvDetailsValueValue} extends {@link TeaModel}
 *
 * <p>DataSubImagesKvInfoKvDetailsValueValue</p>
 */
public class DataSubImagesKvInfoKvDetailsValueValue extends TeaModel {
    @NameInMap("X")
    private Integer x;

    @NameInMap("Y")
    private Integer y;

    private DataSubImagesKvInfoKvDetailsValueValue(Builder builder) {
        this.x = builder.x;
        this.y = builder.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSubImagesKvInfoKvDetailsValueValue create() {
        return builder().build();
    }

    /**
     * @return x
     */
    public Integer getX() {
        return this.x;
    }

    /**
     * @return y
     */
    public Integer getY() {
        return this.y;
    }

    public static final class Builder {
        private Integer x; 
        private Integer y; 

        /**
         * X.
         */
        public Builder x(Integer x) {
            this.x = x;
            return this;
        }

        /**
         * Y.
         */
        public Builder y(Integer y) {
            this.y = y;
            return this;
        }

        public DataSubImagesKvInfoKvDetailsValueValue build() {
            return new DataSubImagesKvInfoKvDetailsValueValue(this);
        } 

    } 

}
