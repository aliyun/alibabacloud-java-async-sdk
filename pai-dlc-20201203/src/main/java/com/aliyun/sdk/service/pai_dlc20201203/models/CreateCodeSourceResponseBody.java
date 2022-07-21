// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCodeSourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCodeSourceResponseBody</p>
 */
public class CreateCodeSourceResponseBody extends TeaModel {
    @NameInMap("CodeSourceId")
    private String codeSourceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCodeSourceResponseBody(Builder builder) {
        this.codeSourceId = builder.codeSourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCodeSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeSourceId
     */
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String codeSourceId; 
        private String requestId; 

        /**
         * 创建的代码源配置的ID
         */
        public Builder codeSourceId(String codeSourceId) {
            this.codeSourceId = codeSourceId;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCodeSourceResponseBody build() {
            return new CreateCodeSourceResponseBody(this);
        } 

    } 

}
