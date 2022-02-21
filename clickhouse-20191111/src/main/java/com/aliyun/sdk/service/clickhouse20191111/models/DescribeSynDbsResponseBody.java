// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynDbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynDbsResponseBody</p>
 */
public class DescribeSynDbsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SynDbs")
    private java.util.List < SynDbs> synDbs;

    private DescribeSynDbsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.synDbs = builder.synDbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynDbsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return synDbs
     */
    public java.util.List < SynDbs> getSynDbs() {
        return this.synDbs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SynDbs> synDbs; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SynDbs.
         */
        public Builder synDbs(java.util.List < SynDbs> synDbs) {
            this.synDbs = synDbs;
            return this;
        }

        public DescribeSynDbsResponseBody build() {
            return new DescribeSynDbsResponseBody(this);
        } 

    } 

    public static class SynDbs extends TeaModel {
        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("RdsId")
        private String rdsId;

        @NameInMap("RdsPassword")
        private String rdsPassword;

        @NameInMap("RdsUserName")
        private String rdsUserName;

        @NameInMap("SynDb")
        private String synDb;

        @NameInMap("SynStatus")
        private Boolean synStatus;

        private SynDbs(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.rdsId = builder.rdsId;
            this.rdsPassword = builder.rdsPassword;
            this.rdsUserName = builder.rdsUserName;
            this.synDb = builder.synDb;
            this.synStatus = builder.synStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynDbs create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return rdsId
         */
        public String getRdsId() {
            return this.rdsId;
        }

        /**
         * @return rdsPassword
         */
        public String getRdsPassword() {
            return this.rdsPassword;
        }

        /**
         * @return rdsUserName
         */
        public String getRdsUserName() {
            return this.rdsUserName;
        }

        /**
         * @return synDb
         */
        public String getSynDb() {
            return this.synDb;
        }

        /**
         * @return synStatus
         */
        public Boolean getSynStatus() {
            return this.synStatus;
        }

        public static final class Builder {
            private String errorMsg; 
            private String rdsId; 
            private String rdsPassword; 
            private String rdsUserName; 
            private String synDb; 
            private Boolean synStatus; 

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * RdsId.
             */
            public Builder rdsId(String rdsId) {
                this.rdsId = rdsId;
                return this;
            }

            /**
             * RdsPassword.
             */
            public Builder rdsPassword(String rdsPassword) {
                this.rdsPassword = rdsPassword;
                return this;
            }

            /**
             * RdsUserName.
             */
            public Builder rdsUserName(String rdsUserName) {
                this.rdsUserName = rdsUserName;
                return this;
            }

            /**
             * SynDb.
             */
            public Builder synDb(String synDb) {
                this.synDb = synDb;
                return this;
            }

            /**
             * SynStatus.
             */
            public Builder synStatus(Boolean synStatus) {
                this.synStatus = synStatus;
                return this;
            }

            public SynDbs build() {
                return new SynDbs(this);
            } 

        } 

    }
}
