// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link BindNlbRequest} extends {@link RequestModel}
 *
 * <p>BindNlbRequest</p>
 */
public class BindNlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private String listeners;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NlbId")
    private String nlbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    private String zoneMappings;

    private BindNlbRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.appId = builder.appId;
        this.listeners = builder.listeners;
        this.nlbId = builder.nlbId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindNlbRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    /**
     * @return nlbId
     */
    public String getNlbId() {
        return this.nlbId;
    }

    /**
     * @return zoneMappings
     */
    public String getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<BindNlbRequest, Builder> {
        private String addressType; 
        private String appId; 
        private String listeners; 
        private String nlbId; 
        private String zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(BindNlbRequest request) {
            super(request);
            this.addressType = request.addressType;
            this.appId = request.appId;
            this.listeners = request.listeners;
            this.nlbId = request.nlbId;
            this.zoneMappings = request.zoneMappings;
        } 

        /**
         * <p>The type of the IP addresses. Valid values:</p>
         * <ul>
         * <li>Internet: public endpoint.</li>
         * <li>Intranet: private endpoint.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The ID of the application to which the NLB instance is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The listener that you want to manage. The value is a string that consists of JSON arrays. Each listener contains the following fields:</p>
         * <ul>
         * <li><strong>port</strong>: the port number of the NLB listener. This field is required. Data type: integer. Valid values: 0 to 65535.</li>
         * <li><strong>TargetPort</strong>: the port number of the container listener. This field is required. Data type: integer. Valid values: 0 to 65535.</li>
         * <li><strong>Protocol</strong>: the listener protocol. This field is required. Data type: string. Valid values: TCP, UDP, and TCPSSL.</li>
         * <li><strong>CertIds</strong>: the IDs of the server certificates. This field is optional. Data type: string. This field is supported only by TCPSSL listeners.</li>
         * </ul>
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        /**
         * <p>The ID of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-7z7jjbzz44d82c9***</p>
         */
        public Builder nlbId(String nlbId) {
            this.putQueryParameter("NlbId", nlbId);
            this.nlbId = nlbId;
            return this;
        }

        /**
         * <p>The mappings between zones and vSwitches. The value is a JSON string. You can specify at most 10 zones. If the region supports two or more zones, specify at least two zones. A ZoneMapping contains the following fields:</p>
         * <ul>
         * <li>The ID of the vSwitch in the zone. Each zone can contain only one vSwitch and one subnet. Data type: string.</li>
         * <li>The zone ID of the NLB instance. Data type: string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-sersdf****
         * cn-hangzhou-a</p>
         */
        public Builder zoneMappings(String zoneMappings) {
            this.putQueryParameter("ZoneMappings", zoneMappings);
            this.zoneMappings = zoneMappings;
            return this;
        }

        @Override
        public BindNlbRequest build() {
            return new BindNlbRequest(this);
        } 

    } 

}
