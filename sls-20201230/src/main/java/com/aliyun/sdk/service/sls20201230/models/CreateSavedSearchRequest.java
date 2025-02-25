// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link CreateSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>CreateSavedSearchRequest</p>
 */
public class CreateSavedSearchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("savedsearchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String savedsearchName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("searchQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private String searchQuery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topic")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The display name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>displayname</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The name of the Logstore to which the saved search belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putBodyParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The name of the saved search. The name must be 3 to 63 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pv in minutes</p>
         */
        public Builder savedsearchName(String savedsearchName) {
            this.putBodyParameter("savedsearchName", savedsearchName);
            this.savedsearchName = savedsearchName;
            return this;
        }

        /**
         * <p>The query statement of the saved search. A query statement consists of a search statement and an analytic statement in the <code>Search statement|Analytic statement</code> format. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><em>|select date_format(<strong>time</strong>-<strong>time</strong>%60, &quot;%H:%i:%s&quot;) as time, COUNT(</em>) as pv group by time</p>
         */
        public Builder searchQuery(String searchQuery) {
            this.putBodyParameter("searchQuery", searchQuery);
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * <p>The topic of the logs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>theme</p>
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
