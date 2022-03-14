// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimilarSecurityEventsQueryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateSimilarSecurityEventsQueryTaskRequest</p>
 */
public class CreateSimilarSecurityEventsQueryTaskRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityEventId")
    private Long securityEventId;

    @Query
    @NameInMap("SimilarEventScenarioCode")
    private String similarEventScenarioCode;

    @Query
    @NameInMap("SourceIp")
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
         * SecurityEventId.
         */
        public Builder securityEventId(Long securityEventId) {
            this.putQueryParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        /**
         * SimilarEventScenarioCode.
         */
        public Builder similarEventScenarioCode(String similarEventScenarioCode) {
            this.putQueryParameter("SimilarEventScenarioCode", similarEventScenarioCode);
            this.similarEventScenarioCode = similarEventScenarioCode;
            return this;
        }

        /**
         * SourceIp.
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
