// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetBizTraceRequest} extends {@link RequestModel}
 *
 * <p>GetBizTraceRequest</p>
 */
public class GetBizTraceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("bizTraceId")
    private String bizTraceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetBizTraceRequest(Builder builder) {
        super(builder);
        this.bizTraceId = builder.bizTraceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBizTraceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTraceId
     */
    public String getBizTraceId() {
        return this.bizTraceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetBizTraceRequest, Builder> {
        private String bizTraceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetBizTraceRequest request) {
            super(request);
            this.bizTraceId = request.bizTraceId;
            this.regionId = request.regionId;
        } 

        /**
         * bizTraceId.
         */
        public Builder bizTraceId(String bizTraceId) {
            this.putPathParameter("bizTraceId", bizTraceId);
            this.bizTraceId = bizTraceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetBizTraceRequest build() {
            return new GetBizTraceRequest(this);
        } 

    } 

}
