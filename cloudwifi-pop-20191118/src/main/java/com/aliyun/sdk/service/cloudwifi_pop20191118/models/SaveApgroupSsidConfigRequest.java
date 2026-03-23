// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link SaveApgroupSsidConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveApgroupSsidConfigRequest</p>
 */
public class SaveApgroupSsidConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcctPort")
    private Integer acctPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcctSecret")
    private String acctSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcctServer")
    private String acctServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApgroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apgroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCache")
    private String authCache;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthPort")
    private Integer authPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthSecret")
    private String authSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthServer")
    private String authServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Binding")
    @com.aliyun.core.annotation.Validation(required = true)
    private String binding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cir")
    private Long cir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DaeClient")
    private String daeClient;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DaePort")
    private Integer daePort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DaeSecret")
    private String daeSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disabled")
    private String disabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisassocLowAck")
    private String disassocLowAck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisassocWeakRssi")
    private Integer disassocWeakRssi;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicVlan")
    private Integer dynamicVlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Effect")
    private Boolean effect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncKey")
    private String encKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encryption")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hidden")
    private String hidden;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ieee80211w")
    private String ieee80211w;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreWeakProbe")
    private Integer ignoreWeakProbe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isolate")
    private String isolate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiteEffect")
    private Boolean liteEffect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxInactivity")
    private Integer maxInactivity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Maxassoc")
    private String maxassoc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MulticastForward")
    private Integer multicastForward;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nasid")
    private String nasid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Network")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSsid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newSsid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ownip")
    private String ownip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryAcctPort")
    private Integer secondaryAcctPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryAcctSecret")
    private String secondaryAcctSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryAcctServer")
    private String secondaryAcctServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryAuthPort")
    private Integer secondaryAuthPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryAuthSecret")
    private String secondaryAuthSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryAuthServer")
    private String secondaryAuthServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShortPreamble")
    private String shortPreamble;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ssid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ssid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsidLb")
    private Integer ssidLb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VlanDhcp")
    private Integer vlanDhcp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Wmm")
    private String wmm;

    private SaveApgroupSsidConfigRequest(Builder builder) {
        super(builder);
        this.acctPort = builder.acctPort;
        this.acctSecret = builder.acctSecret;
        this.acctServer = builder.acctServer;
        this.apgroupId = builder.apgroupId;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.authCache = builder.authCache;
        this.authPort = builder.authPort;
        this.authSecret = builder.authSecret;
        this.authServer = builder.authServer;
        this.binding = builder.binding;
        this.cir = builder.cir;
        this.daeClient = builder.daeClient;
        this.daePort = builder.daePort;
        this.daeSecret = builder.daeSecret;
        this.disabled = builder.disabled;
        this.disassocLowAck = builder.disassocLowAck;
        this.disassocWeakRssi = builder.disassocWeakRssi;
        this.dynamicVlan = builder.dynamicVlan;
        this.effect = builder.effect;
        this.encKey = builder.encKey;
        this.encryption = builder.encryption;
        this.hidden = builder.hidden;
        this.id = builder.id;
        this.ieee80211w = builder.ieee80211w;
        this.ignoreWeakProbe = builder.ignoreWeakProbe;
        this.isolate = builder.isolate;
        this.liteEffect = builder.liteEffect;
        this.maxInactivity = builder.maxInactivity;
        this.maxassoc = builder.maxassoc;
        this.multicastForward = builder.multicastForward;
        this.nasid = builder.nasid;
        this.network = builder.network;
        this.newSsid = builder.newSsid;
        this.ownip = builder.ownip;
        this.secondaryAcctPort = builder.secondaryAcctPort;
        this.secondaryAcctSecret = builder.secondaryAcctSecret;
        this.secondaryAcctServer = builder.secondaryAcctServer;
        this.secondaryAuthPort = builder.secondaryAuthPort;
        this.secondaryAuthSecret = builder.secondaryAuthSecret;
        this.secondaryAuthServer = builder.secondaryAuthServer;
        this.shortPreamble = builder.shortPreamble;
        this.ssid = builder.ssid;
        this.ssidLb = builder.ssidLb;
        this.type = builder.type;
        this.vlanDhcp = builder.vlanDhcp;
        this.wmm = builder.wmm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveApgroupSsidConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acctPort
     */
    public Integer getAcctPort() {
        return this.acctPort;
    }

    /**
     * @return acctSecret
     */
    public String getAcctSecret() {
        return this.acctSecret;
    }

    /**
     * @return acctServer
     */
    public String getAcctServer() {
        return this.acctServer;
    }

    /**
     * @return apgroupId
     */
    public String getApgroupId() {
        return this.apgroupId;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return authCache
     */
    public String getAuthCache() {
        return this.authCache;
    }

    /**
     * @return authPort
     */
    public Integer getAuthPort() {
        return this.authPort;
    }

    /**
     * @return authSecret
     */
    public String getAuthSecret() {
        return this.authSecret;
    }

    /**
     * @return authServer
     */
    public String getAuthServer() {
        return this.authServer;
    }

    /**
     * @return binding
     */
    public String getBinding() {
        return this.binding;
    }

    /**
     * @return cir
     */
    public Long getCir() {
        return this.cir;
    }

    /**
     * @return daeClient
     */
    public String getDaeClient() {
        return this.daeClient;
    }

    /**
     * @return daePort
     */
    public Integer getDaePort() {
        return this.daePort;
    }

    /**
     * @return daeSecret
     */
    public String getDaeSecret() {
        return this.daeSecret;
    }

    /**
     * @return disabled
     */
    public String getDisabled() {
        return this.disabled;
    }

    /**
     * @return disassocLowAck
     */
    public String getDisassocLowAck() {
        return this.disassocLowAck;
    }

    /**
     * @return disassocWeakRssi
     */
    public Integer getDisassocWeakRssi() {
        return this.disassocWeakRssi;
    }

    /**
     * @return dynamicVlan
     */
    public Integer getDynamicVlan() {
        return this.dynamicVlan;
    }

    /**
     * @return effect
     */
    public Boolean getEffect() {
        return this.effect;
    }

    /**
     * @return encKey
     */
    public String getEncKey() {
        return this.encKey;
    }

    /**
     * @return encryption
     */
    public String getEncryption() {
        return this.encryption;
    }

    /**
     * @return hidden
     */
    public String getHidden() {
        return this.hidden;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return ieee80211w
     */
    public String getIeee80211w() {
        return this.ieee80211w;
    }

    /**
     * @return ignoreWeakProbe
     */
    public Integer getIgnoreWeakProbe() {
        return this.ignoreWeakProbe;
    }

    /**
     * @return isolate
     */
    public String getIsolate() {
        return this.isolate;
    }

    /**
     * @return liteEffect
     */
    public Boolean getLiteEffect() {
        return this.liteEffect;
    }

    /**
     * @return maxInactivity
     */
    public Integer getMaxInactivity() {
        return this.maxInactivity;
    }

    /**
     * @return maxassoc
     */
    public String getMaxassoc() {
        return this.maxassoc;
    }

    /**
     * @return multicastForward
     */
    public Integer getMulticastForward() {
        return this.multicastForward;
    }

    /**
     * @return nasid
     */
    public String getNasid() {
        return this.nasid;
    }

    /**
     * @return network
     */
    public Integer getNetwork() {
        return this.network;
    }

    /**
     * @return newSsid
     */
    public String getNewSsid() {
        return this.newSsid;
    }

    /**
     * @return ownip
     */
    public String getOwnip() {
        return this.ownip;
    }

    /**
     * @return secondaryAcctPort
     */
    public Integer getSecondaryAcctPort() {
        return this.secondaryAcctPort;
    }

    /**
     * @return secondaryAcctSecret
     */
    public String getSecondaryAcctSecret() {
        return this.secondaryAcctSecret;
    }

    /**
     * @return secondaryAcctServer
     */
    public String getSecondaryAcctServer() {
        return this.secondaryAcctServer;
    }

    /**
     * @return secondaryAuthPort
     */
    public Integer getSecondaryAuthPort() {
        return this.secondaryAuthPort;
    }

    /**
     * @return secondaryAuthSecret
     */
    public String getSecondaryAuthSecret() {
        return this.secondaryAuthSecret;
    }

    /**
     * @return secondaryAuthServer
     */
    public String getSecondaryAuthServer() {
        return this.secondaryAuthServer;
    }

    /**
     * @return shortPreamble
     */
    public String getShortPreamble() {
        return this.shortPreamble;
    }

    /**
     * @return ssid
     */
    public String getSsid() {
        return this.ssid;
    }

    /**
     * @return ssidLb
     */
    public Integer getSsidLb() {
        return this.ssidLb;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return vlanDhcp
     */
    public Integer getVlanDhcp() {
        return this.vlanDhcp;
    }

    /**
     * @return wmm
     */
    public String getWmm() {
        return this.wmm;
    }

    public static final class Builder extends Request.Builder<SaveApgroupSsidConfigRequest, Builder> {
        private Integer acctPort; 
        private String acctSecret; 
        private String acctServer; 
        private String apgroupId; 
        private String appCode; 
        private String appName; 
        private String authCache; 
        private Integer authPort; 
        private String authSecret; 
        private String authServer; 
        private String binding; 
        private Long cir; 
        private String daeClient; 
        private Integer daePort; 
        private String daeSecret; 
        private String disabled; 
        private String disassocLowAck; 
        private Integer disassocWeakRssi; 
        private Integer dynamicVlan; 
        private Boolean effect; 
        private String encKey; 
        private String encryption; 
        private String hidden; 
        private Long id; 
        private String ieee80211w; 
        private Integer ignoreWeakProbe; 
        private String isolate; 
        private Boolean liteEffect; 
        private Integer maxInactivity; 
        private String maxassoc; 
        private Integer multicastForward; 
        private String nasid; 
        private Integer network; 
        private String newSsid; 
        private String ownip; 
        private Integer secondaryAcctPort; 
        private String secondaryAcctSecret; 
        private String secondaryAcctServer; 
        private Integer secondaryAuthPort; 
        private String secondaryAuthSecret; 
        private String secondaryAuthServer; 
        private String shortPreamble; 
        private String ssid; 
        private Integer ssidLb; 
        private Integer type; 
        private Integer vlanDhcp; 
        private String wmm; 

        private Builder() {
            super();
        } 

        private Builder(SaveApgroupSsidConfigRequest request) {
            super(request);
            this.acctPort = request.acctPort;
            this.acctSecret = request.acctSecret;
            this.acctServer = request.acctServer;
            this.apgroupId = request.apgroupId;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.authCache = request.authCache;
            this.authPort = request.authPort;
            this.authSecret = request.authSecret;
            this.authServer = request.authServer;
            this.binding = request.binding;
            this.cir = request.cir;
            this.daeClient = request.daeClient;
            this.daePort = request.daePort;
            this.daeSecret = request.daeSecret;
            this.disabled = request.disabled;
            this.disassocLowAck = request.disassocLowAck;
            this.disassocWeakRssi = request.disassocWeakRssi;
            this.dynamicVlan = request.dynamicVlan;
            this.effect = request.effect;
            this.encKey = request.encKey;
            this.encryption = request.encryption;
            this.hidden = request.hidden;
            this.id = request.id;
            this.ieee80211w = request.ieee80211w;
            this.ignoreWeakProbe = request.ignoreWeakProbe;
            this.isolate = request.isolate;
            this.liteEffect = request.liteEffect;
            this.maxInactivity = request.maxInactivity;
            this.maxassoc = request.maxassoc;
            this.multicastForward = request.multicastForward;
            this.nasid = request.nasid;
            this.network = request.network;
            this.newSsid = request.newSsid;
            this.ownip = request.ownip;
            this.secondaryAcctPort = request.secondaryAcctPort;
            this.secondaryAcctSecret = request.secondaryAcctSecret;
            this.secondaryAcctServer = request.secondaryAcctServer;
            this.secondaryAuthPort = request.secondaryAuthPort;
            this.secondaryAuthSecret = request.secondaryAuthSecret;
            this.secondaryAuthServer = request.secondaryAuthServer;
            this.shortPreamble = request.shortPreamble;
            this.ssid = request.ssid;
            this.ssidLb = request.ssidLb;
            this.type = request.type;
            this.vlanDhcp = request.vlanDhcp;
            this.wmm = request.wmm;
        } 

        /**
         * AcctPort.
         */
        public Builder acctPort(Integer acctPort) {
            this.putQueryParameter("AcctPort", acctPort);
            this.acctPort = acctPort;
            return this;
        }

        /**
         * AcctSecret.
         */
        public Builder acctSecret(String acctSecret) {
            this.putQueryParameter("AcctSecret", acctSecret);
            this.acctSecret = acctSecret;
            return this;
        }

        /**
         * AcctServer.
         */
        public Builder acctServer(String acctServer) {
            this.putQueryParameter("AcctServer", acctServer);
            this.acctServer = acctServer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apgroupId(String apgroupId) {
            this.putQueryParameter("ApgroupId", apgroupId);
            this.apgroupId = apgroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AuthCache.
         */
        public Builder authCache(String authCache) {
            this.putQueryParameter("AuthCache", authCache);
            this.authCache = authCache;
            return this;
        }

        /**
         * AuthPort.
         */
        public Builder authPort(Integer authPort) {
            this.putQueryParameter("AuthPort", authPort);
            this.authPort = authPort;
            return this;
        }

        /**
         * AuthSecret.
         */
        public Builder authSecret(String authSecret) {
            this.putQueryParameter("AuthSecret", authSecret);
            this.authSecret = authSecret;
            return this;
        }

        /**
         * AuthServer.
         */
        public Builder authServer(String authServer) {
            this.putQueryParameter("AuthServer", authServer);
            this.authServer = authServer;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder binding(String binding) {
            this.putQueryParameter("Binding", binding);
            this.binding = binding;
            return this;
        }

        /**
         * Cir.
         */
        public Builder cir(Long cir) {
            this.putQueryParameter("Cir", cir);
            this.cir = cir;
            return this;
        }

        /**
         * DaeClient.
         */
        public Builder daeClient(String daeClient) {
            this.putQueryParameter("DaeClient", daeClient);
            this.daeClient = daeClient;
            return this;
        }

        /**
         * DaePort.
         */
        public Builder daePort(Integer daePort) {
            this.putQueryParameter("DaePort", daePort);
            this.daePort = daePort;
            return this;
        }

        /**
         * DaeSecret.
         */
        public Builder daeSecret(String daeSecret) {
            this.putQueryParameter("DaeSecret", daeSecret);
            this.daeSecret = daeSecret;
            return this;
        }

        /**
         * Disabled.
         */
        public Builder disabled(String disabled) {
            this.putQueryParameter("Disabled", disabled);
            this.disabled = disabled;
            return this;
        }

        /**
         * DisassocLowAck.
         */
        public Builder disassocLowAck(String disassocLowAck) {
            this.putQueryParameter("DisassocLowAck", disassocLowAck);
            this.disassocLowAck = disassocLowAck;
            return this;
        }

        /**
         * DisassocWeakRssi.
         */
        public Builder disassocWeakRssi(Integer disassocWeakRssi) {
            this.putQueryParameter("DisassocWeakRssi", disassocWeakRssi);
            this.disassocWeakRssi = disassocWeakRssi;
            return this;
        }

        /**
         * DynamicVlan.
         */
        public Builder dynamicVlan(Integer dynamicVlan) {
            this.putQueryParameter("DynamicVlan", dynamicVlan);
            this.dynamicVlan = dynamicVlan;
            return this;
        }

        /**
         * Effect.
         */
        public Builder effect(Boolean effect) {
            this.putQueryParameter("Effect", effect);
            this.effect = effect;
            return this;
        }

        /**
         * EncKey.
         */
        public Builder encKey(String encKey) {
            this.putQueryParameter("EncKey", encKey);
            this.encKey = encKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder encryption(String encryption) {
            this.putQueryParameter("Encryption", encryption);
            this.encryption = encryption;
            return this;
        }

        /**
         * Hidden.
         */
        public Builder hidden(String hidden) {
            this.putQueryParameter("Hidden", hidden);
            this.hidden = hidden;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Ieee80211w.
         */
        public Builder ieee80211w(String ieee80211w) {
            this.putQueryParameter("Ieee80211w", ieee80211w);
            this.ieee80211w = ieee80211w;
            return this;
        }

        /**
         * IgnoreWeakProbe.
         */
        public Builder ignoreWeakProbe(Integer ignoreWeakProbe) {
            this.putQueryParameter("IgnoreWeakProbe", ignoreWeakProbe);
            this.ignoreWeakProbe = ignoreWeakProbe;
            return this;
        }

        /**
         * Isolate.
         */
        public Builder isolate(String isolate) {
            this.putQueryParameter("Isolate", isolate);
            this.isolate = isolate;
            return this;
        }

        /**
         * LiteEffect.
         */
        public Builder liteEffect(Boolean liteEffect) {
            this.putQueryParameter("LiteEffect", liteEffect);
            this.liteEffect = liteEffect;
            return this;
        }

        /**
         * MaxInactivity.
         */
        public Builder maxInactivity(Integer maxInactivity) {
            this.putQueryParameter("MaxInactivity", maxInactivity);
            this.maxInactivity = maxInactivity;
            return this;
        }

        /**
         * Maxassoc.
         */
        public Builder maxassoc(String maxassoc) {
            this.putQueryParameter("Maxassoc", maxassoc);
            this.maxassoc = maxassoc;
            return this;
        }

        /**
         * MulticastForward.
         */
        public Builder multicastForward(Integer multicastForward) {
            this.putQueryParameter("MulticastForward", multicastForward);
            this.multicastForward = multicastForward;
            return this;
        }

        /**
         * Nasid.
         */
        public Builder nasid(String nasid) {
            this.putQueryParameter("Nasid", nasid);
            this.nasid = nasid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder network(Integer network) {
            this.putQueryParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder newSsid(String newSsid) {
            this.putQueryParameter("NewSsid", newSsid);
            this.newSsid = newSsid;
            return this;
        }

        /**
         * Ownip.
         */
        public Builder ownip(String ownip) {
            this.putQueryParameter("Ownip", ownip);
            this.ownip = ownip;
            return this;
        }

        /**
         * SecondaryAcctPort.
         */
        public Builder secondaryAcctPort(Integer secondaryAcctPort) {
            this.putQueryParameter("SecondaryAcctPort", secondaryAcctPort);
            this.secondaryAcctPort = secondaryAcctPort;
            return this;
        }

        /**
         * SecondaryAcctSecret.
         */
        public Builder secondaryAcctSecret(String secondaryAcctSecret) {
            this.putQueryParameter("SecondaryAcctSecret", secondaryAcctSecret);
            this.secondaryAcctSecret = secondaryAcctSecret;
            return this;
        }

        /**
         * SecondaryAcctServer.
         */
        public Builder secondaryAcctServer(String secondaryAcctServer) {
            this.putQueryParameter("SecondaryAcctServer", secondaryAcctServer);
            this.secondaryAcctServer = secondaryAcctServer;
            return this;
        }

        /**
         * SecondaryAuthPort.
         */
        public Builder secondaryAuthPort(Integer secondaryAuthPort) {
            this.putQueryParameter("SecondaryAuthPort", secondaryAuthPort);
            this.secondaryAuthPort = secondaryAuthPort;
            return this;
        }

        /**
         * SecondaryAuthSecret.
         */
        public Builder secondaryAuthSecret(String secondaryAuthSecret) {
            this.putQueryParameter("SecondaryAuthSecret", secondaryAuthSecret);
            this.secondaryAuthSecret = secondaryAuthSecret;
            return this;
        }

        /**
         * SecondaryAuthServer.
         */
        public Builder secondaryAuthServer(String secondaryAuthServer) {
            this.putQueryParameter("SecondaryAuthServer", secondaryAuthServer);
            this.secondaryAuthServer = secondaryAuthServer;
            return this;
        }

        /**
         * ShortPreamble.
         */
        public Builder shortPreamble(String shortPreamble) {
            this.putQueryParameter("ShortPreamble", shortPreamble);
            this.shortPreamble = shortPreamble;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ssid(String ssid) {
            this.putQueryParameter("Ssid", ssid);
            this.ssid = ssid;
            return this;
        }

        /**
         * SsidLb.
         */
        public Builder ssidLb(Integer ssidLb) {
            this.putQueryParameter("SsidLb", ssidLb);
            this.ssidLb = ssidLb;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VlanDhcp.
         */
        public Builder vlanDhcp(Integer vlanDhcp) {
            this.putQueryParameter("VlanDhcp", vlanDhcp);
            this.vlanDhcp = vlanDhcp;
            return this;
        }

        /**
         * Wmm.
         */
        public Builder wmm(String wmm) {
            this.putQueryParameter("Wmm", wmm);
            this.wmm = wmm;
            return this;
        }

        @Override
        public SaveApgroupSsidConfigRequest build() {
            return new SaveApgroupSsidConfigRequest(this);
        } 

    } 

}
