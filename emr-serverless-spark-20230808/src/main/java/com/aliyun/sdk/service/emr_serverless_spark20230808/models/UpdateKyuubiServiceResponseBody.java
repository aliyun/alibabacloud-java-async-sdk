// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link UpdateKyuubiServiceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKyuubiServiceResponseBody</p>
 */
public class UpdateKyuubiServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateKyuubiServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKyuubiServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateKyuubiServiceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Object data) {
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

        public UpdateKyuubiServiceResponseBody build() {
            return new UpdateKyuubiServiceResponseBody(this);
        } 

    } 

}
