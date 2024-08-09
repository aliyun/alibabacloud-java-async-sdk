// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJobConfigParam} extends {@link TeaModel}
 *
 * <p>UpdateJobConfigParam</p>
 */
public class UpdateJobConfigParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("newFlinkConf")
    private java.util.Map < String, ? > newFlinkConf;

    private UpdateJobConfigParam(Builder builder) {
        this.newFlinkConf = builder.newFlinkConf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobConfigParam create() {
        return builder().build();
    }

    /**
     * @return newFlinkConf
     */
    public java.util.Map < String, ? > getNewFlinkConf() {
        return this.newFlinkConf;
    }

    public static final class Builder {
        private java.util.Map < String, ? > newFlinkConf; 

        /**
         * newFlinkConf.
         */
        public Builder newFlinkConf(java.util.Map < String, ? > newFlinkConf) {
            this.newFlinkConf = newFlinkConf;
            return this;
        }

        public UpdateJobConfigParam build() {
            return new UpdateJobConfigParam(this);
        } 

    } 

}
