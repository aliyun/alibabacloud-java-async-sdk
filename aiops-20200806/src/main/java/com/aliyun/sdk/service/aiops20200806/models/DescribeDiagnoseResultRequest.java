// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnoseResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnoseResultRequest</p>
 */
public class DescribeDiagnoseResultRequest extends Request {
    @Query
    @NameInMap("CheckId")
    private String checkId;

    private DescribeDiagnoseResultRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnoseResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnoseResultRequest, Builder> {
        private String checkId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnoseResultRequest request) {
            super(request);
            this.checkId = request.checkId;
        } 

        /**
         * CheckId.
         */
        public Builder checkId(String checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        @Override
        public DescribeDiagnoseResultRequest build() {
            return new DescribeDiagnoseResultRequest(this);
        } 

    } 

}
