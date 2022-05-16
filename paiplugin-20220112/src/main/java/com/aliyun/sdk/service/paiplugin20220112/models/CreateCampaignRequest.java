// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCampaignRequest} extends {@link RequestModel}
 *
 * <p>CreateCampaignRequest</p>
 */
public class CreateCampaignRequest extends Request {
    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Remark")
    private String remark;

    private CreateCampaignRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCampaignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<CreateCampaignRequest, Builder> {
        private String name; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(CreateCampaignRequest request) {
            super(request);
            this.name = request.name;
            this.remark = request.remark;
        } 

        /**
         * 运营活动名称。
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 备注。
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public CreateCampaignRequest build() {
            return new CreateCampaignRequest(this);
        } 

    } 

}
