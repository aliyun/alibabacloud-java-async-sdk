// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoSummaryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoSummaryTaskRequest</p>
 */
public class CreateVideoSummaryTaskRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Body
    @NameInMap("EndTimeStamp")
    @Validation(required = true)
    private Long endTimeStamp;

    @Body
    @NameInMap("LiveVideoSummary")
    private String liveVideoSummary;

    @Body
    @NameInMap("OptionList")
    private String optionList;

    @Body
    @NameInMap("StartTimeStamp")
    @Validation(required = true)
    private Long startTimeStamp;

    private CreateVideoSummaryTaskRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.deviceId = builder.deviceId;
        this.endTimeStamp = builder.endTimeStamp;
        this.liveVideoSummary = builder.liveVideoSummary;
        this.optionList = builder.optionList;
        this.startTimeStamp = builder.startTimeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoSummaryTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    /**
     * @return liveVideoSummary
     */
    public String getLiveVideoSummary() {
        return this.liveVideoSummary;
    }

    /**
     * @return optionList
     */
    public String getOptionList() {
        return this.optionList;
    }

    /**
     * @return startTimeStamp
     */
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public static final class Builder extends Request.Builder<CreateVideoSummaryTaskRequest, Builder> {
        private String corpId; 
        private String deviceId; 
        private Long endTimeStamp; 
        private String liveVideoSummary; 
        private String optionList; 
        private Long startTimeStamp; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoSummaryTaskRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.deviceId = response.deviceId;
            this.endTimeStamp = response.endTimeStamp;
            this.liveVideoSummary = response.liveVideoSummary;
            this.optionList = response.optionList;
            this.startTimeStamp = response.startTimeStamp;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * EndTimeStamp.
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.putBodyParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
            return this;
        }

        /**
         * LiveVideoSummary.
         */
        public Builder liveVideoSummary(String liveVideoSummary) {
            this.putBodyParameter("LiveVideoSummary", liveVideoSummary);
            this.liveVideoSummary = liveVideoSummary;
            return this;
        }

        /**
         * OptionList.
         */
        public Builder optionList(String optionList) {
            this.putBodyParameter("OptionList", optionList);
            this.optionList = optionList;
            return this;
        }

        /**
         * StartTimeStamp.
         */
        public Builder startTimeStamp(Long startTimeStamp) {
            this.putBodyParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        @Override
        public CreateVideoSummaryTaskRequest build() {
            return new CreateVideoSummaryTaskRequest(this);
        } 

    } 

}
