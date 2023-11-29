// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>CreateSavedSearchRequest</p>
 */
public class CreateSavedSearchRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("displayName")
    @Validation(required = true)
    private String displayName;

    @Body
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Body
    @NameInMap("savedsearchName")
    @Validation(required = true)
    private String savedsearchName;

    @Body
    @NameInMap("searchQuery")
    @Validation(required = true)
    private String searchQuery;

    @Body
    @NameInMap("topic")
    private String topic;

    private CreateSavedSearchRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.displayName = builder.displayName;
        this.logstore = builder.logstore;
        this.savedsearchName = builder.savedsearchName;
        this.searchQuery = builder.searchQuery;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSavedSearchRequest create() {
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
     * @return savedsearchName
     */
    public String getSavedsearchName() {
        return this.savedsearchName;
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

    public static final class Builder extends Request.Builder<CreateSavedSearchRequest, Builder> {
        private String project; 
        private String displayName; 
        private String logstore; 
        private String savedsearchName; 
        private String searchQuery; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(CreateSavedSearchRequest request) {
            super(request);
            this.project = request.project;
            this.displayName = request.displayName;
            this.logstore = request.logstore;
            this.savedsearchName = request.savedsearchName;
            this.searchQuery = request.searchQuery;
            this.topic = request.topic;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The display name.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The name of the Logstore to which the saved search belongs.
         */
        public Builder logstore(String logstore) {
            this.putBodyParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * The name of the saved search. The name must be 3 to 63 characters in length.
         */
        public Builder savedsearchName(String savedsearchName) {
            this.putBodyParameter("savedsearchName", savedsearchName);
            this.savedsearchName = savedsearchName;
            return this;
        }

        /**
         * The query statement of the saved search. A query statement consists of a search statement and an analytic statement in the `Search statement|Analytic statement` format. For more information about search statements and analytic statements, see [Log search overview](~~43772~~) and [Log analysis overview](~~53608~~).
         */
        public Builder searchQuery(String searchQuery) {
            this.putBodyParameter("searchQuery", searchQuery);
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * The topic of the log.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public CreateSavedSearchRequest build() {
            return new CreateSavedSearchRequest(this);
        } 

    } 

}
