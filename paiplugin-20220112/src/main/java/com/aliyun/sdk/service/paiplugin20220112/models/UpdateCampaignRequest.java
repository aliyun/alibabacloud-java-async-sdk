// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCampaignRequest} extends {@link RequestModel}
 *
 * <p>UpdateCampaignRequest</p>
 */
public class UpdateCampaignRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Remark")
    private String remark;

    private UpdateCampaignRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCampaignRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateCampaignRequest, Builder> {
        private String id; 
        private String name; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCampaignRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
            this.remark = request.remark;
        } 

        /**
         * 运营活动Id，可通过ListCampaigns查询账号下的运营活动列表，获取运营活动Id。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
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
        public UpdateCampaignRequest build() {
            return new UpdateCampaignRequest(this);
        } 

    } 

}
