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
    @Query
    @NameInMap("disable")
    private Long disable;

    @Query
    @NameInMap("need_org_entity")
    private Boolean needOrgEntity;

    @Query
    @NameInMap("thirdpart_id")
    private String thirdpartId;

    @Query
    @NameInMap("title")
    private String title;

    @Query
    @NameInMap("user_id")
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private CostCenterQueryRequest(Builder builder) {
        super(builder);
        this.disable = builder.disable;
        this.needOrgEntity = builder.needOrgEntity;
        this.thirdpartId = builder.thirdpartId;
        this.title = builder.title;
        this.userId = builder.userId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
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
     * @return disable
     */
    public Long getDisable() {
        return this.disable;
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

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<CostCenterQueryRequest, Builder> {
        private Long disable; 
        private Boolean needOrgEntity; 
        private String thirdpartId; 
        private String title; 
        private String userId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CostCenterQueryRequest request) {
            super(request);
            this.disable = request.disable;
            this.needOrgEntity = request.needOrgEntity;
            this.thirdpartId = request.thirdpartId;
            this.title = request.title;
            this.userId = request.userId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * disable.
         */
        public Builder disable(Long disable) {
            this.putQueryParameter("disable", disable);
            this.disable = disable;
            return this;
        }

        /**
         * need_org_entity.
         */
        public Builder needOrgEntity(Boolean needOrgEntity) {
            this.putQueryParameter("need_org_entity", needOrgEntity);
            this.needOrgEntity = needOrgEntity;
            return this;
        }

        /**
         * thirdpart_id.
         */
        public Builder thirdpartId(String thirdpartId) {
            this.putQueryParameter("thirdpart_id", thirdpartId);
            this.thirdpartId = thirdpartId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putQueryParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public CostCenterQueryRequest build() {
            return new CostCenterQueryRequest(this);
        } 

    } 

}
