// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSparkTemplateFileResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSparkTemplateFileResponseBody</p>
 */
public class UpdateSparkTemplateFileResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateSparkTemplateFileResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSparkTemplateFileResponseBody create() {
        return builder().build();
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

        /**
         * The update result.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateSparkTemplateFileResponseBody build() {
            return new UpdateSparkTemplateFileResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Succeeded")
        private Boolean succeeded;

        private Data(Builder builder) {
            this.succeeded = builder.succeeded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return succeeded
         */
        public Boolean getSucceeded() {
            return this.succeeded;
        }

        public static final class Builder {
            private Boolean succeeded; 

            /**
             * Indicates whether the application template is updated.
             * <p>
             * 
             * *   **true**: The application template is updated.
             * *   **false**: The application template fails to be updated.
             */
            public Builder succeeded(Boolean succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
