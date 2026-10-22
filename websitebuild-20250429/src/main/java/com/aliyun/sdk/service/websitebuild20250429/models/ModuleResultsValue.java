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
 * {@link ModuleResultsValue} extends {@link TeaModel}
 *
 * <p>ModuleResultsValue</p>
 */
public class ModuleResultsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesiredTotal")
    private Long desiredTotal;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.NameInMap("Passed")
    private Boolean passed;

    @com.aliyun.core.annotation.NameInMap("ResourceCode")
    private String resourceCode;

    @com.aliyun.core.annotation.NameInMap("UpgradeAvailable")
    private Boolean upgradeAvailable;

    private ModuleResultsValue(Builder builder) {
        this.desiredTotal = builder.desiredTotal;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.limit = builder.limit;
        this.passed = builder.passed;
        this.resourceCode = builder.resourceCode;
        this.upgradeAvailable = builder.upgradeAvailable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleResultsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desiredTotal
     */
    public Long getDesiredTotal() {
        return this.desiredTotal;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return passed
     */
    public Boolean getPassed() {
        return this.passed;
    }

    /**
     * @return resourceCode
     */
    public String getResourceCode() {
        return this.resourceCode;
    }

    /**
     * @return upgradeAvailable
     */
    public Boolean getUpgradeAvailable() {
        return this.upgradeAvailable;
    }

    public static final class Builder {
        private Long desiredTotal; 
        private String errorCode; 
        private String errorMessage; 
        private Long limit; 
        private Boolean passed; 
        private String resourceCode; 
        private Boolean upgradeAvailable; 

        private Builder() {
        } 

        private Builder(ModuleResultsValue model) {
            this.desiredTotal = model.desiredTotal;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.limit = model.limit;
            this.passed = model.passed;
            this.resourceCode = model.resourceCode;
            this.upgradeAvailable = model.upgradeAvailable;
        } 

        /**
         * <p>Returned only for APP_WORKSPACE: the target total amount for this check, which is the used amount in the saved configuration plus the ResourceValue. If a compatible DesiredTotal is provided, this total amount is used directly. The used amount for issues is the sum of regular and reputation issues in the saved configuration, and the used amount for competitors is the number of competitors. This field is empty for APP and USER checks.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder desiredTotal(Long desiredTotal) {
            this.desiredTotal = desiredTotal;
            return this;
        }

        /**
         * <p>The error code when the check fails. This field is null when the check passes.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource.Control.No.Usage</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message when the check fails. This field is null when the check passes.</p>
         * 
         * <strong>example:</strong>
         * <p>Quota exhausted</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Returned only for APP_WORKSPACE quantity pre-checks: the maximum number of issues or competitors allowed by the current product edition, which is not the remaining quota. This field is empty for APP and USER checks or when the edition benefits cannot be determined.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>Indicates whether the check passed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder passed(Boolean passed) {
            this.passed = passed;
            return this;
        }

        /**
         * <p>The resource code.</p>
         * 
         * <strong>example:</strong>
         * <p>InspirationTokens</p>
         */
        public Builder resourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }

        /**
         * <p>Indicates whether a purchasable higher edition exists that can accommodate the DesiredTotal. This field is true only when the capacity of the current edition is insufficient and a higher edition meets the requirement. Otherwise, it is false. This field may be empty for APP and USER checks. This field does not indicate that an upgrade has been performed or an upgrade order has been created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder upgradeAvailable(Boolean upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }

        public ModuleResultsValue build() {
            return new ModuleResultsValue(this);
        } 

    } 

}
