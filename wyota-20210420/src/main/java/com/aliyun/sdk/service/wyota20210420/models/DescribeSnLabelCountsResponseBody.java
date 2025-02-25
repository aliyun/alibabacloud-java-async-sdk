// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSnLabelCountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnLabelCountsResponseBody</p>
 */
public class DescribeSnLabelCountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSnLabelCountsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnLabelCountsResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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

        public DescribeSnLabelCountsResponseBody build() {
            return new DescribeSnLabelCountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnLabelCountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnLabelCountsResponseBody</p>
     */
    public static class LabelCountDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private LabelCountDTOList(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelCountDTOList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String count; 
            private String label; 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public LabelCountDTOList build() {
                return new LabelCountDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnLabelCountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnLabelCountsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelCountDTOList")
        private java.util.List < LabelCountDTOList> labelCountDTOList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.labelCountDTOList = builder.labelCountDTOList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return labelCountDTOList
         */
        public java.util.List < LabelCountDTOList> getLabelCountDTOList() {
            return this.labelCountDTOList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < LabelCountDTOList> labelCountDTOList; 
            private Integer totalCount; 

            /**
             * LabelCountDTOList.
             */
            public Builder labelCountDTOList(java.util.List < LabelCountDTOList> labelCountDTOList) {
                this.labelCountDTOList = labelCountDTOList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
