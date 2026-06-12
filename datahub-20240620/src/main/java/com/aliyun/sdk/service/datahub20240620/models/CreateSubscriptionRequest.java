// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link CreateSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>CreateSubscriptionRequest</p>
 */
public class CreateSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Application")
    @com.aliyun.core.annotation.Validation(required = true)
    private String application;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionId")
    private String subscriptionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private CreateSubscriptionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.application = builder.application;
        this.comment = builder.comment;
        this.projectName = builder.projectName;
        this.subscriptionId = builder.subscriptionId;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscriptionRequest create() {
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
     * @return application
     */
    public String getApplication() {
        return this.application;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<CreateSubscriptionRequest, Builder> {
        private String regionId; 
        private String application; 
        private String comment; 
        private String projectName; 
        private String subscriptionId; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubscriptionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.application = request.application;
            this.comment = request.comment;
            this.projectName = request.projectName;
            this.subscriptionId = request.subscriptionId;
            this.topicName = request.topicName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_application</p>
         */
        public Builder application(String application) {
            this.putQueryParameter("Application", application);
            this.application = application;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_abc</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gmall_ods_gtk</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * SubscriptionId.
         */
        public Builder subscriptionId(String subscriptionId) {
            this.putQueryParameter("SubscriptionId", subscriptionId);
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataplatform_sync_staging</p>
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public CreateSubscriptionRequest build() {
            return new CreateSubscriptionRequest(this);
        } 

    } 

}
