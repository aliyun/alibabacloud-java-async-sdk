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
         * <p>The project ID (PID) of the application.</p>
         * <p>To obtain the application PID, log on to the Application Real-Time Monitoring Service (ARMS) console. In the left-side navigation pane, choose <strong>Browser Monitoring</strong>&gt;<strong>Browser Monitoring</strong>. Then, click the name of the application. The URL in the address bar contains the application PID, in the xxx format. As the browser is encoded, you must modify the PID. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with an at sign (@) to obtain xxx@74xxx.</p>
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
