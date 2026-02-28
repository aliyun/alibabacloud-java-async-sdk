// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListPowerStationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPowerStationResponseBody</p>
 */
public class ListPowerStationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListPowerStationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPowerStationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPowerStationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPowerStationResponseBody build() {
            return new ListPowerStationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPowerStationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPowerStationResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgoInstanceUid")
        private String algoInstanceUid;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PowerStationUid")
        private String powerStationUid;

        @com.aliyun.core.annotation.NameInMap("RatedPower")
        private Integer ratedPower;

        private DataList(Builder builder) {
            this.algoInstanceUid = builder.algoInstanceUid;
            this.description = builder.description;
            this.name = builder.name;
            this.powerStationUid = builder.powerStationUid;
            this.ratedPower = builder.ratedPower;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return algoInstanceUid
         */
        public String getAlgoInstanceUid() {
            return this.algoInstanceUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return powerStationUid
         */
        public String getPowerStationUid() {
            return this.powerStationUid;
        }

        /**
         * @return ratedPower
         */
        public Integer getRatedPower() {
            return this.ratedPower;
        }

        public static final class Builder {
            private String algoInstanceUid; 
            private String description; 
            private String name; 
            private String powerStationUid; 
            private Integer ratedPower; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.algoInstanceUid = model.algoInstanceUid;
                this.description = model.description;
                this.name = model.name;
                this.powerStationUid = model.powerStationUid;
                this.ratedPower = model.ratedPower;
            } 

            /**
             * AlgoInstanceUid.
             */
            public Builder algoInstanceUid(String algoInstanceUid) {
                this.algoInstanceUid = algoInstanceUid;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PowerStationUid.
             */
            public Builder powerStationUid(String powerStationUid) {
                this.powerStationUid = powerStationUid;
                return this;
            }

            /**
             * RatedPower.
             */
            public Builder ratedPower(Integer ratedPower) {
                this.ratedPower = ratedPower;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPowerStationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPowerStationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataList")
        private java.util.List<DataList> dataList;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.dataList = builder.dataList;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
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
        public java.util.List<DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DataList> dataList; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataList = model.dataList;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * DataList.
             */
            public Builder dataList(java.util.List<DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
