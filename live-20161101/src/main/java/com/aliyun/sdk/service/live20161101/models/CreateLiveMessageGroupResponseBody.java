// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateLiveMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLiveMessageGroupResponseBody</p>
 */
public class CreateLiveMessageGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlreadyDelete")
    private Boolean alreadyDelete;

    @com.aliyun.core.annotation.NameInMap("AlreadyExists")
    private Boolean alreadyExists;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLiveMessageGroupResponseBody(Builder builder) {
        this.alreadyDelete = builder.alreadyDelete;
        this.alreadyExists = builder.alreadyExists;
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveMessageGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alreadyDelete
     */
    public Boolean getAlreadyDelete() {
        return this.alreadyDelete;
    }

    /**
     * @return alreadyExists
     */
    public Boolean getAlreadyExists() {
        return this.alreadyExists;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean alreadyDelete; 
        private Boolean alreadyExists; 
        private String groupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateLiveMessageGroupResponseBody model) {
            this.alreadyDelete = model.alreadyDelete;
            this.alreadyExists = model.alreadyExists;
            this.groupId = model.groupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the group is deleted. If the group existed and is deleted, the group ID is unavailable. We recommend that you create a new group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alreadyDelete(Boolean alreadyDelete) {
            this.alreadyDelete = alreadyDelete;
            return this;
        }

        /**
         * <p>Indicates whether the group already exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alreadyExists(Boolean alreadyExists) {
            this.alreadyExists = alreadyExists;
            return this;
        }

        /**
         * <p>The ID of the group created.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A8C7B033-B339-1A58-B0E0-7B9197BA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLiveMessageGroupResponseBody build() {
            return new CreateLiveMessageGroupResponseBody(this);
        } 

    } 

}
