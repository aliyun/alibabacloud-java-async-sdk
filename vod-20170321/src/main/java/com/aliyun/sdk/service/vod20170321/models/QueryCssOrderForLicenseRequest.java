// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link QueryCssOrderForLicenseRequest} extends {@link RequestModel}
 *
 * <p>QueryCssOrderForLicenseRequest</p>
 */
public class QueryCssOrderForLicenseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamStr")
    private String paramStr;

    private QueryCssOrderForLicenseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.paramStr = builder.paramStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCssOrderForLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return paramStr
     */
    public String getParamStr() {
        return this.paramStr;
    }

    public static final class Builder extends Request.Builder<QueryCssOrderForLicenseRequest, Builder> {
        private String regionId; 
        private String paramStr; 

        private Builder() {
            super();
        } 

        private Builder(QueryCssOrderForLicenseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.paramStr = request.paramStr;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ParamStr.
         */
        public Builder paramStr(String paramStr) {
            this.putQueryParameter("ParamStr", paramStr);
            this.paramStr = paramStr;
            return this;
        }

        @Override
        public QueryCssOrderForLicenseRequest build() {
            return new QueryCssOrderForLicenseRequest(this);
        } 

    } 

}
