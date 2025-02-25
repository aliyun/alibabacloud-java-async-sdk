// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolarDbReadWeightResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPolarDbReadWeightResponseBody</p>
 */
public class ModifyPolarDbReadWeightResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ModifyPolarDbReadWeightResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolarDbReadWeightResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the database creation failure records were removed from the PolarDB-X instance.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModifyPolarDbReadWeightResponseBody build() {
            return new ModifyPolarDbReadWeightResponseBody(this);
        } 

    } 

}
