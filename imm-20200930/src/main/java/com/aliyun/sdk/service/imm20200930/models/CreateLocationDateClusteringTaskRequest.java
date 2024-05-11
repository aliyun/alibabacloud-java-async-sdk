// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLocationDateClusteringTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateLocationDateClusteringTaskRequest</p>
 */
public class CreateLocationDateClusteringTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateOptions")
    @com.aliyun.core.annotation.Validation(required = true)
    private DateOptions dateOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationOptions")
    @com.aliyun.core.annotation.Validation(required = true)
    private LocationOptions locationOptions;

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
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateLocationDateClusteringTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetName = builder.datasetName;
        this.dateOptions = builder.dateOptions;
        this.locationOptions = builder.locationOptions;
        this.notification = builder.notification;
        this.projectName = builder.projectName;
        this.tags = builder.tags;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLocationDateClusteringTaskRequest create() {
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
     * @return dateOptions
     */
    public DateOptions getDateOptions() {
        return this.dateOptions;
    }

    /**
     * @return locationOptions
     */
    public LocationOptions getLocationOptions() {
        return this.locationOptions;
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateLocationDateClusteringTaskRequest, Builder> {
        private String regionId; 
        private String datasetName; 
        private DateOptions dateOptions; 
        private LocationOptions locationOptions; 
        private Notification notification; 
        private String projectName; 
        private java.util.Map < String, ? > tags; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateLocationDateClusteringTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetName = request.datasetName;
            this.dateOptions = request.dateOptions;
            this.locationOptions = request.locationOptions;
            this.notification = request.notification;
            this.projectName = request.projectName;
            this.tags = request.tags;
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
         * DateOptions.
         */
        public Builder dateOptions(DateOptions dateOptions) {
            String dateOptionsShrink = shrink(dateOptions, "DateOptions", "json");
            this.putQueryParameter("DateOptions", dateOptionsShrink);
            this.dateOptions = dateOptions;
            return this;
        }

        /**
         * LocationOptions.
         */
        public Builder locationOptions(LocationOptions locationOptions) {
            String locationOptionsShrink = shrink(locationOptions, "LocationOptions", "json");
            this.putQueryParameter("LocationOptions", locationOptionsShrink);
            this.locationOptions = locationOptions;
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
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateLocationDateClusteringTaskRequest build() {
            return new CreateLocationDateClusteringTaskRequest(this);
        } 

    } 

    public static class DateOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GapDays")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long gapDays;

        @com.aliyun.core.annotation.NameInMap("MaxDays")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long maxDays;

        @com.aliyun.core.annotation.NameInMap("MinDays")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long minDays;

        private DateOptions(Builder builder) {
            this.gapDays = builder.gapDays;
            this.maxDays = builder.maxDays;
            this.minDays = builder.minDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DateOptions create() {
            return builder().build();
        }

        /**
         * @return gapDays
         */
        public Long getGapDays() {
            return this.gapDays;
        }

        /**
         * @return maxDays
         */
        public Long getMaxDays() {
            return this.maxDays;
        }

        /**
         * @return minDays
         */
        public Long getMinDays() {
            return this.minDays;
        }

        public static final class Builder {
            private Long gapDays; 
            private Long maxDays; 
            private Long minDays; 

            /**
             * GapDays.
             */
            public Builder gapDays(Long gapDays) {
                this.gapDays = gapDays;
                return this;
            }

            /**
             * MaxDays.
             */
            public Builder maxDays(Long maxDays) {
                this.maxDays = maxDays;
                return this;
            }

            /**
             * MinDays.
             */
            public Builder minDays(Long minDays) {
                this.minDays = minDays;
                return this;
            }

            public DateOptions build() {
                return new DateOptions(this);
            } 

        } 

    }
    public static class LocationOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocationDateClusterLevels")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > locationDateClusterLevels;

        private LocationOptions(Builder builder) {
            this.locationDateClusterLevels = builder.locationDateClusterLevels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocationOptions create() {
            return builder().build();
        }

        /**
         * @return locationDateClusterLevels
         */
        public java.util.List < String > getLocationDateClusterLevels() {
            return this.locationDateClusterLevels;
        }

        public static final class Builder {
            private java.util.List < String > locationDateClusterLevels; 

            /**
             * LocationDateClusterLevels.
             */
            public Builder locationDateClusterLevels(java.util.List < String > locationDateClusterLevels) {
                this.locationDateClusterLevels = locationDateClusterLevels;
                return this;
            }

            public LocationOptions build() {
                return new LocationOptions(this);
            } 

        } 

    }
}
