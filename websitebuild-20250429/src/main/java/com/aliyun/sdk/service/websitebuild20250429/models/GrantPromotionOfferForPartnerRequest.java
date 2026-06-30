// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GrantPromotionOfferForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GrantPromotionOfferForPartnerRequest</p>
 */
public class GrantPromotionOfferForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityCode")
    private String activityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    private String activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BelongId")
    private String belongId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmployeeCode")
    private String employeeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private GrantPromotionOfferForPartnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.activityCode = builder.activityCode;
        this.activityId = builder.activityId;
        this.belongId = builder.belongId;
        this.channel = builder.channel;
        this.employeeCode = builder.employeeCode;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantPromotionOfferForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return activityCode
     */
    public String getActivityCode() {
        return this.activityCode;
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return belongId
     */
    public String getBelongId() {
        return this.belongId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return employeeCode
     */
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<GrantPromotionOfferForPartnerRequest, Builder> {
        private String regionId; 
        private String activityCode; 
        private String activityId; 
        private String belongId; 
        private String channel; 
        private String employeeCode; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(GrantPromotionOfferForPartnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.activityCode = request.activityCode;
            this.activityId = request.activityId;
            this.belongId = request.belongId;
            this.channel = request.channel;
            this.employeeCode = request.employeeCode;
            this.remark = request.remark;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ActivityCode.
         */
        public Builder activityCode(String activityCode) {
            this.putQueryParameter("ActivityCode", activityCode);
            this.activityCode = activityCode;
            return this;
        }

        /**
         * ActivityId.
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * BelongId.
         */
        public Builder belongId(String belongId) {
            this.putQueryParameter("BelongId", belongId);
            this.belongId = belongId;
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
         * EmployeeCode.
         */
        public Builder employeeCode(String employeeCode) {
            this.putQueryParameter("EmployeeCode", employeeCode);
            this.employeeCode = employeeCode;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public GrantPromotionOfferForPartnerRequest build() {
            return new GrantPromotionOfferForPartnerRequest(this);
        } 

    } 

}
