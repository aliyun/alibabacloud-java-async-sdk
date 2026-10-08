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
 * {@link CreateStoryRequest} extends {@link RequestModel}
 *
 * <p>CreateStoryRequest</p>
 */
public class CreateStoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Address")
    private AddressForStory address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map<String, ?> customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxFileCount")
    private Long maxFileCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinFileCount")
    private Long minFileCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyTopicName")
    private String notifyTopicName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryEndTime")
    private String storyEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryName")
    private String storyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryStartTime")
    private String storyStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StorySubType")
    private String storySubType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateStoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.address = builder.address;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.maxFileCount = builder.maxFileCount;
        this.minFileCount = builder.minFileCount;
        this.notification = builder.notification;
        this.notifyTopicName = builder.notifyTopicName;
        this.objectId = builder.objectId;
        this.projectName = builder.projectName;
        this.storyEndTime = builder.storyEndTime;
        this.storyName = builder.storyName;
        this.storyStartTime = builder.storyStartTime;
        this.storySubType = builder.storySubType;
        this.storyType = builder.storyType;
        this.tags = builder.tags;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStoryRequest create() {
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
     * @return address
     */
    public AddressForStory getAddress() {
        return this.address;
    }

    /**
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * @return customLabels
     */
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return maxFileCount
     */
    public Long getMaxFileCount() {
        return this.maxFileCount;
    }

    /**
     * @return minFileCount
     */
    public Long getMinFileCount() {
        return this.minFileCount;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return notifyTopicName
     */
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return storyEndTime
     */
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    /**
     * @return storyName
     */
    public String getStoryName() {
        return this.storyName;
    }

    /**
     * @return storyStartTime
     */
    public String getStoryStartTime() {
        return this.storyStartTime;
    }

    /**
     * @return storySubType
     */
    public String getStorySubType() {
        return this.storySubType;
    }

    /**
     * @return storyType
     */
    public String getStoryType() {
        return this.storyType;
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

    public static final class Builder extends Request.Builder<CreateStoryRequest, Builder> {
        private String regionId; 
        private AddressForStory address; 
        private String customId; 
        private java.util.Map<String, ?> customLabels; 
        private String datasetName; 
        private Long maxFileCount; 
        private Long minFileCount; 
        private Notification notification; 
        private String notifyTopicName; 
        private String objectId; 
        private String projectName; 
        private String storyEndTime; 
        private String storyName; 
        private String storyStartTime; 
        private String storySubType; 
        private String storyType; 
        private java.util.Map<String, ?> tags; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateStoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.address = request.address;
            this.customId = request.customId;
            this.customLabels = request.customLabels;
            this.datasetName = request.datasetName;
            this.maxFileCount = request.maxFileCount;
            this.minFileCount = request.minFileCount;
            this.notification = request.notification;
            this.notifyTopicName = request.notifyTopicName;
            this.objectId = request.objectId;
            this.projectName = request.projectName;
            this.storyEndTime = request.storyEndTime;
            this.storyName = request.storyName;
            this.storyStartTime = request.storyStartTime;
            this.storySubType = request.storySubType;
            this.storyType = request.storyType;
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
         * <p>The address information for the story. IMM filters photos whose shooting locations match the specified address to generate the story. This parameter takes effect only when StoryType is set to TravelMemory.</p>
         * <blockquote>
         * <p>Due to regulatory requirements, parsing GPS information into addresses is not supported in Hong Kong (China), Macao (China), Taiwan (China), or regions outside of mainland China.</p>
         * </blockquote>
         */
        public Builder address(AddressForStory address) {
            String addressShrink = shrink(address, "Address", "json");
            this.putBodyParameter("Address", addressShrink);
            this.address = address;
            return this;
        }

        /**
         * <p>A custom identifier for the story. This ID can be different from ObjectId. You can use this ID to retrieve or sort stories.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder customId(String customId) {
            this.putBodyParameter("CustomId", customId);
            this.customId = customId;
            return this;
        }

        /**
         * <p>The custom labels. These labels contain custom information about the story and can be used for retrieval.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
         */
        public Builder customLabels(java.util.Map<String, ?> customLabels) {
            String customLabelsShrink = shrink(customLabels, "CustomLabels", "json");
            this.putBodyParameter("CustomLabels", customLabelsShrink);
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>The name of the dataset. For more information, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The maximum number of photos in the generated story. The actual number of photos is between the values of MinFileCount and MaxFileCount. The value must be an integer greater than the value of MinFileCount. To ensure the quality of the generated story, the internal algorithm limits the maximum number of photos to 1,500. If you set MaxFileCount to a value greater than 1,500, the setting does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxFileCount(Long maxFileCount) {
            this.putBodyParameter("MaxFileCount", maxFileCount);
            this.maxFileCount = maxFileCount;
            return this;
        }

        /**
         * <p>The minimum number of photos in the generated story. The actual number of photos is between the values of MinFileCount and MaxFileCount. The value must be an integer greater than 1. If the number of available candidate photos is less than this value, an empty story is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minFileCount(Long minFileCount) {
            this.putBodyParameter("MinFileCount", minFileCount);
            this.minFileCount = minFileCount;
            return this;
        }

        /**
         * <p>The notification configuration. For more information about the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the topic for asynchronous notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>test-topic</p>
         */
        public Builder notifyTopicName(String notifyTopicName) {
            this.putBodyParameter("NotifyTopicName", notifyTopicName);
            this.notifyTopicName = notifyTopicName;
            return this;
        }

        /**
         * <p>The ID for the story object. This parameter is optional. If you do not specify an ID, IMM generates one. You can use the story ID to query or update the story. If you specify an ID that already exists, the corresponding story is updated.</p>
         * 
         * <strong>example:</strong>
         * <p>id1</p>
         */
        public Builder objectId(String objectId) {
            this.putBodyParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The end time of the photo collection for the story. This parameter and StoryStartTime define a time range. IMM filters candidate photos within this time range to generate the story. The value must be a string in the RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-30T16:00:00Z</p>
         */
        public Builder storyEndTime(String storyEndTime) {
            this.putBodyParameter("StoryEndTime", storyEndTime);
            this.storyEndTime = storyEndTime;
            return this;
        }

        /**
         * <p>The name of the story.</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        public Builder storyName(String storyName) {
            this.putBodyParameter("StoryName", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * <p>The start time of the photo collection for the story. This parameter and StoryEndTime define a time range. IMM filters candidate photos within this time range to generate the story. The value must be a string in the RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-12-30T16:00:00Z</p>
         */
        public Builder storyStartTime(String storyStartTime) {
            this.putBodyParameter("StoryStartTime", storyStartTime);
            this.storyStartTime = storyStartTime;
            return this;
        }

        /**
         * <p>The subtype of the story to generate. For more information about story subtypes and their valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Solo</p>
         */
        public Builder storySubType(String storySubType) {
            this.putBodyParameter("StorySubType", storySubType);
            this.storySubType = storySubType;
            return this;
        }

        /**
         * <p>The type of the story to generate. For more information about story types and their valid values, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PeopleMemory</p>
         */
        public Builder storyType(String storyType) {
            this.putBodyParameter("StoryType", storyType);
            this.storyType = storyType;
            return this;
        }

        /**
         * <p>This parameter provides a tagging mechanism that can be used in the following scenarios:</p>
         * <ul>
         * <li><p>Set custom data that is returned in MNS messages.</p>
         * </li>
         * <li><p>Use as a search condition to search for tasks.</p>
         * </li>
         * <li><p>Use as a variable in TargetURI.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;val&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The custom information that is returned in an asynchronous notification message. You can use this information to associate the notification message with your services. The maximum length is 2,048 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ID&quot;: &quot;testuid&quot;,&quot;Name&quot;: &quot;test-user&quot;,&quot;Avatar&quot;: &quot;<a href="http://test.com/testuid%22%7D">http://test.com/testuid&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateStoryRequest build() {
            return new CreateStoryRequest(this);
        } 

    } 

}
