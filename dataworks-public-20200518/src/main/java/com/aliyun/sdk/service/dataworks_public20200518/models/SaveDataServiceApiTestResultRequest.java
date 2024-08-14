// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveDataServiceApiTestResultRequest} extends {@link RequestModel}
 *
 * <p>SaveDataServiceApiTestResultRequest</p>
 */
public class SaveDataServiceApiTestResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoGenerate")
    private Boolean autoGenerate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FailResultSample")
    private String failResultSample;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResultSample")
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
         * The API ID. You can call the [ListDataServiceApis](~~174012~~) operation to obtain the ID.
         */
        public Builder apiId(Long apiId) {
            this.putBodyParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * Specifies whether to use the test results generated by the system. If you do not configure the resultSample or failResultSample parameter, the test results generated by the system are used.
         */
        public Builder autoGenerate(Boolean autoGenerate) {
            this.putBodyParameter("AutoGenerate", autoGenerate);
            this.autoGenerate = autoGenerate;
            return this;
        }

        /**
         * The sample failure response of the API. This parameter is optional.
         */
        public Builder failResultSample(String failResultSample) {
            this.putBodyParameter("FailResultSample", failResultSample);
            this.failResultSample = failResultSample;
            return this;
        }

        /**
         * The DataWorks workspace ID. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to obtain the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The sample success response of the API. This parameter is optional.
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
