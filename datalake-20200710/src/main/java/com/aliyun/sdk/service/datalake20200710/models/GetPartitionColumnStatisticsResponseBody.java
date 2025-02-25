// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPartitionColumnStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPartitionColumnStatisticsResponseBody</p>
 */
public class GetPartitionColumnStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PartitionStatisticsMap")
    private java.util.Map < String, java.util.List<ColumnStatisticsObj>> partitionStatisticsMap;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPartitionColumnStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.partitionStatisticsMap = builder.partitionStatisticsMap;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPartitionColumnStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return partitionStatisticsMap
     */
    public java.util.Map < String, java.util.List<ColumnStatisticsObj>> getPartitionStatisticsMap() {
        return this.partitionStatisticsMap;
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
        private String message; 
        private java.util.Map < String, java.util.List<ColumnStatisticsObj>> partitionStatisticsMap; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * PartitionStatisticsMap.
         */
        public Builder partitionStatisticsMap(java.util.Map < String, java.util.List<ColumnStatisticsObj>> partitionStatisticsMap) {
            this.partitionStatisticsMap = partitionStatisticsMap;
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

        public GetPartitionColumnStatisticsResponseBody build() {
            return new GetPartitionColumnStatisticsResponseBody(this);
        } 

    } 

}
