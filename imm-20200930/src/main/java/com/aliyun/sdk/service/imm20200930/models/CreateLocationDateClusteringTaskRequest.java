// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
         * <p>The name of the dataset.<a href="~~478160~~"></a></p>
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
         * <p>The date configurations for clustering.</p>
         * <blockquote>
         * <p> Adjusting these configurations affects existing spatiotemporal clusters for the dataset.</p>
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
         * <p>The geolocation configurations for clustering.</p>
         * <blockquote>
         * <p> Adjusting these configurations affects existing spatiotemporal clusters for the dataset.</p>
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
         * <p>The notification message configurations. For more information, see the &quot;Metadata indexing&quot; section of the <a href="https://help.aliyun.com/document_detail/471456.html">Asynchronous message examples</a> topic.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
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
         * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;User&quot;: &quot;Jane&quot;
         * }</p>
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The custom information, which is returned in an asynchronous notification and facilitates notification management. The maximum length of the value is 2,048 bytes.</p>
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

            /**
             * <p>The maximum number of days allowed in a gap for a single spatiotemporal cluster. Valid values: 0 to 99999.</p>
             * <p>For example, if travel photos were produced on March 4, 5, and 7, 2024, but not on Marh 6, 2024, and you set the parameter to 1, IMM considers the travel spanning the date range from March 4, 2024 to March 7, 2024 and includes photos within the data range in the same cluster.````</p>
             * <p>We recommend that you set the parameter to a value within the range from 0 to 3.</p>
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
             * <p>The maximum number of days that a single spatiotemporal cluster can span. Valid values: 1 to 99999. IMM does not create a cluster that spans more than the maximum number of days.</p>
             * <p>For example, if you want to create travel photo clusters, you may want to exclude photos that were taken within 15 consecutive days in the same city, because it is likely that these photos were not taken during a travel. In this case, you can set the parameter to 15 to exclude this time range and location from the clustering task.</p>
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
             * <p>The minimum number of days that a single spatiotemporal cluster can span. Valid values: 1 to 99999. IMM does not create a cluster that spans less than the minimum number of days.</p>
             * <p>For example, if you do not want a one-day tour cluster, you can set the parameter to 2.</p>
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
             * <p>The administrative division levels. You can specify multiple administrative division levels.</p>
             * <p>For example, you uploaded photos that were taken from March 3, 2024 to March 5, 2024 in Hangzhou and photos that were taken from March 6, 2024 to March 8, 2024 in Jiaxing. When you call the operation and set the parameter to <code>[&quot;city&quot;, &quot;province&quot;]</code>, the following spatiotemporal clusters are created from these photos:</p>
             * <ul>
             * <li>March 3, 2024 to March 5, 2024, Hangzhou</li>
             * <li>March 6, 2024 to March 8, 2024, Jiaxing</li>
             * <li>March 3, 2024 to March 8, 2024, Zhejiang</li>
             * </ul>
             * <p>This parameter is required.</p>
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
