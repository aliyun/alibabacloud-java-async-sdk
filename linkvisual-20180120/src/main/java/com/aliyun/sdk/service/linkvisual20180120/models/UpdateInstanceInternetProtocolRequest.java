// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link UpdateInstanceInternetProtocolRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceInternetProtocolRequest</p>
 */
public class UpdateInstanceInternetProtocolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipVersion;

    private UpdateInstanceInternetProtocolRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.ipVersion = builder.ipVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceInternetProtocolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceInternetProtocolRequest, Builder> {
        private String iotInstanceId; 
        private String ipVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceInternetProtocolRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.ipVersion = request.ipVersion;
        } 

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>If an ID value is available, you must specify it. Otherwise, the call fails.</li>
         * <li>If the &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance overview</strong> page or </ph>ID value is not available, you do not need to specify it.</li>
         * </ul>
         * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-n6w1y59****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The IP protocol version. Valid values:</p>
         * <ul>
         * <li>IPv4 (default)</li>
         * <li>IPv6</li>
         * </ul>
         * <blockquote>
         * <p>If the IP protocol version is set to IPv6, streaming media-related addresses are changed to IPv4/IPv6 dual-stack addresses. Make sure that your devices and applications are configured for IPv6. Otherwise, exceptions such as playback screen loading failures may occur.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        @Override
        public UpdateInstanceInternetProtocolRequest build() {
            return new UpdateInstanceInternetProtocolRequest(this);
        } 

    } 

}
