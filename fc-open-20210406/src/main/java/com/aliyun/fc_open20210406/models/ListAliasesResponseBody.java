// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListAliasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliasesResponseBody</p>
 */
public class ListAliasesResponseBody extends TeaModel {
    @NameInMap("aliases")
    private java.util.List < Aliases> aliases;

    @NameInMap("nextToken")
    private String nextToken;


    private ListAliasesResponseBody(Builder builder) {
        this.aliases = builder.aliases;
        this.nextToken = builder.nextToken;
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
    public java.util.List < Aliases> getAliases() {
        return this.aliases;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < Aliases> aliases; 
        private String nextToken; 

        /**
         * <p>别名列表</p>
         */
        public Builder aliases(java.util.List < Aliases> aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * <p>下次查询token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListAliasesResponseBody build() {
            return new ListAliasesResponseBody(this);
        } 

    } 

    public static class Aliases extends TeaModel {
        @NameInMap("additionalVersionWeight")
        private java.util.Map < String, Float > additionalVersionWeight;

        @NameInMap("aliasName")
        private String aliasName;

        @NameInMap("createdTime")
        private String createdTime;

        @NameInMap("description")
        private String description;

        @NameInMap("lastModifiedTime")
        private String lastModifiedTime;

        @NameInMap("versionId")
        private String versionId;


        private Aliases(Builder builder) {
            this.additionalVersionWeight = builder.additionalVersionWeight;
            this.aliasName = builder.aliasName;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aliases create() {
            return builder().build();
        }

        /**
         * @return additionalVersionWeight
         */
        public java.util.Map < String, Float > getAdditionalVersionWeight() {
            return this.additionalVersionWeight;
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lastModifiedTime
         */
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private java.util.Map < String, Float > additionalVersionWeight; 
            private String aliasName; 
            private String createdTime; 
            private String description; 
            private String lastModifiedTime; 
            private String versionId; 

            /**
             * <p>额外版本权重</p>
             */
            public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
                this.additionalVersionWeight = additionalVersionWeight;
                return this;
            }

            /**
             * <p>别名名称</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>创建时间</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>别名描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>上次更新时间</p>
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>版本ID</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Aliases build() {
                return new Aliases(this);
            } 

        } 

    }
}
