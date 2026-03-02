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
 * {@link GetPbcDeveloperRepoMetricsRequest} extends {@link RequestModel}
 *
 * <p>GetPbcDeveloperRepoMetricsRequest</p>
 */
public class GetPbcDeveloperRepoMetricsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    private GetPbcDeveloperRepoMetricsRequest(Builder builder) {
        super(builder);
        this.pbcId = builder.pbcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPbcDeveloperRepoMetricsRequest create() {
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

    public static final class Builder extends Request.Builder<GetPbcDeveloperRepoMetricsRequest, Builder> {
        private Long pbcId; 

        private Builder() {
            super();
        } 

        private Builder(GetPbcDeveloperRepoMetricsRequest request) {
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
        public GetPbcDeveloperRepoMetricsRequest build() {
            return new GetPbcDeveloperRepoMetricsRequest(this);
        } 

    } 

}
