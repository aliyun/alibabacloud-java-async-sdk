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
 * {@link CancelKyuubiSparkApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CancelKyuubiSparkApplicationResponseBody</p>
 */
public class CancelKyuubiSparkApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("body")
    private CancelKyuubiSparkApplicationResponseBodyBody body;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CancelKyuubiSparkApplicationResponseBody(Builder builder) {
        this.body = builder.body;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelKyuubiSparkApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CancelKyuubiSparkApplicationResponseBodyBody getBody() {
        return this.body;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CancelKyuubiSparkApplicationResponseBodyBody body; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CancelKyuubiSparkApplicationResponseBody model) {
            this.body = model.body;
            this.requestId = model.requestId;
        } 

        /**
         * body.
         */
        public Builder body(CancelKyuubiSparkApplicationResponseBodyBody body) {
            this.body = body;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelKyuubiSparkApplicationResponseBody build() {
            return new CancelKyuubiSparkApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CancelKyuubiSparkApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>CancelKyuubiSparkApplicationResponseBody</p>
     */
    public static class CancelKyuubiSparkApplicationResponseBodyBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        private CancelKyuubiSparkApplicationResponseBodyBody(Builder builder) {
            this.applicationId = builder.applicationId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CancelKyuubiSparkApplicationResponseBodyBody create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String applicationId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(CancelKyuubiSparkApplicationResponseBodyBody model) {
                this.applicationId = model.applicationId;
                this.success = model.success;
            } 

            /**
             * applicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public CancelKyuubiSparkApplicationResponseBodyBody build() {
                return new CancelKyuubiSparkApplicationResponseBodyBody(this);
            } 

        } 

    }
}
