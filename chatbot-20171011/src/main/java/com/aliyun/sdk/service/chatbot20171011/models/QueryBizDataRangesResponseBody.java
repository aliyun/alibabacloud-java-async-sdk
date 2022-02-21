// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBizDataRangesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBizDataRangesResponseBody</p>
 */
public class QueryBizDataRangesResponseBody extends TeaModel {
    @NameInMap("BizDataRanges")
    private java.util.List < BizDataRanges> bizDataRanges;

    @NameInMap("RequestId")
    private String requestId;

    private QueryBizDataRangesResponseBody(Builder builder) {
        this.bizDataRanges = builder.bizDataRanges;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBizDataRangesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizDataRanges
     */
    public java.util.List < BizDataRanges> getBizDataRanges() {
        return this.bizDataRanges;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BizDataRanges> bizDataRanges; 
        private String requestId; 

        /**
         * BizDataRanges.
         */
        public Builder bizDataRanges(java.util.List < BizDataRanges> bizDataRanges) {
            this.bizDataRanges = bizDataRanges;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryBizDataRangesResponseBody build() {
            return new QueryBizDataRangesResponseBody(this);
        } 

    } 

    public static class BizDataRanges extends TeaModel {
        @NameInMap("BizDataRangeId")
        private Long bizDataRangeId;

        @NameInMap("DataType")
        private Integer dataType;

        @NameInMap("ManageCode")
        private String manageCode;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentBizDataRangeId")
        private Long parentBizDataRangeId;

        private BizDataRanges(Builder builder) {
            this.bizDataRangeId = builder.bizDataRangeId;
            this.dataType = builder.dataType;
            this.manageCode = builder.manageCode;
            this.name = builder.name;
            this.parentBizDataRangeId = builder.parentBizDataRangeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizDataRanges create() {
            return builder().build();
        }

        /**
         * @return bizDataRangeId
         */
        public Long getBizDataRangeId() {
            return this.bizDataRangeId;
        }

        /**
         * @return dataType
         */
        public Integer getDataType() {
            return this.dataType;
        }

        /**
         * @return manageCode
         */
        public String getManageCode() {
            return this.manageCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentBizDataRangeId
         */
        public Long getParentBizDataRangeId() {
            return this.parentBizDataRangeId;
        }

        public static final class Builder {
            private Long bizDataRangeId; 
            private Integer dataType; 
            private String manageCode; 
            private String name; 
            private Long parentBizDataRangeId; 

            /**
             * BizDataRangeId.
             */
            public Builder bizDataRangeId(Long bizDataRangeId) {
                this.bizDataRangeId = bizDataRangeId;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * ManageCode.
             */
            public Builder manageCode(String manageCode) {
                this.manageCode = manageCode;
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
             * ParentBizDataRangeId.
             */
            public Builder parentBizDataRangeId(Long parentBizDataRangeId) {
                this.parentBizDataRangeId = parentBizDataRangeId;
                return this;
            }

            public BizDataRanges build() {
                return new BizDataRanges(this);
            } 

        } 

    }
}
