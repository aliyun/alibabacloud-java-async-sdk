// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>The name of the application that is monitored by Browser Monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The process identifier (PID) of the application. </p>
         * <p>Log on to the <strong>ARMS console</strong>. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the <code>pid=xxx</code> format. The PID is usually percent encoded as <code>xxx%40xxx</code>. You must modify this value to remove the percent encoding. For example, if the PID in the URL is <code>eb4zdose6v%409781be0f44d****</code>, you must replace <code>%40</code> with @ to obtain <code>eb4zdose6v@9781be0f44d****</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>atc889zkcf@d8deedfa9bf****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>Specifies whether to turn on or turn off the logon-free sharing switch. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Turn on the switch.</li>
         * <li><code>false</code>: Turn off the switch.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
