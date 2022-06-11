// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionConfigurationRequest} extends {@link RequestModel}
 *
 * <p>GetRegionConfigurationRequest</p>
 */
public class GetRegionConfigurationRequest extends Request {
    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("zoneId")
    private String zoneId;

    private GetRegionConfigurationRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<GetRegionConfigurationRequest, Builder> {
        private String body; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(GetRegionConfigurationRequest request) {
            super(request);
            this.body = request.body;
            this.zoneId = request.zoneId;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public GetRegionConfigurationRequest build() {
            return new GetRegionConfigurationRequest(this);
        } 

    } 

}
