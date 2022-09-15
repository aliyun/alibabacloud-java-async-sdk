// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>UpdateSavedSearchRequest</p>
 */
public class UpdateSavedSearchRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @Body
    @NameInMap("savedsearchName")
    @Validation(required = true)
    private String savedsearchName;

    @Body
    @NameInMap("displayName")
    @Validation(required = true)
    private String displayName;

    @Body
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Body
    @NameInMap("searchQuery")
    @Validation(required = true)
    private String searchQuery;

    @Body
    @NameInMap("topic")
    private String topic;

    private UpdateSavedSearchRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.savedsearchName = builder.savedsearchName;
        this.displayName = builder.displayName;
        this.logstore = builder.logstore;
        this.searchQuery = builder.searchQuery;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSavedSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return savedsearchName
     */
    public String getSavedsearchName() {
        return this.savedsearchName;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return searchQuery
     */
    public String getSearchQuery() {
        return this.searchQuery;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<UpdateSavedSearchRequest, Builder> {
        private String project; 
        private String savedsearchName; 
        private String displayName; 
        private String logstore; 
        private String searchQuery; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSavedSearchRequest request) {
            super(request);
            this.project = request.project;
            this.savedsearchName = request.savedsearchName;
            this.displayName = request.displayName;
            this.logstore = request.logstore;
            this.searchQuery = request.searchQuery;
            this.topic = request.topic;
        } 

        /**
         * Project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * savedsearchName.
         */
        public Builder savedsearchName(String savedsearchName) {
            this.putPathParameter("savedsearchName", savedsearchName);
            this.putBodyParameter("savedsearchName", savedsearchName);
            this.savedsearchName = savedsearchName;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putBodyParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * searchQuery.
         */
        public Builder searchQuery(String searchQuery) {
            this.putBodyParameter("searchQuery", searchQuery);
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public UpdateSavedSearchRequest build() {
            return new UpdateSavedSearchRequest(this);
        } 

    } 

}
