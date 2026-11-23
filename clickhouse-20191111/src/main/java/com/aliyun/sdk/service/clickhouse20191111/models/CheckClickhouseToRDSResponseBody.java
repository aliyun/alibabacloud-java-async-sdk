// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link CheckClickhouseToRDSResponseBody} extends {@link TeaModel}
 *
 * <p>CheckClickhouseToRDSResponseBody</p>
 */
public class CheckClickhouseToRDSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    private CheckClickhouseToRDSResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckClickhouseToRDSResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String errorCode; 
        private String requestId; 
        private Boolean status; 

        private Builder() {
        } 

        private Builder(CheckClickhouseToRDSResponseBody model) {
            this.errorCode = model.errorCode;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <ul>
         * <li>This parameter is not returned when <strong>Status</strong> is <strong>true</strong>.</li>
         * <li>When <strong>Status</strong> is <strong>false</strong>, this parameter indicates the cause of the connection failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotSameVpc</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A82758F8-E793-5610-BE11-0E46664305C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the connection is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The connection is successful.</li>
         * <li><strong>false</strong>: The connection fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public CheckClickhouseToRDSResponseBody build() {
            return new CheckClickhouseToRDSResponseBody(this);
        } 

    } 

}
