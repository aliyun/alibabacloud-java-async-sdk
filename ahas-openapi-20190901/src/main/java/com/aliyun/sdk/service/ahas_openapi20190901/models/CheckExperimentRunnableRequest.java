// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckExperimentRunnableRequest} extends {@link RequestModel}
 *
 * <p>CheckExperimentRunnableRequest</p>
 */
public class CheckExperimentRunnableRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("ExperimentId")
    @Validation(required = true)
    private String experimentId;

    @Query
    @NameInMap("NameSpace")
    private String nameSpace;

    private CheckExperimentRunnableRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.experimentId = builder.experimentId;
        this.nameSpace = builder.nameSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckExperimentRunnableRequest create() {
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

    public static final class Builder extends Request.Builder<CheckExperimentRunnableRequest, Builder> {
        private String ahasRegionId; 
        private String experimentId; 
        private String nameSpace; 

        private Builder() {
            super();
        } 

        private Builder(CheckExperimentRunnableRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
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
        public CheckExperimentRunnableRequest build() {
            return new CheckExperimentRunnableRequest(this);
        } 

    } 

}
