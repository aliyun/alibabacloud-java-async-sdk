// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > desktopId;

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
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
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
        private String contentEncoding; 
        private java.util.List < String > desktopId; 
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
            this.contentEncoding = request.contentEncoding;
            this.desktopId = request.desktopId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.timeout = request.timeout;
            this.type = request.type;
        } 

        /**
         * The content of the command. The command content can be plaintext or Base64-encoded.\
         * <p>
         * The Base64-encoded command content cannot exceed 16 KB in size.
         * 
         * > If the command content is Base64-encoded, you must set the ContentEncoding parameter to Base64.
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * The encoding mode of the command content. Valid values:
         * <p>
         * 
         * *   PlainText: The command content is not encoded.
         * *   Base64: The command content is Base64-encoded.
         * 
         * Default value: PlainText. If the specified value of this parameter is invalid, PlainText is used by default.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * The ID of cloud desktop N. Valid values of N: 1 to 50.\
         * <p>
         * If multiple cloud desktops are specified and the command execution succeeds on at least one of the cloud desktops, the operation is considered successful. If multiple cloud desktops are specified and the command execution fails on all the cloud desktops, verify the value of the parameter and try again.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the end user. If you specify a value, you run the command as the end user that is granted specific permissions. Note: The end user has sessions on a cloud computer. That is, when the cloud computer is started, the end user logs on to a WUYING client and connects to the cloud computer, and the cloud computer is not preempted by another end user during the connection. This parameter is not available for Linux cloud computers.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The timeout period for the command to run. Unit: seconds. Default value: 60.\
         * <p>
         * A timeout error occurs if the command cannot be run because the process slows down or because a specific module or the Cloud Assistant client does not exist. When a timeout error occurs, the command process is forcibly terminated.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The language of the O\&M command. Valid values:
         * <p>
         * 
         * *   RunBatScript
         * *   RunPowerShellScript
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
