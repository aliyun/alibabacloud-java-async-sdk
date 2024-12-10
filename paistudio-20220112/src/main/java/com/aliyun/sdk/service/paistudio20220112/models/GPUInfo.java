// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GPUInfo} extends {@link TeaModel}
 *
 * <p>GPUInfo</p>
 */
public class GPUInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GPUInfo(Builder builder) {
        this.count = builder.count;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GPUInfo create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long count; 
        private String type; 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GPUInfo build() {
            return new GPUInfo(this);
        } 

    } 

}
