// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SetAIServiceResponseBody} extends {@link TeaModel}
 *
 * <p>SetAIServiceResponseBody</p>
 */
public class SetAIServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedTypes")
    private String failedTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessTypes")
    private String successTypes;

    private SetAIServiceResponseBody(Builder builder) {
        this.failedTypes = builder.failedTypes;
        this.requestId = builder.requestId;
        this.successTypes = builder.successTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAIServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedTypes
     */
    public String getFailedTypes() {
        return this.failedTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successTypes
     */
    public String getSuccessTypes() {
        return this.successTypes;
    }

    public static final class Builder {
        private String failedTypes; 
        private String requestId; 
        private String successTypes; 

        private Builder() {
        } 

        private Builder(SetAIServiceResponseBody model) {
            this.failedTypes = model.failedTypes;
            this.requestId = model.requestId;
            this.successTypes = model.successTypes;
        } 

        /**
         * FailedTypes.
         */
        public Builder failedTypes(String failedTypes) {
            this.failedTypes = failedTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessTypes.
         */
        public Builder successTypes(String successTypes) {
            this.successTypes = successTypes;
            return this;
        }

        public SetAIServiceResponseBody build() {
            return new SetAIServiceResponseBody(this);
        } 

    } 

}
