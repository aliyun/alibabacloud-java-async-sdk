// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApiTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetApiTemplateResponseBody</p>
 */
public class GetApiTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    @Deprecated
    private ApiTemplate data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApiTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public ApiTemplate getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiTemplate data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(ApiTemplate data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApiTemplateResponseBody build() {
            return new GetApiTemplateResponseBody(this);
        } 

    } 

}
