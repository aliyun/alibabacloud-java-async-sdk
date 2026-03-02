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
 * {@link NeuronClientInfoPageResult} extends {@link TeaModel}
 *
 * <p>NeuronClientInfoPageResult</p>
 */
public class NeuronClientInfoPageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<NeuronAppClientInfo> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("showApp")
    private Boolean showApp;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private NeuronClientInfoPageResult(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.showApp = builder.showApp;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronClientInfoPageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<NeuronAppClientInfo> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showApp
     */
    public Boolean getShowApp() {
        return this.showApp;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<NeuronAppClientInfo> data; 
        private String requestId; 
        private Boolean showApp; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(NeuronClientInfoPageResult model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.showApp = model.showApp;
            this.total = model.total;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<NeuronAppClientInfo> data) {
            this.data = data;
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
         * showApp.
         */
        public Builder showApp(Boolean showApp) {
            this.showApp = showApp;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public NeuronClientInfoPageResult build() {
            return new NeuronClientInfoPageResult(this);
        } 

    } 

}
