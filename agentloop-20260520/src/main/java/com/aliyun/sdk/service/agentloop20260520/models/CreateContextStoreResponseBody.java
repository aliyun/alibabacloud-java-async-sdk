// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link CreateContextStoreResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContextStoreResponseBody</p>
 */
public class CreateContextStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("strategyVersion")
    private Integer strategyVersion;

    private CreateContextStoreResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategyVersion = builder.strategyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextStoreResponseBody create() {
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
     * @return strategyVersion
     */
    public Integer getStrategyVersion() {
        return this.strategyVersion;
    }

    public static final class Builder {
        private String requestId; 
        private Integer strategyVersion; 

        private Builder() {
        } 

        private Builder(CreateContextStoreResponseBody model) {
            this.requestId = model.requestId;
            this.strategyVersion = model.strategyVersion;
        } 

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * strategyVersion.
         */
        public Builder strategyVersion(Integer strategyVersion) {
            this.strategyVersion = strategyVersion;
            return this;
        }

        public CreateContextStoreResponseBody build() {
            return new CreateContextStoreResponseBody(this);
        } 

    } 

}
