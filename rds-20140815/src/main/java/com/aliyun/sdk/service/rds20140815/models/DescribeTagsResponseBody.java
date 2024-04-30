// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsResponseBody</p>
 */
public class DescribeTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTagsResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        /**
         * The tags that are added to the instance.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTagsResponseBody build() {
            return new DescribeTagsResponseBody(this);
        } 

    } 

    public static class DBInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
        private java.util.List < String > DBInstanceIds;

        private DBInstanceIds(Builder builder) {
            this.DBInstanceIds = builder.DBInstanceIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return DBInstanceIds
         */
        public java.util.List < String > getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        public static final class Builder {
            private java.util.List < String > DBInstanceIds; 

            /**
             * DBInstanceIds.
             */
            public Builder DBInstanceIds(java.util.List < String > DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            public DBInstanceIds build() {
                return new DBInstanceIds(this);
            } 

        } 

    }
    public static class TagInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
        private DBInstanceIds DBInstanceIds;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagInfos(Builder builder) {
            this.DBInstanceIds = builder.DBInstanceIds;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfos create() {
            return builder().build();
        }

        /**
         * @return DBInstanceIds
         */
        public DBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private DBInstanceIds DBInstanceIds; 
            private String tagKey; 
            private String tagValue; 

            /**
             * The IDs of the instances to which the tag is added.
             */
            public Builder DBInstanceIds(DBInstanceIds DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagInfos build() {
                return new TagInfos(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfos")
        private java.util.List < TagInfos> tagInfos;

        private Items(Builder builder) {
            this.tagInfos = builder.tagInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return tagInfos
         */
        public java.util.List < TagInfos> getTagInfos() {
            return this.tagInfos;
        }

        public static final class Builder {
            private java.util.List < TagInfos> tagInfos; 

            /**
             * TagInfos.
             */
            public Builder tagInfos(java.util.List < TagInfos> tagInfos) {
                this.tagInfos = tagInfos;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
