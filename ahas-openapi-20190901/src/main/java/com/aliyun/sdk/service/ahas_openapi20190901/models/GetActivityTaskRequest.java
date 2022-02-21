// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetActivityTaskRequest} extends {@link RequestModel}
 *
 * <p>GetActivityTaskRequest</p>
 */
public class GetActivityTaskRequest extends Request {
    @Query
    @NameInMap("ActivityTaskId")
    @Validation(required = true)
    private String activityTaskId;

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

    private GetActivityTaskRequest(Builder builder) {
        super(builder);
        this.activityTaskId = builder.activityTaskId;
        this.ahasRegionId = builder.ahasRegionId;
        this.experimentTaskId = builder.experimentTaskId;
        this.nameSpace = builder.nameSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActivityTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityTaskId
     */
    public String getActivityTaskId() {
        return this.activityTaskId;
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

    public static final class Builder extends Request.Builder<GetActivityTaskRequest, Builder> {
        private String activityTaskId; 
        private String ahasRegionId; 
        private String experimentTaskId; 
        private String nameSpace; 

        private Builder() {
            super();
        } 

        private Builder(GetActivityTaskRequest response) {
            super(response);
            this.activityTaskId = response.activityTaskId;
            this.ahasRegionId = response.ahasRegionId;
            this.experimentTaskId = response.experimentTaskId;
            this.nameSpace = response.nameSpace;
        } 

        /**
         * ActivityTaskId.
         */
        public Builder activityTaskId(String activityTaskId) {
            this.putQueryParameter("ActivityTaskId", activityTaskId);
            this.activityTaskId = activityTaskId;
            return this;
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
        public GetActivityTaskRequest build() {
            return new GetActivityTaskRequest(this);
        } 

    } 

}
