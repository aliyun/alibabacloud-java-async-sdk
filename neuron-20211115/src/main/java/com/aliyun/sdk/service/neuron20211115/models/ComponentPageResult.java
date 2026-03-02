// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ComponentPageResult} extends {@link TeaModel}
 *
 * <p>ComponentPageResult</p>
 */
public class ComponentPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<PdpComponent> list;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ComponentPageResult(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComponentPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<PdpComponent> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<PdpComponent> list; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ComponentPageResult model) {
            this.list = model.list;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * list.
         */
        public Builder list(java.util.List<PdpComponent> list) {
            this.list = list;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ComponentPageResult build() {
            return new ComponentPageResult(this);
        } 

    } 

}
