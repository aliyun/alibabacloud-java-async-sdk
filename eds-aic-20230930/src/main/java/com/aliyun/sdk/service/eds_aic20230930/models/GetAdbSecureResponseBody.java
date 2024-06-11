// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdbSecureResponseBody} extends {@link TeaModel}
 *
 * <p>GetAdbSecureResponseBody</p>
 */
public class GetAdbSecureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAdbSecureResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdbSecureResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAdbSecureResponseBody build() {
            return new GetAdbSecureResponseBody(this);
        } 

    } 

    public static class AdbSecureList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private AdbSecureList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbSecureList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceId; 
            private Integer status; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public AdbSecureList build() {
                return new AdbSecureList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbSecureList")
        private java.util.List < AdbSecureList> adbSecureList;

        private Data(Builder builder) {
            this.adbSecureList = builder.adbSecureList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adbSecureList
         */
        public java.util.List < AdbSecureList> getAdbSecureList() {
            return this.adbSecureList;
        }

        public static final class Builder {
            private java.util.List < AdbSecureList> adbSecureList; 

            /**
             * AdbSecureList.
             */
            public Builder adbSecureList(java.util.List < AdbSecureList> adbSecureList) {
                this.adbSecureList = adbSecureList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
