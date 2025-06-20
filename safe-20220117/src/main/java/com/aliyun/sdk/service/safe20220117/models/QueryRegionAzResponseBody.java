// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link QueryRegionAzResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRegionAzResponseBody</p>
 */
public class QueryRegionAzResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryRegionAzResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRegionAzResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryRegionAzResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public QueryRegionAzResponseBody build() {
            return new QueryRegionAzResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRegionAzResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRegionAzResponseBody</p>
     */
    public static class DataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AzList")
        private java.util.List<String> azList;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        private DataInfo(Builder builder) {
            this.azList = builder.azList;
            this.regionCode = builder.regionCode;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInfo create() {
            return builder().build();
        }

        /**
         * @return azList
         */
        public java.util.List<String> getAzList() {
            return this.azList;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        public static final class Builder {
            private java.util.List<String> azList; 
            private String regionCode; 
            private String regionName; 

            private Builder() {
            } 

            private Builder(DataInfo model) {
                this.azList = model.azList;
                this.regionCode = model.regionCode;
                this.regionName = model.regionName;
            } 

            /**
             * AzList.
             */
            public Builder azList(java.util.List<String> azList) {
                this.azList = azList;
                return this;
            }

            /**
             * RegionCode.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public DataInfo build() {
                return new DataInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRegionAzResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRegionAzResponseBody</p>
     */
    public static class Pagination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        private Pagination(Builder builder) {
            this.limit = builder.limit;
            this.page = builder.page;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        public static final class Builder {
            private Integer limit; 
            private Integer page; 

            private Builder() {
            } 

            private Builder(Pagination model) {
                this.limit = model.limit;
                this.page = model.page;
            } 

            /**
             * Limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRegionAzResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRegionAzResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataInfo")
        private java.util.List<DataInfo> dataInfo;

        @com.aliyun.core.annotation.NameInMap("Pagination")
        private Pagination pagination;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.dataInfo = builder.dataInfo;
            this.pagination = builder.pagination;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataInfo
         */
        public java.util.List<DataInfo> getDataInfo() {
            return this.dataInfo;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DataInfo> dataInfo; 
            private Pagination pagination; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataInfo = model.dataInfo;
                this.pagination = model.pagination;
                this.total = model.total;
            } 

            /**
             * DataInfo.
             */
            public Builder dataInfo(java.util.List<DataInfo> dataInfo) {
                this.dataInfo = dataInfo;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
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
