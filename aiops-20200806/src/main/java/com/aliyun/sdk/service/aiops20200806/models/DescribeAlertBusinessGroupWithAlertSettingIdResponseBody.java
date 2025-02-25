// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertBusinessGroupWithAlertSettingIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertBusinessGroupWithAlertSettingIdResponseBody</p>
 */
public class DescribeAlertBusinessGroupWithAlertSettingIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeAlertBusinessGroupWithAlertSettingIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertBusinessGroupWithAlertSettingIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeAlertBusinessGroupWithAlertSettingIdResponseBody build() {
            return new DescribeAlertBusinessGroupWithAlertSettingIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BusinessGroupId")
        private String businessGroupId;

        @NameInMap("BusinessGroupName")
        private String businessGroupName;

        private Data(Builder builder) {
            this.businessGroupId = builder.businessGroupId;
            this.businessGroupName = builder.businessGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessGroupId
         */
        public String getBusinessGroupId() {
            return this.businessGroupId;
        }

        /**
         * @return businessGroupName
         */
        public String getBusinessGroupName() {
            return this.businessGroupName;
        }

        public static final class Builder {
            private String businessGroupId; 
            private String businessGroupName; 

            /**
             * BusinessGroupId.
             */
            public Builder businessGroupId(String businessGroupId) {
                this.businessGroupId = businessGroupId;
                return this;
            }

            /**
             * BusinessGroupName.
             */
            public Builder businessGroupName(String businessGroupName) {
                this.businessGroupName = businessGroupName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
