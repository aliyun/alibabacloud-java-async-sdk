// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link AddWebhookRequest} extends {@link RequestModel}
 *
 * <p>AddWebhookRequest</p>
 */
public class AddWebhookRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableSslVerification")
    private Boolean enableSslVerification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mergeRequestsEvents")
    private Boolean mergeRequestsEvents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("noteEvents")
    private Boolean noteEvents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pushEvents")
    private Boolean pushEvents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("secretToken")
    private String secretToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tagPushEvents")
    private Boolean tagPushEvents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private AddWebhookRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.description = builder.description;
        this.enableSslVerification = builder.enableSslVerification;
        this.mergeRequestsEvents = builder.mergeRequestsEvents;
        this.noteEvents = builder.noteEvents;
        this.pushEvents = builder.pushEvents;
        this.secretToken = builder.secretToken;
        this.tagPushEvents = builder.tagPushEvents;
        this.url = builder.url;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWebhookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableSslVerification
     */
    public Boolean getEnableSslVerification() {
        return this.enableSslVerification;
    }

    /**
     * @return mergeRequestsEvents
     */
    public Boolean getMergeRequestsEvents() {
        return this.mergeRequestsEvents;
    }

    /**
     * @return noteEvents
     */
    public Boolean getNoteEvents() {
        return this.noteEvents;
    }

    /**
     * @return pushEvents
     */
    public Boolean getPushEvents() {
        return this.pushEvents;
    }

    /**
     * @return secretToken
     */
    public String getSecretToken() {
        return this.secretToken;
    }

    /**
     * @return tagPushEvents
     */
    public Boolean getTagPushEvents() {
        return this.tagPushEvents;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<AddWebhookRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String description; 
        private Boolean enableSslVerification; 
        private Boolean mergeRequestsEvents; 
        private Boolean noteEvents; 
        private Boolean pushEvents; 
        private String secretToken; 
        private Boolean tagPushEvents; 
        private String url; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(AddWebhookRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.description = request.description;
            this.enableSslVerification = request.enableSslVerification;
            this.mergeRequestsEvents = request.mergeRequestsEvents;
            this.noteEvents = request.noteEvents;
            this.pushEvents = request.pushEvents;
            this.secretToken = request.secretToken;
            this.tagPushEvents = request.tagPushEvents;
            this.url = request.url;
            this.organizationId = request.organizationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2835387</p>
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * enableSslVerification.
         */
        public Builder enableSslVerification(Boolean enableSslVerification) {
            this.putBodyParameter("enableSslVerification", enableSslVerification);
            this.enableSslVerification = enableSslVerification;
            return this;
        }

        /**
         * mergeRequestsEvents.
         */
        public Builder mergeRequestsEvents(Boolean mergeRequestsEvents) {
            this.putBodyParameter("mergeRequestsEvents", mergeRequestsEvents);
            this.mergeRequestsEvents = mergeRequestsEvents;
            return this;
        }

        /**
         * noteEvents.
         */
        public Builder noteEvents(Boolean noteEvents) {
            this.putBodyParameter("noteEvents", noteEvents);
            this.noteEvents = noteEvents;
            return this;
        }

        /**
         * pushEvents.
         */
        public Builder pushEvents(Boolean pushEvents) {
            this.putBodyParameter("pushEvents", pushEvents);
            this.pushEvents = pushEvents;
            return this;
        }

        /**
         * secretToken.
         */
        public Builder secretToken(String secretToken) {
            this.putBodyParameter("secretToken", secretToken);
            this.secretToken = secretToken;
            return this;
        }

        /**
         * tagPushEvents.
         */
        public Builder tagPushEvents(Boolean tagPushEvents) {
            this.putBodyParameter("tagPushEvents", tagPushEvents);
            this.tagPushEvents = tagPushEvents;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("url", url);
            this.url = url;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public AddWebhookRequest build() {
            return new AddWebhookRequest(this);
        } 

    } 

}
