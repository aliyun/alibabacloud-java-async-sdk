// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link TableConsumer} extends {@link TeaModel}
 *
 * <p>TableConsumer</p>
 */
public class TableConsumer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private Long lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("nextSnapshot")
    private Long nextSnapshot;

    private TableConsumer(Builder builder) {
        this.consumerId = builder.consumerId;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.nextSnapshot = builder.nextSnapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableConsumer create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return lastModifiedTime
     */
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return nextSnapshot
     */
    public Long getNextSnapshot() {
        return this.nextSnapshot;
    }

    public static final class Builder {
        private String consumerId; 
        private Long lastModifiedTime; 
        private Long nextSnapshot; 

        private Builder() {
        } 

        private Builder(TableConsumer model) {
            this.consumerId = model.consumerId;
            this.lastModifiedTime = model.lastModifiedTime;
            this.nextSnapshot = model.nextSnapshot;
        } 

        /**
         * <p>Consumer ID</p>
         * 
         * <strong>example:</strong>
         * <p>paimon-table1-id</p>
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>The last modified time of the consumer file in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1791792221185</p>
         */
        public Builder lastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The ID of the next snapshot to be consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder nextSnapshot(Long nextSnapshot) {
            this.nextSnapshot = nextSnapshot;
            return this;
        }

        public TableConsumer build() {
            return new TableConsumer(this);
        } 

    } 

}
