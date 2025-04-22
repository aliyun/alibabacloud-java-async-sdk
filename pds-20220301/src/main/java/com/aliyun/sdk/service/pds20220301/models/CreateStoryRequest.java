// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("address")
    private Address address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("custom_labels")
    @Deprecated
    private java.util.Map<String, String> customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("max_image_count")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Long maxImageCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("min_image_count")
    private Long minImageCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_end_time")
    private String storyEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_id")
    private String storyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_name")
    private String storyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_start_time")
    private String storyStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_sub_type")
    private String storySubType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyType;

    private CreateStoryRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.address = builder.address;
        this.customLabels = builder.customLabels;
        this.driveId = builder.driveId;
        this.maxImageCount = builder.maxImageCount;
        this.minImageCount = builder.minImageCount;
        this.storyEndTime = builder.storyEndTime;
        this.storyId = builder.storyId;
        this.storyName = builder.storyName;
        this.storyStartTime = builder.storyStartTime;
        this.storySubType = builder.storySubType;
        this.storyType = builder.storyType;
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
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return address
     */
    public Address getAddress() {
        return this.address;
    }

    /**
     * @return customLabels
     */
    public java.util.Map<String, String> getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return maxImageCount
     */
    public Long getMaxImageCount() {
        return this.maxImageCount;
    }

    /**
     * @return minImageCount
     */
    public Long getMinImageCount() {
        return this.minImageCount;
    }

    /**
     * @return storyEndTime
     */
    public String getStoryEndTime() {
        return this.storyEndTime;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
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

    public static final class Builder extends Request.Builder<CreateStoryRequest, Builder> {
        private String domainId; 
        private Address address; 
        private java.util.Map<String, String> customLabels; 
        private String driveId; 
        private Long maxImageCount; 
        private Long minImageCount; 
        private String storyEndTime; 
        private String storyId; 
        private String storyName; 
        private String storyStartTime; 
        private String storySubType; 
        private String storyType; 

        private Builder() {
            super();
        } 

        private Builder(CreateStoryRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.address = request.address;
            this.customLabels = request.customLabels;
            this.driveId = request.driveId;
            this.maxImageCount = request.maxImageCount;
            this.minImageCount = request.minImageCount;
            this.storyEndTime = request.storyEndTime;
            this.storyId = request.storyId;
            this.storyName = request.storyName;
            this.storyStartTime = request.storyStartTime;
            this.storySubType = request.storySubType;
            this.storyType = request.storyType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * address.
         */
        public Builder address(Address address) {
            this.putBodyParameter("address", address);
            this.address = address;
            return this;
        }

        /**
         * custom_labels.
         */
        public Builder customLabels(java.util.Map<String, String> customLabels) {
            this.putBodyParameter("custom_labels", customLabels);
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * max_image_count.
         */
        public Builder maxImageCount(Long maxImageCount) {
            this.putBodyParameter("max_image_count", maxImageCount);
            this.maxImageCount = maxImageCount;
            return this;
        }

        /**
         * min_image_count.
         */
        public Builder minImageCount(Long minImageCount) {
            this.putBodyParameter("min_image_count", minImageCount);
            this.minImageCount = minImageCount;
            return this;
        }

        /**
         * story_end_time.
         */
        public Builder storyEndTime(String storyEndTime) {
            this.putBodyParameter("story_end_time", storyEndTime);
            this.storyEndTime = storyEndTime;
            return this;
        }

        /**
         * story_id.
         */
        public Builder storyId(String storyId) {
            this.putBodyParameter("story_id", storyId);
            this.storyId = storyId;
            return this;
        }

        /**
         * story_name.
         */
        public Builder storyName(String storyName) {
            this.putBodyParameter("story_name", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * story_start_time.
         */
        public Builder storyStartTime(String storyStartTime) {
            this.putBodyParameter("story_start_time", storyStartTime);
            this.storyStartTime = storyStartTime;
            return this;
        }

        /**
         * story_sub_type.
         */
        public Builder storySubType(String storySubType) {
            this.putBodyParameter("story_sub_type", storySubType);
            this.storySubType = storySubType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TagMemory</p>
         */
        public Builder storyType(String storyType) {
            this.putBodyParameter("story_type", storyType);
            this.storyType = storyType;
            return this;
        }

        @Override
        public CreateStoryRequest build() {
            return new CreateStoryRequest(this);
        } 

    } 

}
