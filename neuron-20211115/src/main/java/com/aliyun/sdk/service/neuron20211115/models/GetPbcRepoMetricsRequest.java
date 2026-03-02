// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link GetPbcRepoMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetPbcRepoMetricsRequest</p>
 */
public class GetPbcRepoMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    private GetPbcRepoMetricsRequest(Builder builder) {
        super(builder);
        this.pbcId = builder.pbcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPbcRepoMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    public static final class Builder extends Request.Builder<GetPbcRepoMetricsRequest, Builder> {
        private Long pbcId; 

        private Builder() {
            super();
        } 

        private Builder(GetPbcRepoMetricsRequest request) {
            super(request);
            this.pbcId = request.pbcId;
        } 

        /**
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.putPathParameter("pbcId", pbcId);
            this.pbcId = pbcId;
            return this;
        }

        @Override
        public GetPbcRepoMetricsRequest build() {
            return new GetPbcRepoMetricsRequest(this);
        } 

    } 

}
