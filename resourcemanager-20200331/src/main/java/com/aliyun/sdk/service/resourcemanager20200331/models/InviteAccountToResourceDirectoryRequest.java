// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
        private java.util.List < Tag> tag; 
        private String targetEntity; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(InviteAccountToResourceDirectoryRequest request) {
            super(request);
            this.note = request.note;
            this.tag = request.tag;
            this.targetEntity = request.targetEntity;
            this.targetType = request.targetType;
        } 

        /**
         * The comment on the invitation.
         * <p>
         * 
         * The comment can be up to 1,024 characters in length.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * The tag key and value.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID or logon email address of the account that you want to invite.
         */
        public Builder targetEntity(String targetEntity) {
            this.putQueryParameter("TargetEntity", targetEntity);
            this.targetEntity = targetEntity;
            return this;
        }

        /**
         * The type of the account. Valid values:
         * <p>
         * 
         * *   Account: indicates the ID of the account.
         * *   Email: indicates the logon email address of the account.
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
             * A tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * A tag value.
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
