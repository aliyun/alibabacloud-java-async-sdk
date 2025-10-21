// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link Cell} extends {@link TeaModel}
 *
 * <p>Cell</p>
 */
public class Cell extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private Cell(Builder builder) {
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Cell create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String value; 

        private Builder() {
        } 

        private Builder(Cell model) {
            this.value = model.value;
        } 

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Cell build() {
            return new Cell(this);
        } 

    } 

}
