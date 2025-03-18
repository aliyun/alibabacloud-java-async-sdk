// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link QueryAliasesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAliasesResponseBody</p>
 */
public class QueryAliasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliasInfos")
    private AliasInfos aliasInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAliasesResponseBody(Builder builder) {
        this.aliasInfos = builder.aliasInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAliasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasInfos
     */
    public AliasInfos getAliasInfos() {
        return this.aliasInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AliasInfos aliasInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryAliasesResponseBody model) {
            this.aliasInfos = model.aliasInfos;
            this.requestId = model.requestId;
        } 

        /**
         * AliasInfos.
         */
        public Builder aliasInfos(AliasInfos aliasInfos) {
            this.aliasInfos = aliasInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAliasesResponseBody build() {
            return new QueryAliasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAliasesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAliasesResponseBody</p>
     */
    public static class AliasInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        private AliasInfo(Builder builder) {
            this.aliasName = builder.aliasName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliasInfo create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        public static final class Builder {
            private String aliasName; 

            private Builder() {
            } 

            private Builder(AliasInfo model) {
                this.aliasName = model.aliasName;
            } 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            public AliasInfo build() {
                return new AliasInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAliasesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAliasesResponseBody</p>
     */
    public static class AliasInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasInfo")
        private java.util.List<AliasInfo> aliasInfo;

        private AliasInfos(Builder builder) {
            this.aliasInfo = builder.aliasInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliasInfos create() {
            return builder().build();
        }

        /**
         * @return aliasInfo
         */
        public java.util.List<AliasInfo> getAliasInfo() {
            return this.aliasInfo;
        }

        public static final class Builder {
            private java.util.List<AliasInfo> aliasInfo; 

            private Builder() {
            } 

            private Builder(AliasInfos model) {
                this.aliasInfo = model.aliasInfo;
            } 

            /**
             * AliasInfo.
             */
            public Builder aliasInfo(java.util.List<AliasInfo> aliasInfo) {
                this.aliasInfo = aliasInfo;
                return this;
            }

            public AliasInfos build() {
                return new AliasInfos(this);
            } 

        } 

    }
}
