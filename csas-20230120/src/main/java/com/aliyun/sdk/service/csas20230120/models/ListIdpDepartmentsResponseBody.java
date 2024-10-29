// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIdpDepartmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdpDepartmentsResponseBody</p>
 */
public class ListIdpDepartmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListIdpDepartmentsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdpDepartmentsResponseBody create() {
        return builder().build();
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

        public ListIdpDepartmentsResponseBody build() {
            return new ListIdpDepartmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIdpDepartmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdpDepartmentsResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdpConfigId")
        private String idpConfigId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DataList(Builder builder) {
            this.id = builder.id;
            this.idpConfigId = builder.idpConfigId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idpConfigId
         */
        public String getIdpConfigId() {
            return this.idpConfigId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String idpConfigId; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdpConfigId.
             */
            public Builder idpConfigId(String idpConfigId) {
                this.idpConfigId = idpConfigId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIdpDepartmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdpDepartmentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataList")
        private java.util.List < DataList> dataList;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Long totalNum;

        private Data(Builder builder) {
            this.dataList = builder.dataList;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataList
         */
        public java.util.List < DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private java.util.List < DataList> dataList; 
            private Long totalNum; 

            /**
             * DataList.
             */
            public Builder dataList(java.util.List < DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
