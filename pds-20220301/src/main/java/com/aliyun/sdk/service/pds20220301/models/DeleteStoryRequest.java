// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link DeleteStoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteStoryRequest</p>
 */
public class DeleteStoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("story_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyId;

    private DeleteStoryRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.storyId = builder.storyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return storyId
     */
    public String getStoryId() {
        return this.storyId;
    }

    public static final class Builder extends Request.Builder<DeleteStoryRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String storyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStoryRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.storyId = request.storyId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9132e0d8-fe92-4e56-86c3-f5f112308003</p>
         */
        public Builder storyId(String storyId) {
            this.putBodyParameter("story_id", storyId);
            this.storyId = storyId;
            return this;
        }

        @Override
        public DeleteStoryRequest build() {
            return new DeleteStoryRequest(this);
        } 

    } 

}
