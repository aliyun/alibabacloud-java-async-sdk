// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link CreateModuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModuleResponseBody</p>
 */
public class CreateModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("moduleId")
    private String moduleId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateModuleResponseBody(Builder builder) {
        this.moduleId = builder.moduleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String moduleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateModuleResponseBody model) {
            this.moduleId = model.moduleId;
            this.requestId = model.requestId;
        } 

        /**
         * moduleId.
         */
        public Builder moduleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateModuleResponseBody build() {
            return new CreateModuleResponseBody(this);
        } 

    } 

}
