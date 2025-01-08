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
 * {@link SavedSearch} extends {@link TeaModel}
 *
 * <p>SavedSearch</p>
 */
public class SavedSearch extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("savedsearchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String savedsearchName;

    @com.aliyun.core.annotation.NameInMap("searchQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private String searchQuery;

    @com.aliyun.core.annotation.NameInMap("topic")
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
         * <p>This parameter is required.</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder savedsearchName(String savedsearchName) {
            this.savedsearchName = savedsearchName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder searchQuery(String searchQuery) {
            this.searchQuery = searchQuery;
            return this;
        }

        /**
         * topic.
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
