// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealTimeRiskInfoRequest} extends {@link RequestModel}
 *
 * <p>GetRealTimeRiskInfoRequest</p>
 */
public class GetRealTimeRiskInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("atoken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String atoken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    private GetRealTimeRiskInfoRequest(Builder builder) {
        super(builder);
        this.atoken = builder.atoken;
        this.dataSourceId = builder.dataSourceId;
        this.extra = builder.extra;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealTimeRiskInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return atoken
     */
    public String getAtoken() {
        return this.atoken;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    public static final class Builder extends Request.Builder<GetRealTimeRiskInfoRequest, Builder> {
        private String atoken; 
        private String dataSourceId; 
        private String extra; 

        private Builder() {
            super();
        } 

        private Builder(GetRealTimeRiskInfoRequest request) {
            super(request);
            this.atoken = request.atoken;
            this.dataSourceId = request.dataSourceId;
            this.extra = request.extra;
        } 

        /**
         * atoken.
         */
        public Builder atoken(String atoken) {
            this.putQueryParameter("atoken", atoken);
            this.atoken = atoken;
            return this;
        }

        /**
         * dataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(String extra) {
            this.putQueryParameter("extra", extra);
            this.extra = extra;
            return this;
        }

        @Override
        public GetRealTimeRiskInfoRequest build() {
            return new GetRealTimeRiskInfoRequest(this);
        } 

    } 

}
