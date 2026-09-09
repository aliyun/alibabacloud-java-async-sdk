// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListHivesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHivesResponseBody</p>
 */
public class ListHivesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Hives")
    private java.util.List<Hives> hives;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListHivesResponseBody(Builder builder) {
        this.hives = builder.hives;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHivesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hives
     */
    public java.util.List<Hives> getHives() {
        return this.hives;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Hives> hives; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListHivesResponseBody model) {
            this.hives = model.hives;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of clusters.</p>
         */
        public Builder hives(java.util.List<Hives> hives) {
            this.hives = hives;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxx-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHivesResponseBody build() {
            return new ListHivesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHivesResponseBody} extends {@link TeaModel}
     *
     * <p>ListHivesResponseBody</p>
     */
    public static class Hives extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HiveId")
        private String hiveId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Hives(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.hiveId = builder.hiveId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hives create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hiveId
         */
        public String getHiveId() {
            return this.hiveId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String hiveId; 
            private String name; 

            private Builder() {
            } 

            private Builder(Hives model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.hiveId = model.hiveId;
                this.name = model.name;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-14T15:20:37+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Basic S1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>hive-3b506f0868a7451ba15e0e890706033a</p>
             */
            public Builder hiveId(String hiveId) {
                this.hiveId = hiveId;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>yy-test2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Hives build() {
                return new Hives(this);
            } 

        } 

    }
}
