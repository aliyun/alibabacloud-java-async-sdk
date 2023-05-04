// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteAccountToResourceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>InviteAccountToResourceDirectoryRequest</p>
 */
public class InviteAccountToResourceDirectoryRequest extends Request {
    @Query
    @NameInMap("Note")
    private String note;

    @Query
    @NameInMap("ParentFolderId")
    private String parentFolderId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TargetEntity")
    @Validation(required = true)
    private String targetEntity;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    private InviteAccountToResourceDirectoryRequest(Builder builder) {
        super(builder);
        this.note = builder.note;
        this.parentFolderId = builder.parentFolderId;
        this.tag = builder.tag;
        this.targetEntity = builder.targetEntity;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteAccountToResourceDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetEntity
     */
    public String getTargetEntity() {
        return this.targetEntity;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<InviteAccountToResourceDirectoryRequest, Builder> {
        private String note; 
        private String parentFolderId; 
        private java.util.List < Tag> tag; 
        private String targetEntity; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(InviteAccountToResourceDirectoryRequest request) {
            super(request);
            this.note = request.note;
            this.parentFolderId = request.parentFolderId;
            this.tag = request.tag;
            this.targetEntity = request.targetEntity;
            this.targetType = request.targetType;
        } 

        /**
         * Note.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * ParentFolderId.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
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

        /**
         * TargetEntity.
         */
        public Builder targetEntity(String targetEntity) {
            this.putQueryParameter("TargetEntity", targetEntity);
            this.targetEntity = targetEntity;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public InviteAccountToResourceDirectoryRequest build() {
            return new InviteAccountToResourceDirectoryRequest(this);
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
