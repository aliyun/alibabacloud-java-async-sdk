// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCampaignRequest} extends {@link RequestModel}
 *
 * <p>GetCampaignRequest</p>
 */
public class GetCampaignRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private GetCampaignRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCampaignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetCampaignRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetCampaignRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 运营活动Id，可通过ListCampaigns查询账号下的运营活动列表，获取运营活动Id。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetCampaignRequest build() {
            return new GetCampaignRequest(this);
        } 

    } 

}
