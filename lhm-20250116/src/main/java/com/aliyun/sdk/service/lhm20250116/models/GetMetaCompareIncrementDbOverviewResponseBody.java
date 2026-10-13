// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetMetaCompareIncrementDbOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaCompareIncrementDbOverviewResponseBody</p>
 */
public class GetMetaCompareIncrementDbOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMetaCompareIncrementDbOverviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaCompareIncrementDbOverviewResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMetaCompareIncrementDbOverviewResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.success = model.success;
        } 

        /**
         * <p>The list of data returned by the API operation. For the element structure, see the descriptions of the child fields.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The fault message code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed. If the call fails, troubleshoot the issue based on errCode and errMessage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaCompareIncrementDbOverviewResponseBody build() {
            return new GetMetaCompareIncrementDbOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaCompareIncrementDbOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaCompareIncrementDbOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("compareJobId")
        private Long compareJobId;

        @com.aliyun.core.annotation.NameInMap("curVersionTime")
        private String curVersionTime;

        @com.aliyun.core.annotation.NameInMap("diffAddPartitionNum")
        private Long diffAddPartitionNum;

        @com.aliyun.core.annotation.NameInMap("diffAddTableNum")
        private Long diffAddTableNum;

        @com.aliyun.core.annotation.NameInMap("diffDelPartitionNum")
        private Long diffDelPartitionNum;

        @com.aliyun.core.annotation.NameInMap("diffDelTableNum")
        private Long diffDelTableNum;

        @com.aliyun.core.annotation.NameInMap("diffModifyPartitionNum")
        private Long diffModifyPartitionNum;

        @com.aliyun.core.annotation.NameInMap("diffModifyTableNum")
        private Long diffModifyTableNum;

        @com.aliyun.core.annotation.NameInMap("diffPartitionNum")
        private Long diffPartitionNum;

        @com.aliyun.core.annotation.NameInMap("diffTableNum")
        private Long diffTableNum;

        @com.aliyun.core.annotation.NameInMap("prevVersionTime")
        private String prevVersionTime;

        private Data(Builder builder) {
            this.compareJobId = builder.compareJobId;
            this.curVersionTime = builder.curVersionTime;
            this.diffAddPartitionNum = builder.diffAddPartitionNum;
            this.diffAddTableNum = builder.diffAddTableNum;
            this.diffDelPartitionNum = builder.diffDelPartitionNum;
            this.diffDelTableNum = builder.diffDelTableNum;
            this.diffModifyPartitionNum = builder.diffModifyPartitionNum;
            this.diffModifyTableNum = builder.diffModifyTableNum;
            this.diffPartitionNum = builder.diffPartitionNum;
            this.diffTableNum = builder.diffTableNum;
            this.prevVersionTime = builder.prevVersionTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return compareJobId
         */
        public Long getCompareJobId() {
            return this.compareJobId;
        }

        /**
         * @return curVersionTime
         */
        public String getCurVersionTime() {
            return this.curVersionTime;
        }

        /**
         * @return diffAddPartitionNum
         */
        public Long getDiffAddPartitionNum() {
            return this.diffAddPartitionNum;
        }

        /**
         * @return diffAddTableNum
         */
        public Long getDiffAddTableNum() {
            return this.diffAddTableNum;
        }

        /**
         * @return diffDelPartitionNum
         */
        public Long getDiffDelPartitionNum() {
            return this.diffDelPartitionNum;
        }

        /**
         * @return diffDelTableNum
         */
        public Long getDiffDelTableNum() {
            return this.diffDelTableNum;
        }

        /**
         * @return diffModifyPartitionNum
         */
        public Long getDiffModifyPartitionNum() {
            return this.diffModifyPartitionNum;
        }

        /**
         * @return diffModifyTableNum
         */
        public Long getDiffModifyTableNum() {
            return this.diffModifyTableNum;
        }

        /**
         * @return diffPartitionNum
         */
        public Long getDiffPartitionNum() {
            return this.diffPartitionNum;
        }

        /**
         * @return diffTableNum
         */
        public Long getDiffTableNum() {
            return this.diffTableNum;
        }

        /**
         * @return prevVersionTime
         */
        public String getPrevVersionTime() {
            return this.prevVersionTime;
        }

        public static final class Builder {
            private Long compareJobId; 
            private String curVersionTime; 
            private Long diffAddPartitionNum; 
            private Long diffAddTableNum; 
            private Long diffDelPartitionNum; 
            private Long diffDelTableNum; 
            private Long diffModifyPartitionNum; 
            private Long diffModifyTableNum; 
            private Long diffPartitionNum; 
            private Long diffTableNum; 
            private String prevVersionTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.compareJobId = model.compareJobId;
                this.curVersionTime = model.curVersionTime;
                this.diffAddPartitionNum = model.diffAddPartitionNum;
                this.diffAddTableNum = model.diffAddTableNum;
                this.diffDelPartitionNum = model.diffDelPartitionNum;
                this.diffDelTableNum = model.diffDelTableNum;
                this.diffModifyPartitionNum = model.diffModifyPartitionNum;
                this.diffModifyTableNum = model.diffModifyTableNum;
                this.diffPartitionNum = model.diffPartitionNum;
                this.diffTableNum = model.diffTableNum;
                this.prevVersionTime = model.prevVersionTime;
            } 

            /**
             * <p>The unique identifier of the current metadata comparison job.</p>
             * 
             * <strong>example:</strong>
             * <p>100256</p>
             */
            public Builder compareJobId(Long compareJobId) {
                this.compareJobId = compareJobId;
                return this;
            }

            /**
             * <p>The metadata version time corresponding to the current comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-15T10:30:00Z</p>
             */
            public Builder curVersionTime(String curVersionTime) {
                this.curVersionTime = curVersionTime;
                return this;
            }

            /**
             * <p>The number of partitions added compared to the last comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder diffAddPartitionNum(Long diffAddPartitionNum) {
                this.diffAddPartitionNum = diffAddPartitionNum;
                return this;
            }

            /**
             * <p>The number of tables added compared to the last comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder diffAddTableNum(Long diffAddTableNum) {
                this.diffAddTableNum = diffAddTableNum;
                return this;
            }

            /**
             * <p>The number of partitions deleted compared to the last comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder diffDelPartitionNum(Long diffDelPartitionNum) {
                this.diffDelPartitionNum = diffDelPartitionNum;
                return this;
            }

            /**
             * <p>The number of tables deleted compared to the last comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder diffDelTableNum(Long diffDelTableNum) {
                this.diffDelTableNum = diffDelTableNum;
                return this;
            }

            /**
             * <p>The number of partitions whose properties changed compared to the last comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder diffModifyPartitionNum(Long diffModifyPartitionNum) {
                this.diffModifyPartitionNum = diffModifyPartitionNum;
                return this;
            }

            /**
             * <p>The number of tables whose structure underwent schema evolution compared to the last comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder diffModifyTableNum(Long diffModifyTableNum) {
                this.diffModifyTableNum = diffModifyTableNum;
                return this;
            }

            /**
             * <p>The total number of differences at the partition level, which is the sum of the number of added, deleted, and modified partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder diffPartitionNum(Long diffPartitionNum) {
                this.diffPartitionNum = diffPartitionNum;
                return this;
            }

            /**
             * <p>The total number of differences at the table level, which is the sum of the number of added, deleted, and modified tables.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder diffTableNum(Long diffTableNum) {
                this.diffTableNum = diffTableNum;
                return this;
            }

            /**
             * <p>The metadata version time corresponding to the last comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-14T10:30:00Z</p>
             */
            public Builder prevVersionTime(String prevVersionTime) {
                this.prevVersionTime = prevVersionTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
