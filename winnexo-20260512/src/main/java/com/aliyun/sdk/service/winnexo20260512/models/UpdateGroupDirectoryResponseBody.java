// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link UpdateGroupDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGroupDirectoryResponseBody</p>
 */
public class UpdateGroupDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("directoryType")
    private String directoryType;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("kbRootDirectoryId")
    private String kbRootDirectoryId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpdateGroupDirectoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.directoryType = builder.directoryType;
        this.groupId = builder.groupId;
        this.kbRootDirectoryId = builder.kbRootDirectoryId;
        this.message = builder.message;
        this.name = builder.name;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupDirectoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return directoryType
     */
    public String getDirectoryType() {
        return this.directoryType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return kbRootDirectoryId
     */
    public String getKbRootDirectoryId() {
        return this.kbRootDirectoryId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String description; 
        private String directoryId; 
        private String directoryType; 
        private String groupId; 
        private String kbRootDirectoryId; 
        private String message; 
        private String name; 
        private String parentDirectoryId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateGroupDirectoryResponseBody model) {
            this.code = model.code;
            this.description = model.description;
            this.directoryId = model.directoryId;
            this.directoryType = model.directoryType;
            this.groupId = model.groupId;
            this.kbRootDirectoryId = model.kbRootDirectoryId;
            this.message = model.message;
            this.name = model.name;
            this.parentDirectoryId = model.parentDirectoryId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The folder description.</p>
         * 
         * <strong>example:</strong>
         * <p>Project description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_example</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The folder type. The value is fixed as GROUP.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP</p>
         */
        public Builder directoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }

        /**
         * <p>The ID of the collaborative share.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the internal root folder in the collaborative share. This folder cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_root</p>
         */
        public Builder kbRootDirectoryId(String kbRootDirectoryId) {
            this.kbRootDirectoryId = kbRootDirectoryId;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The folder name.</p>
         * 
         * <strong>example:</strong>
         * <p>Project Materials</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The parent folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_parent</p>
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateGroupDirectoryResponseBody build() {
            return new UpdateGroupDirectoryResponseBody(this);
        } 

    } 

}
