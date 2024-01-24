// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecycleBinStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecycleBinStatusResponseBody</p>
 */
public class DescribeRecycleBinStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    private DescribeRecycleBinStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecycleBinStatusResponseBody create() {
        return builder().build();
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
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the table recycle bin. Valid values:
         * <p>
         * 
         * *   disable: The table recycle bin is enabled.
         * *   enable: The table recycle bin is disabled.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The result of the request.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRecycleBinStatusResponseBody build() {
            return new DescribeRecycleBinStatusResponseBody(this);
        } 

    } 

}
