// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link CreateSimilarSecurityEventsQueryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSimilarSecurityEventsQueryTaskRequest</p>
 */
public class CreateSimilarSecurityEventsQueryTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long securityEventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimilarEventScenarioCode")
    private String similarEventScenarioCode;

    private CreateSimilarSecurityEventsQueryTaskRequest(Builder builder) {
        super(builder);
        this.securityEventId = builder.securityEventId;
        this.similarEventScenarioCode = builder.similarEventScenarioCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimilarSecurityEventsQueryTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityEventId
     */
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    /**
     * @return similarEventScenarioCode
     */
    public String getSimilarEventScenarioCode() {
        return this.similarEventScenarioCode;
    }

    public static final class Builder extends Request.Builder<CreateSimilarSecurityEventsQueryTaskRequest, Builder> {
        private Long securityEventId; 
        private String similarEventScenarioCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateSimilarSecurityEventsQueryTaskRequest request) {
            super(request);
            this.securityEventId = request.securityEventId;
            this.similarEventScenarioCode = request.similarEventScenarioCode;
        } 

        /**
         * <p>The ID of the alert event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14323</p>
         */
        public Builder securityEventId(Long securityEventId) {
            this.putQueryParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        /**
         * <p>The scenario code of alerting events that are of the same type or have the same rule hits.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder similarEventScenarioCode(String similarEventScenarioCode) {
            this.putQueryParameter("SimilarEventScenarioCode", similarEventScenarioCode);
            this.similarEventScenarioCode = similarEventScenarioCode;
            return this;
        }

        @Override
        public CreateSimilarSecurityEventsQueryTaskRequest build() {
            return new CreateSimilarSecurityEventsQueryTaskRequest(this);
        } 

    } 

}
