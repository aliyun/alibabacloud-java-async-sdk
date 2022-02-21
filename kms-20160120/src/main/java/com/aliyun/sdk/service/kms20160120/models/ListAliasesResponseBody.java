// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAliasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliasesResponseBody</p>
 */
public class ListAliasesResponseBody extends TeaModel {
    @NameInMap("Aliases")
    private Aliases aliases;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAliasesResponseBody(Builder builder) {
        this.aliases = builder.aliases;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliases
     */
    public Aliases getAliases() {
        return this.aliases;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Aliases aliases; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Aliases.
         */
        public Builder aliases(Aliases aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAliasesResponseBody build() {
            return new ListAliasesResponseBody(this);
        } 

    } 

    public static class Alias extends TeaModel {
        @NameInMap("AliasArn")
        private String aliasArn;

        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("KeyId")
        private String keyId;

        private Alias(Builder builder) {
            this.aliasArn = builder.aliasArn;
            this.aliasName = builder.aliasName;
            this.keyId = builder.keyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alias create() {
            return builder().build();
        }

        /**
         * @return aliasArn
         */
        public String getAliasArn() {
            return this.aliasArn;
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
            private String aliasArn; 
            private String aliasName; 
            private String keyId; 

            /**
             * AliasArn.
             */
            public Builder aliasArn(String aliasArn) {
                this.aliasArn = aliasArn;
                return this;
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

            public Alias build() {
                return new Alias(this);
            } 

        } 

    }
    public static class Aliases extends TeaModel {
        @NameInMap("Alias")
        private java.util.List < Alias> alias;

        private Aliases(Builder builder) {
            this.alias = builder.alias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aliases create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public java.util.List < Alias> getAlias() {
            return this.alias;
        }

        public static final class Builder {
            private java.util.List < Alias> alias; 

            /**
             * Alias.
             */
            public Builder alias(java.util.List < Alias> alias) {
                this.alias = alias;
                return this;
            }

            public Aliases build() {
                return new Aliases(this);
            } 

        } 

    }
}
