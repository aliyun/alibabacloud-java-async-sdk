// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yicconsole20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LxPopCmd} extends {@link TeaModel}
 *
 * <p>LxPopCmd</p>
 */
public class LxPopCmd extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    private String data;

    private LxPopCmd(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LxPopCmd create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder {
        private String data; 

        /**
         * data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        public LxPopCmd build() {
            return new LxPopCmd(this);
        } 

    } 

}
