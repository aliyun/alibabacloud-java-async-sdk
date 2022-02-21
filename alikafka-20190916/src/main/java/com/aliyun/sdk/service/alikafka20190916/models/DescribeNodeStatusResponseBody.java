// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeStatusResponseBody</p>
 */
public class DescribeNodeStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatusList")
    private StatusList statusList;

    @NameInMap("Success")
    private Boolean success;

    private DescribeNodeStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.statusList = builder.statusList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusList
     */
    public StatusList getStatusList() {
        return this.statusList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private StatusList statusList; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(StatusList statusList) {
            this.statusList = statusList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeNodeStatusResponseBody build() {
            return new DescribeNodeStatusResponseBody(this);
        } 

    } 

    public static class StatusList extends TeaModel {
        @NameInMap("Status")
        private java.util.List < String > status;

        private StatusList(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusList create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public java.util.List < String > getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < String > status; 

            /**
             * Status.
             */
            public Builder status(java.util.List < String > status) {
                this.status = status;
                return this;
            }

            public StatusList build() {
                return new StatusList(this);
            } 

        } 

    }
}
