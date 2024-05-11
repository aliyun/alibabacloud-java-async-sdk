// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFigureClustersMergingTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateFigureClustersMergingTaskRequest</p>
 */
public class CreateFigureClustersMergingTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Froms")
    private java.util.List < String > froms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private String to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateFigureClustersMergingTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetName = builder.datasetName;
        this.from = builder.from;
        this.froms = builder.froms;
        this.notification = builder.notification;
        this.projectName = builder.projectName;
        this.tags = builder.tags;
        this.to = builder.to;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFigureClustersMergingTaskRequest create() {
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
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return froms
     */
    public java.util.List < String > getFroms() {
        return this.froms;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateFigureClustersMergingTaskRequest, Builder> {
        private String regionId; 
        private String datasetName; 
        private String from; 
        private java.util.List < String > froms; 
        private Notification notification; 
        private String projectName; 
        private java.util.Map < String, ? > tags; 
        private String to; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateFigureClustersMergingTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetName = request.datasetName;
            this.from = request.from;
            this.froms = request.froms;
            this.notification = request.notification;
            this.projectName = request.projectName;
            this.tags = request.tags;
            this.to = request.to;
            this.userData = request.userData;
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
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Froms.
         */
        public Builder froms(java.util.List < String > froms) {
            String fromsShrink = shrink(froms, "Froms", "json");
            this.putQueryParameter("Froms", fromsShrink);
            this.froms = froms;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * To.
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateFigureClustersMergingTaskRequest build() {
            return new CreateFigureClustersMergingTaskRequest(this);
        } 

    } 

}
