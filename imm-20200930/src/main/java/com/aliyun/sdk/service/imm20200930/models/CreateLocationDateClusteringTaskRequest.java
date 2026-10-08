// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    private java.util.Map<String, ?> tags;

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
    public java.util.Map<String, ?> getTags() {
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
        private java.util.Map<String, ?> tags; 
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
         * <p>The dataset name. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The date clustering settings.</p>
         * <blockquote>
         * <p>Notice: Modifying this setting also affects existing spatio-temporal clusters in your <code>Dataset</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder dateOptions(DateOptions dateOptions) {
            String dateOptionsShrink = shrink(dateOptions, "DateOptions", "json");
            this.putQueryParameter("DateOptions", dateOptionsShrink);
            this.dateOptions = dateOptions;
            return this;
        }

        /**
         * <p>The location clustering settings.</p>
         * <blockquote>
         * <p>Notice: Modifying this setting also affects existing spatio-temporal clusters in your <code>Dataset</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder locationOptions(LocationOptions locationOptions) {
            String locationOptionsShrink = shrink(locationOptions, "LocationOptions", "json");
            this.putQueryParameter("LocationOptions", locationOptionsShrink);
            this.locationOptions = locationOptions;
            return this;
        }

        /**
         * <p>The message notification configuration. For more information, see Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The project name. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>Custom tags used to search for and filter asynchronous tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;User&quot;: &quot;Jane&quot;
         * }</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>Custom information that is returned in the asynchronous notification message. This helps you associate the notification message with your system. The maximum length is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>test-data</p>
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

    /**
     * 
     * {@link CreateLocationDateClusteringTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateLocationDateClusteringTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(DateOptions model) {
                this.gapDays = model.gapDays;
                this.maxDays = model.maxDays;
                this.minDays = model.minDays;
            } 

            /**
             * <p>The maximum number of gap days allowed in a single spatio-temporal group. The value must be in the range of 0 to 99,999.</p>
             * <p>For example, a user has photos from March 4–5 and March 7, but not from March 6. If you assume that the photos from March 4–7 belong to the same trip, set this parameter to <code>1 day</code>. This allows the gap of <code>1 day</code> on March 6 to be included in the same spatio-temporal cluster.</p>
             * <p>Set this parameter to a value from 0 to 3.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gapDays(Long gapDays) {
                this.gapDays = gapDays;
                return this;
            }

            /**
             * <p>The maximum number of days in a single spatio-temporal group. The value must be in the range of 1 to 99,999. Clusters with more days than this value are not detected or stored.</p>
             * <p>For example, if a user takes photos in the same location for more than 15 consecutive days, this location might be their residence rather than a travel destination. If you want to exclude this time period and location from the spatio-temporal clusters, set this parameter to 15.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder maxDays(Long maxDays) {
                this.maxDays = maxDays;
                return this;
            }

            /**
             * <p>The minimum number of days in a single spatio-temporal group. The value must be in the range of 1 to 99,999. Clusters with fewer days than this value are not detected or stored.</p>
             * <p>For example, if you do not want to include one-day trips in the generated groups, set this parameter to 2.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link CreateLocationDateClusteringTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateLocationDateClusteringTaskRequest</p>
     */
    public static class LocationOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocationDateClusterLevels")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> locationDateClusterLevels;

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
        public java.util.List<String> getLocationDateClusterLevels() {
            return this.locationDateClusterLevels;
        }

        public static final class Builder {
            private java.util.List<String> locationDateClusterLevels; 

            private Builder() {
            } 

            private Builder(LocationOptions model) {
                this.locationDateClusterLevels = model.locationDateClusterLevels;
            } 

            /**
             * <p>A list of administrative levels for grouping. You can select multiple levels.</p>
             * <p>For example, a user uploads photos taken in Hangzhou from March 3 to March 5 and photos taken in Jiaxing from March 6 to March 8. If you set this parameter to <code>[&quot;city&quot;, &quot;province&quot;]</code>, the following spatio-temporal clusters are generated:</p>
             * <ul>
             * <li><p>March 3 to March 5, Hangzhou</p>
             * </li>
             * <li><p>March 6 to March 8, Jiaxing</p>
             * </li>
             * <li><p>March 3 to March 8, Zhejiang</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             */
            public Builder locationDateClusterLevels(java.util.List<String> locationDateClusterLevels) {
                this.locationDateClusterLevels = locationDateClusterLevels;
                return this;
            }

            public LocationOptions build() {
                return new LocationOptions(this);
            } 

        } 

    }
}
