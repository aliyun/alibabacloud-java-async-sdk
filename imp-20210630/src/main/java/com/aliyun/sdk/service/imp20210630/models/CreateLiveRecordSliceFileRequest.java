// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveRecordSliceFileRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveRecordSliceFileRequest</p>
 */
public class CreateLiveRecordSliceFileRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Body
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private CreateLiveRecordSliceFileRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTime = builder.endTime;
        this.fileName = builder.fileName;
        this.liveId = builder.liveId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveRecordSliceFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateLiveRecordSliceFileRequest, Builder> {
        private String appId; 
        private Long endTime; 
        private String fileName; 
        private String liveId; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveRecordSliceFileRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTime = request.endTime;
            this.fileName = request.fileName;
            this.liveId = request.liveId;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * 应用唯一标识，由6位小写字母、数字组成。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 片段结束时间，时间戳。
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 自定义文件名称。
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * 直播ID。
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
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

        /**
         * 片段开始时间，时间戳。
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateLiveRecordSliceFileRequest build() {
            return new CreateLiveRecordSliceFileRequest(this);
        } 

    } 

}
