// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeCandidateInstanceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCandidateInstanceTypeResponseBody</p>
 */
public class DescribeCandidateInstanceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CandidateInstanceTypes")
    private java.util.List<String> candidateInstanceTypes;

    @com.aliyun.core.annotation.NameInMap("CandidateZoneIds")
    private java.util.List<String> candidateZoneIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCandidateInstanceTypeResponseBody(Builder builder) {
        this.candidateInstanceTypes = builder.candidateInstanceTypes;
        this.candidateZoneIds = builder.candidateZoneIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCandidateInstanceTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return candidateInstanceTypes
     */
    public java.util.List<String> getCandidateInstanceTypes() {
        return this.candidateInstanceTypes;
    }

    /**
     * @return candidateZoneIds
     */
    public java.util.List<String> getCandidateZoneIds() {
        return this.candidateZoneIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> candidateInstanceTypes; 
        private java.util.List<String> candidateZoneIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCandidateInstanceTypeResponseBody model) {
            this.candidateInstanceTypes = model.candidateInstanceTypes;
            this.candidateZoneIds = model.candidateZoneIds;
            this.requestId = model.requestId;
        } 

        /**
         * CandidateInstanceTypes.
         */
        public Builder candidateInstanceTypes(java.util.List<String> candidateInstanceTypes) {
            this.candidateInstanceTypes = candidateInstanceTypes;
            return this;
        }

        /**
         * CandidateZoneIds.
         */
        public Builder candidateZoneIds(java.util.List<String> candidateZoneIds) {
            this.candidateZoneIds = candidateZoneIds;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCandidateInstanceTypeResponseBody build() {
            return new DescribeCandidateInstanceTypeResponseBody(this);
        } 

    } 

}
