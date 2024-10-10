// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartBaselineSecurityCheckRequest} extends {@link RequestModel}
 *
 * <p>StartBaselineSecurityCheckRequest</p>
 */
public class StartBaselineSecurityCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemIds")
    private java.util.List < Long > itemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The IDs of the check items.</p>
         * <blockquote>
         * <p>To perform a check task on cloud service configurations, you must specify the ID of the check item. You can call the <a href="~~DescribeRiskItemType~~">DescribeRiskItemType</a> operation to query the IDs of check items.</p>
         * </blockquote>
         */
        public Builder itemIds(java.util.List < Long > itemIds) {
            this.putQueryParameter("ItemIds", itemIds);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
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
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>106.11.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the check task. Valid values:</p>
         * <ul>
         * <li><strong>check</strong></li>
         * <li><strong>verify</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>verify</p>
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
