// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListMigrationZonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMigrationZonesResponseBody</p>
 */
public class ListMigrationZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("zoneList")
    private java.util.List<ZoneList> zoneList;

    private ListMigrationZonesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.zoneList = builder.zoneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMigrationZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zoneList
     */
    public java.util.List<ZoneList> getZoneList() {
        return this.zoneList;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ZoneList> zoneList; 

        private Builder() {
        } 

        private Builder(ListMigrationZonesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.zoneList = model.zoneList;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * zoneList.
         */
        public Builder zoneList(java.util.List<ZoneList> zoneList) {
            this.zoneList = zoneList;
            return this;
        }

        public ListMigrationZonesResponseBody build() {
            return new ListMigrationZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMigrationZonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMigrationZonesResponseBody</p>
     */
    public static class ZoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private ZoneList(Builder builder) {
            this.available = builder.available;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneList create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean available; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneList model) {
                this.available = model.available;
                this.zoneId = model.zoneId;
            } 

            /**
             * available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneList build() {
                return new ZoneList(this);
            } 

        } 

    }
}
