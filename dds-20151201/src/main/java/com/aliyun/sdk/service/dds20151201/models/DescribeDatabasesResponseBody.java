// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabasesResponseBody</p>
 */
public class DescribeDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private Databases databases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databases
     */
    public Databases getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Databases databases; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDatabasesResponseBody model) {
            this.databases = model.databases;
            this.requestId = model.requestId;
        } 

        /**
         * Databases.
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>009D2572-6839-43C0-8D89-44DB46CBA2EA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatabasesResponseBody build() {
            return new DescribeDatabasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabasesResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private java.util.List<String> database;

        private Databases(Builder builder) {
            this.database = builder.database;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public java.util.List<String> getDatabase() {
            return this.database;
        }

        public static final class Builder {
            private java.util.List<String> database; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.database = model.database;
            } 

            /**
             * Database.
             */
            public Builder database(java.util.List<String> database) {
                this.database = database;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
