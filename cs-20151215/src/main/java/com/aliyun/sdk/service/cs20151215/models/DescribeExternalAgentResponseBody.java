// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExternalAgentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExternalAgentResponseBody</p>
 */
public class DescribeExternalAgentResponseBody extends TeaModel {
    @NameInMap("config")
    private String config;

    private DescribeExternalAgentResponseBody(Builder builder) {
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExternalAgentResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    public static final class Builder {
        private String config; 

        /**
         * The agent configurations in YAML format.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        public DescribeExternalAgentResponseBody build() {
            return new DescribeExternalAgentResponseBody(this);
        } 

    } 

}
