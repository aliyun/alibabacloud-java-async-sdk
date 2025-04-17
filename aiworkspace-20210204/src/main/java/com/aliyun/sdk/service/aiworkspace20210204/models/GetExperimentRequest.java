// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetExperimentRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentRequest</p>
 */
public class GetExperimentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private String experimentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    private GetExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.verbose = builder.verbose;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentRequest create() {
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

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<GetExperimentRequest, Builder> {
        private String experimentId; 
        private Boolean verbose; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.verbose = request.verbose;
        } 

        /**
         * <p>The ID of the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-1zpfthdx******</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>Specifies whether to obtain the latest run information associated with the experiment</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public GetExperimentRequest build() {
            return new GetExperimentRequest(this);
        } 

    } 

}
