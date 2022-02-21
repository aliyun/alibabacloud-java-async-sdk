// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FinishExperimentTaskRequest} extends {@link RequestModel}
 *
 * <p>FinishExperimentTaskRequest</p>
 */
public class FinishExperimentTaskRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("ExperimentTaskId")
    @Validation(required = true)
    private String experimentTaskId;

    @Query
    @NameInMap("NameSpace")
    private String nameSpace;

    private FinishExperimentTaskRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.experimentTaskId = builder.experimentTaskId;
        this.nameSpace = builder.nameSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishExperimentTaskRequest create() {
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
     * @return experimentTaskId
     */
    public String getExperimentTaskId() {
        return this.experimentTaskId;
    }

    /**
     * @return nameSpace
     */
    public String getNameSpace() {
        return this.nameSpace;
    }

    public static final class Builder extends Request.Builder<FinishExperimentTaskRequest, Builder> {
        private String ahasRegionId; 
        private String experimentTaskId; 
        private String nameSpace; 

        private Builder() {
            super();
        } 

        private Builder(FinishExperimentTaskRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.experimentTaskId = response.experimentTaskId;
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
         * ExperimentTaskId.
         */
        public Builder experimentTaskId(String experimentTaskId) {
            this.putQueryParameter("ExperimentTaskId", experimentTaskId);
            this.experimentTaskId = experimentTaskId;
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
        public FinishExperimentTaskRequest build() {
            return new FinishExperimentTaskRequest(this);
        } 

    } 

}
