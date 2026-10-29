// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeSiteMonitorLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorLogResponseBody</p>
 */
public class DescribeSiteMonitorLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSiteMonitorLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSiteMonitorLogResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>A status code of 200 indicates that the operation was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detection logs of the one-time detection task.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;redirectCount\&quot;:0.0,\&quot;SSLConnectTime\&quot;:0.0,\&quot;pingDetail\&quot;:\&quot;\&quot;,\&quot;HTTPConnectTime\&quot;:0.0,\&quot;isp\&quot;:\&quot;465\&quot;,\&quot;errorCode\&quot;:611,\&quot;ispCN\&quot;:\&quot;阿里巴巴\&quot;,\&quot;resolution\&quot;:\&quot;\&quot;,\&quot;areaEN\&quot;:\&quot;HuaBei\&quot;,\&quot;taskEndTimestamp\&quot;:1638422475687,\&quot;targetIspEN\&quot;:\&quot;\&quot;,\&quot;TotalTime\&quot;:1.0,\&quot;taskStartTimestamp\&quot;:1638422474389,\&quot;countryCN\&quot;:\&quot;中国\&quot;,\&quot;provinceEN\&quot;:\&quot;Beijing\&quot;,\&quot;countryEN\&quot;:\&quot;China\&quot;,\&quot;targetCityEN\&quot;:\&quot;\&quot;,\&quot;curlConnectTime\&quot;:0.0,\&quot;ips\&quot;:\&quot;\&quot;,\&quot;route\&quot;:\&quot;\&quot;,\&quot;tcpConnectTime\&quot;:0.0,\&quot;cityEN\&quot;:\&quot;Beijing\&quot;,\&quot;HTTPDownloadSpeed\&quot;:0.0,\&quot;HTTPDownloadTime\&quot;:0.0,\&quot;HTTPResponseCode\&quot;:0.0,\&quot;areaCN\&quot;:\&quot;华北\&quot;,\&quot;city\&quot;:\&quot;546\&quot;,\&quot;expection\&quot;:\&quot;\&quot;,\&quot;suorceIp\&quot;:\&quot;192.168.XX.XX \&quot;,\&quot;ispEN\&quot;:\&quot;Alibaba\&quot;,\&quot;HTTPDNSTime\&quot;:1.0,\&quot;targetIsp\&quot;:\&quot;\&quot;,\&quot;curlStarttransferTime\&quot;:0.0,\&quot;provinceCN\&quot;:\&quot;北京市\&quot;,\&quot;timestamp\&quot;:1638422474000,\&quot;redirectTime\&quot;:0.0,\&quot;targetCity\&quot;:\&quot;\&quot;, \&quot;expect\&quot;:\&quot;\&quot;,\&quot;HTTPDownloadSize\&quot;:0.0,\&quot;localDns\&quot;:\&quot;192.168.XX.XX\&quot;,\&quot;cityCN\&quot;:\&quot;北京市\&quot;,\&quot;taskId\&quot;:\&quot;afa5c3ce-f944-4363-9edb-ce919a29****\&quot;}]</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token that is used to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67F646FA-ED8A-58C2-B461-451DB52C8B14</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSiteMonitorLogResponseBody build() {
            return new DescribeSiteMonitorLogResponseBody(this);
        } 

    } 

}
