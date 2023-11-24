// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPerRequestLogsOutput} extends {@link TeaModel}
 *
 * <p>GetPerRequestLogsOutput</p>
 */
public class GetPerRequestLogsOutput extends TeaModel {
    @NameInMap("data")
    private String data;

    @NameInMap("requestId")
    private String requestId;

    private GetPerRequestLogsOutput(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPerRequestLogsOutput create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPerRequestLogsOutput build() {
            return new GetPerRequestLogsOutput(this);
        } 

    } 

}
