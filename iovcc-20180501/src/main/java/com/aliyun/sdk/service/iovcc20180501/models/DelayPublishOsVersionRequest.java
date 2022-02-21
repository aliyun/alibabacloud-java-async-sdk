// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelayPublishOsVersionRequest} extends {@link RequestModel}
 *
 * <p>DelayPublishOsVersionRequest</p>
 */
public class DelayPublishOsVersionRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DownTime")
    private Long downTime;

    @Query
    @NameInMap("Email")
    @Validation(required = true)
    private String email;

    @Query
    @NameInMap("PrepubTime")
    private Long prepubTime;

    @Query
    @NameInMap("PrepublishCount")
    private String prepublishCount;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("PublishTime")
    private Long publishTime;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SendMessage")
    private String sendMessage;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private DelayPublishOsVersionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.downTime = builder.downTime;
        this.email = builder.email;
        this.prepubTime = builder.prepubTime;
        this.prepublishCount = builder.prepublishCount;
        this.projectId = builder.projectId;
        this.publishTime = builder.publishTime;
        this.regionId = builder.regionId;
        this.sendMessage = builder.sendMessage;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DelayPublishOsVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return downTime
     */
    public Long getDownTime() {
        return this.downTime;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return prepubTime
     */
    public Long getPrepubTime() {
        return this.prepubTime;
    }

    /**
     * @return prepublishCount
     */
    public String getPrepublishCount() {
        return this.prepublishCount;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return publishTime
     */
    public Long getPublishTime() {
        return this.publishTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sendMessage
     */
    public String getSendMessage() {
        return this.sendMessage;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DelayPublishOsVersionRequest, Builder> {
        private String description; 
        private Long downTime; 
        private String email; 
        private Long prepubTime; 
        private String prepublishCount; 
        private String projectId; 
        private Long publishTime; 
        private String regionId; 
        private String sendMessage; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DelayPublishOsVersionRequest response) {
            super(response);
            this.description = response.description;
            this.downTime = response.downTime;
            this.email = response.email;
            this.prepubTime = response.prepubTime;
            this.prepublishCount = response.prepublishCount;
            this.projectId = response.projectId;
            this.publishTime = response.publishTime;
            this.regionId = response.regionId;
            this.sendMessage = response.sendMessage;
            this.versionId = response.versionId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DownTime.
         */
        public Builder downTime(Long downTime) {
            this.putQueryParameter("DownTime", downTime);
            this.downTime = downTime;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * PrepubTime.
         */
        public Builder prepubTime(Long prepubTime) {
            this.putQueryParameter("PrepubTime", prepubTime);
            this.prepubTime = prepubTime;
            return this;
        }

        /**
         * PrepublishCount.
         */
        public Builder prepublishCount(String prepublishCount) {
            this.putQueryParameter("PrepublishCount", prepublishCount);
            this.prepublishCount = prepublishCount;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * PublishTime.
         */
        public Builder publishTime(Long publishTime) {
            this.putQueryParameter("PublishTime", publishTime);
            this.publishTime = publishTime;
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
         * SendMessage.
         */
        public Builder sendMessage(String sendMessage) {
            this.putQueryParameter("SendMessage", sendMessage);
            this.sendMessage = sendMessage;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DelayPublishOsVersionRequest build() {
            return new DelayPublishOsVersionRequest(this);
        } 

    } 

}
