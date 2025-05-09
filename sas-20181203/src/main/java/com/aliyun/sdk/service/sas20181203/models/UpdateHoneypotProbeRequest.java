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
 * {@link UpdateHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotProbeRequest</p>
 */
public class UpdateHoneypotProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arp")
    private Boolean arp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ping")
    private Boolean ping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String probeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceIpList")
    private java.util.List<String> serviceIpList;

    private UpdateHoneypotProbeRequest(Builder builder) {
        super(builder);
        this.arp = builder.arp;
        this.displayName = builder.displayName;
        this.lang = builder.lang;
        this.ping = builder.ping;
        this.probeId = builder.probeId;
        this.serviceIpList = builder.serviceIpList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHoneypotProbeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arp
     */
    public Boolean getArp() {
        return this.arp;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ping
     */
    public Boolean getPing() {
        return this.ping;
    }

    /**
     * @return probeId
     */
    public String getProbeId() {
        return this.probeId;
    }

    /**
     * @return serviceIpList
     */
    public java.util.List<String> getServiceIpList() {
        return this.serviceIpList;
    }

    public static final class Builder extends Request.Builder<UpdateHoneypotProbeRequest, Builder> {
        private Boolean arp; 
        private String displayName; 
        private String lang; 
        private Boolean ping; 
        private String probeId; 
        private java.util.List<String> serviceIpList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHoneypotProbeRequest request) {
            super(request);
            this.arp = request.arp;
            this.displayName = request.displayName;
            this.lang = request.lang;
            this.ping = request.ping;
            this.probeId = request.probeId;
            this.serviceIpList = request.serviceIpList;
        } 

        /**
         * <p>Specifies whether address resolution protocol (ARP) is enabled for the check type.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder arp(Boolean arp) {
            this.putQueryParameter("Arp", arp);
            this.arp = arp;
            return this;
        }

        /**
         * <p>The name of the probe.</p>
         * 
         * <strong>example:</strong>
         * <p>svwsx-vpc-4430</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Specifies whether ping is enabled for the check type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ping(Boolean ping) {
            this.putQueryParameter("Ping", ping);
            this.ping = ping;
            return this;
        }

        /**
         * <p>The ID of the probe.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to query the IDs of probes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bbe7e382-956f-473e-beed-bc73a258****</p>
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        /**
         * <p>The IP addresses that are monitored.</p>
         */
        public Builder serviceIpList(java.util.List<String> serviceIpList) {
            this.putQueryParameter("ServiceIpList", serviceIpList);
            this.serviceIpList = serviceIpList;
            return this;
        }

        @Override
        public UpdateHoneypotProbeRequest build() {
            return new UpdateHoneypotProbeRequest(this);
        } 

    } 

}
