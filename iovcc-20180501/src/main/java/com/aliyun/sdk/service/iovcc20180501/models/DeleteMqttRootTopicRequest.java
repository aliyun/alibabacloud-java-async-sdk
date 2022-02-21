// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMqttRootTopicRequest} extends {@link RequestModel}
 *
 * <p>DeleteMqttRootTopicRequest</p>
 */
public class DeleteMqttRootTopicRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RootTopic")
    @Validation(required = true)
    private String rootTopic;

    private DeleteMqttRootTopicRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.rootTopic = builder.rootTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMqttRootTopicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
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
     * @return rootTopic
     */
    public String getRootTopic() {
        return this.rootTopic;
    }

    public static final class Builder extends Request.Builder<DeleteMqttRootTopicRequest, Builder> {
        private String appKey; 
        private String projectId; 
        private String regionId; 
        private String rootTopic; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMqttRootTopicRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.rootTopic = response.rootTopic;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RootTopic.
         */
        public Builder rootTopic(String rootTopic) {
            this.putQueryParameter("RootTopic", rootTopic);
            this.rootTopic = rootTopic;
            return this;
        }

        @Override
        public DeleteMqttRootTopicRequest build() {
            return new DeleteMqttRootTopicRequest(this);
        } 

    } 

}
