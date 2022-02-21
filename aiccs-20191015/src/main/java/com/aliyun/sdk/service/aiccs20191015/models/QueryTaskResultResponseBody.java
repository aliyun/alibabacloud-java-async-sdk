// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskResultResponseBody</p>
 */
public class QueryTaskResultResponseBody extends TeaModel {
    @NameInMap("BuildId")
    private String buildId;

    @NameInMap("Message")
    private String message;

    @NameInMap("PassNumber")
    private Long passNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TestSetRecordId")
    private Long testSetRecordId;

    @NameInMap("TotalNumber")
    private Long totalNumber;

    @NameInMap("Url")
    private String url;

    private QueryTaskResultResponseBody(Builder builder) {
        this.buildId = builder.buildId;
        this.message = builder.message;
        this.passNumber = builder.passNumber;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.testSetRecordId = builder.testSetRecordId;
        this.totalNumber = builder.totalNumber;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return buildId
     */
    public String getBuildId() {
        return this.buildId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return passNumber
     */
    public Long getPassNumber() {
        return this.passNumber;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return testSetRecordId
     */
    public Long getTestSetRecordId() {
        return this.testSetRecordId;
    }

    /**
     * @return totalNumber
     */
    public Long getTotalNumber() {
        return this.totalNumber;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String buildId; 
        private String message; 
        private Long passNumber; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private Long testSetRecordId; 
        private Long totalNumber; 
        private String url; 

        /**
         * buildId
         */
        public Builder buildId(String buildId) {
            this.buildId = buildId;
            return this;
        }

        /**
         * message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * passNumber
         */
        public Builder passNumber(Long passNumber) {
            this.passNumber = passNumber;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * testSetRecordId
         */
        public Builder testSetRecordId(Long testSetRecordId) {
            this.testSetRecordId = testSetRecordId;
            return this;
        }

        /**
         * totalNumber
         */
        public Builder totalNumber(Long totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        /**
         * url
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public QueryTaskResultResponseBody build() {
            return new QueryTaskResultResponseBody(this);
        } 

    } 

}
