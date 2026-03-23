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
 * {@link GetStaDetailedStatusByMacRequest} extends {@link RequestModel}
 *
 * <p>GetStaDetailedStatusByMacRequest</p>
 */
public class GetStaDetailedStatusByMacRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StaMac")
    private String staMac;

    private GetStaDetailedStatusByMacRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.staMac = builder.staMac;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStaDetailedStatusByMacRequest create() {
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
     * @return staMac
     */
    public String getStaMac() {
        return this.staMac;
    }

    public static final class Builder extends Request.Builder<GetStaDetailedStatusByMacRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String staMac; 

        private Builder() {
            super();
        } 

        private Builder(GetStaDetailedStatusByMacRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.staMac = request.staMac;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * StaMac.
         */
        public Builder staMac(String staMac) {
            this.putQueryParameter("StaMac", staMac);
            this.staMac = staMac;
            return this;
        }

        @Override
        public GetStaDetailedStatusByMacRequest build() {
            return new GetStaDetailedStatusByMacRequest(this);
        } 

    } 

}
