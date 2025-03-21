// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long securityEventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimilarEventScenarioCode")
    private String similarEventScenarioCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private CreateSimilarSecurityEventsQueryTaskRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityEventId = builder.securityEventId;
        this.similarEventScenarioCode = builder.similarEventScenarioCode;
        this.sourceIp = builder.sourceIp;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateSimilarSecurityEventsQueryTaskRequest, Builder> {
        private Long resourceOwnerId; 
        private Long securityEventId; 
        private String similarEventScenarioCode; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateSimilarSecurityEventsQueryTaskRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityEventId = request.securityEventId;
            this.similarEventScenarioCode = request.similarEventScenarioCode;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the alert event.</p>
         * <blockquote>
         * <p> You must specify at least one of the SecurityEventId and SimilarEventScenarioCode parameters.</p>
         * </blockquote>
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
         * <p>The codes of alert events that are triggered by the same rule or of the same alert type.</p>
         * <blockquote>
         * <p> You must specify at least one of the SecurityEventId and SimilarEventScenarioCode parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder similarEventScenarioCode(String similarEventScenarioCode) {
            this.putQueryParameter("SimilarEventScenarioCode", similarEventScenarioCode);
            this.similarEventScenarioCode = similarEventScenarioCode;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateSimilarSecurityEventsQueryTaskRequest build() {
            return new CreateSimilarSecurityEventsQueryTaskRequest(this);
        } 

    } 

}
