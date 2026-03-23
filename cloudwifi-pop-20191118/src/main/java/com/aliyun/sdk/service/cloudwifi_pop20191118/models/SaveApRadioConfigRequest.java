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
 * {@link SaveApRadioConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveApRadioConfigRequest</p>
 */
public class SaveApRadioConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BcastRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bcastRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeaconInt")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer beaconInt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private String disabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frag")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer frag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Htmode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String htmode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hwmode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hwmode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McastRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer mcastRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MgmtRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer mgmtRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Minrate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer minrate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Noscan")
    @com.aliyun.core.annotation.Validation(required = true)
    private String noscan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Probereq")
    @com.aliyun.core.annotation.Validation(required = true)
    private String probereq;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequireMode")
    private String requireMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rts")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Shortgi")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shortgi;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Txpower")
    @com.aliyun.core.annotation.Validation(required = true)
    private String txpower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uapsd")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer uapsd;

    private SaveApRadioConfigRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.bcastRate = builder.bcastRate;
        this.beaconInt = builder.beaconInt;
        this.channel = builder.channel;
        this.disabled = builder.disabled;
        this.frag = builder.frag;
        this.htmode = builder.htmode;
        this.hwmode = builder.hwmode;
        this.id = builder.id;
        this.mcastRate = builder.mcastRate;
        this.mgmtRate = builder.mgmtRate;
        this.minrate = builder.minrate;
        this.noscan = builder.noscan;
        this.probereq = builder.probereq;
        this.requireMode = builder.requireMode;
        this.rts = builder.rts;
        this.shortgi = builder.shortgi;
        this.txpower = builder.txpower;
        this.uapsd = builder.uapsd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveApRadioConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return bcastRate
     */
    public Integer getBcastRate() {
        return this.bcastRate;
    }

    /**
     * @return beaconInt
     */
    public Integer getBeaconInt() {
        return this.beaconInt;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return disabled
     */
    public String getDisabled() {
        return this.disabled;
    }

    /**
     * @return frag
     */
    public Integer getFrag() {
        return this.frag;
    }

    /**
     * @return htmode
     */
    public String getHtmode() {
        return this.htmode;
    }

    /**
     * @return hwmode
     */
    public String getHwmode() {
        return this.hwmode;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mcastRate
     */
    public Integer getMcastRate() {
        return this.mcastRate;
    }

    /**
     * @return mgmtRate
     */
    public Integer getMgmtRate() {
        return this.mgmtRate;
    }

    /**
     * @return minrate
     */
    public Integer getMinrate() {
        return this.minrate;
    }

    /**
     * @return noscan
     */
    public String getNoscan() {
        return this.noscan;
    }

    /**
     * @return probereq
     */
    public String getProbereq() {
        return this.probereq;
    }

    /**
     * @return requireMode
     */
    public String getRequireMode() {
        return this.requireMode;
    }

    /**
     * @return rts
     */
    public Integer getRts() {
        return this.rts;
    }

    /**
     * @return shortgi
     */
    public String getShortgi() {
        return this.shortgi;
    }

    /**
     * @return txpower
     */
    public String getTxpower() {
        return this.txpower;
    }

    /**
     * @return uapsd
     */
    public Integer getUapsd() {
        return this.uapsd;
    }

    public static final class Builder extends Request.Builder<SaveApRadioConfigRequest, Builder> {
        private String appCode; 
        private String appName; 
        private Integer bcastRate; 
        private Integer beaconInt; 
        private String channel; 
        private String disabled; 
        private Integer frag; 
        private String htmode; 
        private String hwmode; 
        private Long id; 
        private Integer mcastRate; 
        private Integer mgmtRate; 
        private Integer minrate; 
        private String noscan; 
        private String probereq; 
        private String requireMode; 
        private Integer rts; 
        private String shortgi; 
        private String txpower; 
        private Integer uapsd; 

        private Builder() {
            super();
        } 

        private Builder(SaveApRadioConfigRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.bcastRate = request.bcastRate;
            this.beaconInt = request.beaconInt;
            this.channel = request.channel;
            this.disabled = request.disabled;
            this.frag = request.frag;
            this.htmode = request.htmode;
            this.hwmode = request.hwmode;
            this.id = request.id;
            this.mcastRate = request.mcastRate;
            this.mgmtRate = request.mgmtRate;
            this.minrate = request.minrate;
            this.noscan = request.noscan;
            this.probereq = request.probereq;
            this.requireMode = request.requireMode;
            this.rts = request.rts;
            this.shortgi = request.shortgi;
            this.txpower = request.txpower;
            this.uapsd = request.uapsd;
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
         * <p>This parameter is required.</p>
         */
        public Builder bcastRate(Integer bcastRate) {
            this.putQueryParameter("BcastRate", bcastRate);
            this.bcastRate = bcastRate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder beaconInt(Integer beaconInt) {
            this.putQueryParameter("BeaconInt", beaconInt);
            this.beaconInt = beaconInt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
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
        public Builder frag(Integer frag) {
            this.putQueryParameter("Frag", frag);
            this.frag = frag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder htmode(String htmode) {
            this.putQueryParameter("Htmode", htmode);
            this.htmode = htmode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hwmode(String hwmode) {
            this.putQueryParameter("Hwmode", hwmode);
            this.hwmode = hwmode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mcastRate(Integer mcastRate) {
            this.putQueryParameter("McastRate", mcastRate);
            this.mcastRate = mcastRate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mgmtRate(Integer mgmtRate) {
            this.putQueryParameter("MgmtRate", mgmtRate);
            this.mgmtRate = mgmtRate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder minrate(Integer minrate) {
            this.putQueryParameter("Minrate", minrate);
            this.minrate = minrate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder noscan(String noscan) {
            this.putQueryParameter("Noscan", noscan);
            this.noscan = noscan;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder probereq(String probereq) {
            this.putQueryParameter("Probereq", probereq);
            this.probereq = probereq;
            return this;
        }

        /**
         * RequireMode.
         */
        public Builder requireMode(String requireMode) {
            this.putQueryParameter("RequireMode", requireMode);
            this.requireMode = requireMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder rts(Integer rts) {
            this.putQueryParameter("Rts", rts);
            this.rts = rts;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder shortgi(String shortgi) {
            this.putQueryParameter("Shortgi", shortgi);
            this.shortgi = shortgi;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder txpower(String txpower) {
            this.putQueryParameter("Txpower", txpower);
            this.txpower = txpower;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uapsd(Integer uapsd) {
            this.putQueryParameter("Uapsd", uapsd);
            this.uapsd = uapsd;
            return this;
        }

        @Override
        public SaveApRadioConfigRequest build() {
            return new SaveApRadioConfigRequest(this);
        } 

    } 

}
