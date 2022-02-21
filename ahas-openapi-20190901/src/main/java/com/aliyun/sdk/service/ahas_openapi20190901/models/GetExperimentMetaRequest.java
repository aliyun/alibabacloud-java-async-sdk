// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentMetaRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentMetaRequest</p>
 */
public class GetExperimentMetaRequest extends Request {
    @Query
    @NameInMap("ExperimentId")
    @Validation(required = true)
    private String experimentId;

    @Query
    @NameInMap("NameSpace")
    private String nameSpace;

    private GetExperimentMetaRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.nameSpace = builder.nameSpace;
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

    /**
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
    }

    public static final class Builder extends Request.Builder<GetExperimentMetaRequest, Builder> {
        private String experimentId; 
        private String nameSpace; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentMetaRequest response) {
            super(response);
            this.experimentId = response.experimentId;
            this.nameSpace = response.nameSpace;
        } 

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putQueryParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * NameSpace.
         */
        public Builder nameSpace(String nameSpace) {
            this.putQueryParameter("NameSpace", nameSpace);
            this.nameSpace = nameSpace;
            return this;
        }

        @Override
        public GetExperimentMetaRequest build() {
            return new GetExperimentMetaRequest(this);
        } 

    } 

}
