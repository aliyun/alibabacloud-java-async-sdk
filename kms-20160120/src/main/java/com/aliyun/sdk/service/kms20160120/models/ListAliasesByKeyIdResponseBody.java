// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link ListAliasesByKeyIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliasesByKeyIdResponseBody</p>
 */
public class ListAliasesByKeyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aliases")
    private Aliases aliases;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAliasesByKeyIdResponseBody(Builder builder) {
        this.aliases = builder.aliases;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliasesByKeyIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListAliasesByKeyIdResponseBody model) {
            this.aliases = model.aliases;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>An array that consists of aliases.</p>
         */
        public Builder aliases(Aliases aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1b57992c-834b-4811-a889-f8bac1ba0353</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned CMKs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAliasesByKeyIdResponseBody build() {
            return new ListAliasesByKeyIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAliasesByKeyIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliasesByKeyIdResponseBody</p>
     */
    public static class Alias extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasArn")
        private String aliasArn;

        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("KeyId")
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

            private Builder() {
            } 

            private Builder(Alias model) {
                this.aliasArn = model.aliasArn;
                this.aliasName = model.aliasName;
                this.keyId = model.keyId;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the alias.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:kms:cn-hangzhou:123456:alias/ExampleAlias1</p>
             */
            public Builder aliasArn(String aliasArn) {
                this.aliasArn = aliasArn;
                return this;
            }

            /**
             * <p>The ID of the alias.</p>
             * 
             * <strong>example:</strong>
             * <p>alias/ExampleAlias1</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The CMK to which an alias is bound.</p>
             * 
             * <strong>example:</strong>
             * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
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
    /**
     * 
     * {@link ListAliasesByKeyIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliasesByKeyIdResponseBody</p>
     */
    public static class Aliases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private java.util.List<Alias> alias;

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
        public java.util.List<Alias> getAlias() {
            return this.alias;
        }

        public static final class Builder {
            private java.util.List<Alias> alias; 

            private Builder() {
            } 

            private Builder(Aliases model) {
                this.alias = model.alias;
            } 

            /**
             * Alias.
             */
            public Builder alias(java.util.List<Alias> alias) {
                this.alias = alias;
                return this;
            }

            public Aliases build() {
                return new Aliases(this);
            } 

        } 

    }
}
