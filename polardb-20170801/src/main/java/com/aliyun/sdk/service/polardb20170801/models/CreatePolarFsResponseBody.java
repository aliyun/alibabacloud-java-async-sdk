// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePolarFsResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolarFsResponseBody</p>
 */
public class CreatePolarFsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("PolarFsPath")
    private String polarFsPath;

    @com.aliyun.core.annotation.NameInMap("PolarFsStatus")
    private String polarFsStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePolarFsResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.polarFsPath = builder.polarFsPath;
        this.polarFsStatus = builder.polarFsStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarFsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return polarFsPath
     */
    public String getPolarFsPath() {
        return this.polarFsPath;
    }

    /**
     * @return polarFsStatus
     */
    public String getPolarFsStatus() {
        return this.polarFsStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String orderId; 
        private String polarFsInstanceId; 
        private String polarFsPath; 
        private String polarFsStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePolarFsResponseBody model) {
            this.orderId = model.orderId;
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.polarFsPath = model.polarFsPath;
            this.polarFsStatus = model.polarFsStatus;
            this.requestId = model.requestId;
        } 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * PolarFsPath.
         */
        public Builder polarFsPath(String polarFsPath) {
            this.polarFsPath = polarFsPath;
            return this;
        }

        /**
         * PolarFsStatus.
         */
        public Builder polarFsStatus(String polarFsStatus) {
            this.polarFsStatus = polarFsStatus;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>580EF224-9647-59E7-9950-D9EBFD6A2921</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolarFsResponseBody build() {
            return new CreatePolarFsResponseBody(this);
        } 

    } 

}
