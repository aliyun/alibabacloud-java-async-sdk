// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppAttemptLogRequest} extends {@link RequestModel}
 *
 * <p>GetSparkAppAttemptLogRequest</p>
 */
public class GetSparkAppAttemptLogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttemptId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 72)
    private String attemptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogLength")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Long logLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private GetSparkAppAttemptLogRequest(Builder builder) {
        super(builder);
        this.attemptId = builder.attemptId;
        this.logLength = builder.logLength;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppAttemptLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attemptId
     */
    public String getAttemptId() {
        return this.attemptId;
    }

    /**
     * @return logLength
     */
    public Long getLogLength() {
        return this.logLength;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetSparkAppAttemptLogRequest, Builder> {
        private String attemptId; 
        private Long logLength; 
        private Integer pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkAppAttemptLogRequest request) {
            super(request);
            this.attemptId = request.attemptId;
            this.logLength = request.logLength;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The ID of the log.
         * <p>
         * 
         * > You can call the [ListSparkAppAttempts](~~455887~~) operation to query the information about the retry attempts of a Spark application, including the retry log IDs.
         */
        public Builder attemptId(String attemptId) {
            this.putBodyParameter("AttemptId", attemptId);
            this.attemptId = attemptId;
            return this;
        }

        /**
         * The number of log entries to return. Valid values: 1 to 500. Default value: 300.
         */
        public Builder logLength(Long logLength) {
            this.putBodyParameter("LogLength", logLength);
            this.logLength = logLength;
            return this;
        }

        /**
         * The log offset.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetSparkAppAttemptLogRequest build() {
            return new GetSparkAppAttemptLogRequest(this);
        } 

    } 

}
