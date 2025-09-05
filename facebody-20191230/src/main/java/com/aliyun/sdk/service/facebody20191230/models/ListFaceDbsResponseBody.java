// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

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
 * {@link ListFaceDbsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFaceDbsResponseBody</p>
 */
public class ListFaceDbsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFaceDbsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaceDbsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFaceDbsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFaceDbsResponseBody build() {
            return new ListFaceDbsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFaceDbsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFaceDbsResponseBody</p>
     */
    public static class DbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DbList(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DbList model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DbList build() {
                return new DbList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFaceDbsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFaceDbsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbList")
        private java.util.List<DbList> dbList;

        private Data(Builder builder) {
            this.dbList = builder.dbList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbList
         */
        public java.util.List<DbList> getDbList() {
            return this.dbList;
        }

        public static final class Builder {
            private java.util.List<DbList> dbList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dbList = model.dbList;
            } 

            /**
             * DbList.
             */
            public Builder dbList(java.util.List<DbList> dbList) {
                this.dbList = dbList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
