// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link CreateFlowResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFlowResponseBody</p>
 */
public class CreateFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("LastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateFlowResponseBody(Builder builder) {
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

    public static CreateFlowResponseBody create() {
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
         * <p>The time when the flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>Considering compatibility, the system supports two flow definition specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n - type: pass\n name: mypass</p>
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>The description of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>test flow</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The execution mode. Valid values: Express and Standard. Considering compatibility, an empty string is equivalent to the Standard execution mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder executionMode(String executionMode) {
            this.executionMode = executionMode;
            return this;
        }

        /**
         * <p>The unique ID of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>e589e092-e2c0-4dee-b306-3574ddfdddf5****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The time when the flow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01.001Z</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The name of the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID. Each time an <code>HTTP status code</code> is returned, Serverless Workflow returns a value for the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>testRequestID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, CloudFlow assumes the role to call API operations of relevant services.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram:${region}:${accountID}:${role}</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The type of the flow.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li><p>FDL</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FDL</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateFlowResponseBody build() {
            return new CreateFlowResponseBody(this);
        } 

    } 

}
