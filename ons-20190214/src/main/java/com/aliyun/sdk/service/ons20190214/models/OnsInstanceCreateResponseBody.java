// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsInstanceCreateResponseBody} extends {@link TeaModel}
 *
 * <p>OnsInstanceCreateResponseBody</p>
 */
public class OnsInstanceCreateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The result returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A07E3902-B92E-44A6-B6C5-6AA111111****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsInstanceCreateResponseBody build() {
            return new OnsInstanceCreateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsInstanceCreateResponseBody} extends {@link TeaModel}
     *
     * <p>OnsInstanceCreateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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
             * <p>The ID of the instance that you created.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_188077086902****_BXSuW61e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The edition of the instance that you created. Valid value:</p>
             * <ul>
             * <li><strong>1</strong>: Standard Edition instances</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
