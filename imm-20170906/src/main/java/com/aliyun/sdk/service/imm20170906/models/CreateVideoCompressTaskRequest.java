// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoCompressTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoCompressTaskRequest</p>
 */
public class CreateVideoCompressTaskRequest extends Request {
    @Query
    @NameInMap("CustomMessage")
    private String customMessage;

    @Query
    @NameInMap("NotifyEndpoint")
    private String notifyEndpoint;

    @Query
    @NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetList")
    private String targetList;

    @Query
    @NameInMap("TargetSegment")
    private String targetSegment;

    @Query
    @NameInMap("TargetSubtitle")
    private String targetSubtitle;

    @Query
    @NameInMap("VideoUri")
    @Validation(required = true)
    private String videoUri;

    private CreateVideoCompressTaskRequest(Builder builder) {
        super(builder);
        this.customMessage = builder.customMessage;
        this.notifyEndpoint = builder.notifyEndpoint;
        this.notifyTopicName = builder.notifyTopicName;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.targetList = builder.targetList;
        this.targetSegment = builder.targetSegment;
        this.targetSubtitle = builder.targetSubtitle;
        this.videoUri = builder.videoUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoCompressTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customMessage
     */
    public String getCustomMessage() {
        return this.customMessage;
    }

    /**
     * @return notifyEndpoint
     */
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    /**
     * @return notifyTopicName
     */
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetList
     */
    public String getTargetList() {
        return this.targetList;
    }

    /**
     * @return targetSegment
     */
    public String getTargetSegment() {
        return this.targetSegment;
    }

    /**
     * @return targetSubtitle
     */
    public String getTargetSubtitle() {
        return this.targetSubtitle;
    }

    /**
     * @return videoUri
     */
    public String getVideoUri() {
        return this.videoUri;
    }

    public static final class Builder extends Request.Builder<CreateVideoCompressTaskRequest, Builder> {
        private String customMessage; 
        private String notifyEndpoint; 
        private String notifyTopicName; 
        private String project; 
        private String regionId; 
        private String targetList; 
        private String targetSegment; 
        private String targetSubtitle; 
        private String videoUri; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoCompressTaskRequest response) {
            super(response);
            this.customMessage = response.customMessage;
            this.notifyEndpoint = response.notifyEndpoint;
            this.notifyTopicName = response.notifyTopicName;
            this.project = response.project;
            this.regionId = response.regionId;
            this.targetList = response.targetList;
            this.targetSegment = response.targetSegment;
            this.targetSubtitle = response.targetSubtitle;
            this.videoUri = response.videoUri;
        } 

        /**
         * CustomMessage.
         */
        public Builder customMessage(String customMessage) {
            this.putQueryParameter("CustomMessage", customMessage);
            this.customMessage = customMessage;
            return this;
        }

        /**
         * NotifyEndpoint.
         */
        public Builder notifyEndpoint(String notifyEndpoint) {
            this.putQueryParameter("NotifyEndpoint", notifyEndpoint);
            this.notifyEndpoint = notifyEndpoint;
            return this;
        }

        /**
         * NotifyTopicName.
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.putQueryParameter("NotifyTopicName", notifyTopicName);
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
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
         * TargetList.
         */
        public Builder targetList(String targetList) {
            this.putQueryParameter("TargetList", targetList);
            this.targetList = targetList;
            return this;
        }

        /**
         * TargetSegment.
         */
        public Builder targetSegment(String targetSegment) {
            this.putQueryParameter("TargetSegment", targetSegment);
            this.targetSegment = targetSegment;
            return this;
        }

        /**
         * TargetSubtitle.
         */
        public Builder targetSubtitle(String targetSubtitle) {
            this.putQueryParameter("TargetSubtitle", targetSubtitle);
            this.targetSubtitle = targetSubtitle;
            return this;
        }

        /**
         * VideoUri.
         */
        public Builder videoUri(String videoUri) {
            this.putQueryParameter("VideoUri", videoUri);
            this.videoUri = videoUri;
            return this;
        }

        @Override
        public CreateVideoCompressTaskRequest build() {
            return new CreateVideoCompressTaskRequest(this);
        } 

    } 

}
