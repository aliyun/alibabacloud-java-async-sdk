// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link UpdatePrivacyRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivacyRuleRequest</p>
 */
public class UpdatePrivacyRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgImpl")
    private String algImpl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privacyRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private UpdatePrivacyRuleRequest(Builder builder) {
        super(builder);
        this.algImpl = builder.algImpl;
        this.algType = builder.algType;
        this.name = builder.name;
        this.privacyRuleId = builder.privacyRuleId;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivacyRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algImpl
     */
    public String getAlgImpl() {
        return this.algImpl;
    }

    /**
     * @return algType
     */
    public String getAlgType() {
        return this.algType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return privacyRuleId
     */
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdatePrivacyRuleRequest, Builder> {
        private String algImpl; 
        private String algType; 
        private String name; 
        private String privacyRuleId; 
        private String regionId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrivacyRuleRequest request) {
            super(request);
            this.algImpl = request.algImpl;
            this.algType = request.algType;
            this.name = request.name;
            this.privacyRuleId = request.privacyRuleId;
            this.regionId = request.regionId;
            this.remark = request.remark;
        } 

        /**
         * AlgImpl.
         */
        public Builder algImpl(String algImpl) {
            this.putQueryParameter("AlgImpl", algImpl);
            this.algImpl = algImpl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder algType(String algType) {
            this.putQueryParameter("AlgType", algType);
            this.algType = algType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder privacyRuleId(String privacyRuleId) {
            this.putQueryParameter("PrivacyRuleId", privacyRuleId);
            this.privacyRuleId = privacyRuleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public UpdatePrivacyRuleRequest build() {
            return new UpdatePrivacyRuleRequest(this);
        } 

    } 

}
