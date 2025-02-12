// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link ConfigLayer4RemarkRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RemarkRequest</p>
 */
public class ConfigLayer4RemarkRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Listeners")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listeners;

    private ConfigLayer4RemarkRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listeners = builder.listeners;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigLayer4RemarkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    public static final class Builder extends Request.Builder<ConfigLayer4RemarkRequest, Builder> {
        private String regionId; 
        private String listeners; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RemarkRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listeners = request.listeners;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The port forwarding rule that you want to manage.</p>
         * <p>This parameter is a string that consists of JSON arrays. Each element in a JSON array indicates a port forwarding rule. You can perform this operation only on one port forwarding rule at a time.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157484.html">DescribeNetworkRules</a> to query existing port forwarding rules.</p>
         * </blockquote>
         * <p>Each port forwarding rule contains the following fields:</p>
         * <ul>
         * <li><strong>InstanceId</strong>: the ID of the instance. This field is required and must be of the STRING type.</li>
         * <li><strong>Protocol</strong>: the forwarding protocol. This field is required and must be of the STRING type. Valid values: <strong>tcp</strong> and <strong>udp</strong>.</li>
         * <li><strong>FrontendPort</strong>: the forwarding port. This field is required and must be of the INTEGER type.</li>
         * <li><strong>Remark</strong>: the remarks of the port forwarding rule. This field is required and must be of the STRING type. The value can contain letters, digits, and some special characters, such as <code>, . + - * / _</code>. The value can be up to 200 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;InstanceId&quot;:&quot;ddosDip-sg-4hr2b3l****&quot;,&quot;FrontendPort&quot;:2020,&quot;Protocol&quot;:&quot;udp&quot;,&quot;Remark&quot;:&quot;test&quot;}]</p>
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        @Override
        public ConfigLayer4RemarkRequest build() {
            return new ConfigLayer4RemarkRequest(this);
        } 

    } 

}
