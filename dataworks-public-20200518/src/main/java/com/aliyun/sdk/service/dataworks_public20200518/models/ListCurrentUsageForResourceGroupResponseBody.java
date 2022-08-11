// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentUsageForResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListCurrentUsageForResourceGroupResponseBody</p>
 */
public class ListCurrentUsageForResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCurrentUsageForResourceGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCurrentUsageForResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private Data data; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Id of the request
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

        public ListCurrentUsageForResourceGroupResponseBody build() {
            return new ListCurrentUsageForResourceGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("RecodeTime")
        private Long recodeTime;

        @NameInMap("Usage")
        private Float usage;

        private Data(Builder builder) {
            this.recodeTime = builder.recodeTime;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return recodeTime
         */
        public Long getRecodeTime() {
            return this.recodeTime;
        }

        /**
         * @return usage
         */
        public Float getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Long recodeTime; 
            private Float usage; 

            /**
             * RecodeTime.
             */
            public Builder recodeTime(Long recodeTime) {
                this.recodeTime = recodeTime;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(Float usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
