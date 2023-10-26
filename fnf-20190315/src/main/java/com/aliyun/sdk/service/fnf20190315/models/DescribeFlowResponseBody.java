// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowResponseBody</p>
 */
public class DescribeFlowResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("Definition")
    private String definition;

    @NameInMap("Description")
    private String description;

    @NameInMap("ExecutionMode")
    private String executionMode;

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

    private DescribeFlowResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.definition = builder.definition;
        this.description = builder.description;
        this.executionMode = builder.executionMode;
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

    public static DescribeFlowResponseBody create() {
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
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
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
        private String executionMode; 
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
         * The definition of the flow. The definition must comply with the Flow Definition Language (FDL) syntax.
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
         * The execution mode or the enumeration type. Valid values: Express and Standard. The value Standard indicates an empty string.
         */
        public Builder executionMode(String executionMode) {
            this.executionMode = executionMode;
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
         * The Alibaba Cloud Resource Name (ARN) of the RAM role.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The type of the flow. Valid value: **FDL**.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeFlowResponseBody build() {
            return new DescribeFlowResponseBody(this);
        } 

    } 

}
