// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPromInstallStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPromInstallStatusResponseBody</p>
 */
public class QueryPromInstallStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryPromInstallStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPromInstallStatusResponseBody create() {
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
         * The returned struct.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPromInstallStatusResponseBody build() {
            return new QueryPromInstallStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("isControllerInstalled")
        private Boolean isControllerInstalled;

        private Data(Builder builder) {
            this.isControllerInstalled = builder.isControllerInstalled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isControllerInstalled
         */
        public Boolean getIsControllerInstalled() {
            return this.isControllerInstalled;
        }

        public static final class Builder {
            private Boolean isControllerInstalled; 

            /**
             * Indicates whether the call was successful. Valid values:
             * <p>
             * 
             * true: The call was successful. false: The call fails.
             */
            public Builder isControllerInstalled(Boolean isControllerInstalled) {
                this.isControllerInstalled = isControllerInstalled;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
