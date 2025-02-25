// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPartitionsProfileResponseBody} extends {@link TeaModel}
 *
 * <p>ListPartitionsProfileResponseBody</p>
 */
public class ListPartitionsProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < PartitionProfile > data;

    @com.aliyun.core.annotation.NameInMap("LatestAccessNumDate")
    private String latestAccessNumDate;

    @com.aliyun.core.annotation.NameInMap("LatestDate")
    private String latestDate;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListPartitionsProfileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.latestAccessNumDate = builder.latestAccessNumDate;
        this.latestDate = builder.latestDate;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartitionsProfileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < PartitionProfile > getData() {
        return this.data;
    }

    /**
     * @return latestAccessNumDate
     */
    public String getLatestAccessNumDate() {
        return this.latestAccessNumDate;
    }

    /**
     * @return latestDate
     */
    public String getLatestDate() {
        return this.latestDate;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < PartitionProfile > data; 
        private String latestAccessNumDate; 
        private String latestDate; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < PartitionProfile > data) {
            this.data = data;
            return this;
        }

        /**
         * LatestAccessNumDate.
         */
        public Builder latestAccessNumDate(String latestAccessNumDate) {
            this.latestAccessNumDate = latestAccessNumDate;
            return this;
        }

        /**
         * LatestDate.
         */
        public Builder latestDate(String latestDate) {
            this.latestDate = latestDate;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListPartitionsProfileResponseBody build() {
            return new ListPartitionsProfileResponseBody(this);
        } 

    } 

}
