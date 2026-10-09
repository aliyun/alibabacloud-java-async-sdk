// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyControlPolicyPositionRequest} extends {@link RequestModel}
 *
 * <p>ModifyControlPolicyPositionRequest</p>
 */
public class ModifyControlPolicyPositionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewOrder")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldOrder")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oldOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    private ModifyControlPolicyPositionRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.lang = builder.lang;
        this.newOrder = builder.newOrder;
        this.oldOrder = builder.oldOrder;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyControlPolicyPositionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return newOrder
     */
    public String getNewOrder() {
        return this.newOrder;
    }

    /**
     * @return oldOrder
     */
    public String getOldOrder() {
        return this.oldOrder;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<ModifyControlPolicyPositionRequest, Builder> {
        private String direction; 
        private String lang; 
        private String newOrder; 
        private String oldOrder; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyControlPolicyPositionRequest request) {
            super(request);
            this.direction = request.direction;
            this.lang = request.lang;
            this.newOrder = request.newOrder;
            this.oldOrder = request.oldOrder;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The traffic direction of the IPv4 access control policy for the Internet firewall. Valid values:</p>
         * <ul>
         * <li><p>in: inbound traffic.</p>
         * </li>
         * <li><p>out: outbound traffic.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><p>zh (default): Chinese.</p>
         * </li>
         * <li><p>en: English.</p>
         * </li>
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
         * <p>The new priority for the IPv4 access control policy of the Internet firewall. The priority is a number. A smaller number indicates a higher priority. The value 1 indicates the highest priority.</p>
         * <blockquote>
         * <p>The new priority value cannot be outside the range of existing priorities for IPv4 policies. Otherwise, the API call fails. Before you call this operation, call <a href="https://help.aliyun.com/document_detail/138862.html">DescribePolicyPriorUsed</a> to query the priority range of IPv4 policies for a specific traffic direction.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder newOrder(String newOrder) {
            this.putQueryParameter("NewOrder", newOrder);
            this.newOrder = newOrder;
            return this;
        }

        /**
         * <p>The current priority of the IPv4 access control policy that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder oldOrder(String oldOrder) {
            this.putQueryParameter("OldOrder", oldOrder);
            this.oldOrder = oldOrder;
            return this;
        }

        /**
         * <p>The source IP address of the visitor.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public ModifyControlPolicyPositionRequest build() {
            return new ModifyControlPolicyPositionRequest(this);
        } 

    } 

}
