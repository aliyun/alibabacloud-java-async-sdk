// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetExperimentStatusRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentStatusRequest</p>
 */
public class GetExperimentStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    private GetExperimentStatusRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    public static final class Builder extends Request.Builder<GetExperimentStatusRequest, Builder> {
        private String experimentId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentStatusRequest request) {
            super(request);
            this.experimentId = request.experimentId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft-4c60c4txtaexfum1zx</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        @Override
        public GetExperimentStatusRequest build() {
            return new GetExperimentStatusRequest(this);
        } 

    } 

}
