// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CheckUpgradeItemResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUpgradeItemResponseBody</p>
 */
public class CheckUpgradeItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpgradeItem")
    private UpgradeItem upgradeItem;

    private CheckUpgradeItemResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.upgradeItem = builder.upgradeItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUpgradeItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return upgradeItem
     */
    public UpgradeItem getUpgradeItem() {
        return this.upgradeItem;
    }

    public static final class Builder {
        private String requestId; 
        private UpgradeItem upgradeItem; 

        private Builder() {
        } 

        private Builder(CheckUpgradeItemResponseBody model) {
            this.requestId = model.requestId;
            this.upgradeItem = model.upgradeItem;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UpgradeItem.
         */
        public Builder upgradeItem(UpgradeItem upgradeItem) {
            this.upgradeItem = upgradeItem;
            return this;
        }

        public CheckUpgradeItemResponseBody build() {
            return new CheckUpgradeItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckUpgradeItemResponseBody} extends {@link TeaModel}
     *
     * <p>CheckUpgradeItemResponseBody</p>
     */
    public static class UpgradeItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private String checkResult;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeItemId")
        private String upgradeItemId;

        private UpgradeItem(Builder builder) {
            this.checkResult = builder.checkResult;
            this.checkStatus = builder.checkStatus;
            this.upgradeItemId = builder.upgradeItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeItem create() {
            return builder().build();
        }

        /**
         * @return checkResult
         */
        public String getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return upgradeItemId
         */
        public String getUpgradeItemId() {
            return this.upgradeItemId;
        }

        public static final class Builder {
            private String checkResult; 
            private String checkStatus; 
            private String upgradeItemId; 

            private Builder() {
            } 

            private Builder(UpgradeItem model) {
                this.checkResult = model.checkResult;
                this.checkStatus = model.checkStatus;
                this.upgradeItemId = model.upgradeItemId;
            } 

            /**
             * CheckResult.
             */
            public Builder checkResult(String checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * UpgradeItemId.
             */
            public Builder upgradeItemId(String upgradeItemId) {
                this.upgradeItemId = upgradeItemId;
                return this;
            }

            public UpgradeItem build() {
                return new UpgradeItem(this);
            } 

        } 

    }
}
