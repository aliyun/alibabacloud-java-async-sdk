// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppAttemptLogRequest} extends {@link RequestModel}
 *
 * <p>GetSparkAppAttemptLogRequest</p>
 */
public class GetSparkAppAttemptLogRequest extends Request {
    @Body
    @NameInMap("AttemptId")
    @Validation(required = true, maxLength = 72)
    private String attemptId;

    @Body
    @NameInMap("LogLength")
    @Validation(maximum = 500)
    private Long logLength;

    private GetSparkAppAttemptLogRequest(Builder builder) {
        super(builder);
        this.attemptId = builder.attemptId;
        this.logLength = builder.logLength;
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

    public static final class Builder extends Request.Builder<GetSparkAppAttemptLogRequest, Builder> {
        private String attemptId; 
        private Long logLength; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkAppAttemptLogRequest request) {
            super(request);
            this.attemptId = request.attemptId;
            this.logLength = request.logLength;
        } 

        /**
         * The ID of the log.
         * <p>
         * 
         * >  You can call the [ListSparkAppAttempts](~~455887~~) operation to query the retry history of an application, including the log ID of a retry attempt.
         */
        public Builder attemptId(String attemptId) {
            this.putBodyParameter("AttemptId", attemptId);
            this.attemptId = attemptId;
            return this;
        }

        /**
         * The number of rows to return in the log. Valid values: 1 to 500. Default value: 300.
         */
        public Builder logLength(Long logLength) {
            this.putBodyParameter("LogLength", logLength);
            this.logLength = logLength;
            return this;
        }

        @Override
        public GetSparkAppAttemptLogRequest build() {
            return new GetSparkAppAttemptLogRequest(this);
        } 

    } 

}
