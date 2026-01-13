// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ListSubAccountInfoResult} extends {@link TeaModel}
 *
 * <p>ListSubAccountInfoResult</p>
 */
public class ListSubAccountInfoResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("subAccountInfos")
    private java.util.List<SubAccountInfos> subAccountInfos;

    private ListSubAccountInfoResult(Builder builder) {
        this.subAccountInfos = builder.subAccountInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubAccountInfoResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subAccountInfos
     */
    public java.util.List<SubAccountInfos> getSubAccountInfos() {
        return this.subAccountInfos;
    }

    public static final class Builder {
        private java.util.List<SubAccountInfos> subAccountInfos; 

        private Builder() {
        } 

        private Builder(ListSubAccountInfoResult model) {
            this.subAccountInfos = model.subAccountInfos;
        } 

        /**
         * subAccountInfos.
         */
        public Builder subAccountInfos(java.util.List<SubAccountInfos> subAccountInfos) {
            this.subAccountInfos = subAccountInfos;
            return this;
        }

        public ListSubAccountInfoResult build() {
            return new ListSubAccountInfoResult(this);
        } 

    } 

    /**
     * 
     * {@link ListSubAccountInfoResult} extends {@link TeaModel}
     *
     * <p>ListSubAccountInfoResult</p>
     */
    public static class SubAccountInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountName")
        private String accountName;

        private SubAccountInfos(Builder builder) {
            this.accountName = builder.accountName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubAccountInfos create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        public static final class Builder {
            private String accountName; 

            private Builder() {
            } 

            private Builder(SubAccountInfos model) {
                this.accountName = model.accountName;
            } 

            /**
             * accountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            public SubAccountInfos build() {
                return new SubAccountInfos(this);
            } 

        } 

    }
}
