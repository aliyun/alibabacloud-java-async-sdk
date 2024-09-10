// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCanTrySasResponseBody} extends {@link TeaModel}
 *
 * <p>GetCanTrySasResponseBody</p>
 */
public class GetCanTrySasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCanTrySasResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCanTrySasResponseBody create() {
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
         * The data returned.
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

        public GetCanTrySasResponseBody build() {
            return new GetCanTrySasResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanTry")
        private Integer canTry;

        @com.aliyun.core.annotation.NameInMap("CanTryVersions")
        private java.util.List < Integer > canTryVersions;

        @com.aliyun.core.annotation.NameInMap("TryType")
        private Integer tryType;

        private Data(Builder builder) {
            this.canTry = builder.canTry;
            this.canTryVersions = builder.canTryVersions;
            this.tryType = builder.tryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canTry
         */
        public Integer getCanTry() {
            return this.canTry;
        }

        /**
         * @return canTryVersions
         */
        public java.util.List < Integer > getCanTryVersions() {
            return this.canTryVersions;
        }

        /**
         * @return tryType
         */
        public Integer getTryType() {
            return this.tryType;
        }

        public static final class Builder {
            private Integer canTry; 
            private java.util.List < Integer > canTryVersions; 
            private Integer tryType; 

            /**
             * Indicates whether the user is qualified for the trial use. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder canTry(Integer canTry) {
                this.canTry = canTry;
                return this;
            }

            /**
             * The editions that are allowed for the trial use.
             */
            public Builder canTryVersions(java.util.List < Integer > canTryVersions) {
                this.canTryVersions = canTryVersions;
                return this;
            }

            /**
             * The trial type. Valid values:
             * <p>
             * 
             * *   **0**: trial prohibited
             * *   **1**: first trial
             * *   **2**: second trial
             */
            public Builder tryType(Integer tryType) {
                this.tryType = tryType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
