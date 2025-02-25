// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFlowResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateFlowResponseBody</p>
 */
public class UpdateFlowResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("Definition")
    private String definition;

    @NameInMap("Description")
    private String description;

    @NameInMap("ExternalStorageLocation")
    private String externalStorageLocation;

    @NameInMap("Id")
    private String id;

    @NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleArn")
    private String roleArn;

    @NameInMap("Type")
    private String type;

    private UpdateFlowResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.definition = builder.definition;
        this.description = builder.description;
        this.externalStorageLocation = builder.externalStorageLocation;
        this.id = builder.id;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.roleArn = builder.roleArn;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return externalStorageLocation
     */
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String createdTime; 
        private String definition; 
        private String description; 
        private String externalStorageLocation; 
        private String id; 
        private String lastModifiedTime; 
        private String name; 
        private String requestId; 
        private String roleArn; 
        private String type; 

        /**
         * The time when the flow was created.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The flow definition, which follows the FDL syntax standard. Considering compatibility, the system supports the two flow definition specifications.
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * The description of the flow.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The path of the external storage.
         */
        public Builder externalStorageLocation(String externalStorageLocation) {
            this.externalStorageLocation = externalStorageLocation;
            return this;
        }

        /**
         * The unique ID of the flow.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The time when the flow was last modified.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * The name of the flow.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, the flow execution engine assumes the role to call API operations of relevant services.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The type of the flow.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public UpdateFlowResponseBody build() {
            return new UpdateFlowResponseBody(this);
        } 

    } 

}
