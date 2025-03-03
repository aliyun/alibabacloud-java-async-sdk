// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link FunctionLayer} extends {@link TeaModel}
 *
 * <p>FunctionLayer</p>
 */
public class FunctionLayer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private FunctionLayer(Builder builder) {
        this.arn = builder.arn;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionLayer create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private String arn; 
        private Long size; 

        /**
         * arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public FunctionLayer build() {
            return new FunctionLayer(this);
        } 

    } 

}
