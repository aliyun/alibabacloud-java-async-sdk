// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAppliedConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppliedConfigsResponseBody</p>
 */
public class GetAppliedConfigsResponseBody extends TeaModel {
    @NameInMap("configs")
    private java.util.List < String > configs;

    @NameInMap("count")
    private Integer count;

    private GetAppliedConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.count = builder.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppliedConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List < String > getConfigs() {
        return this.configs;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    public static final class Builder {
        private java.util.List < String > configs; 
        private Integer count; 

        /**
         * The names of the Logtail configurations.
         */
        public Builder configs(java.util.List < String > configs) {
            this.configs = configs;
            return this;
        }

        /**
         * The number of Logtail configurations.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        public GetAppliedConfigsResponseBody build() {
            return new GetAppliedConfigsResponseBody(this);
        } 

    } 

}
