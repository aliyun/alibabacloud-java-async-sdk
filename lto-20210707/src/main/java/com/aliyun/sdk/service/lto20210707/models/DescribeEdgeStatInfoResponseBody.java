// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link DescribeEdgeStatInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeStatInfoResponseBody</p>
 */
public class DescribeEdgeStatInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEdgeStatInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeStatInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeEdgeStatInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(Data data) {
            this.data = data;
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

        public DescribeEdgeStatInfoResponseBody build() {
            return new DescribeEdgeStatInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEdgeStatInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEdgeStatInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalDeviceLicenseCount")
        private Long totalDeviceLicenseCount;

        @com.aliyun.core.annotation.NameInMap("UsedDeviceLicenseCount")
        private Long usedDeviceLicenseCount;

        private Data(Builder builder) {
            this.totalDeviceLicenseCount = builder.totalDeviceLicenseCount;
            this.usedDeviceLicenseCount = builder.usedDeviceLicenseCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return totalDeviceLicenseCount
         */
        public Long getTotalDeviceLicenseCount() {
            return this.totalDeviceLicenseCount;
        }

        /**
         * @return usedDeviceLicenseCount
         */
        public Long getUsedDeviceLicenseCount() {
            return this.usedDeviceLicenseCount;
        }

        public static final class Builder {
            private Long totalDeviceLicenseCount; 
            private Long usedDeviceLicenseCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.totalDeviceLicenseCount = model.totalDeviceLicenseCount;
                this.usedDeviceLicenseCount = model.usedDeviceLicenseCount;
            } 

            /**
             * TotalDeviceLicenseCount.
             */
            public Builder totalDeviceLicenseCount(Long totalDeviceLicenseCount) {
                this.totalDeviceLicenseCount = totalDeviceLicenseCount;
                return this;
            }

            /**
             * UsedDeviceLicenseCount.
             */
            public Builder usedDeviceLicenseCount(Long usedDeviceLicenseCount) {
                this.usedDeviceLicenseCount = usedDeviceLicenseCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
