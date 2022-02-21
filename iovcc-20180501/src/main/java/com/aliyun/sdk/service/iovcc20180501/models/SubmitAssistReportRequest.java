// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAssistReportRequest} extends {@link RequestModel}
 *
 * <p>SubmitAssistReportRequest</p>
 */
public class SubmitAssistReportRequest extends Request {
    @Body
    @NameInMap("AssistDescription")
    private String assistDescription;

    @Body
    @NameInMap("AssistId")
    @Validation(required = true)
    private String assistId;

    @Body
    @NameInMap("AssistReason")
    private String assistReason;

    @Body
    @NameInMap("AssistResult")
    private String assistResult;

    @Body
    @NameInMap("AssistTag")
    private String assistTag;

    @Body
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private SubmitAssistReportRequest(Builder builder) {
        super(builder);
        this.assistDescription = builder.assistDescription;
        this.assistId = builder.assistId;
        this.assistReason = builder.assistReason;
        this.assistResult = builder.assistResult;
        this.assistTag = builder.assistTag;
        this.deviceModel = builder.deviceModel;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAssistReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assistDescription
     */
    public String getAssistDescription() {
        return this.assistDescription;
    }

    /**
     * @return assistId
     */
    public String getAssistId() {
        return this.assistId;
    }

    /**
     * @return assistReason
     */
    public String getAssistReason() {
        return this.assistReason;
    }

    /**
     * @return assistResult
     */
    public String getAssistResult() {
        return this.assistResult;
    }

    /**
     * @return assistTag
     */
    public String getAssistTag() {
        return this.assistTag;
    }

    /**
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SubmitAssistReportRequest, Builder> {
        private String assistDescription; 
        private String assistId; 
        private String assistReason; 
        private String assistResult; 
        private String assistTag; 
        private String deviceModel; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAssistReportRequest response) {
            super(response);
            this.assistDescription = response.assistDescription;
            this.assistId = response.assistId;
            this.assistReason = response.assistReason;
            this.assistResult = response.assistResult;
            this.assistTag = response.assistTag;
            this.deviceModel = response.deviceModel;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * AssistDescription.
         */
        public Builder assistDescription(String assistDescription) {
            this.putBodyParameter("AssistDescription", assistDescription);
            this.assistDescription = assistDescription;
            return this;
        }

        /**
         * AssistId.
         */
        public Builder assistId(String assistId) {
            this.putBodyParameter("AssistId", assistId);
            this.assistId = assistId;
            return this;
        }

        /**
         * AssistReason.
         */
        public Builder assistReason(String assistReason) {
            this.putBodyParameter("AssistReason", assistReason);
            this.assistReason = assistReason;
            return this;
        }

        /**
         * AssistResult.
         */
        public Builder assistResult(String assistResult) {
            this.putBodyParameter("AssistResult", assistResult);
            this.assistResult = assistResult;
            return this;
        }

        /**
         * AssistTag.
         */
        public Builder assistTag(String assistTag) {
            this.putBodyParameter("AssistTag", assistTag);
            this.assistTag = assistTag;
            return this;
        }

        /**
         * DeviceModel.
         */
        public Builder deviceModel(String deviceModel) {
            this.putBodyParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SubmitAssistReportRequest build() {
            return new SubmitAssistReportRequest(this);
        } 

    } 

}
