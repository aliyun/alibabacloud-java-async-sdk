// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NodeSpec} extends {@link TeaModel}
 *
 * <p>NodeSpec</p>
 */
public class NodeSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private NodeSpec(Builder builder) {
        this.count = builder.count;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeSpec create() {
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
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public NodeSpec build() {
            return new NodeSpec(this);
        } 

    } 

}
