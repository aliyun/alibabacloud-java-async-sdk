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
 * {@link GetApgroupConfigByIdentityRequest} extends {@link RequestModel}
 *
 * <p>GetApgroupConfigByIdentityRequest</p>
 */
public class GetApgroupConfigByIdentityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApgroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apgroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApgroupUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apgroupUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    private GetApgroupConfigByIdentityRequest(Builder builder) {
        super(builder);
        this.apgroupId = builder.apgroupId;
        this.apgroupUuid = builder.apgroupUuid;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApgroupConfigByIdentityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apgroupId
     */
    public Long getApgroupId() {
        return this.apgroupId;
    }

    /**
     * @return apgroupUuid
     */
    public String getApgroupUuid() {
        return this.apgroupUuid;
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

    public static final class Builder extends Request.Builder<GetApgroupConfigByIdentityRequest, Builder> {
        private Long apgroupId; 
        private String apgroupUuid; 
        private String appCode; 
        private String appName; 

        private Builder() {
            super();
        } 

        private Builder(GetApgroupConfigByIdentityRequest request) {
            super(request);
            this.apgroupId = request.apgroupId;
            this.apgroupUuid = request.apgroupUuid;
            this.appCode = request.appCode;
            this.appName = request.appName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apgroupId(Long apgroupId) {
            this.putQueryParameter("ApgroupId", apgroupId);
            this.apgroupId = apgroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apgroupUuid(String apgroupUuid) {
            this.putQueryParameter("ApgroupUuid", apgroupUuid);
            this.apgroupUuid = apgroupUuid;
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

        @Override
        public GetApgroupConfigByIdentityRequest build() {
            return new GetApgroupConfigByIdentityRequest(this);
        } 

    } 

}
