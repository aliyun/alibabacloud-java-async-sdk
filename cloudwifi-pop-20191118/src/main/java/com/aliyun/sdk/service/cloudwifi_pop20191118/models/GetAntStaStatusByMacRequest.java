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
 * {@link GetAntStaStatusByMacRequest} extends {@link RequestModel}
 *
 * <p>GetAntStaStatusByMacRequest</p>
 */
public class GetAntStaStatusByMacRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StaMac")
    @com.aliyun.core.annotation.Validation(required = true)
    private String staMac;

    private GetAntStaStatusByMacRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.staMac = builder.staMac;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAntStaStatusByMacRequest create() {
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

    public static final class Builder extends Request.Builder<GetAntStaStatusByMacRequest, Builder> {
        private String appCode; 
        private String appName; 
        private String staMac; 

        private Builder() {
            super();
        } 

        private Builder(GetAntStaStatusByMacRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.staMac = request.staMac;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4fcb82c0-ee83-11ea-88b6-02420b0f63f4</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ISV_ALIYUN_IOT</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BA:5F:40:45:63:89</p>
         */
        public Builder staMac(String staMac) {
            this.putQueryParameter("StaMac", staMac);
            this.staMac = staMac;
            return this;
        }

        @Override
        public GetAntStaStatusByMacRequest build() {
            return new GetAntStaStatusByMacRequest(this);
        } 

    } 

}
