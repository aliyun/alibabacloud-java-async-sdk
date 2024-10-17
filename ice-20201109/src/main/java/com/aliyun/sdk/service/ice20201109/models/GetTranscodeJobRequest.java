// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTranscodeJobRequest} extends {@link RequestModel}
 *
 * <p>GetTranscodeJobRequest</p>
 */
public class GetTranscodeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentJobId")
    private String parentJobId;

    private GetTranscodeJobRequest(Builder builder) {
        super(builder);
        this.parentJobId = builder.parentJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscodeJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentJobId
     */
    public String getParentJobId() {
        return this.parentJobId;
    }

    public static final class Builder extends Request.Builder<GetTranscodeJobRequest, Builder> {
        private String parentJobId; 

        private Builder() {
            super();
        } 

        private Builder(GetTranscodeJobRequest request) {
            super(request);
            this.parentJobId = request.parentJobId;
        } 

        /**
         * ParentJobId.
         */
        public Builder parentJobId(String parentJobId) {
            this.putQueryParameter("ParentJobId", parentJobId);
            this.parentJobId = parentJobId;
            return this;
        }

        @Override
        public GetTranscodeJobRequest build() {
            return new GetTranscodeJobRequest(this);
        } 

    } 

}
