// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCheckInstanceResultResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCheckInstanceResultResponseBody</p>
 */
public class VerifyCheckInstanceResultResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyCheckInstanceResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckInstanceResultResponseBody create() {
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyCheckInstanceResultResponseBody build() {
            return new VerifyCheckInstanceResultResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("FailInstances")
        private java.util.List < String > failInstances;

        @NameInMap("OperateCode")
        private String operateCode;

        private Data(Builder builder) {
            this.failInstances = builder.failInstances;
            this.operateCode = builder.operateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failInstances
         */
        public java.util.List < String > getFailInstances() {
            return this.failInstances;
        }

        /**
         * @return operateCode
         */
        public String getOperateCode() {
            return this.operateCode;
        }

        public static final class Builder {
            private java.util.List < String > failInstances; 
            private String operateCode; 

            /**
             * An array consisting of instances that failed the check.
             */
            public Builder failInstances(java.util.List < String > failInstances) {
                this.failInstances = failInstances;
                return this;
            }

            /**
             * The operation code of the task that checks the configurations of cloud services. Valid values:
             * <p>
             * 
             * *   **Throttling**
             * *   **ActionTrialUnauthorized**
             */
            public Builder operateCode(String operateCode) {
                this.operateCode = operateCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
