// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HttpApiBackendMatchConditions} extends {@link TeaModel}
 *
 * <p>HttpApiBackendMatchConditions</p>
 */
public class HttpApiBackendMatchConditions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List < HttpApiBackendMatchCondition > conditions;

    @com.aliyun.core.annotation.NameInMap("default")
    private Boolean _default;

    private HttpApiBackendMatchConditions(Builder builder) {
        this.conditions = builder.conditions;
        this._default = builder._default;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiBackendMatchConditions create() {
        return builder().build();
    }

    /**
     * @return conditions
     */
    public java.util.List < HttpApiBackendMatchCondition > getConditions() {
        return this.conditions;
    }

    /**
     * @return _default
     */
    public Boolean get_default() {
        return this._default;
    }

    public static final class Builder {
        private java.util.List < HttpApiBackendMatchCondition > conditions; 
        private Boolean _default; 

        /**
         * conditions.
         */
        public Builder conditions(java.util.List < HttpApiBackendMatchCondition > conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * default.
         */
        public Builder _default(Boolean _default) {
            this._default = _default;
            return this;
        }

        public HttpApiBackendMatchConditions build() {
            return new HttpApiBackendMatchConditions(this);
        } 

    } 

}
