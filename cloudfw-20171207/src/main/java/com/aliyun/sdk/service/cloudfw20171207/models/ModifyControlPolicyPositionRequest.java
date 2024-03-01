// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyControlPolicyPositionRequest} extends {@link RequestModel}
 *
 * <p>ModifyControlPolicyPositionRequest</p>
 */
public class ModifyControlPolicyPositionRequest extends Request {
    @Query
    @NameInMap("Direction")
    @Validation(required = true)
    private String direction;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NewOrder")
    @Validation(required = true)
    private String newOrder;

    @Query
    @NameInMap("OldOrder")
    @Validation(required = true)
    private String oldOrder;

    @Query
    @NameInMap("SourceIp")
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
         * The direction of the traffic to which the IPv4 access control policy applies. Valid values:
         * <p>
         * 
         * *   in: inbound traffic
         * *   out: outbound traffic
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese (default)
         * *   en: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The new priority of the IPv4 access control policy. You must specify a numeric value for this parameter. The value 1 indicates the highest priority. A larger value indicates a lower priority.
         * <p>
         * 
         * >  The new priority cannot exceed the priority range of the IPv4 access control policy. Otherwise, an error occurs when you call this operation. Before you call this operation, we recommend that you use the [DescribePolicyPriorUsed](~~138862~~) operation to query the priority range of the IPv4 access control policy in the specified direction.
         */
        public Builder newOrder(String newOrder) {
            this.putQueryParameter("NewOrder", newOrder);
            this.newOrder = newOrder;
            return this;
        }

        /**
         * The original priority of the IPv4 access control policy.
         */
        public Builder oldOrder(String oldOrder) {
            this.putQueryParameter("OldOrder", oldOrder);
            this.oldOrder = oldOrder;
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

        @Override
        public ModifyControlPolicyPositionRequest build() {
            return new ModifyControlPolicyPositionRequest(this);
        } 

    } 

}
