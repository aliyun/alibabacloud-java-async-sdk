// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link QueryAskLumaLogResult} extends {@link TeaModel}
 *
 * <p>QueryAskLumaLogResult</p>
 */
public class QueryAskLumaLogResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entries")
    private java.util.List<AskLumaLogEntry> entries;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("LastKey")
    private String lastKey;

    private QueryAskLumaLogResult(Builder builder) {
        this.entries = builder.entries;
        this.hasMore = builder.hasMore;
        this.lastKey = builder.lastKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAskLumaLogResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entries
     */
    public java.util.List<AskLumaLogEntry> getEntries() {
        return this.entries;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return lastKey
     */
    public String getLastKey() {
        return this.lastKey;
    }

    public static final class Builder {
        private java.util.List<AskLumaLogEntry> entries; 
        private Boolean hasMore; 
        private String lastKey; 

        private Builder() {
        } 

        private Builder(QueryAskLumaLogResult model) {
            this.entries = model.entries;
            this.hasMore = model.hasMore;
            this.lastKey = model.lastKey;
        } 

        /**
         * Entries.
         */
        public Builder entries(java.util.List<AskLumaLogEntry> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * HasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * LastKey.
         */
        public Builder lastKey(String lastKey) {
            this.lastKey = lastKey;
            return this;
        }

        public QueryAskLumaLogResult build() {
            return new QueryAskLumaLogResult(this);
        } 

    } 

}
