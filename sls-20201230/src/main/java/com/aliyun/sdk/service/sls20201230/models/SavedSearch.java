// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link SavedSearch} extends {@link TeaModel}
 *
 * <p>SavedSearch</p>
 */
public class SavedSearch extends TeaModel {
    @NameInMap("displayName")
    @Validation(required = true)
    private String displayName;

    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @NameInMap("savedsearchName")
    @Validation(required = true)
    private String savedsearchName;

    @NameInMap("searchQuery")
    @Validation(required = true)
    private String searchQuery;

    @NameInMap("topic")
    private String topic;

    private SavedSearch(Builder builder) {
        this.displayName = builder.displayName;
        this.logstore = builder.logstore;
        this.savedsearchName = builder.savedsearchName;
        this.searchQuery = builder.searchQuery;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SavedSearch create() {
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

    public static final class Builder {
        private String displayName; 
        private String logstore; 
        private String savedsearchName; 
        private String searchQuery; 
        private String topic; 

        /**
         * displayName
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * logstore
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * savedsearchName
         */
        public Builder savedsearchName(String savedsearchName) {
            this.savedsearchName = savedsearchName;
            return this;
        }

        /**
         * searchQuery
         */
        public Builder searchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * topic
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public SavedSearch build() {
            return new SavedSearch(this);
        } 

    } 

}
