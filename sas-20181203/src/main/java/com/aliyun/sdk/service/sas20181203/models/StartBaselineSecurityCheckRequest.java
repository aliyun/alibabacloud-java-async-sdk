// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBaselineSecurityCheckRequest} extends {@link RequestModel}
 *
 * <p>StartBaselineSecurityCheckRequest</p>
 */
public class StartBaselineSecurityCheckRequest extends Request {
    @Query
    @NameInMap("ItemIds")
    private java.util.List < Long > itemIds;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private StartBaselineSecurityCheckRequest(Builder builder) {
        super(builder);
        this.itemIds = builder.itemIds;
        this.lang = builder.lang;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartBaselineSecurityCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemIds
     */
    public java.util.List < Long > getItemIds() {
        return this.itemIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<StartBaselineSecurityCheckRequest, Builder> {
        private java.util.List < Long > itemIds; 
        private String lang; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(StartBaselineSecurityCheckRequest response) {
            super(response);
            this.itemIds = response.itemIds;
            this.lang = response.lang;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceIp = response.sourceIp;
            this.type = response.type;
        } 

        /**
         * ItemIds.
         */
        public Builder itemIds(java.util.List < Long > itemIds) {
            this.putQueryParameter("ItemIds", itemIds);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public StartBaselineSecurityCheckRequest build() {
            return new StartBaselineSecurityCheckRequest(this);
        } 

    } 

}
