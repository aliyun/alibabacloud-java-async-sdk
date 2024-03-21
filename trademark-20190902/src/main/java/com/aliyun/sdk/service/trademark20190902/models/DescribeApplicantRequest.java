// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicantRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicantRequest</p>
 */
public class DescribeApplicantRequest extends Request {
    @Query
    @NameInMap("ApplicantId")
    @Validation(required = true)
    private Long applicantId;

    private DescribeApplicantRequest(Builder builder) {
        super(builder);
        this.applicantId = builder.applicantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicantRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicantId
     */
    public Long getApplicantId() {
        return this.applicantId;
    }

    public static final class Builder extends Request.Builder<DescribeApplicantRequest, Builder> {
        private Long applicantId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicantRequest request) {
            super(request);
            this.applicantId = request.applicantId;
        } 

        /**
         * ApplicantId.
         */
        public Builder applicantId(Long applicantId) {
            this.putQueryParameter("ApplicantId", applicantId);
            this.applicantId = applicantId;
            return this;
        }

        @Override
        public DescribeApplicantRequest build() {
            return new DescribeApplicantRequest(this);
        } 

    } 

}
