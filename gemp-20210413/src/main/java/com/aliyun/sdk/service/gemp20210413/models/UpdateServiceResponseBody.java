// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateServiceResponseBody</p>
 */
public class UpdateServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Long data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateServiceResponseBody build() {
            return new UpdateServiceResponseBody(this);
        } 

    } 

}
