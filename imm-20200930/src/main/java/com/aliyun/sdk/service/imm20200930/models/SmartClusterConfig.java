// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link SmartClusterConfig} extends {@link TeaModel}
 *
 * <p>SmartClusterConfig</p>
 */
public class SmartClusterConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Figure")
    private FigureClusterConfig figure;

    private SmartClusterConfig(Builder builder) {
        this.figure = builder.figure;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartClusterConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return figure
     */
    public FigureClusterConfig getFigure() {
        return this.figure;
    }

    public static final class Builder {
        private FigureClusterConfig figure; 

        private Builder() {
        } 

        private Builder(SmartClusterConfig model) {
            this.figure = model.figure;
        } 

        /**
         * Figure.
         */
        public Builder figure(FigureClusterConfig figure) {
            this.figure = figure;
            return this;
        }

        public SmartClusterConfig build() {
            return new SmartClusterConfig(this);
        } 

    } 

}
