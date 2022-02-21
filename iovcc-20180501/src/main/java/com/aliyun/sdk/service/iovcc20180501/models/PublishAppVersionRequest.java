// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishAppVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishAppVersionRequest</p>
 */
public class PublishAppVersionRequest extends Request {
    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SendMessage")
    @Validation(required = true)
    private Boolean sendMessage;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private PublishAppVersionRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.sendMessage = builder.sendMessage;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAppVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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
    public Boolean getSendMessage() {
        return this.sendMessage;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<PublishAppVersionRequest, Builder> {
        private String projectId; 
        private String regionId; 
        private Boolean sendMessage; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(PublishAppVersionRequest response) {
            super(response);
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.sendMessage = response.sendMessage;
            this.versionId = response.versionId;
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
        public Builder sendMessage(Boolean sendMessage) {
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
        public PublishAppVersionRequest build() {
            return new PublishAppVersionRequest(this);
        } 

    } 

}
