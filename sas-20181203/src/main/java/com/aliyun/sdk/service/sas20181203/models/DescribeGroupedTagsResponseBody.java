// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedTagsResponseBody</p>
 */
public class DescribeGroupedTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("GroupedFileds")
    private java.util.List < GroupedFileds> groupedFileds;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeGroupedTagsResponseBody(Builder builder) {
        this.count = builder.count;
        this.groupedFileds = builder.groupedFileds;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return groupedFileds
     */
    public java.util.List < GroupedFileds> getGroupedFileds() {
        return this.groupedFileds;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < GroupedFileds> groupedFileds; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * This parameter is deprecated.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * An array that consists of the statistics of the asset tags.
         */
        public Builder groupedFileds(java.util.List < GroupedFileds> groupedFileds) {
            this.groupedFileds = groupedFileds;
            return this;
        }

        /**
         * The HTTP status code of the request.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGroupedTagsResponseBody build() {
            return new DescribeGroupedTagsResponseBody(this);
        } 

    } 

    public static class GroupedFileds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private Integer tagId;

        private GroupedFileds(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
            this.tagId = builder.tagId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedFileds create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tagId
         */
        public Integer getTagId() {
            return this.tagId;
        }

        public static final class Builder {
            private String count; 
            private String name; 
            private Integer tagId; 

            /**
             * The number of assets to which the tag is added.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * The name of the tag.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the tag.
             */
            public Builder tagId(Integer tagId) {
                this.tagId = tagId;
                return this;
            }

            public GroupedFileds build() {
                return new GroupedFileds(this);
            } 

        } 

    }
}
