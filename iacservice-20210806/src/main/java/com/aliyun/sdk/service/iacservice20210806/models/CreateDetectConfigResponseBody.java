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
 * {@link CreateDetectConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDetectConfigResponseBody</p>
 */
public class CreateDetectConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("detectConfigId")
    private String detectConfigId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateDetectConfigResponseBody(Builder builder) {
        this.detectConfigId = builder.detectConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDetectConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectConfigId
     */
    public String getDetectConfigId() {
        return this.detectConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String detectConfigId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDetectConfigResponseBody model) {
            this.detectConfigId = model.detectConfigId;
            this.requestId = model.requestId;
        } 

        /**
         * detectConfigId.
         */
        public Builder detectConfigId(String detectConfigId) {
            this.detectConfigId = detectConfigId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDetectConfigResponseBody build() {
            return new CreateDetectConfigResponseBody(this);
        } 

    } 

}
