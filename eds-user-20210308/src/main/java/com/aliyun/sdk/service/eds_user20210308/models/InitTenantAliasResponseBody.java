// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link InitTenantAliasResponseBody} extends {@link TeaModel}
 *
 * <p>InitTenantAliasResponseBody</p>
 */
public class InitTenantAliasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliasInfo")
    private AliasInfo aliasInfo;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InitTenantAliasResponseBody(Builder builder) {
        this.aliasInfo = builder.aliasInfo;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitTenantAliasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasInfo
     */
    public AliasInfo getAliasInfo() {
        return this.aliasInfo;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AliasInfo aliasInfo; 
        private String data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InitTenantAliasResponseBody model) {
            this.aliasInfo = model.aliasInfo;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * AliasInfo.
         */
        public Builder aliasInfo(AliasInfo aliasInfo) {
            this.aliasInfo = aliasInfo;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InitTenantAliasResponseBody build() {
            return new InitTenantAliasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitTenantAliasResponseBody} extends {@link TeaModel}
     *
     * <p>InitTenantAliasResponseBody</p>
     */
    public static class AliasInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasEditDisabledReason")
        private String aliasEditDisabledReason;

        @com.aliyun.core.annotation.NameInMap("AliasEditable")
        private Boolean aliasEditable;

        @com.aliyun.core.annotation.NameInMap("AliasSourceType")
        private String aliasSourceType;

        @com.aliyun.core.annotation.NameInMap("NextModifyTime")
        private String nextModifyTime;

        private AliasInfo(Builder builder) {
            this.aliasEditDisabledReason = builder.aliasEditDisabledReason;
            this.aliasEditable = builder.aliasEditable;
            this.aliasSourceType = builder.aliasSourceType;
            this.nextModifyTime = builder.nextModifyTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliasInfo create() {
            return builder().build();
        }

        /**
         * @return aliasEditDisabledReason
         */
        public String getAliasEditDisabledReason() {
            return this.aliasEditDisabledReason;
        }

        /**
         * @return aliasEditable
         */
        public Boolean getAliasEditable() {
            return this.aliasEditable;
        }

        /**
         * @return aliasSourceType
         */
        public String getAliasSourceType() {
            return this.aliasSourceType;
        }

        /**
         * @return nextModifyTime
         */
        public String getNextModifyTime() {
            return this.nextModifyTime;
        }

        public static final class Builder {
            private String aliasEditDisabledReason; 
            private Boolean aliasEditable; 
            private String aliasSourceType; 
            private String nextModifyTime; 

            private Builder() {
            } 

            private Builder(AliasInfo model) {
                this.aliasEditDisabledReason = model.aliasEditDisabledReason;
                this.aliasEditable = model.aliasEditable;
                this.aliasSourceType = model.aliasSourceType;
                this.nextModifyTime = model.nextModifyTime;
            } 

            /**
             * AliasEditDisabledReason.
             */
            public Builder aliasEditDisabledReason(String aliasEditDisabledReason) {
                this.aliasEditDisabledReason = aliasEditDisabledReason;
                return this;
            }

            /**
             * AliasEditable.
             */
            public Builder aliasEditable(Boolean aliasEditable) {
                this.aliasEditable = aliasEditable;
                return this;
            }

            /**
             * AliasSourceType.
             */
            public Builder aliasSourceType(String aliasSourceType) {
                this.aliasSourceType = aliasSourceType;
                return this;
            }

            /**
             * NextModifyTime.
             */
            public Builder nextModifyTime(String nextModifyTime) {
                this.nextModifyTime = nextModifyTime;
                return this;
            }

            public AliasInfo build() {
                return new AliasInfo(this);
            } 

        } 

    }
}
