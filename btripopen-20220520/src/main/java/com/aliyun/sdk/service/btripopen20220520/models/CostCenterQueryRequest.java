// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CostCenterQueryRequest} extends {@link RequestModel}
 *
 * <p>CostCenterQueryRequest</p>
 */
public class CostCenterQueryRequest extends Request {
    @Body
    @NameInMap("need_org_entity")
    private Boolean needOrgEntity;

    @Body
    @NameInMap("thirdpart_id")
    private String thirdpartId;

    @Body
    @NameInMap("title")
    private String title;

    @Body
    @NameInMap("user_id")
    private String userId;

    private CostCenterQueryRequest(Builder builder) {
        super(builder);
        this.needOrgEntity = builder.needOrgEntity;
        this.thirdpartId = builder.thirdpartId;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostCenterQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return needOrgEntity
     */
    public Boolean getNeedOrgEntity() {
        return this.needOrgEntity;
    }

    /**
     * @return thirdpartId
     */
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CostCenterQueryRequest, Builder> {
        private Boolean needOrgEntity; 
        private String thirdpartId; 
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CostCenterQueryRequest request) {
            super(request);
            this.needOrgEntity = request.needOrgEntity;
            this.thirdpartId = request.thirdpartId;
            this.title = request.title;
            this.userId = request.userId;
        } 

        /**
         * 是否需要展示成员信息，当成本中心为部分人员适用的时候有返回
         */
        public Builder needOrgEntity(Boolean needOrgEntity) {
            this.putBodyParameter("need_org_entity", needOrgEntity);
            this.needOrgEntity = needOrgEntity;
            return this;
        }

        /**
         * 第三方成本中心id
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putBodyParameter("thirdpart_id", thirdpartId);
            this.thirdpartId = thirdpartId;
            return this;
        }

        /**
         * 成本中心名称
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CostCenterQueryRequest build() {
            return new CostCenterQueryRequest(this);
        } 

    } 

}
