// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListKmsKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListKmsKeysResponseBody</p>
 */
public class ListKmsKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListKmsKeysResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKmsKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListKmsKeysResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListKmsKeysResponseBody build() {
            return new ListKmsKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKmsKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListKmsKeysResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        private Items(Builder builder) {
            this.aliasName = builder.aliasName;
            this.keyId = builder.keyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        public static final class Builder {
            private String aliasName; 
            private String keyId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.aliasName = model.aliasName;
                this.keyId = model.keyId;
            } 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * KeyId.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
