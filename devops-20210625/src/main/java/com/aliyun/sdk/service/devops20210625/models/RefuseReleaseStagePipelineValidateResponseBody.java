// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefuseReleaseStagePipelineValidateResponseBody} extends {@link TeaModel}
 *
 * <p>RefuseReleaseStagePipelineValidateResponseBody</p>
 */
public class RefuseReleaseStagePipelineValidateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private RefuseReleaseStagePipelineValidateResponseBody(Builder builder) {
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefuseReleaseStagePipelineValidateResponseBody create() {
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

        public RefuseReleaseStagePipelineValidateResponseBody build() {
            return new RefuseReleaseStagePipelineValidateResponseBody(this);
        } 

    } 

}
