// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link RunCommandRequest} extends {@link RequestModel}
 *
 * <p>RunCommandRequest</p>
 */
public class RunCommandRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommandContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableParameter")
    private Boolean enableParameter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Frequency")
    private String frequency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIdList")
    private java.util.List<String> nodeIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RepeatMode")
    private String repeatMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkingDir")
    private String workingDir;

    private RunCommandRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.commandContent = builder.commandContent;
        this.contentEncoding = builder.contentEncoding;
        this.description = builder.description;
        this.enableParameter = builder.enableParameter;
        this.frequency = builder.frequency;
        this.name = builder.name;
        this.nodeIdList = builder.nodeIdList;
        this.parameters = builder.parameters;
        this.repeatMode = builder.repeatMode;
        this.timeout = builder.timeout;
        this.username = builder.username;
        this.workingDir = builder.workingDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableParameter
     */
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeIdList
     */
    public java.util.List<String> getNodeIdList() {
        return this.nodeIdList;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return repeatMode
     */
    public String getRepeatMode() {
        return this.repeatMode;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workingDir
     */
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static final class Builder extends Request.Builder<RunCommandRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String commandContent; 
        private String contentEncoding; 
        private String description; 
        private Boolean enableParameter; 
        private String frequency; 
        private String name; 
        private java.util.List<String> nodeIdList; 
        private java.util.Map<String, ?> parameters; 
        private String repeatMode; 
        private Integer timeout; 
        private String username; 
        private String workingDir; 

        private Builder() {
            super();
        } 

        private Builder(RunCommandRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.commandContent = request.commandContent;
            this.contentEncoding = request.contentEncoding;
            this.description = request.description;
            this.enableParameter = request.enableParameter;
            this.frequency = request.frequency;
            this.name = request.name;
            this.nodeIdList = request.nodeIdList;
            this.parameters = request.parameters;
            this.repeatMode = request.repeatMode;
            this.timeout = request.timeout;
            this.username = request.username;
            this.workingDir = request.workingDir;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyAxMjM=</p>
         */
        public Builder commandContent(String commandContent) {
            this.putBodyParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * ContentEncoding.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putBodyParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableParameter.
         */
        public Builder enableParameter(Boolean enableParameter) {
            this.putBodyParameter("EnableParameter", enableParameter);
            this.enableParameter = enableParameter;
            return this;
        }

        /**
         * Frequency.
         */
        public Builder frequency(String frequency) {
            this.putBodyParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NodeIdList.
         */
        public Builder nodeIdList(java.util.List<String> nodeIdList) {
            String nodeIdListShrink = shrink(nodeIdList, "NodeIdList", "json");
            this.putBodyParameter("NodeIdList", nodeIdListShrink);
            this.nodeIdList = nodeIdList;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * RepeatMode.
         */
        public Builder repeatMode(String repeatMode) {
            this.putBodyParameter("RepeatMode", repeatMode);
            this.repeatMode = repeatMode;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * WorkingDir.
         */
        public Builder workingDir(String workingDir) {
            this.putBodyParameter("WorkingDir", workingDir);
            this.workingDir = workingDir;
            return this;
        }

        @Override
        public RunCommandRequest build() {
            return new RunCommandRequest(this);
        } 

    } 

}
