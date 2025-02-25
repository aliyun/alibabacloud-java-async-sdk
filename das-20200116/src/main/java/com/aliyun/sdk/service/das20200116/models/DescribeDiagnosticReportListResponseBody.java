// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeDiagnosticReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportListResponseBody</p>
 */
public class DescribeDiagnosticReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private String synchro;

    private DescribeDiagnosticReportListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticReportListResponseBody create() {
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
    public String getData() {
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return synchro
     */
    public String getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private String success; 
        private String synchro; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information of the diagnostics reports. Valid values:</p>
         * <ul>
         * <li><strong>total</strong>: the number of diagnostics reports.</li>
         * <li><strong>score</strong>: the health score.</li>
         * <li><strong>diagnosticTime</strong>: the time when the diagnostics report was generated. The time is displayed in UTC.</li>
         * <li><strong>startTime</strong>: the start time of the query. The time is displayed in UTC.</li>
         * <li><strong>endTime</strong>: the end time of the query. The time is displayed in UTC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;total&quot;: 1,     &quot;list&quot;: [       {         &quot;score&quot;: 100,         &quot;diagnosticTime&quot;: &quot;2022-11-14T08:17:00Z&quot;,         &quot;startTime&quot;: &quot;2022-11-14T07:16:59Z&quot;,         &quot;endTime&quot;: &quot;2022-11-14T08:16:59Z&quot;       }     ]   }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D00DB161-FEF6-5428-B37A-8D29A4C2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder synchro(String synchro) {
            this.synchro = synchro;
            return this;
        }

        public DescribeDiagnosticReportListResponseBody build() {
            return new DescribeDiagnosticReportListResponseBody(this);
        } 

    } 

}
