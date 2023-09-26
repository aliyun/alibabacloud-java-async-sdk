// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRaceWorkForInnerRequest} extends {@link RequestModel}
 *
 * <p>CreateRaceWorkForInnerRequest</p>
 */
public class CreateRaceWorkForInnerRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Keywords")
    @Validation(required = true)
    private String keywords;

    @Query
    @NameInMap("LogoUrl")
    @Validation(required = true)
    private String logoUrl;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("ShortDescription")
    @Validation(required = true)
    private String shortDescription;

    @Query
    @NameInMap("WorkName")
    @Validation(required = true)
    private String workName;

    private CreateRaceWorkForInnerRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.groupId = builder.groupId;
        this.keywords = builder.keywords;
        this.logoUrl = builder.logoUrl;
        this.securityToken = builder.securityToken;
        this.shortDescription = builder.shortDescription;
        this.workName = builder.workName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRaceWorkForInnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return shortDescription
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * @return workName
     */
    public String getWorkName() {
        return this.workName;
    }

    public static final class Builder extends Request.Builder<CreateRaceWorkForInnerRequest, Builder> {
        private String commodityCode; 
        private String groupId; 
        private String keywords; 
        private String logoUrl; 
        private String securityToken; 
        private String shortDescription; 
        private String workName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRaceWorkForInnerRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.groupId = request.groupId;
            this.keywords = request.keywords;
            this.logoUrl = request.logoUrl;
            this.securityToken = request.securityToken;
            this.shortDescription = request.shortDescription;
            this.workName = request.workName;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * LogoUrl.
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * ShortDescription.
         */
        public Builder shortDescription(String shortDescription) {
            this.putQueryParameter("ShortDescription", shortDescription);
            this.shortDescription = shortDescription;
            return this;
        }

        /**
         * WorkName.
         */
        public Builder workName(String workName) {
            this.putQueryParameter("WorkName", workName);
            this.workName = workName;
            return this;
        }

        @Override
        public CreateRaceWorkForInnerRequest build() {
            return new CreateRaceWorkForInnerRequest(this);
        } 

    } 

}
