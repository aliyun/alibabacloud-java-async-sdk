// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryPromInstallStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPromInstallStatusResponseBody</p>
 */
public class QueryPromInstallStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>27E653FA-5958-45BE-8AA9-14D884DC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryPromInstallStatusResponseBody build() {
            return new QueryPromInstallStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPromInstallStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPromInstallStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isControllerInstalled")
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
             * <p>Indicates whether the call was successful. Valid values:</p>
             * <p>true: The call was successful. false: The call fails.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
