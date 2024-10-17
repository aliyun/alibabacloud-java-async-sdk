// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRetcodeShareUrlRequest} extends {@link RequestModel}
 *
 * <p>GetRetcodeShareUrlRequest</p>
 */
public class GetRetcodeShareUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    private GetRetcodeShareUrlRequest(Builder builder) {
        super(builder);
        this.pid = builder.pid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRetcodeShareUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    public static final class Builder extends Request.Builder<GetRetcodeShareUrlRequest, Builder> {
        private String pid; 

        private Builder() {
            super();
        } 

        private Builder(GetRetcodeShareUrlRequest request) {
            super(request);
            this.pid = request.pid;
        } 

        /**
         * <p>The process identifier (PID) of the application. </p>
         * <p>Log on to the <strong>ARMS console</strong>. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the Browser Monitoring page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the <code>pid=xxx</code> format. The PID is usually percent encoded as <code>xxx%40xxx</code>. You must modify this value to remove the percent encoding. For example, if the PID in the URL is <code>eb4zdose6v%409781be0f44d****</code>, you must replace <code>%40</code> with @ to obtain <code>eb4zdose6v@9781be0f44d****</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iioe7jcnuk@582846f37******</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        @Override
        public GetRetcodeShareUrlRequest build() {
            return new GetRetcodeShareUrlRequest(this);
        } 

    } 

}
