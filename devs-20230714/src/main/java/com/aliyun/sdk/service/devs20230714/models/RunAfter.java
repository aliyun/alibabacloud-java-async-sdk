// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunAfter} extends {@link TeaModel}
 *
 * <p>RunAfter</p>
 */
public class RunAfter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
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
         * name.
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
