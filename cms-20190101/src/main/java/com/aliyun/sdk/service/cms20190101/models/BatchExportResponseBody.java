// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchExportResponseBody} extends {@link TeaModel}
 *
 * <p>BatchExportResponseBody</p>
 */
public class BatchExportResponseBody extends TeaModel {
    @NameInMap("Anchor")
    private Long anchor;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Cursor")
    private String cursor;

    @NameInMap("DataResults")
    private java.util.List < MetricStat > dataResults;

    @NameInMap("HasNext")
    private Boolean hasNext;

    @NameInMap("Length")
    private Integer length;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchExportResponseBody(Builder builder) {
        this.anchor = builder.anchor;
        this.code = builder.code;
        this.cursor = builder.cursor;
        this.dataResults = builder.dataResults;
        this.hasNext = builder.hasNext;
        this.length = builder.length;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchExportResponseBody create() {
        return builder().build();
    }

    /**
     * @return anchor
     */
    public Long getAnchor() {
        return this.anchor;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return dataResults
     */
    public java.util.List < MetricStat > getDataResults() {
        return this.dataResults;
    }

    /**
     * @return hasNext
     */
    public Boolean getHasNext() {
        return this.hasNext;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
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
        private Long anchor; 
        private Integer code; 
        private String cursor; 
        private java.util.List < MetricStat > dataResults; 
        private Boolean hasNext; 
        private Integer length; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The timestamp of the data requested by the backend. A larger timestamp indicates that the data export time is closer to the current time.
         */
        public Builder anchor(Long anchor) {
            this.anchor = anchor;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The Cursor information that is used to call this operation again.
         * <p>
         * 
         * >  If `null` is returned, the monitoring data is exported.
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * The data returned in this call.
         */
        public Builder dataResults(java.util.List < MetricStat > dataResults) {
            this.dataResults = dataResults;
            return this;
        }

        /**
         * Indicates whether the data has been exported. Valid values:
         * <p>
         * 
         * *   true: Some data is not exported.
         * *   false: All the data is exported.
         */
        public Builder hasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        /**
         * The number of data entries returned in this call.
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchExportResponseBody build() {
            return new BatchExportResponseBody(this);
        } 

    } 

}
