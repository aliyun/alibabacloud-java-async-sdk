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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(FunctionLayer model) {
            this.arn = model.arn;
            this.size = model.size;
        } 

        /**
         * <p>The resource identifier of the layer version.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-beijing:186824xxxxxx:layers/fc_layer/versions/1</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The size of the layer code package. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>421</p>
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
