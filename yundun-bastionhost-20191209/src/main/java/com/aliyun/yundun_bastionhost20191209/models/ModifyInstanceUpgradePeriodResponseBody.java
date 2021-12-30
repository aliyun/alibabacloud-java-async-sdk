// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyInstanceUpgradePeriodResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceUpgradePeriodResponseBody</p>
 */
public class ModifyInstanceUpgradePeriodResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyInstanceUpgradePeriodResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceUpgradePeriodResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceUpgradePeriodResponseBody build() {
            return new ModifyInstanceUpgradePeriodResponseBody(this);
        } 

    } 

}
