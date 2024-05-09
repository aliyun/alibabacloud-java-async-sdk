// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRetcodeShareStatusRequest} extends {@link RequestModel}
 *
 * <p>SetRetcodeShareStatusRequest</p>
 */
public class SetRetcodeShareStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean status;

    private SetRetcodeShareStatusRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.pid = builder.pid;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRetcodeShareStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetRetcodeShareStatusRequest, Builder> {
        private String appName; 
        private String pid; 
        private Boolean status; 

        private Builder() {
            super();
        } 

        private Builder(SetRetcodeShareStatusRequest request) {
            super(request);
            this.appName = request.appName;
            this.pid = request.pid;
            this.status = request.status;
        } 

        /**
         * The name of the application that is monitored by Browser Monitoring.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The process identifier (PID) of the application. 
         * <p>
         * 
         * Log on to the **ARMS console**. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the `pid=xxx` format. The PID is usually percent encoded as `xxx%40xxx`. You must modify this value to remove the percent encoding. For example, if the PID in the URL is `eb4zdose6v%409781be0f44d****`, you must replace `%40` with @ to obtain `eb4zdose6v@9781be0f44d****`.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * Specifies whether to turn on or turn off the logon-free sharing switch. Valid values:
         * <p>
         * 
         * *   `true`: Turn on the switch.
         * *   `false`: Turn off the switch.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetRetcodeShareStatusRequest build() {
            return new SetRetcodeShareStatusRequest(this);
        } 

    } 

}
