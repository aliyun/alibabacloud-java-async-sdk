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
 * {@link GetApgroupSsidConfigRequest} extends {@link RequestModel}
 *
 * <p>GetApgroupSsidConfigRequest</p>
 */
public class GetApgroupSsidConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApGroupUUId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apGroupUUId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    private GetApgroupSsidConfigRequest(Builder builder) {
        super(builder);
        this.apGroupUUId = builder.apGroupUUId;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApgroupSsidConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apGroupUUId
     */
    public String getApGroupUUId() {
        return this.apGroupUUId;
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

    public static final class Builder extends Request.Builder<GetApgroupSsidConfigRequest, Builder> {
        private String apGroupUUId; 
        private String appCode; 
        private String appName; 

        private Builder() {
            super();
        } 

        private Builder(GetApgroupSsidConfigRequest request) {
            super(request);
            this.apGroupUUId = request.apGroupUUId;
            this.appCode = request.appCode;
            this.appName = request.appName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apGroupUUId(String apGroupUUId) {
            this.putQueryParameter("ApGroupUUId", apGroupUUId);
            this.apGroupUUId = apGroupUUId;
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
        public GetApgroupSsidConfigRequest build() {
            return new GetApgroupSsidConfigRequest(this);
        } 

    } 

}
