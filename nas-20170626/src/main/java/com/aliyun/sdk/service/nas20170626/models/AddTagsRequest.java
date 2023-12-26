// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private java.util.List < Tag> tag;

    private AddTagsRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
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
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<AddTagsRequest, Builder> {
        private String fileSystemId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(AddTagsRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.tag = request.tag;
        } 

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
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
        private String key;

        @NameInMap("Value")
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
             * The key of each tag. The tag includes a TagKey and TagValue. You can add a maximum of 10 tags at a time. You must specify a TagKey. You can leave a TagValue empty.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of each tag. The tag includes a TagKey and TagValue. You can add a maximum of 10 tags at a time. You must specify a TagKey. You can leave a TagValue empty.
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
