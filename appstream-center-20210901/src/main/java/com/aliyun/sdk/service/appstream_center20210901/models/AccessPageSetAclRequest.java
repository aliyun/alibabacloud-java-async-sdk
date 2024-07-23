// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccessPageSetAclRequest} extends {@link RequestModel}
 *
 * <p>AccessPageSetAclRequest</p>
 */
public class AccessPageSetAclRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageName")
    private String accessPageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectTime")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer effectTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Unit")
    private String unit;

    private AccessPageSetAclRequest(Builder builder) {
        super(builder);
        this.accessMode = builder.accessMode;
        this.accessPageId = builder.accessPageId;
        this.accessPageName = builder.accessPageName;
        this.effectTime = builder.effectTime;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessPageSetAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessMode
     */
    public String getAccessMode() {
        return this.accessMode;
    }

    /**
     * @return accessPageId
     */
    public String getAccessPageId() {
        return this.accessPageId;
    }

    /**
     * @return accessPageName
     */
    public String getAccessPageName() {
        return this.accessPageName;
    }

    /**
     * @return effectTime
     */
    public Integer getEffectTime() {
        return this.effectTime;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder extends Request.Builder<AccessPageSetAclRequest, Builder> {
        private String accessMode; 
        private String accessPageId; 
        private String accessPageName; 
        private Integer effectTime; 
        private String unit; 

        private Builder() {
            super();
        } 

        private Builder(AccessPageSetAclRequest request) {
            super(request);
            this.accessMode = request.accessMode;
            this.accessPageId = request.accessPageId;
            this.accessPageName = request.accessPageName;
            this.effectTime = request.effectTime;
            this.unit = request.unit;
        } 

        /**
         * AccessMode.
         */
        public Builder accessMode(String accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
            return this;
        }

        /**
         * AccessPageId.
         */
        public Builder accessPageId(String accessPageId) {
            this.putQueryParameter("AccessPageId", accessPageId);
            this.accessPageId = accessPageId;
            return this;
        }

        /**
         * AccessPageName.
         */
        public Builder accessPageName(String accessPageName) {
            this.putQueryParameter("AccessPageName", accessPageName);
            this.accessPageName = accessPageName;
            return this;
        }

        /**
         * EffectTime.
         */
        public Builder effectTime(Integer effectTime) {
            this.putQueryParameter("EffectTime", effectTime);
            this.effectTime = effectTime;
            return this;
        }

        /**
         * Unit.
         */
        public Builder unit(String unit) {
            this.putQueryParameter("Unit", unit);
            this.unit = unit;
            return this;
        }

        @Override
        public AccessPageSetAclRequest build() {
            return new AccessPageSetAclRequest(this);
        } 

    } 

}
