// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ServiceLabelsValue} extends {@link TeaModel}
 *
 * <p>ServiceLabelsValue</p>
 */
public class ServiceLabelsValue extends TeaModel {
    @NameInMap("Labels")
    private java.util.Map < String, String > labels;

    @NameInMap("Success")
    private Boolean success;

    private ServiceLabelsValue(Builder builder) {
        this.labels = builder.labels;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceLabelsValue create() {
        return builder().build();
    }

    /**
     * @return labels
     */
    public java.util.Map < String, String > getLabels() {
        return this.labels;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.Map < String, String > labels; 
        private Boolean success; 

        /**
         * Labels.
         */
        public Builder labels(java.util.Map < String, String > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ServiceLabelsValue build() {
            return new ServiceLabelsValue(this);
        } 

    } 

}
