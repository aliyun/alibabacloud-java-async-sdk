// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceCreateResponseBody} extends {@link TeaModel}
 *
 * <p>OnsInstanceCreateResponseBody</p>
 */
public class OnsInstanceCreateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsInstanceCreateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceCreateResponseBody create() {
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
         * The results that are returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsInstanceCreateResponseBody build() {
            return new OnsInstanceCreateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private Integer instanceType;

        private Data(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public Integer getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceId; 
            private Integer instanceType; 

            /**
             * The ID of the instance that you created.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The edition of the instance. Valid value:
             * <p>
             * 
             * *   **1**: Standard Edition
             */
            public Builder instanceType(Integer instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
