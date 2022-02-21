// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteExperimentRequest} extends {@link RequestModel}
 *
 * <p>ExecuteExperimentRequest</p>
 */
public class ExecuteExperimentRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("Definition")
    private String definition;

    @Query
    @NameInMap("ExperimentId")
    @Validation(required = true)
    private String experimentId;

    @Query
    @NameInMap("NameSpace")
    private String nameSpace;

    private ExecuteExperimentRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.definition = builder.definition;
        this.experimentId = builder.experimentId;
        this.nameSpace = builder.nameSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteExperimentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
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

    public static final class Builder extends Request.Builder<ExecuteExperimentRequest, Builder> {
        private String ahasRegionId; 
        private String definition; 
        private String experimentId; 
        private String nameSpace; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteExperimentRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.definition = response.definition;
            this.experimentId = response.experimentId;
            this.nameSpace = response.nameSpace;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
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
        public ExecuteExperimentRequest build() {
            return new ExecuteExperimentRequest(this);
        } 

    } 

}
