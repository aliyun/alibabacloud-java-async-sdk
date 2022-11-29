// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunAfter} extends {@link TeaModel}
 *
 * <p>RunAfter</p>
 */
public class RunAfter extends TeaModel {
    @NameInMap("name")
    private String name;

    private RunAfter(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAfter create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String name; 

        /**
         * Task name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public RunAfter build() {
            return new RunAfter(this);
        } 

    } 

}
