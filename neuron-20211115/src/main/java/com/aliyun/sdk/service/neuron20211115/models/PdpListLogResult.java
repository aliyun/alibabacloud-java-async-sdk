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
 * {@link PdpListLogResult} extends {@link TeaModel}
 *
 * <p>PdpListLogResult</p>
 */
public class PdpListLogResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logs")
    private java.util.List<PdpLog> logs;

    private PdpListLogResult(Builder builder) {
        this.logs = builder.logs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpListLogResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logs
     */
    public java.util.List<PdpLog> getLogs() {
        return this.logs;
    }

    public static final class Builder {
        private java.util.List<PdpLog> logs; 

        private Builder() {
        } 

        private Builder(PdpListLogResult model) {
            this.logs = model.logs;
        } 

        /**
         * logs.
         */
        public Builder logs(java.util.List<PdpLog> logs) {
            this.logs = logs;
            return this;
        }

        public PdpListLogResult build() {
            return new PdpListLogResult(this);
        } 

    } 

}
