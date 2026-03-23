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
 * {@link DeleteApSsidConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteApSsidConfigRequest</p>
 */
public class DeleteApSsidConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApMac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apMac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RadioIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private String radioIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ssid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ssid;

    private DeleteApSsidConfigRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.radioIndex = builder.radioIndex;
        this.ssid = builder.ssid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApSsidConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apMac
     */
    public String getApMac() {
        return this.apMac;
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
     * @return radioIndex
     */
    public String getRadioIndex() {
        return this.radioIndex;
    }

    /**
     * @return ssid
     */
    public String getSsid() {
        return this.ssid;
    }

    public static final class Builder extends Request.Builder<DeleteApSsidConfigRequest, Builder> {
        private String apMac; 
        private String appCode; 
        private String appName; 
        private String radioIndex; 
        private String ssid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApSsidConfigRequest request) {
            super(request);
            this.apMac = request.apMac;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.radioIndex = request.radioIndex;
            this.ssid = request.ssid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apMac(String apMac) {
            this.putQueryParameter("ApMac", apMac);
            this.apMac = apMac;
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
         * <p>This parameter is required.</p>
         */
        public Builder radioIndex(String radioIndex) {
            this.putQueryParameter("RadioIndex", radioIndex);
            this.radioIndex = radioIndex;
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

        @Override
        public DeleteApSsidConfigRequest build() {
            return new DeleteApSsidConfigRequest(this);
        } 

    } 

}
