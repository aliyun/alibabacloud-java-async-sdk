// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorDataResponseBody</p>
 */
public class DescribeSiteMonitorDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private DescribeSiteMonitorDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorDataResponseBody create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private String success; 

        /**
         * The returned message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The pagination cursor.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The returned data contains a JSON string that may consist of several or all of the following parameters:
         * <p>
         * 
         * *   Error4XXRate: the percentage of detection results with 4XX status codes.
         * *   Error6XXRate: the percentage of detection results with 6XX status codes.
         * *   Error5XXRate: the percentage of detection results with 5XX status codes.
         * *   Error4XXNumber: the number of detection results with 4XX status codes.
         * *   Error5XXNumber: the number of detection results with 5XX status codes.
         * *   Error6XXNumber: the number of detection results with 6XX status codes.
         * *   Over5totalTime: the percentage of detection requests to which the response time exceeds 5,000 ms.
         * *   Over3totalTime: the percentage of detection requests to which the response time exceeds 3,000 ms.
         * *   Over2totalTime: the percentage of detection requests to which the response time exceeds 2,000 ms.
         * *   Over10FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 10%.
         * *   Over100FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 99%.
         * *   Over30FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 30%.
         * *   Over50FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 50%.
         * *   Over80FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 80%.
         * *   Over90FailureRate: the percentage of detection points whose failure rate of detection requests exceeds 90%.
         * *   Over400NumberRate: the percentage of detection results with status codes that are greater than 400.
         * *   Over400NumberRate: the percentage of detection results with status codes that are greater than 500.
         * *   AvailableNumber: the number of detection results in which the status code is smaller than 400.
         * *   UnavailableNumber: the number of detection results in which the status code is greater than 399.
         * *   Availability: the percentage of detection results in which the status code is smaller than 400.
         * *   Unavailability: the percentage of detection results in which the status code is greater than 399.
         * *   ErrorCodeMaximum: the maximum error code in the detection results that were returned in a specific period. Assume that five status codes are returned in a minute after detection requests are sent from five detection points. The status code in four detection results is 200 and that in one detection result is 404. In this case, the maximum error code is 404.
         * *   ErrorCodeMinimum: the minimum error code in the detection results returned in a monitoring period. Assume that five status codes are returned in a minute after detection requests are sent from five detection points. The status code in four detection results is 200 and that in one detection result is 404. In this case, the minimum error code is 200.
         * 
         * >  We recommend that you use the AvailableNumber, UnavailableNumber, Availability, Unavailability, ErrorCodeMaximum, or ErrorCodeMinimum metric, whose value is easy to calculate.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSiteMonitorDataResponseBody build() {
            return new DescribeSiteMonitorDataResponseBody(this);
        } 

    } 

}
