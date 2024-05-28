// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetZidTagScoreByAtokenRequest} extends {@link RequestModel}
 *
 * <p>GetZidTagScoreByAtokenRequest</p>
 */
public class GetZidTagScoreByAtokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("atoken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String atoken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    private GetZidTagScoreByAtokenRequest(Builder builder) {
        super(builder);
        this.atoken = builder.atoken;
        this.dataSourceId = builder.dataSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetZidTagScoreByAtokenRequest create() {
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

    public static final class Builder extends Request.Builder<GetZidTagScoreByAtokenRequest, Builder> {
        private String atoken; 
        private String dataSourceId; 

        private Builder() {
            super();
        } 

        private Builder(GetZidTagScoreByAtokenRequest request) {
            super(request);
            this.atoken = request.atoken;
            this.dataSourceId = request.dataSourceId;
        } 

        /**
         * atoken
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

        @Override
        public GetZidTagScoreByAtokenRequest build() {
            return new GetZidTagScoreByAtokenRequest(this);
        } 

    } 

}
