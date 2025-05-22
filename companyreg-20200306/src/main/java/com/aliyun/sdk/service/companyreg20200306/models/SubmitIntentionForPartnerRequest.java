// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link SubmitIntentionForPartnerRequest} extends {@link RequestModel}
 *
 * <p>SubmitIntentionForPartnerRequest</p>
 */
public class SubmitIntentionForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityType")
    private String commodityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Grade")
    private Integer grade;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private SubmitIntentionForPartnerRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.bizType = builder.bizType;
        this.channel = builder.channel;
        this.commodityType = builder.commodityType;
        this.contactName = builder.contactName;
        this.description = builder.description;
        this.extInfo = builder.extInfo;
        this.grade = builder.grade;
        this.mobile = builder.mobile;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitIntentionForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return commodityType
     */
    public String getCommodityType() {
        return this.commodityType;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return grade
     */
    public Integer getGrade() {
        return this.grade;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SubmitIntentionForPartnerRequest, Builder> {
        private String area; 
        private String bizType; 
        private String channel; 
        private String commodityType; 
        private String contactName; 
        private String description; 
        private String extInfo; 
        private Integer grade; 
        private String mobile; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitIntentionForPartnerRequest request) {
            super(request);
            this.area = request.area;
            this.bizType = request.bizType;
            this.channel = request.channel;
            this.commodityType = request.commodityType;
            this.contactName = request.contactName;
            this.description = request.description;
            this.extInfo = request.extInfo;
            this.grade = request.grade;
            this.mobile = request.mobile;
            this.userId = request.userId;
        } 

        /**
         * Area.
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * CommodityType.
         */
        public Builder commodityType(String commodityType) {
            this.putQueryParameter("CommodityType", commodityType);
            this.commodityType = commodityType;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putQueryParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * Grade.
         */
        public Builder grade(Integer grade) {
            this.putQueryParameter("Grade", grade);
            this.grade = grade;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SubmitIntentionForPartnerRequest build() {
            return new SubmitIntentionForPartnerRequest(this);
        } 

    } 

}
