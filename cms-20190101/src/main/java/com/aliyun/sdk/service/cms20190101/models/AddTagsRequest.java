// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagsRequest} extends {@link RequestModel}
 *
 * <p>AddTagsRequest</p>
 */
public class AddTagsRequest extends Request {
    @Query
    @NameInMap("GroupIds")
    @Validation(required = true)
    private java.util.List < String > groupIds;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private java.util.List < Tag> tag;

    private AddTagsRequest(Builder builder) {
        super(builder);
        this.groupIds = builder.groupIds;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupIds
     */
    public java.util.List < String > getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<AddTagsRequest, Builder> {
        private java.util.List < String > groupIds; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(AddTagsRequest request) {
            super(request);
            this.groupIds = request.groupIds;
            this.tag = request.tag;
        } 

        /**
         * GroupIds.
         */
        public Builder groupIds(java.util.List < String > groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public AddTagsRequest build() {
            return new AddTagsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The HTTP status code.
             * <p>
             * 
             * >  The status code 200 indicates that the call was successful.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
