// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
         * <p>The ID of the log.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/455887.html">ListSparkAppAttempts</a> operation to query the information about the retry attempts of a Spark application, including the retry log IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s202207151211hz****-0001</p>
         */
        public Builder attemptId(String attemptId) {
            this.putBodyParameter("AttemptId", attemptId);
            this.attemptId = attemptId;
            return this;
        }

        /**
         * <p>The number of log entries to return. Valid values: 1 to 500. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder logLength(Long logLength) {
            this.putBodyParameter("LogLength", logLength);
            this.logLength = logLength;
            return this;
        }

        /**
         * <p>The log offset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
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
