// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandRole")
    private String commandRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private RunCommandRequest(Builder builder) {
        super(builder);
        this.commandContent = builder.commandContent;
        this.commandRole = builder.commandRole;
        this.contentEncoding = builder.contentEncoding;
        this.desktopId = builder.desktopId;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.timeout = builder.timeout;
        this.type = builder.type;
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
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return commandRole
     */
    public String getCommandRole() {
        return this.commandRole;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<RunCommandRequest, Builder> {
        private String commandContent; 
        private String commandRole; 
        private String contentEncoding; 
        private java.util.List<String> desktopId; 
        private String endUserId; 
        private String regionId; 
        private Long timeout; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(RunCommandRequest request) {
            super(request);
            this.commandContent = request.commandContent;
            this.commandRole = request.commandRole;
            this.contentEncoding = request.contentEncoding;
            this.desktopId = request.desktopId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.timeout = request.timeout;
            this.type = request.type;
        } 

        /**
         * <p>The plaintext or Base64-encoded content of the script.<br>The Base64-encoded script content cannot exceed 16 KB.</p>
         * <blockquote>
         * <p>If the script content is Base64-encoded, set the ContentEncoding parameter to Base64.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipconfig</p>
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * <p>The role used when the command is executed on the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder commandRole(String commandRole) {
            this.putQueryParameter("CommandRole", commandRole);
            this.commandRole = commandRole;
            return this;
        }

        /**
         * <p>The encoding method of the script content.</p>
         * <blockquote>
         * <p>If the specified value is not within the valid values, the value is treated as <code>PlainText</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Base64</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>The list of cloud computer IDs. Valid values of N: 1 to 50.<br>If multiple cloud computers are specified, the API call succeeds as long as the script is successfully executed on at least one cloud computer. If the script fails to execute on all specified cloud computers, reset this parameter.</p>
         * <p>This parameter is required.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the end user. If this parameter is specified, the command is executed with the permissions of the end user.</p>
         * <blockquote>
         * <p>The user must have a session record on the cloud computer (the user has logged on and connected to the cloud computer after it was started, and the session was not preempted by another user). This parameter is not supported for Linux cloud computers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The timeout period for executing the script. Unit: seconds. Default value: 300.<br>A timeout may occur when the script cannot run because of process issues, missing modules, or a missing Cloud Assistant client. After a timeout, the script process is forcefully terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The language type of the O&amp;M script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RunPowerShellScript</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public RunCommandRequest build() {
            return new RunCommandRequest(this);
        } 

    } 

}
