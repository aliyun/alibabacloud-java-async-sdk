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
 * {@link UpdateStoryResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateStoryResponseBody</p>
 */
public class UpdateStoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("story_id")
    private String storyId;

    private UpdateStoryResponseBody(Builder builder) {
        this.driveId = builder.driveId;
        this.storyId = builder.storyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String driveId; 
        private String storyId; 

        private Builder() {
        } 

        private Builder(UpdateStoryResponseBody model) {
            this.driveId = model.driveId;
            this.storyId = model.storyId;
        } 

        /**
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * story_id.
         */
        public Builder storyId(String storyId) {
            this.storyId = storyId;
            return this;
        }

        public UpdateStoryResponseBody build() {
            return new UpdateStoryResponseBody(this);
        } 

    } 

}
