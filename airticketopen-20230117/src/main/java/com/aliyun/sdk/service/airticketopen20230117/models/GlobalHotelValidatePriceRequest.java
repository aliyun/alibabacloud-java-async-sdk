// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link GlobalHotelValidatePriceRequest} extends {@link RequestModel}
 *
 * <p>GlobalHotelValidatePriceRequest</p>
 */
public class GlobalHotelValidatePriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Adults")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer adults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Children")
    private Integer children;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildrenAges")
    private java.util.List<Integer> childrenAges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemOfferKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemOfferKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer roomCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private GlobalHotelValidatePriceRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.adults = builder.adults;
        this.children = builder.children;
        this.childrenAges = builder.childrenAges;
        this.itemOfferKey = builder.itemOfferKey;
        this.roomCount = builder.roomCount;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalHotelValidatePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return adults
     */
    public Integer getAdults() {
        return this.adults;
    }

    /**
     * @return children
     */
    public Integer getChildren() {
        return this.children;
    }

    /**
     * @return childrenAges
     */
    public java.util.List<Integer> getChildrenAges() {
        return this.childrenAges;
    }

    /**
     * @return itemOfferKey
     */
    public String getItemOfferKey() {
        return this.itemOfferKey;
    }

    /**
     * @return roomCount
     */
    public Integer getRoomCount() {
        return this.roomCount;
    }

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder extends Request.Builder<GlobalHotelValidatePriceRequest, Builder> {
        private Long accountNo; 
        private Integer adults; 
        private Integer children; 
        private java.util.List<Integer> childrenAges; 
        private String itemOfferKey; 
        private Integer roomCount; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(GlobalHotelValidatePriceRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.adults = request.adults;
            this.children = request.children;
            this.childrenAges = request.childrenAges;
            this.itemOfferKey = request.itemOfferKey;
            this.roomCount = request.roomCount;
            this.tracerId = request.tracerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder adults(Integer adults) {
            this.putBodyParameter("Adults", adults);
            this.adults = adults;
            return this;
        }

        /**
         * Children.
         */
        public Builder children(Integer children) {
            this.putBodyParameter("Children", children);
            this.children = children;
            return this;
        }

        /**
         * ChildrenAges.
         */
        public Builder childrenAges(java.util.List<Integer> childrenAges) {
            String childrenAgesShrink = shrink(childrenAges, "ChildrenAges", "json");
            this.putBodyParameter("ChildrenAges", childrenAgesShrink);
            this.childrenAges = childrenAges;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>itemOfferKey_abc123</p>
         */
        public Builder itemOfferKey(String itemOfferKey) {
            this.putBodyParameter("ItemOfferKey", itemOfferKey);
            this.itemOfferKey = itemOfferKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roomCount(Integer roomCount) {
            this.putBodyParameter("RoomCount", roomCount);
            this.roomCount = roomCount;
            return this;
        }

        /**
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public GlobalHotelValidatePriceRequest build() {
            return new GlobalHotelValidatePriceRequest(this);
        } 

    } 

}
