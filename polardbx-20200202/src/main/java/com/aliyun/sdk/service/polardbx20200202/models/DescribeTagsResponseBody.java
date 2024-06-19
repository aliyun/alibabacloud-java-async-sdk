// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsResponseBody</p>
 */
public class DescribeTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagInfos")
    private java.util.List < TagInfos> tagInfos;

    private DescribeTagsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagInfos = builder.tagInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagInfos
     */
    public java.util.List < TagInfos> getTagInfos() {
        return this.tagInfos;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TagInfos> tagInfos; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TagInfos.
         */
        public Builder tagInfos(java.util.List < TagInfos> tagInfos) {
            this.tagInfos = tagInfos;
            return this;
        }

        public DescribeTagsResponseBody build() {
            return new DescribeTagsResponseBody(this);
        } 

    } 

    public static class TagInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
        private java.util.List < String > DBInstanceIds;

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
        public java.util.List < String > getDBInstanceIds() {
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
            private java.util.List < String > DBInstanceIds; 
            private String tagKey; 
            private String tagValue; 

            /**
             * DBInstanceIds.
             */
            public Builder DBInstanceIds(java.util.List < String > DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
}
