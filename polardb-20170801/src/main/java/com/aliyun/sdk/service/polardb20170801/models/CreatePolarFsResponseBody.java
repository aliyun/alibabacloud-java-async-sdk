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
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2035638*******</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The PolarFS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607wck3</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The PolarFS file system path.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx*******</p>
         */
        public Builder polarFsPath(String polarFsPath) {
            this.polarFsPath = polarFsPath;
            return this;
        }

        /**
         * <p>The PolarFS instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder polarFsStatus(String polarFsStatus) {
            this.polarFsStatus = polarFsStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
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
