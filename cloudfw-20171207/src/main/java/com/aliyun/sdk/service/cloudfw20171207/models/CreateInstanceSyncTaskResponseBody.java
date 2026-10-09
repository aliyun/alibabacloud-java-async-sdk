// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateInstanceSyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceSyncTaskResponseBody</p>
 */
public class CreateInstanceSyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateInstanceSyncTaskResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceSyncTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateInstanceSyncTaskResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application module.</p>
         * 
         * <strong>example:</strong>
         * <p>ips_server</p>
         */
        public Builder module(String module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D19D8F70-D64B-5A95-905A-6073BF4A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInstanceSyncTaskResponseBody build() {
            return new CreateInstanceSyncTaskResponseBody(this);
        } 

    } 

}
