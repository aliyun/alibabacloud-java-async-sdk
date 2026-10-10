// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link PaidResourceDTO} extends {@link TeaModel}
 *
 * <p>PaidResourceDTO</p>
 */
public class PaidResourceDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("effectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.NameInMap("remainQuantity")
    private Integer remainQuantity;

    @com.aliyun.core.annotation.NameInMap("resourceCatalogCode")
    private String resourceCatalogCode;

    @com.aliyun.core.annotation.NameInMap("resourceCatalogName")
    private String resourceCatalogName;

    @com.aliyun.core.annotation.NameInMap("resourcePackageCode")
    private String resourcePackageCode;

    @com.aliyun.core.annotation.NameInMap("resourcePackageName")
    private String resourcePackageName;

    @com.aliyun.core.annotation.NameInMap("resourceStatus")
    private String resourceStatus;

    private PaidResourceDTO(Builder builder) {
        this.effectiveTime = builder.effectiveTime;
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
        this.quantity = builder.quantity;
        this.remainQuantity = builder.remainQuantity;
        this.resourceCatalogCode = builder.resourceCatalogCode;
        this.resourceCatalogName = builder.resourceCatalogName;
        this.resourcePackageCode = builder.resourcePackageCode;
        this.resourcePackageName = builder.resourcePackageName;
        this.resourceStatus = builder.resourceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaidResourceDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return remainQuantity
     */
    public Integer getRemainQuantity() {
        return this.remainQuantity;
    }

    /**
     * @return resourceCatalogCode
     */
    public String getResourceCatalogCode() {
        return this.resourceCatalogCode;
    }

    /**
     * @return resourceCatalogName
     */
    public String getResourceCatalogName() {
        return this.resourceCatalogName;
    }

    /**
     * @return resourcePackageCode
     */
    public String getResourcePackageCode() {
        return this.resourcePackageCode;
    }

    /**
     * @return resourcePackageName
     */
    public String getResourcePackageName() {
        return this.resourcePackageName;
    }

    /**
     * @return resourceStatus
     */
    public String getResourceStatus() {
        return this.resourceStatus;
    }

    public static final class Builder {
        private String effectiveTime; 
        private String expireTime; 
        private String instanceId; 
        private Integer quantity; 
        private Integer remainQuantity; 
        private String resourceCatalogCode; 
        private String resourceCatalogName; 
        private String resourcePackageCode; 
        private String resourcePackageName; 
        private String resourceStatus; 

        private Builder() {
        } 

        private Builder(PaidResourceDTO model) {
            this.effectiveTime = model.effectiveTime;
            this.expireTime = model.expireTime;
            this.instanceId = model.instanceId;
            this.quantity = model.quantity;
            this.remainQuantity = model.remainQuantity;
            this.resourceCatalogCode = model.resourceCatalogCode;
            this.resourceCatalogName = model.resourceCatalogName;
            this.resourcePackageCode = model.resourcePackageCode;
            this.resourcePackageName = model.resourcePackageName;
            this.resourceStatus = model.resourceStatus;
        } 

        /**
         * <p>The time the resource becomes effective.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-01 00:00:00</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The time the resource expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-10 00:00:00</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-fou41hse8001</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The total quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The remaining quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder remainQuantity(Integer remainQuantity) {
            this.remainQuantity = remainQuantity;
            return this;
        }

        /**
         * <p>The code of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>AI_ORAL</p>
         */
        public Builder resourceCatalogCode(String resourceCatalogCode) {
            this.resourceCatalogCode = resourceCatalogCode;
            return this;
        }

        /**
         * <p>The name of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>口语评测</p>
         */
        public Builder resourceCatalogName(String resourceCatalogName) {
            this.resourceCatalogName = resourceCatalogName;
            return this;
        }

        /**
         * <p>The code of the resource package.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE_PAID_RECOURSE_PACKAGE</p>
         */
        public Builder resourcePackageCode(String resourcePackageCode) {
            this.resourcePackageCode = resourcePackageCode;
            return this;
        }

        /**
         * <p>The name of the resource package.</p>
         * 
         * <strong>example:</strong>
         * <p>智能批改-资源包</p>
         */
        public Builder resourcePackageName(String resourcePackageName) {
            this.resourcePackageName = resourcePackageName;
            return this;
        }

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder resourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }

        public PaidResourceDTO build() {
            return new PaidResourceDTO(this);
        } 

    } 

}
