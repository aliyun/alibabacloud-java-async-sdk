// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSetReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataSetReportResponseBody</p>
 */
public class DescribeDataSetReportResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeDataSetReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSetReportResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeDataSetReportResponseBody build() {
            return new DescribeDataSetReportResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("ActiveItem")
        private Long activeItem;

        @NameInMap("BizDate")
        private Long bizDate;

        @NameInMap("Click")
        private Long click;

        @NameInMap("ClickUser")
        private Long clickUser;

        @NameInMap("Ctr")
        private Float ctr;

        @NameInMap("PerUvBhv")
        private Float perUvBhv;

        @NameInMap("PerUvClick")
        private Float perUvClick;

        @NameInMap("Pv")
        private Long pv;

        @NameInMap("Uv")
        private Long uv;

        @NameInMap("UvCtr")
        private Float uvCtr;

        private Detail(Builder builder) {
            this.activeItem = builder.activeItem;
            this.bizDate = builder.bizDate;
            this.click = builder.click;
            this.clickUser = builder.clickUser;
            this.ctr = builder.ctr;
            this.perUvBhv = builder.perUvBhv;
            this.perUvClick = builder.perUvClick;
            this.pv = builder.pv;
            this.uv = builder.uv;
            this.uvCtr = builder.uvCtr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return activeItem
         */
        public Long getActiveItem() {
            return this.activeItem;
        }

        /**
         * @return bizDate
         */
        public Long getBizDate() {
            return this.bizDate;
        }

        /**
         * @return click
         */
        public Long getClick() {
            return this.click;
        }

        /**
         * @return clickUser
         */
        public Long getClickUser() {
            return this.clickUser;
        }

        /**
         * @return ctr
         */
        public Float getCtr() {
            return this.ctr;
        }

        /**
         * @return perUvBhv
         */
        public Float getPerUvBhv() {
            return this.perUvBhv;
        }

        /**
         * @return perUvClick
         */
        public Float getPerUvClick() {
            return this.perUvClick;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        /**
         * @return uv
         */
        public Long getUv() {
            return this.uv;
        }

        /**
         * @return uvCtr
         */
        public Float getUvCtr() {
            return this.uvCtr;
        }

        public static final class Builder {
            private Long activeItem; 
            private Long bizDate; 
            private Long click; 
            private Long clickUser; 
            private Float ctr; 
            private Float perUvBhv; 
            private Float perUvClick; 
            private Long pv; 
            private Long uv; 
            private Float uvCtr; 

            /**
             * ActiveItem.
             */
            public Builder activeItem(Long activeItem) {
                this.activeItem = activeItem;
                return this;
            }

            /**
             * BizDate.
             */
            public Builder bizDate(Long bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * Click.
             */
            public Builder click(Long click) {
                this.click = click;
                return this;
            }

            /**
             * ClickUser.
             */
            public Builder clickUser(Long clickUser) {
                this.clickUser = clickUser;
                return this;
            }

            /**
             * Ctr.
             */
            public Builder ctr(Float ctr) {
                this.ctr = ctr;
                return this;
            }

            /**
             * PerUvBhv.
             */
            public Builder perUvBhv(Float perUvBhv) {
                this.perUvBhv = perUvBhv;
                return this;
            }

            /**
             * PerUvClick.
             */
            public Builder perUvClick(Float perUvClick) {
                this.perUvClick = perUvClick;
                return this;
            }

            /**
             * Pv.
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            /**
             * Uv.
             */
            public Builder uv(Long uv) {
                this.uv = uv;
                return this;
            }

            /**
             * UvCtr.
             */
            public Builder uvCtr(Float uvCtr) {
                this.uvCtr = uvCtr;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class Overall extends TeaModel {
        @NameInMap("BhvCount")
        private Integer bhvCount;

        @NameInMap("BhvLegalRate")
        private Float bhvLegalRate;

        @NameInMap("ItemCompleteRate")
        private Float itemCompleteRate;

        @NameInMap("ItemItemCount")
        private Integer itemItemCount;

        @NameInMap("ItemLegalRate")
        private Float itemLegalRate;

        @NameInMap("ItemLoginRate")
        private Float itemLoginRate;

        @NameInMap("ItemRepetitiveRate")
        private Float itemRepetitiveRate;

        @NameInMap("UserCompleteRate")
        private Float userCompleteRate;

        @NameInMap("UserLegalRate")
        private Float userLegalRate;

        @NameInMap("UserLoginRate")
        private Float userLoginRate;

        @NameInMap("UserRepetitiveRate")
        private Float userRepetitiveRate;

        @NameInMap("UserUserCount")
        private Integer userUserCount;

        private Overall(Builder builder) {
            this.bhvCount = builder.bhvCount;
            this.bhvLegalRate = builder.bhvLegalRate;
            this.itemCompleteRate = builder.itemCompleteRate;
            this.itemItemCount = builder.itemItemCount;
            this.itemLegalRate = builder.itemLegalRate;
            this.itemLoginRate = builder.itemLoginRate;
            this.itemRepetitiveRate = builder.itemRepetitiveRate;
            this.userCompleteRate = builder.userCompleteRate;
            this.userLegalRate = builder.userLegalRate;
            this.userLoginRate = builder.userLoginRate;
            this.userRepetitiveRate = builder.userRepetitiveRate;
            this.userUserCount = builder.userUserCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Overall create() {
            return builder().build();
        }

        /**
         * @return bhvCount
         */
        public Integer getBhvCount() {
            return this.bhvCount;
        }

        /**
         * @return bhvLegalRate
         */
        public Float getBhvLegalRate() {
            return this.bhvLegalRate;
        }

        /**
         * @return itemCompleteRate
         */
        public Float getItemCompleteRate() {
            return this.itemCompleteRate;
        }

        /**
         * @return itemItemCount
         */
        public Integer getItemItemCount() {
            return this.itemItemCount;
        }

        /**
         * @return itemLegalRate
         */
        public Float getItemLegalRate() {
            return this.itemLegalRate;
        }

        /**
         * @return itemLoginRate
         */
        public Float getItemLoginRate() {
            return this.itemLoginRate;
        }

        /**
         * @return itemRepetitiveRate
         */
        public Float getItemRepetitiveRate() {
            return this.itemRepetitiveRate;
        }

        /**
         * @return userCompleteRate
         */
        public Float getUserCompleteRate() {
            return this.userCompleteRate;
        }

        /**
         * @return userLegalRate
         */
        public Float getUserLegalRate() {
            return this.userLegalRate;
        }

        /**
         * @return userLoginRate
         */
        public Float getUserLoginRate() {
            return this.userLoginRate;
        }

        /**
         * @return userRepetitiveRate
         */
        public Float getUserRepetitiveRate() {
            return this.userRepetitiveRate;
        }

        /**
         * @return userUserCount
         */
        public Integer getUserUserCount() {
            return this.userUserCount;
        }

        public static final class Builder {
            private Integer bhvCount; 
            private Float bhvLegalRate; 
            private Float itemCompleteRate; 
            private Integer itemItemCount; 
            private Float itemLegalRate; 
            private Float itemLoginRate; 
            private Float itemRepetitiveRate; 
            private Float userCompleteRate; 
            private Float userLegalRate; 
            private Float userLoginRate; 
            private Float userRepetitiveRate; 
            private Integer userUserCount; 

            /**
             * BhvCount.
             */
            public Builder bhvCount(Integer bhvCount) {
                this.bhvCount = bhvCount;
                return this;
            }

            /**
             * BhvLegalRate.
             */
            public Builder bhvLegalRate(Float bhvLegalRate) {
                this.bhvLegalRate = bhvLegalRate;
                return this;
            }

            /**
             * ItemCompleteRate.
             */
            public Builder itemCompleteRate(Float itemCompleteRate) {
                this.itemCompleteRate = itemCompleteRate;
                return this;
            }

            /**
             * ItemItemCount.
             */
            public Builder itemItemCount(Integer itemItemCount) {
                this.itemItemCount = itemItemCount;
                return this;
            }

            /**
             * ItemLegalRate.
             */
            public Builder itemLegalRate(Float itemLegalRate) {
                this.itemLegalRate = itemLegalRate;
                return this;
            }

            /**
             * ItemLoginRate.
             */
            public Builder itemLoginRate(Float itemLoginRate) {
                this.itemLoginRate = itemLoginRate;
                return this;
            }

            /**
             * ItemRepetitiveRate.
             */
            public Builder itemRepetitiveRate(Float itemRepetitiveRate) {
                this.itemRepetitiveRate = itemRepetitiveRate;
                return this;
            }

            /**
             * UserCompleteRate.
             */
            public Builder userCompleteRate(Float userCompleteRate) {
                this.userCompleteRate = userCompleteRate;
                return this;
            }

            /**
             * UserLegalRate.
             */
            public Builder userLegalRate(Float userLegalRate) {
                this.userLegalRate = userLegalRate;
                return this;
            }

            /**
             * UserLoginRate.
             */
            public Builder userLoginRate(Float userLoginRate) {
                this.userLoginRate = userLoginRate;
                return this;
            }

            /**
             * UserRepetitiveRate.
             */
            public Builder userRepetitiveRate(Float userRepetitiveRate) {
                this.userRepetitiveRate = userRepetitiveRate;
                return this;
            }

            /**
             * UserUserCount.
             */
            public Builder userUserCount(Integer userUserCount) {
                this.userUserCount = userUserCount;
                return this;
            }

            public Overall build() {
                return new Overall(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < Detail> detail;

        @NameInMap("Overall")
        private Overall overall;

        private Result(Builder builder) {
            this.detail = builder.detail;
            this.overall = builder.overall;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return overall
         */
        public Overall getOverall() {
            return this.overall;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 
            private Overall overall; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Overall.
             */
            public Builder overall(Overall overall) {
                this.overall = overall;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
