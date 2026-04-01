// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpgradeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeInfoResponseBody</p>
 */
public class UpgradeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private UpgradeInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeInfoResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(UpgradeInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpgradeInfoResponseBody build() {
            return new UpgradeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeInfoResponseBody</p>
     */
    public static class UpgradeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurRepoVersion")
        private String curRepoVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateRepoVersion")
        private String updateRepoVersion;

        @com.aliyun.core.annotation.NameInMap("Upgrade")
        private Boolean upgrade;

        @com.aliyun.core.annotation.NameInMap("curApackVersion")
        private String curApackVersion;

        @com.aliyun.core.annotation.NameInMap("curEsVersion")
        private String curEsVersion;

        @com.aliyun.core.annotation.NameInMap("upgradeApackVersion")
        private String upgradeApackVersion;

        @com.aliyun.core.annotation.NameInMap("upgradeEsVersion")
        private String upgradeEsVersion;

        private UpgradeInfo(Builder builder) {
            this.curRepoVersion = builder.curRepoVersion;
            this.updateRepoVersion = builder.updateRepoVersion;
            this.upgrade = builder.upgrade;
            this.curApackVersion = builder.curApackVersion;
            this.curEsVersion = builder.curEsVersion;
            this.upgradeApackVersion = builder.upgradeApackVersion;
            this.upgradeEsVersion = builder.upgradeEsVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeInfo create() {
            return builder().build();
        }

        /**
         * @return curRepoVersion
         */
        public String getCurRepoVersion() {
            return this.curRepoVersion;
        }

        /**
         * @return updateRepoVersion
         */
        public String getUpdateRepoVersion() {
            return this.updateRepoVersion;
        }

        /**
         * @return upgrade
         */
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        /**
         * @return curApackVersion
         */
        public String getCurApackVersion() {
            return this.curApackVersion;
        }

        /**
         * @return curEsVersion
         */
        public String getCurEsVersion() {
            return this.curEsVersion;
        }

        /**
         * @return upgradeApackVersion
         */
        public String getUpgradeApackVersion() {
            return this.upgradeApackVersion;
        }

        /**
         * @return upgradeEsVersion
         */
        public String getUpgradeEsVersion() {
            return this.upgradeEsVersion;
        }

        public static final class Builder {
            private String curRepoVersion; 
            private String updateRepoVersion; 
            private Boolean upgrade; 
            private String curApackVersion; 
            private String curEsVersion; 
            private String upgradeApackVersion; 
            private String upgradeEsVersion; 

            private Builder() {
            } 

            private Builder(UpgradeInfo model) {
                this.curRepoVersion = model.curRepoVersion;
                this.updateRepoVersion = model.updateRepoVersion;
                this.upgrade = model.upgrade;
                this.curApackVersion = model.curApackVersion;
                this.curEsVersion = model.curEsVersion;
                this.upgradeApackVersion = model.upgradeApackVersion;
                this.upgradeEsVersion = model.upgradeEsVersion;
            } 

            /**
             * CurRepoVersion.
             */
            public Builder curRepoVersion(String curRepoVersion) {
                this.curRepoVersion = curRepoVersion;
                return this;
            }

            /**
             * UpdateRepoVersion.
             */
            public Builder updateRepoVersion(String updateRepoVersion) {
                this.updateRepoVersion = updateRepoVersion;
                return this;
            }

            /**
             * Upgrade.
             */
            public Builder upgrade(Boolean upgrade) {
                this.upgrade = upgrade;
                return this;
            }

            /**
             * curApackVersion.
             */
            public Builder curApackVersion(String curApackVersion) {
                this.curApackVersion = curApackVersion;
                return this;
            }

            /**
             * curEsVersion.
             */
            public Builder curEsVersion(String curEsVersion) {
                this.curEsVersion = curEsVersion;
                return this;
            }

            /**
             * upgradeApackVersion.
             */
            public Builder upgradeApackVersion(String upgradeApackVersion) {
                this.upgradeApackVersion = upgradeApackVersion;
                return this;
            }

            /**
             * upgradeEsVersion.
             */
            public Builder upgradeEsVersion(String upgradeEsVersion) {
                this.upgradeEsVersion = upgradeEsVersion;
                return this;
            }

            public UpgradeInfo build() {
                return new UpgradeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpgradeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>UpgradeInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UpgradeInfo")
        private UpgradeInfo upgradeInfo;

        private Result(Builder builder) {
            this.upgradeInfo = builder.upgradeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return upgradeInfo
         */
        public UpgradeInfo getUpgradeInfo() {
            return this.upgradeInfo;
        }

        public static final class Builder {
            private UpgradeInfo upgradeInfo; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.upgradeInfo = model.upgradeInfo;
            } 

            /**
             * UpgradeInfo.
             */
            public Builder upgradeInfo(UpgradeInfo upgradeInfo) {
                this.upgradeInfo = upgradeInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
