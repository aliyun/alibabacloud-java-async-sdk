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
         * <p>The address of the story. IMM filters candidate photos to generate a story based on the value of this parameter. This parameter takes effect only if you set StoryType to TravelMemory.</p>
         * <blockquote>
         * <p> If you are located in Hong Kong (China), Macao (China), Taiwan (China), or overseas, you cannot specify an address in the Chinese mainland by using this parameter.</p>
         * </blockquote>
         */
        public Builder address(AddressForStory address) {
            String addressShrink = shrink(address, "Address", "json");
            this.putBodyParameter("Address", addressShrink);
            this.address = address;
            return this;
        }

        /**
         * <p>The custom ID. A custom ID of a generated story may differ from the value of ObjectID and can be utilized for subsequent retrieval and sorting of stories.</p>
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
         * <p>The custom labels. Labels specify the custom information of the story. This enables retrieval based on your business requirements.</p>
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
         * <p>The name of the dataset. For information about how to obtain the name of a dataset, see <a href="https://help.aliyun.com/document_detail/478160.html">Create a dataset</a>.</p>
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
         * <p>The maximum number of photo files in the story. The actual number of photo files ranges from the value of MinFileCount to the value of MaxFileCount. The value of this parameter must be an integer greater than the value of MinFileCount. To provide the desired effect, the algorithm limits the maximum number of photo files to 1,500. If you set MaxFileCount to a value greater than 1,500, this parameter does not take effect.</p>
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
         * <p>The minimum number of photo files in the story. The actual number of photo files ranges from the value of MinFileCount to the value of MaxFileCount. The value of this parameter must be an integer greater than 1. If the actual number of candidate photos is less than the value of this parameter, a null story is returned.</p>
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
         * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putQueryParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The topic name of the asynchronous reverse notification.</p>
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
         * <p>The ID of the story. This parameter is optional. If you leave this parameter empty, IMM assigns a unique identifier to the story. You can query and update a story based on its ID. You can also manually create an ID for a story. After you create an ID for a story, you must specify this parameter to pass the ID into the system. This way, IMM can record the ID as the unique identifier of the story. If you pass an existing ID into the system, IMM updates the story that corresponds to the ID.</p>
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
         * <p>The name of the project. You can obtain the name of the project from the response of the <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a> operation.</p>
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
         * <p>The end time of the photo collection for which you want to create the story. StoryStartTime and StoryEndTime form a time interval based on which IMM filters candidate photos to generate a story. The value must be a string in the RFC3339 format.</p>
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
         * <p>The start time of the photo collection for which you want to create the story. StoryStartTime and StoryEndTime form a time interval based on which IMM filters candidate photos to generate a story. The value must be a string in the RFC3339 format.</p>
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
         * <p>The subtype of the story. For information about valid subtypes, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
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
         * <p>The type of the story. For information about valid types, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
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
         * <p>The tags. You can specify this parameter in one of the following scenarios:</p>
         * <ul>
         * <li>Specify tags as custom data, which is returned in messages provided by Simple Message Queue.</li>
         * <li>Search for tasks by tag.</li>
         * <li>Specify tags as variables in destination URIs.</li>
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
         * <p>The custom information, which is returned as asynchronous notifications to facilitate notification management in your system. The maximum information length is 2,048 bytes.</p>
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
