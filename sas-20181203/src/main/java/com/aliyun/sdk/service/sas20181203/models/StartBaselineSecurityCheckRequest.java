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

        private Builder(StartBaselineSecurityCheckRequest request) {
            super(request);
            this.itemIds = request.itemIds;
            this.lang = request.lang;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * The IDs of the check items.
         * <p>
         * 
         * > To perform a check task on cloud service configurations, you must specify the ID of the check item. You can call the [DescribeRiskItemType](~~DescribeRiskItemType~~) operation to query the IDs of check items.
         */
        public Builder itemIds(java.util.List < Long > itemIds) {
            this.putQueryParameter("ItemIds", itemIds);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
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
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the check task. Valid values:
         * <p>
         * 
         * *   **check**
         * *   **verify**
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
