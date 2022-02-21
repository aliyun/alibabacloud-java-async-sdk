// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMergeFaceGroupsJobRequest} extends {@link RequestModel}
 *
 * <p>CreateMergeFaceGroupsJobRequest</p>
 */
public class CreateMergeFaceGroupsJobRequest extends Request {
    @Query
    @NameInMap("CustomMessage")
    private String customMessage;

    @Query
    @NameInMap("GroupIdFrom")
    private String groupIdFrom;

    @Query
    @NameInMap("GroupIdTo")
    private String groupIdTo;

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
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    private CreateMergeFaceGroupsJobRequest(Builder builder) {
        super(builder);
        this.customMessage = builder.customMessage;
        this.groupIdFrom = builder.groupIdFrom;
        this.groupIdTo = builder.groupIdTo;
        this.notifyEndpoint = builder.notifyEndpoint;
        this.notifyTopicName = builder.notifyTopicName;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMergeFaceGroupsJobRequest create() {
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
     * @return groupIdFrom
     */
    public String getGroupIdFrom() {
        return this.groupIdFrom;
    }

    /**
     * @return groupIdTo
     */
    public String getGroupIdTo() {
        return this.groupIdTo;
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
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    public static final class Builder extends Request.Builder<CreateMergeFaceGroupsJobRequest, Builder> {
        private String customMessage; 
        private String groupIdFrom; 
        private String groupIdTo; 
        private String notifyEndpoint; 
        private String notifyTopicName; 
        private String project; 
        private String regionId; 
        private String setId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMergeFaceGroupsJobRequest response) {
            super(response);
            this.customMessage = response.customMessage;
            this.groupIdFrom = response.groupIdFrom;
            this.groupIdTo = response.groupIdTo;
            this.notifyEndpoint = response.notifyEndpoint;
            this.notifyTopicName = response.notifyTopicName;
            this.project = response.project;
            this.regionId = response.regionId;
            this.setId = response.setId;
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
         * GroupIdFrom.
         */
        public Builder groupIdFrom(String groupIdFrom) {
            this.putQueryParameter("GroupIdFrom", groupIdFrom);
            this.groupIdFrom = groupIdFrom;
            return this;
        }

        /**
         * GroupIdTo.
         */
        public Builder groupIdTo(String groupIdTo) {
            this.putQueryParameter("GroupIdTo", groupIdTo);
            this.groupIdTo = groupIdTo;
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
         * SetId.
         */
        public Builder setId(String setId) {
            this.putQueryParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        @Override
        public CreateMergeFaceGroupsJobRequest build() {
            return new CreateMergeFaceGroupsJobRequest(this);
        } 

    } 

}
