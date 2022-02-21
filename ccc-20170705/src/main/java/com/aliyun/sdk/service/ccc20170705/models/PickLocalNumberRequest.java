// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PickLocalNumberRequest} extends {@link RequestModel}
 *
 * <p>PickLocalNumberRequest</p>
 */
public class PickLocalNumberRequest extends Request {
    @Query
    @NameInMap("CalleeNumber")
    @Validation(required = true)
    private String calleeNumber;

    @Query
    @NameInMap("CandidateNumber")
    @Validation(required = true)
    private java.util.List < String > candidateNumber;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private PickLocalNumberRequest(Builder builder) {
        super(builder);
        this.calleeNumber = builder.calleeNumber;
        this.candidateNumber = builder.candidateNumber;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PickLocalNumberRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<PickLocalNumberRequest, Builder> {
        private String calleeNumber; 
        private java.util.List < String > candidateNumber; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(PickLocalNumberRequest response) {
            super(response);
            this.calleeNumber = response.calleeNumber;
            this.candidateNumber = response.candidateNumber;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public PickLocalNumberRequest build() {
            return new PickLocalNumberRequest(this);
        } 

    } 

}
