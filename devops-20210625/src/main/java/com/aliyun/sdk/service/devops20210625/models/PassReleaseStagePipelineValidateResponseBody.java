// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PassReleaseStagePipelineValidateResponseBody} extends {@link TeaModel}
 *
 * <p>PassReleaseStagePipelineValidateResponseBody</p>
 */
public class PassReleaseStagePipelineValidateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private PassReleaseStagePipelineValidateResponseBody(Builder builder) {
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PassReleaseStagePipelineValidateResponseBody create() {
        return builder().build();
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean success; 

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PassReleaseStagePipelineValidateResponseBody build() {
            return new PassReleaseStagePipelineValidateResponseBody(this);
        } 

    } 

}
