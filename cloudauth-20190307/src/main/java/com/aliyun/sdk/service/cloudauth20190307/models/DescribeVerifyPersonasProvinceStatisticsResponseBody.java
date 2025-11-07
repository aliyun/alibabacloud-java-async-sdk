// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifyPersonasProvinceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyPersonasProvinceStatisticsResponseBody</p>
 */
public class DescribeVerifyPersonasProvinceStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeVerifyPersonasProvinceStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyPersonasProvinceStatisticsResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeVerifyPersonasProvinceStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>D9821F95-CC18-5439-BB1C-21A0FF0C2003</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Query result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVerifyPersonasProvinceStatisticsResponseBody build() {
            return new DescribeVerifyPersonasProvinceStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyPersonasProvinceStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyPersonasProvinceStatisticsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProvinceCnt")
        private Long provinceCnt;

        @com.aliyun.core.annotation.NameInMap("ProvinceName")
        private String provinceName;

        @com.aliyun.core.annotation.NameInMap("ProvinceRate")
        private String provinceRate;

        private Items(Builder builder) {
            this.provinceCnt = builder.provinceCnt;
            this.provinceName = builder.provinceName;
            this.provinceRate = builder.provinceRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return provinceCnt
         */
        public Long getProvinceCnt() {
            return this.provinceCnt;
        }

        /**
         * @return provinceName
         */
        public String getProvinceName() {
            return this.provinceName;
        }

        /**
         * @return provinceRate
         */
        public String getProvinceRate() {
            return this.provinceRate;
        }

        public static final class Builder {
            private Long provinceCnt; 
            private String provinceName; 
            private String provinceRate; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.provinceCnt = model.provinceCnt;
                this.provinceName = model.provinceName;
                this.provinceRate = model.provinceRate;
            } 

            /**
             * <p>Total number of devices in the province.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder provinceCnt(Long provinceCnt) {
                this.provinceCnt = provinceCnt;
                return this;
            }

            /**
             * <p>Province name.</p>
             * 
             * <strong>example:</strong>
             * <p>浙江</p>
             */
            public Builder provinceName(String provinceName) {
                this.provinceName = provinceName;
                return this;
            }

            /**
             * <p>Percentage of the total for this province.</p>
             * 
             * <strong>example:</strong>
             * <p>35.71</p>
             */
            public Builder provinceRate(String provinceRate) {
                this.provinceRate = provinceRate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyPersonasProvinceStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyPersonasProvinceStatisticsResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllUserCnt")
        private Long allUserCnt;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private ResultObject(Builder builder) {
            this.allUserCnt = builder.allUserCnt;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return allUserCnt
         */
        public Long getAllUserCnt() {
            return this.allUserCnt;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private Long allUserCnt; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.allUserCnt = model.allUserCnt;
                this.items = model.items;
            } 

            /**
             * <p>Total number of devices.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder allUserCnt(Long allUserCnt) {
                this.allUserCnt = allUserCnt;
                return this;
            }

            /**
             * <p>Data items.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
