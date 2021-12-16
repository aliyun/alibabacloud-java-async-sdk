// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SavedSearch} extends {@link TeaModel}
 *
 * <p>SavedSearch</p>
 */
public class SavedSearch extends TeaModel {
    @NameInMap("displayName")
    private String displayName;

    @NameInMap("logstore")
    private String logstore;

    @NameInMap("savedsearchName")
    private String savedsearchName;

    @NameInMap("searchQuery")
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
         * <p>displayName</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>logstore</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>savedsearchName</p>
         */
        public Builder savedsearchName(String savedsearchName) {
            this.savedsearchName = savedsearchName;
            return this;
        }

        /**
         * <p>searchQuery</p>
         */
        public Builder searchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * <p>topic</p>
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
