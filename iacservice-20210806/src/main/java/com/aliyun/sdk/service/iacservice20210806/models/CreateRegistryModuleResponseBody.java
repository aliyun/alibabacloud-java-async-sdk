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
 * {@link CreateRegistryModuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRegistryModuleResponseBody</p>
 */
public class CreateRegistryModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private CreateRegistryModuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRegistryModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder {
        private String requestId; 
        private String source; 

        private Builder() {
        } 

        private Builder(CreateRegistryModuleResponseBody model) {
            this.requestId = model.requestId;
            this.source = model.source;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public CreateRegistryModuleResponseBody build() {
            return new CreateRegistryModuleResponseBody(this);
        } 

    } 

}
