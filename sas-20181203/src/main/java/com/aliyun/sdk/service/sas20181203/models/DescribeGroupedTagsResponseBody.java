// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedTagsResponseBody</p>
 */
public class DescribeGroupedTagsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("GroupedFileds")
    private java.util.List < GroupedFileds> groupedFileds;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * GroupedFileds.
         */
        public Builder groupedFileds(java.util.List < GroupedFileds> groupedFileds) {
            this.groupedFileds = groupedFileds;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("Count")
        private String count;

        @NameInMap("Name")
        private String name;

        @NameInMap("TagId")
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
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TagId.
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
