// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSparkTemplateFileResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSparkTemplateFileResponseBody</p>
 */
public class DeleteSparkTemplateFileResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteSparkTemplateFileResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSparkTemplateFileResponseBody create() {
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
         * The deletion result.
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

        public DeleteSparkTemplateFileResponseBody build() {
            return new DeleteSparkTemplateFileResponseBody(this);
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
             * Indicates whether the template file is deleted. Valid values:
             * <p>
             * 
             * *   **true**: The template file is deleted.
             * *   **false**: The template file fails to be deleted.
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
