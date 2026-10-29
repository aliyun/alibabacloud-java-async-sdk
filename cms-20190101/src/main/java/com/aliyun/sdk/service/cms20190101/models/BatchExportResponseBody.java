// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link BatchExportResponseBody} extends {@link TeaModel}
 *
 * <p>BatchExportResponseBody</p>
 */
public class BatchExportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Anchor")
    private Long anchor;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Cursor")
    private String cursor;

    @com.aliyun.core.annotation.NameInMap("DataResults")
    private java.util.List<MetricStat> dataResults;

    @com.aliyun.core.annotation.NameInMap("HasNext")
    private Boolean hasNext;

    @com.aliyun.core.annotation.NameInMap("Length")
    private Integer length;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<MetricStat> getDataResults() {
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
        private java.util.List<MetricStat> dataResults; 
        private Boolean hasNext; 
        private Integer length; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchExportResponseBody model) {
            this.anchor = model.anchor;
            this.code = model.code;
            this.cursor = model.cursor;
            this.dataResults = model.dataResults;
            this.hasNext = model.hasNext;
            this.length = model.length;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The timestamp when the backend requested the data. A larger timestamp indicates that the exported data is closer to the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1678781819000</p>
         */
        public Builder anchor(Long anchor) {
            this.anchor = anchor;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>A status code of 200 indicates success.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The cursor used for the next call to this operation.</p>
         * <blockquote>
         * <p>If the return value is <code>null</code>, the monitoring data export is complete.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v2.5eyJidWNrZXRzIjo0LCJjdXJzb3IiOiIxNjQxNDU0ODAwMDAwMWUxY2YxNWY0NTU0MTliZjllYTY4OWQ2ODI1OTU1Yzc1NmZjMDQ2OTMxMzczMzM2MzUzMTMxMzEzMzM0MzMzODM5MzEzMTMwMjQyYzY5MmQzMjdhNjU2MjY3N2E2NjZhNzczOTY2NmM3Mjc0NjM3MzY5Njg3NDcyMjQyYyIsImN1cnNvclZlcnNpb24iOiJxdWVyeSIsImVuZFRpbWUiOjE2NDE0NTUyMzYxMTIsImV4cG9ydEVuZFRpbWUiOjE2NDE0NTUyMzYxMTIsImV4cG9ydFN0YXJ0VGltZSI6MTY0MTQ1NDYzNjExMiwiZXhwcmVzc1JhbmdlIjpmYWxzZSwiaGFzTmV4dCI6dHJ1ZSwiaW5wdXRNZXRyaWMiOiJDUFVVdGlsaXphdGlvbiIsImlucHV0TmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJsaW1pdCI6MTAwMCwibG9nVGltZU1vZGUiOnRydWUsIm1hdGNoZXJzIjp7ImNoYWluIjpbeyJsYWJlbCI6InVzZXJJZCIsIm9wZXJhdG9yIjoiRVFVQUxTIiwidmFsdWUiOiIxNzM2NTExMTM0Mzg5MTEwIn1dfSwibWV0cmljIjoiQ1BVVXRpbGl6YXRpb24iLCJtZXRyaWNUeXBlIjoiTUVUUklDIiwibmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJuZXh0UGtBZGFwdGVyIjp7fSwib2Zmc2V0IjowLCJwYXJlbnRVaWQiOjEyNzA2NzY2Nzk1NDY3MDQsInN0YXJ0VGltZSI6MTY0MTQ1NDYzNjExMiwic3RlcCI6LTEsInRpbWVvdXQiOjEyMCwid2luZG93Ijo2MH0***</p>
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * <p>The data returned in the current call.</p>
         */
        public Builder dataResults(java.util.List<MetricStat> dataResults) {
            this.dataResults = dataResults;
            return this;
        }

        /**
         * <p>Indicates whether the data export is complete. Valid values:</p>
         * <ul>
         * <li><p>true: The data export is incomplete.</p>
         * </li>
         * <li><p>false: The data export is complete.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        /**
         * <p>The number of data records returned in the current call.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>251402CD-305C-1617-808E-D8C11FC8138D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
