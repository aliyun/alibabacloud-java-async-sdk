// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetWebTerminalResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebTerminalResponseBody</p>
 */
public class GetWebTerminalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebTerminalUrl")
    private String webTerminalUrl;

    private GetWebTerminalResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webTerminalUrl = builder.webTerminalUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebTerminalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webTerminalUrl
     */
    public String getWebTerminalUrl() {
        return this.webTerminalUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String webTerminalUrl; 

        private Builder() {
        } 

        private Builder(GetWebTerminalResponseBody model) {
            this.requestId = model.requestId;
            this.webTerminalUrl = model.webTerminalUrl;
        } 

        /**
         * <p>The request ID which is used for diagnostics and Q&amp;A.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The WebSocket URI for accessing the container. You must build a WebSocket client. For more information about the communication format, see the following code:</p>
         * <pre><code>ws = new WebSocket(
         *   `wss://xxxxx`,
         * );
         * ws.onopen = function open() {
         *   console.warn(\&quot;connected\&quot;);
         *   term.write(\&quot;\r\&quot;);
         * };
         * 
         * ws.onclose = function close() {
         *   console.warn(\&quot;disconnected\&quot;);
         *   term.write(\&quot;Connection closed\&quot;);
         * };
         * 
         * // Return the following information in the backend.
         * ws.onmessage = function incoming(event) {
         *   const msg = JSON.parse(event.data);
         *   console.warn(msg);
         *   if (msg.operation === \&quot;stdout\&quot;) {
         *     term.write(msg.data);
         *   } else {
         *     console.warn(\&quot;invalid msg operation: \&quot; + msg);
         *   }
         * };
         * 
         * // Enter the following code in the console.
         * term.onData(data =&gt; {
         *   const msg = { operation: \&quot;stdin\&quot;, data: data };
         *   ws.send(JSON.stringify(msg));
         * });
         * 
         * term.onResize(size =&gt; {
         *   const msg = { operation: \&quot;resize\&quot;, cols: size.cols, rows: size.rows };
         *   ws.send(JSON.stringify(msg));
         * });
         * 
         * fitAddon.fit();
         * };
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>wss://*****</p>
         */
        public Builder webTerminalUrl(String webTerminalUrl) {
            this.webTerminalUrl = webTerminalUrl;
            return this;
        }

        public GetWebTerminalResponseBody build() {
            return new GetWebTerminalResponseBody(this);
        } 

    } 

}
