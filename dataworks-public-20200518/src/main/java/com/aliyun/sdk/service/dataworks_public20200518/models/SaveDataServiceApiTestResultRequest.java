// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveDataServiceApiTestResultRequest} extends {@link RequestModel}
 *
 * <p>SaveDataServiceApiTestResultRequest</p>
 */
public class SaveDataServiceApiTestResultRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ApiId")
    @Validation(required = true)
    private Long apiId;

    @Body
    @NameInMap("AutoGenerate")
    private Boolean autoGenerate;

    @Body
    @NameInMap("FailResultSample")
    private String failResultSample;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("ResultSample")
    private String resultSample;

    private SaveDataServiceApiTestResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiId = builder.apiId;
        this.autoGenerate = builder.autoGenerate;
        this.failResultSample = builder.failResultSample;
        this.projectId = builder.projectId;
        this.resultSample = builder.resultSample;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveDataServiceApiTestResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return apiId
     */
    public Long getApiId() {
        return this.apiId;
    }

    /**
     * @return autoGenerate
     */
    public Boolean getAutoGenerate() {
        return this.autoGenerate;
    }

    /**
     * @return failResultSample
     */
    public String getFailResultSample() {
        return this.failResultSample;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return resultSample
     */
    public String getResultSample() {
        return this.resultSample;
    }

    public static final class Builder extends Request.Builder<SaveDataServiceApiTestResultRequest, Builder> {
        private String regionId; 
        private Long apiId; 
        private Boolean autoGenerate; 
        private String failResultSample; 
        private Long projectId; 
        private String resultSample; 

        private Builder() {
            super();
        } 

        private Builder(SaveDataServiceApiTestResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiId = request.apiId;
            this.autoGenerate = request.autoGenerate;
            this.failResultSample = request.failResultSample;
            this.projectId = request.projectId;
            this.resultSample = request.resultSample;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ApiId.
         */
        public Builder apiId(Long apiId) {
            this.putBodyParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * AutoGenerate.
         */
        public Builder autoGenerate(Boolean autoGenerate) {
            this.putBodyParameter("AutoGenerate", autoGenerate);
            this.autoGenerate = autoGenerate;
            return this;
        }

        /**
         * FailResultSample.
         */
        public Builder failResultSample(String failResultSample) {
            this.putBodyParameter("FailResultSample", failResultSample);
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ResultSample.
         */
        public Builder resultSample(String resultSample) {
            this.putBodyParameter("ResultSample", resultSample);
            this.resultSample = resultSample;
            return this;
        }

        @Override
        public SaveDataServiceApiTestResultRequest build() {
            return new SaveDataServiceApiTestResultRequest(this);
        } 

    } 

}
