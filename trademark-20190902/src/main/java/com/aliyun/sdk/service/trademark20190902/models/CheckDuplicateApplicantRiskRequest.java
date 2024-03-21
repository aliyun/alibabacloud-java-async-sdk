// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDuplicateApplicantRiskRequest} extends {@link RequestModel}
 *
 * <p>CheckDuplicateApplicantRiskRequest</p>
 */
public class CheckDuplicateApplicantRiskRequest extends Request {
    @Query
    @NameInMap("ApplicantName")
    @Validation(required = true)
    private String applicantName;

    @Query
    @NameInMap("EventSceneType")
    private Integer eventSceneType;

    private CheckDuplicateApplicantRiskRequest(Builder builder) {
        super(builder);
        this.applicantName = builder.applicantName;
        this.eventSceneType = builder.eventSceneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDuplicateApplicantRiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicantName
     */
    public String getApplicantName() {
        return this.applicantName;
    }

    /**
     * @return eventSceneType
     */
    public Integer getEventSceneType() {
        return this.eventSceneType;
    }

    public static final class Builder extends Request.Builder<CheckDuplicateApplicantRiskRequest, Builder> {
        private String applicantName; 
        private Integer eventSceneType; 

        private Builder() {
            super();
        } 

        private Builder(CheckDuplicateApplicantRiskRequest request) {
            super(request);
            this.applicantName = request.applicantName;
            this.eventSceneType = request.eventSceneType;
        } 

        /**
         * ApplicantName.
         */
        public Builder applicantName(String applicantName) {
            this.putQueryParameter("ApplicantName", applicantName);
            this.applicantName = applicantName;
            return this;
        }

        /**
         * EventSceneType.
         */
        public Builder eventSceneType(Integer eventSceneType) {
            this.putQueryParameter("EventSceneType", eventSceneType);
            this.eventSceneType = eventSceneType;
            return this;
        }

        @Override
        public CheckDuplicateApplicantRiskRequest build() {
            return new CheckDuplicateApplicantRiskRequest(this);
        } 

    } 

}
