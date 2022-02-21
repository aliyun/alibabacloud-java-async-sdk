// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiagnoseResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDiagnoseResponseBody</p>
 */
public class ModifyDiagnoseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Integer data;

    private ModifyDiagnoseResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiagnoseResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Integer getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Integer data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Integer data) {
            this.data = data;
            return this;
        }

        public ModifyDiagnoseResponseBody build() {
            return new ModifyDiagnoseResponseBody(this);
        } 

    } 

}
