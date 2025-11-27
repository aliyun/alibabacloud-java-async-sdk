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
         * <p>The data returned.</p>
         */
        public Builder aliasInfo(AliasInfo aliasInfo) {
            this.aliasInfo = aliasInfo;
            return this;
        }

        /**
         * <p>The generated ID of the organization.</p>
         * 
         * <strong>example:</strong>
         * <p>WY23***</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
             * <p>The reason why modification is not allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>FrequencyExceedsLimit</p>
             */
            public Builder aliasEditDisabledReason(String aliasEditDisabledReason) {
                this.aliasEditDisabledReason = aliasEditDisabledReason;
                return this;
            }

            /**
             * <p>Indicates whether modification is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder aliasEditable(Boolean aliasEditable) {
                this.aliasEditable = aliasEditable;
                return this;
            }

            /**
             * <p>The source of the organization ID.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Generated: auto-generated.</li>
             * <li>Customized: user-defined.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Customized</p>
             */
            public Builder aliasSourceType(String aliasSourceType) {
                this.aliasSourceType = aliasSourceType;
                return this;
            }

            /**
             * <p>The time window during which modification is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-17 20:31:48</p>
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
