// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardResponseBody</p>
 */
public class ListDashboardResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListDashboardResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardResponseBody create() {
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

        public ListDashboardResponseBody build() {
            return new ListDashboardResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
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

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("TraceId")
        private String traceId;

        @NameInMap("Uv")
        private Long uv;

        @NameInMap("UvCtr")
        private Float uvCtr;

        private List(Builder builder) {
            this.activeItem = builder.activeItem;
            this.bizDate = builder.bizDate;
            this.click = builder.click;
            this.clickUser = builder.clickUser;
            this.ctr = builder.ctr;
            this.perUvBhv = builder.perUvBhv;
            this.perUvClick = builder.perUvClick;
            this.pv = builder.pv;
            this.sceneId = builder.sceneId;
            this.traceId = builder.traceId;
            this.uv = builder.uv;
            this.uvCtr = builder.uvCtr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
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
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
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
            private String sceneId; 
            private String traceId; 
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
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
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

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Num")
        private Integer num;

        private Result(Builder builder) {
            this.list = builder.list;
            this.num = builder.num;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return num
         */
        public Integer getNum() {
            return this.num;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer num; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Num.
             */
            public Builder num(Integer num) {
                this.num = num;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
