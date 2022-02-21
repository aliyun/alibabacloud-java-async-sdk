// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PickOutboundNumbersRequest} extends {@link RequestModel}
 *
 * <p>PickOutboundNumbersRequest</p>
 */
public class PickOutboundNumbersRequest extends Request {
    @Query
    @NameInMap("CalleeNumber")
    @Validation(required = true)
    private String calleeNumber;

    @Query
    @NameInMap("CandidateNumber")
    @Validation(required = true)
    private java.util.List < String > candidateNumber;

    @Query
    @NameInMap("Count")
    @Validation(required = true)
    private Integer count;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private PickOutboundNumbersRequest(Builder builder) {
        super(builder);
        this.calleeNumber = builder.calleeNumber;
        this.candidateNumber = builder.candidateNumber;
        this.count = builder.count;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PickOutboundNumbersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calleeNumber
     */
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    /**
     * @return candidateNumber
     */
    public java.util.List < String > getCandidateNumber() {
        return this.candidateNumber;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<PickOutboundNumbersRequest, Builder> {
        private String calleeNumber; 
        private java.util.List < String > candidateNumber; 
        private Integer count; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(PickOutboundNumbersRequest response) {
            super(response);
            this.calleeNumber = response.calleeNumber;
            this.candidateNumber = response.candidateNumber;
            this.count = response.count;
            this.instanceId = response.instanceId;
        } 

        /**
         * CalleeNumber.
         */
        public Builder calleeNumber(String calleeNumber) {
            this.putQueryParameter("CalleeNumber", calleeNumber);
            this.calleeNumber = calleeNumber;
            return this;
        }

        /**
         * CandidateNumber.
         */
        public Builder candidateNumber(java.util.List < String > candidateNumber) {
            this.putQueryParameter("CandidateNumber", candidateNumber);
            this.candidateNumber = candidateNumber;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public PickOutboundNumbersRequest build() {
            return new PickOutboundNumbersRequest(this);
        } 

    } 

}
