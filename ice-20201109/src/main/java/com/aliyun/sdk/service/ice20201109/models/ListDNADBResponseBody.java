// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDNADBResponseBody} extends {@link TeaModel}
 *
 * <p>ListDNADBResponseBody</p>
 */
public class ListDNADBResponseBody extends TeaModel {
    @NameInMap("DBList")
    private java.util.List < DBList> DBList;

    @NameInMap("RequestId")
    private String requestId;

    private ListDNADBResponseBody(Builder builder) {
        this.DBList = builder.DBList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDNADBResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBList
     */
    public java.util.List < DBList> getDBList() {
        return this.DBList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DBList> DBList; 
        private String requestId; 

        /**
         * DBList.
         */
        public Builder DBList(java.util.List < DBList> DBList) {
            this.DBList = DBList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDNADBResponseBody build() {
            return new ListDNADBResponseBody(this);
        } 

    } 

    public static class DBList extends TeaModel {
        @NameInMap("DBId")
        private String DBId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Model")
        private Integer model;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        private DBList(Builder builder) {
            this.DBId = builder.DBId;
            this.description = builder.description;
            this.model = builder.model;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBList create() {
            return builder().build();
        }

        /**
         * @return DBId
         */
        public String getDBId() {
            return this.DBId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return model
         */
        public Integer getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String DBId; 
            private String description; 
            private Integer model; 
            private String name; 
            private String status; 

            /**
             * DBId.
             */
            public Builder DBId(String DBId) {
                this.DBId = DBId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(Integer model) {
                this.model = model;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DBList build() {
                return new DBList(this);
            } 

        } 

    }
}
