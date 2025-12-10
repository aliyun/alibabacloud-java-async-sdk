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
 * {@link GetExperimentMetaRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentMetaRequest</p>
 */
public class GetExperimentMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    private GetExperimentMetaRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentMetaRequest create() {
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

    public static final class Builder extends Request.Builder<GetExperimentMetaRequest, Builder> {
        private String experimentId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentMetaRequest request) {
            super(request);
            this.experimentId = request.experimentId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft-rbvg5wzljzjhc9ks92</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        @Override
        public GetExperimentMetaRequest build() {
            return new GetExperimentMetaRequest(this);
        } 

    } 

}
