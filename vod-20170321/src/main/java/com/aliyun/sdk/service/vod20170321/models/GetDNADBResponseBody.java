// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetDNADBResponseBody} extends {@link TeaModel}
 *
 * <p>GetDNADBResponseBody</p>
 */
public class GetDNADBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DNADB")
    private DNADB DNADB;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDNADBResponseBody(Builder builder) {
        this.DNADB = builder.DNADB;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDNADBResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DNADB
     */
    public DNADB getDNADB() {
        return this.DNADB;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DNADB DNADB; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDNADBResponseBody model) {
            this.DNADB = model.DNADB;
            this.requestId = model.requestId;
        } 

        /**
         * DNADB.
         */
        public Builder DNADB(DNADB DNADB) {
            this.DNADB = DNADB;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDNADBResponseBody build() {
            return new GetDNADBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDNADBResponseBody} extends {@link TeaModel}
     *
     * <p>GetDNADBResponseBody</p>
     */
    public static class DNADB extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBDescription")
        private String DBDescription;

        @com.aliyun.core.annotation.NameInMap("DBId")
        private String DBId;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("DBRegion")
        private String DBRegion;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DNADB(Builder builder) {
            this.DBDescription = builder.DBDescription;
            this.DBId = builder.DBId;
            this.DBName = builder.DBName;
            this.DBRegion = builder.DBRegion;
            this.DBType = builder.DBType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DNADB create() {
            return builder().build();
        }

        /**
         * @return DBDescription
         */
        public String getDBDescription() {
            return this.DBDescription;
        }

        /**
         * @return DBId
         */
        public String getDBId() {
            return this.DBId;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return DBRegion
         */
        public String getDBRegion() {
            return this.DBRegion;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String DBDescription; 
            private String DBId; 
            private String DBName; 
            private String DBRegion; 
            private String DBType; 
            private String status; 

            private Builder() {
            } 

            private Builder(DNADB model) {
                this.DBDescription = model.DBDescription;
                this.DBId = model.DBId;
                this.DBName = model.DBName;
                this.DBRegion = model.DBRegion;
                this.DBType = model.DBType;
                this.status = model.status;
            } 

            /**
             * DBDescription.
             */
            public Builder DBDescription(String DBDescription) {
                this.DBDescription = DBDescription;
                return this;
            }

            /**
             * DBId.
             */
            public Builder DBId(String DBId) {
                this.DBId = DBId;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * DBRegion.
             */
            public Builder DBRegion(String DBRegion) {
                this.DBRegion = DBRegion;
                return this;
            }

            /**
             * DBType.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DNADB build() {
                return new DNADB(this);
            } 

        } 

    }
}
