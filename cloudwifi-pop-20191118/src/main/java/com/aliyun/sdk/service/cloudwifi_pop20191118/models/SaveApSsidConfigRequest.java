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
 * {@link SaveApSsidConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveApSsidConfigRequest</p>
 */
public class SaveApSsidConfigRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("AcctStatusServerWork")
    private Integer acctStatusServerWork;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApAssetId")
    private Long apAssetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArpProxyEnable")
    private Integer arpProxyEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCache")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("AuthStatusServerWork")
    private Integer authStatusServerWork;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cir")
    private Long cir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CirStep")
    private Long cirStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CirType")
    private Integer cirType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CirUl")
    private Long cirUl;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String disabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisassocLowAck")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disassocLowAck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisassocWeakRssi")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer disassocWeakRssi;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicVlan")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dynamicVlan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncKey")
    private String encKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encryption")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FourthAuthPort")
    private Integer fourthAuthPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FourthAuthSecret")
    private String fourthAuthSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FourthAuthServer")
    private String fourthAuthServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FtOverDs")
    private Integer ftOverDs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hidden")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hidden;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ieee80211r")
    private Integer ieee80211r;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ieee80211w")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ieee80211w;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreWeakProbe")
    private Integer ignoreWeakProbe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isolate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiteEffect")
    private Boolean liteEffect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxInactivity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxInactivity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Maxassoc")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxassoc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobilityDomain")
    private String mobilityDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MulticastForward")
    private Integer multicastForward;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nasid")
    private String nasid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NdProxyWork")
    private Integer ndProxyWork;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Network")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ownip")
    private String ownip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RadioIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private String radioIndex;

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
    @com.aliyun.core.annotation.NameInMap("SendConfigToAp")
    private Boolean sendConfigToAp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShortPreamble")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shortPreamble;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ssid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ssid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsidLb")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ssidLb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdAuthPort")
    private Integer thirdAuthPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdAuthSecret")
    private String thirdAuthSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdAuthServer")
    private String thirdAuthServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VlanDhcp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer vlanDhcp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Wmm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wmm;

    private SaveApSsidConfigRequest(Builder builder) {
        super(builder);
        this.acctPort = builder.acctPort;
        this.acctSecret = builder.acctSecret;
        this.acctServer = builder.acctServer;
        this.acctStatusServerWork = builder.acctStatusServerWork;
        this.apAssetId = builder.apAssetId;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.arpProxyEnable = builder.arpProxyEnable;
        this.authCache = builder.authCache;
        this.authPort = builder.authPort;
        this.authSecret = builder.authSecret;
        this.authServer = builder.authServer;
        this.authStatusServerWork = builder.authStatusServerWork;
        this.cir = builder.cir;
        this.cirStep = builder.cirStep;
        this.cirType = builder.cirType;
        this.cirUl = builder.cirUl;
        this.daeClient = builder.daeClient;
        this.daePort = builder.daePort;
        this.daeSecret = builder.daeSecret;
        this.disabled = builder.disabled;
        this.disassocLowAck = builder.disassocLowAck;
        this.disassocWeakRssi = builder.disassocWeakRssi;
        this.dynamicVlan = builder.dynamicVlan;
        this.encKey = builder.encKey;
        this.encryption = builder.encryption;
        this.fourthAuthPort = builder.fourthAuthPort;
        this.fourthAuthSecret = builder.fourthAuthSecret;
        this.fourthAuthServer = builder.fourthAuthServer;
        this.ftOverDs = builder.ftOverDs;
        this.hidden = builder.hidden;
        this.id = builder.id;
        this.ieee80211r = builder.ieee80211r;
        this.ieee80211w = builder.ieee80211w;
        this.ignoreWeakProbe = builder.ignoreWeakProbe;
        this.isolate = builder.isolate;
        this.liteEffect = builder.liteEffect;
        this.mac = builder.mac;
        this.maxInactivity = builder.maxInactivity;
        this.maxassoc = builder.maxassoc;
        this.mobilityDomain = builder.mobilityDomain;
        this.multicastForward = builder.multicastForward;
        this.nasid = builder.nasid;
        this.ndProxyWork = builder.ndProxyWork;
        this.network = builder.network;
        this.ownip = builder.ownip;
        this.radioIndex = builder.radioIndex;
        this.secondaryAcctPort = builder.secondaryAcctPort;
        this.secondaryAcctSecret = builder.secondaryAcctSecret;
        this.secondaryAcctServer = builder.secondaryAcctServer;
        this.secondaryAuthPort = builder.secondaryAuthPort;
        this.secondaryAuthSecret = builder.secondaryAuthSecret;
        this.secondaryAuthServer = builder.secondaryAuthServer;
        this.sendConfigToAp = builder.sendConfigToAp;
        this.shortPreamble = builder.shortPreamble;
        this.ssid = builder.ssid;
        this.ssidLb = builder.ssidLb;
        this.thirdAuthPort = builder.thirdAuthPort;
        this.thirdAuthSecret = builder.thirdAuthSecret;
        this.thirdAuthServer = builder.thirdAuthServer;
        this.type = builder.type;
        this.vlanDhcp = builder.vlanDhcp;
        this.wmm = builder.wmm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveApSsidConfigRequest create() {
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
     * @return acctStatusServerWork
     */
    public Integer getAcctStatusServerWork() {
        return this.acctStatusServerWork;
    }

    /**
     * @return apAssetId
     */
    public Long getApAssetId() {
        return this.apAssetId;
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
     * @return arpProxyEnable
     */
    public Integer getArpProxyEnable() {
        return this.arpProxyEnable;
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
     * @return authStatusServerWork
     */
    public Integer getAuthStatusServerWork() {
        return this.authStatusServerWork;
    }

    /**
     * @return cir
     */
    public Long getCir() {
        return this.cir;
    }

    /**
     * @return cirStep
     */
    public Long getCirStep() {
        return this.cirStep;
    }

    /**
     * @return cirType
     */
    public Integer getCirType() {
        return this.cirType;
    }

    /**
     * @return cirUl
     */
    public Long getCirUl() {
        return this.cirUl;
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
     * @return fourthAuthPort
     */
    public Integer getFourthAuthPort() {
        return this.fourthAuthPort;
    }

    /**
     * @return fourthAuthSecret
     */
    public String getFourthAuthSecret() {
        return this.fourthAuthSecret;
    }

    /**
     * @return fourthAuthServer
     */
    public String getFourthAuthServer() {
        return this.fourthAuthServer;
    }

    /**
     * @return ftOverDs
     */
    public Integer getFtOverDs() {
        return this.ftOverDs;
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
     * @return ieee80211r
     */
    public Integer getIeee80211r() {
        return this.ieee80211r;
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
     * @return mac
     */
    public String getMac() {
        return this.mac;
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
    public Integer getMaxassoc() {
        return this.maxassoc;
    }

    /**
     * @return mobilityDomain
     */
    public String getMobilityDomain() {
        return this.mobilityDomain;
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
     * @return ndProxyWork
     */
    public Integer getNdProxyWork() {
        return this.ndProxyWork;
    }

    /**
     * @return network
     */
    public Integer getNetwork() {
        return this.network;
    }

    /**
     * @return ownip
     */
    public String getOwnip() {
        return this.ownip;
    }

    /**
     * @return radioIndex
     */
    public String getRadioIndex() {
        return this.radioIndex;
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
     * @return sendConfigToAp
     */
    public Boolean getSendConfigToAp() {
        return this.sendConfigToAp;
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
     * @return thirdAuthPort
     */
    public Integer getThirdAuthPort() {
        return this.thirdAuthPort;
    }

    /**
     * @return thirdAuthSecret
     */
    public String getThirdAuthSecret() {
        return this.thirdAuthSecret;
    }

    /**
     * @return thirdAuthServer
     */
    public String getThirdAuthServer() {
        return this.thirdAuthServer;
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

    public static final class Builder extends Request.Builder<SaveApSsidConfigRequest, Builder> {
        private Integer acctPort; 
        private String acctSecret; 
        private String acctServer; 
        private Integer acctStatusServerWork; 
        private Long apAssetId; 
        private String appCode; 
        private String appName; 
        private Integer arpProxyEnable; 
        private String authCache; 
        private Integer authPort; 
        private String authSecret; 
        private String authServer; 
        private Integer authStatusServerWork; 
        private Long cir; 
        private Long cirStep; 
        private Integer cirType; 
        private Long cirUl; 
        private String daeClient; 
        private Integer daePort; 
        private String daeSecret; 
        private String disabled; 
        private String disassocLowAck; 
        private Integer disassocWeakRssi; 
        private Integer dynamicVlan; 
        private String encKey; 
        private String encryption; 
        private Integer fourthAuthPort; 
        private String fourthAuthSecret; 
        private String fourthAuthServer; 
        private Integer ftOverDs; 
        private String hidden; 
        private Long id; 
        private Integer ieee80211r; 
        private String ieee80211w; 
        private Integer ignoreWeakProbe; 
        private String isolate; 
        private Boolean liteEffect; 
        private String mac; 
        private Integer maxInactivity; 
        private Integer maxassoc; 
        private String mobilityDomain; 
        private Integer multicastForward; 
        private String nasid; 
        private Integer ndProxyWork; 
        private Integer network; 
        private String ownip; 
        private String radioIndex; 
        private Integer secondaryAcctPort; 
        private String secondaryAcctSecret; 
        private String secondaryAcctServer; 
        private Integer secondaryAuthPort; 
        private String secondaryAuthSecret; 
        private String secondaryAuthServer; 
        private Boolean sendConfigToAp; 
        private String shortPreamble; 
        private String ssid; 
        private Integer ssidLb; 
        private Integer thirdAuthPort; 
        private String thirdAuthSecret; 
        private String thirdAuthServer; 
        private Integer type; 
        private Integer vlanDhcp; 
        private String wmm; 

        private Builder() {
            super();
        } 

        private Builder(SaveApSsidConfigRequest request) {
            super(request);
            this.acctPort = request.acctPort;
            this.acctSecret = request.acctSecret;
            this.acctServer = request.acctServer;
            this.acctStatusServerWork = request.acctStatusServerWork;
            this.apAssetId = request.apAssetId;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.arpProxyEnable = request.arpProxyEnable;
            this.authCache = request.authCache;
            this.authPort = request.authPort;
            this.authSecret = request.authSecret;
            this.authServer = request.authServer;
            this.authStatusServerWork = request.authStatusServerWork;
            this.cir = request.cir;
            this.cirStep = request.cirStep;
            this.cirType = request.cirType;
            this.cirUl = request.cirUl;
            this.daeClient = request.daeClient;
            this.daePort = request.daePort;
            this.daeSecret = request.daeSecret;
            this.disabled = request.disabled;
            this.disassocLowAck = request.disassocLowAck;
            this.disassocWeakRssi = request.disassocWeakRssi;
            this.dynamicVlan = request.dynamicVlan;
            this.encKey = request.encKey;
            this.encryption = request.encryption;
            this.fourthAuthPort = request.fourthAuthPort;
            this.fourthAuthSecret = request.fourthAuthSecret;
            this.fourthAuthServer = request.fourthAuthServer;
            this.ftOverDs = request.ftOverDs;
            this.hidden = request.hidden;
            this.id = request.id;
            this.ieee80211r = request.ieee80211r;
            this.ieee80211w = request.ieee80211w;
            this.ignoreWeakProbe = request.ignoreWeakProbe;
            this.isolate = request.isolate;
            this.liteEffect = request.liteEffect;
            this.mac = request.mac;
            this.maxInactivity = request.maxInactivity;
            this.maxassoc = request.maxassoc;
            this.mobilityDomain = request.mobilityDomain;
            this.multicastForward = request.multicastForward;
            this.nasid = request.nasid;
            this.ndProxyWork = request.ndProxyWork;
            this.network = request.network;
            this.ownip = request.ownip;
            this.radioIndex = request.radioIndex;
            this.secondaryAcctPort = request.secondaryAcctPort;
            this.secondaryAcctSecret = request.secondaryAcctSecret;
            this.secondaryAcctServer = request.secondaryAcctServer;
            this.secondaryAuthPort = request.secondaryAuthPort;
            this.secondaryAuthSecret = request.secondaryAuthSecret;
            this.secondaryAuthServer = request.secondaryAuthServer;
            this.sendConfigToAp = request.sendConfigToAp;
            this.shortPreamble = request.shortPreamble;
            this.ssid = request.ssid;
            this.ssidLb = request.ssidLb;
            this.thirdAuthPort = request.thirdAuthPort;
            this.thirdAuthSecret = request.thirdAuthSecret;
            this.thirdAuthServer = request.thirdAuthServer;
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
         * AcctStatusServerWork.
         */
        public Builder acctStatusServerWork(Integer acctStatusServerWork) {
            this.putQueryParameter("AcctStatusServerWork", acctStatusServerWork);
            this.acctStatusServerWork = acctStatusServerWork;
            return this;
        }

        /**
         * ApAssetId.
         */
        public Builder apAssetId(Long apAssetId) {
            this.putQueryParameter("ApAssetId", apAssetId);
            this.apAssetId = apAssetId;
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
         * ArpProxyEnable.
         */
        public Builder arpProxyEnable(Integer arpProxyEnable) {
            this.putQueryParameter("ArpProxyEnable", arpProxyEnable);
            this.arpProxyEnable = arpProxyEnable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * AuthStatusServerWork.
         */
        public Builder authStatusServerWork(Integer authStatusServerWork) {
            this.putQueryParameter("AuthStatusServerWork", authStatusServerWork);
            this.authStatusServerWork = authStatusServerWork;
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
         * CirStep.
         */
        public Builder cirStep(Long cirStep) {
            this.putQueryParameter("CirStep", cirStep);
            this.cirStep = cirStep;
            return this;
        }

        /**
         * CirType.
         */
        public Builder cirType(Integer cirType) {
            this.putQueryParameter("CirType", cirType);
            this.cirType = cirType;
            return this;
        }

        /**
         * CirUl.
         */
        public Builder cirUl(Long cirUl) {
            this.putQueryParameter("CirUl", cirUl);
            this.cirUl = cirUl;
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
         * <p>This parameter is required.</p>
         */
        public Builder disabled(String disabled) {
            this.putQueryParameter("Disabled", disabled);
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder disassocLowAck(String disassocLowAck) {
            this.putQueryParameter("DisassocLowAck", disassocLowAck);
            this.disassocLowAck = disassocLowAck;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder disassocWeakRssi(Integer disassocWeakRssi) {
            this.putQueryParameter("DisassocWeakRssi", disassocWeakRssi);
            this.disassocWeakRssi = disassocWeakRssi;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dynamicVlan(Integer dynamicVlan) {
            this.putQueryParameter("DynamicVlan", dynamicVlan);
            this.dynamicVlan = dynamicVlan;
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
         * FourthAuthPort.
         */
        public Builder fourthAuthPort(Integer fourthAuthPort) {
            this.putQueryParameter("FourthAuthPort", fourthAuthPort);
            this.fourthAuthPort = fourthAuthPort;
            return this;
        }

        /**
         * FourthAuthSecret.
         */
        public Builder fourthAuthSecret(String fourthAuthSecret) {
            this.putQueryParameter("FourthAuthSecret", fourthAuthSecret);
            this.fourthAuthSecret = fourthAuthSecret;
            return this;
        }

        /**
         * FourthAuthServer.
         */
        public Builder fourthAuthServer(String fourthAuthServer) {
            this.putQueryParameter("FourthAuthServer", fourthAuthServer);
            this.fourthAuthServer = fourthAuthServer;
            return this;
        }

        /**
         * FtOverDs.
         */
        public Builder ftOverDs(Integer ftOverDs) {
            this.putQueryParameter("FtOverDs", ftOverDs);
            this.ftOverDs = ftOverDs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * Ieee80211r.
         */
        public Builder ieee80211r(Integer ieee80211r) {
            this.putQueryParameter("Ieee80211r", ieee80211r);
            this.ieee80211r = ieee80211r;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder maxInactivity(Integer maxInactivity) {
            this.putQueryParameter("MaxInactivity", maxInactivity);
            this.maxInactivity = maxInactivity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder maxassoc(Integer maxassoc) {
            this.putQueryParameter("Maxassoc", maxassoc);
            this.maxassoc = maxassoc;
            return this;
        }

        /**
         * MobilityDomain.
         */
        public Builder mobilityDomain(String mobilityDomain) {
            this.putQueryParameter("MobilityDomain", mobilityDomain);
            this.mobilityDomain = mobilityDomain;
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
         * NdProxyWork.
         */
        public Builder ndProxyWork(Integer ndProxyWork) {
            this.putQueryParameter("NdProxyWork", ndProxyWork);
            this.ndProxyWork = ndProxyWork;
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
         * Ownip.
         */
        public Builder ownip(String ownip) {
            this.putQueryParameter("Ownip", ownip);
            this.ownip = ownip;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder radioIndex(String radioIndex) {
            this.putQueryParameter("RadioIndex", radioIndex);
            this.radioIndex = radioIndex;
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
         * SendConfigToAp.
         */
        public Builder sendConfigToAp(Boolean sendConfigToAp) {
            this.putQueryParameter("SendConfigToAp", sendConfigToAp);
            this.sendConfigToAp = sendConfigToAp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder ssidLb(Integer ssidLb) {
            this.putQueryParameter("SsidLb", ssidLb);
            this.ssidLb = ssidLb;
            return this;
        }

        /**
         * ThirdAuthPort.
         */
        public Builder thirdAuthPort(Integer thirdAuthPort) {
            this.putQueryParameter("ThirdAuthPort", thirdAuthPort);
            this.thirdAuthPort = thirdAuthPort;
            return this;
        }

        /**
         * ThirdAuthSecret.
         */
        public Builder thirdAuthSecret(String thirdAuthSecret) {
            this.putQueryParameter("ThirdAuthSecret", thirdAuthSecret);
            this.thirdAuthSecret = thirdAuthSecret;
            return this;
        }

        /**
         * ThirdAuthServer.
         */
        public Builder thirdAuthServer(String thirdAuthServer) {
            this.putQueryParameter("ThirdAuthServer", thirdAuthServer);
            this.thirdAuthServer = thirdAuthServer;
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
         * <p>This parameter is required.</p>
         */
        public Builder vlanDhcp(Integer vlanDhcp) {
            this.putQueryParameter("VlanDhcp", vlanDhcp);
            this.vlanDhcp = vlanDhcp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder wmm(String wmm) {
            this.putQueryParameter("Wmm", wmm);
            this.wmm = wmm;
            return this;
        }

        @Override
        public SaveApSsidConfigRequest build() {
            return new SaveApSsidConfigRequest(this);
        } 

    } 

}
