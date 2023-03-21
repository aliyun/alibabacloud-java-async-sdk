// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>UpdateHoneypotProbeRequest</p>
 */
public class UpdateHoneypotProbeRequest extends Request {
    @Query
    @NameInMap("Arp")
    private Boolean arp;

    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Ping")
    private Boolean ping;

    @Query
    @NameInMap("ProbeId")
    @Validation(required = true)
    private String probeId;

    @Query
    @NameInMap("ServiceIpList")
    private java.util.List < String > serviceIpList;

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
    public java.util.List < String > getServiceIpList() {
        return this.serviceIpList;
    }

    public static final class Builder extends Request.Builder<UpdateHoneypotProbeRequest, Builder> {
        private Boolean arp; 
        private String displayName; 
        private String lang; 
        private Boolean ping; 
        private String probeId; 
        private java.util.List < String > serviceIpList; 

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
         * Specifies whether address resolution protocol (ARP) is enabled for the check type.
         */
        public Builder arp(Boolean arp) {
            this.putQueryParameter("Arp", arp);
            this.arp = arp;
            return this;
        }

        /**
         * The name of the probe.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether ping is enabled for the check type.
         */
        public Builder ping(Boolean ping) {
            this.putQueryParameter("Ping", ping);
            this.ping = ping;
            return this;
        }

        /**
         * The ID of the probe.
         * <p>
         * 
         * > You can call the [ListHoneypotProbe](~~ListHoneypotProbe~~) operation to query the IDs of probes.
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        /**
         * The IP addresses that are monitored.
         */
        public Builder serviceIpList(java.util.List < String > serviceIpList) {
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
