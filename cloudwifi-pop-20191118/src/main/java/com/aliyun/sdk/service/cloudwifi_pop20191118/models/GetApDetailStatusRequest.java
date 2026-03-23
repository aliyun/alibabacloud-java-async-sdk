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
 * {@link GetApDetailStatusRequest} extends {@link RequestModel}
 *
 * <p>GetApDetailStatusRequest</p>
 */
public class GetApDetailStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mac;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedApgroupInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean needApgroupInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedRadioStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean needRadioStatus;

    private GetApDetailStatusRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.mac = builder.mac;
        this.needApgroupInfo = builder.needApgroupInfo;
        this.needRadioStatus = builder.needRadioStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApDetailStatusRequest create() {
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
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return needApgroupInfo
     */
    public Boolean getNeedApgroupInfo() {
        return this.needApgroupInfo;
    }

    /**
     * @return needRadioStatus
     */
    public Boolean getNeedRadioStatus() {
        return this.needRadioStatus;
    }

    public static final class Builder extends Request.Builder<GetApDetailStatusRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String mac; 
        private Boolean needApgroupInfo; 
        private Boolean needRadioStatus; 

        private Builder() {
            super();
        } 

        private Builder(GetApDetailStatusRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.mac = request.mac;
            this.needApgroupInfo = request.needApgroupInfo;
            this.needRadioStatus = request.needRadioStatus;
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
        public Builder mac(String mac) {
            this.putQueryParameter("Mac", mac);
            this.mac = mac;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder needApgroupInfo(Boolean needApgroupInfo) {
            this.putQueryParameter("NeedApgroupInfo", needApgroupInfo);
            this.needApgroupInfo = needApgroupInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder needRadioStatus(Boolean needRadioStatus) {
            this.putQueryParameter("NeedRadioStatus", needRadioStatus);
            this.needRadioStatus = needRadioStatus;
            return this;
        }

        @Override
        public GetApDetailStatusRequest build() {
            return new GetApDetailStatusRequest(this);
        } 

    } 

}
