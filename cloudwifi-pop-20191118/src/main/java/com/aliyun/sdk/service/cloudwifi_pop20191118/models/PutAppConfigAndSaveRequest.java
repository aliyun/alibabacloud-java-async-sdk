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
 * {@link PutAppConfigAndSaveRequest} extends {@link RequestModel}
 *
 * <p>PutAppConfigAndSaveRequest</p>
 */
public class PutAppConfigAndSaveRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ConfigureType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    private PutAppConfigAndSaveRequest(Builder builder) {
        super(builder);
        this.apMac = builder.apMac;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.configureType = builder.configureType;
        this.currentTime = builder.currentTime;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAppConfigAndSaveRequest create() {
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
     * @return configureType
     */
    public String getConfigureType() {
        return this.configureType;
    }

    /**
     * @return currentTime
     */
    public Long getCurrentTime() {
        return this.currentTime;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<PutAppConfigAndSaveRequest, Builder> {
        private String apMac; 
        private String appCode; 
        private String appName; 
        private String configureType; 
        private Long currentTime; 
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(PutAppConfigAndSaveRequest request) {
            super(request);
            this.apMac = request.apMac;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.configureType = request.configureType;
            this.currentTime = request.currentTime;
            this.data = request.data;
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
        public Builder configureType(String configureType) {
            this.putQueryParameter("ConfigureType", configureType);
            this.configureType = configureType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder currentTime(Long currentTime) {
            this.putQueryParameter("CurrentTime", currentTime);
            this.currentTime = currentTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        @Override
        public PutAppConfigAndSaveRequest build() {
            return new PutAppConfigAndSaveRequest(this);
        } 

    } 

}
