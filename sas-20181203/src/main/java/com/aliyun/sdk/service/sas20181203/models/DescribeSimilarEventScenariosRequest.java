// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSimilarEventScenariosRequest} extends {@link RequestModel}
 *
 * <p>DescribeSimilarEventScenariosRequest</p>
 */
public class DescribeSimilarEventScenariosRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityEventId")
    private Long securityEventId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeSimilarEventScenariosRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityEventId = builder.securityEventId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSimilarEventScenariosRequest create() {
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeSimilarEventScenariosRequest, Builder> {
        private Long resourceOwnerId; 
        private Long securityEventId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSimilarEventScenariosRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityEventId = request.securityEventId;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeSimilarEventScenariosRequest build() {
            return new DescribeSimilarEventScenariosRequest(this);
        } 

    } 

}
