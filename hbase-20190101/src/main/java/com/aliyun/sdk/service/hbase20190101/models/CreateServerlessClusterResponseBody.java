// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServerlessClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServerlessClusterResponseBody</p>
 */
public class CreateServerlessClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("PassWord")
    private String passWord;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateServerlessClusterResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.orderId = builder.orderId;
        this.passWord = builder.passWord;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServerlessClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return passWord
     */
    public String getPassWord() {
        return this.passWord;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String orderId; 
        private String passWord; 
        private String requestId; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PassWord.
         */
        public Builder passWord(String passWord) {
            this.passWord = passWord;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateServerlessClusterResponseBody build() {
            return new CreateServerlessClusterResponseBody(this);
        } 

    } 

}
