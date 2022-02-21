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
        private String targetEntity; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(InviteAccountToResourceDirectoryRequest response) {
            super(response);
            this.note = response.note;
            this.targetEntity = response.targetEntity;
            this.targetType = response.targetType;
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

}
