// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link QueryVmsVirtualNumberRelationByPageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVmsVirtualNumberRelationByPageResponseBody</p>
 */
public class QueryVmsVirtualNumberRelationByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryVmsVirtualNumberRelationByPageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVmsVirtualNumberRelationByPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private String accessDeniedDetail; 
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryVmsVirtualNumberRelationByPageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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

        public QueryVmsVirtualNumberRelationByPageResponseBody build() {
            return new QueryVmsVirtualNumberRelationByPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVmsVirtualNumberRelationByPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVmsVirtualNumberRelationByPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NumberCity")
        private String numberCity;

        @com.aliyun.core.annotation.NameInMap("NumberProvince")
        private String numberProvince;

        @com.aliyun.core.annotation.NameInMap("RealNumber")
        private String realNumber;

        @com.aliyun.core.annotation.NameInMap("State")
        private Long state;

        @com.aliyun.core.annotation.NameInMap("VirtualNumber")
        private String virtualNumber;

        private Data(Builder builder) {
            this.numberCity = builder.numberCity;
            this.numberProvince = builder.numberProvince;
            this.realNumber = builder.realNumber;
            this.state = builder.state;
            this.virtualNumber = builder.virtualNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return numberCity
         */
        public String getNumberCity() {
            return this.numberCity;
        }

        /**
         * @return numberProvince
         */
        public String getNumberProvince() {
            return this.numberProvince;
        }

        /**
         * @return realNumber
         */
        public String getRealNumber() {
            return this.realNumber;
        }

        /**
         * @return state
         */
        public Long getState() {
            return this.state;
        }

        /**
         * @return virtualNumber
         */
        public String getVirtualNumber() {
            return this.virtualNumber;
        }

        public static final class Builder {
            private String numberCity; 
            private String numberProvince; 
            private String realNumber; 
            private Long state; 
            private String virtualNumber; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.numberCity = model.numberCity;
                this.numberProvince = model.numberProvince;
                this.realNumber = model.realNumber;
                this.state = model.state;
                this.virtualNumber = model.virtualNumber;
            } 

            /**
             * <p>号码归属地--城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder numberCity(String numberCity) {
                this.numberCity = numberCity;
                return this;
            }

            /**
             * <p>号码归属地--省</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder numberProvince(String numberProvince) {
                this.numberProvince = numberProvince;
                return this;
            }

            /**
             * <p>真实号码</p>
             * 
             * <strong>example:</strong>
             * <p>131****1234</p>
             */
            public Builder realNumber(String realNumber) {
                this.realNumber = realNumber;
                return this;
            }

            /**
             * <p>状态 1:有效；0:无效；-1:注销</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder state(Long state) {
                this.state = state;
                return this;
            }

            /**
             * <p>虚拟号码</p>
             * 
             * <strong>example:</strong>
             * <p>0571***1234</p>
             */
            public Builder virtualNumber(String virtualNumber) {
                this.virtualNumber = virtualNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVmsVirtualNumberRelationByPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVmsVirtualNumberRelationByPageResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Model(Builder builder) {
            this.data = builder.data;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.data = model.data;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
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

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
