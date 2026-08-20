// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateProhibitedTagResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProhibitedTagResponseBody</p>
 */
public class CreateProhibitedTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private Tag tag;

    private CreateProhibitedTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProhibitedTagResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tag
     */
    public Tag getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String requestId; 
        private Tag tag; 

        private Builder() {
        } 

        private Builder(CreateProhibitedTagResponseBody model) {
            this.requestId = model.requestId;
            this.tag = model.tag;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C7F30ABA-67BD-537D-A516-8DA20DA1F28C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(Tag tag) {
            this.tag = tag;
            return this;
        }

        public CreateProhibitedTagResponseBody build() {
            return new CreateProhibitedTagResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProhibitedTagResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProhibitedTagResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        private Tag(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.tagId = builder.tagId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
        public String getTagId() {
            return this.tagId;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String tagId; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.tagId = model.tagId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
