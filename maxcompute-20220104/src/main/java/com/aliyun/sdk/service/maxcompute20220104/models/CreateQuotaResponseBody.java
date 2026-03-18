// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQuotaResponseBody</p>
 */
public class CreateQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateQuotaResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateQuotaResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
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

        public CreateQuotaResponseBody build() {
            return new CreateQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>CreateQuotaResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        private Data(Builder builder) {
            this.nickName = builder.nickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private String nickName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nickName = model.nickName;
            } 

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
