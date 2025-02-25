// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetDocContentTakIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetDocContentTakIdResponseBody</p>
 */
public class GetDocContentTakIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetDocContentTakIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocContentTakIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private Long taskId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetDocContentTakIdResponseBody build() {
            return new GetDocContentTakIdResponseBody(this);
        } 

    } 

}
