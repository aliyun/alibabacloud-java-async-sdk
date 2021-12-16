// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>CreateSavedSearchRequest</p>
 */
public class CreateSavedSearchRequest extends Request {
    @Body
    @NameInMap("displayName")
    private String displayName;

    @Body
    @NameInMap("logstore")
    private String logstore;

    @Body
    @NameInMap("savedsearchName")
    private String savedsearchName;

    @Body
    @NameInMap("searchQuery")
    private String searchQuery;

    @Body
    @NameInMap("topic")
    private String topic;


    private CreateSavedSearchRequest(Builder builder) {
        super(builder);
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

    public static final class Builder extends Request.Builder<Builder> {
        private String displayName; 
        private String logstore; 
        private String savedsearchName; 
        private String searchQuery; 
        private String topic; 

        /**
         * <p>displayName.</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>logstore.</p>
         */
        public Builder logstore(String logstore) {
            this.putBodyParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>savedsearchName.</p>
         */
        public Builder savedsearchName(String savedsearchName) {
            this.putBodyParameter("savedsearchName", savedsearchName);
            this.savedsearchName = savedsearchName;
            return this;
        }

        /**
         * <p>searchQuery.</p>
         */
        public Builder searchQuery(String searchQuery) {
            this.putBodyParameter("searchQuery", searchQuery);
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * <p>topic.</p>
         */
        public Builder topic(String topic) {
            this.putBodyParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        public CreateSavedSearchRequest build() {
            return new CreateSavedSearchRequest(this);
        } 

    } 

}
