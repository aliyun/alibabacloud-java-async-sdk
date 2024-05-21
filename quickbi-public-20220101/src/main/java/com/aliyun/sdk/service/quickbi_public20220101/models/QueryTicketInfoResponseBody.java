// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTicketInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTicketInfoResponseBody</p>
 */
public class QueryTicketInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryTicketInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTicketInfoResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTicketInfoResponseBody build() {
            return new QueryTicketInfoResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTicket")
        private String accessTicket;

        @com.aliyun.core.annotation.NameInMap("CmptId")
        private String cmptId;

        @com.aliyun.core.annotation.NameInMap("GlobalParam")
        private String globalParam;

        @com.aliyun.core.annotation.NameInMap("InvalidTime")
        private String invalidTime;

        @com.aliyun.core.annotation.NameInMap("MaxTicketNum")
        private Integer maxTicketNum;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("RegisterTime")
        private String registerTime;

        @com.aliyun.core.annotation.NameInMap("UsedTicketNum")
        private Integer usedTicketNum;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WatermarkParam")
        private String watermarkParam;

        @com.aliyun.core.annotation.NameInMap("WorksId")
        private String worksId;

        private Result(Builder builder) {
            this.accessTicket = builder.accessTicket;
            this.cmptId = builder.cmptId;
            this.globalParam = builder.globalParam;
            this.invalidTime = builder.invalidTime;
            this.maxTicketNum = builder.maxTicketNum;
            this.organizationId = builder.organizationId;
            this.registerTime = builder.registerTime;
            this.usedTicketNum = builder.usedTicketNum;
            this.userId = builder.userId;
            this.watermarkParam = builder.watermarkParam;
            this.worksId = builder.worksId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accessTicket
         */
        public String getAccessTicket() {
            return this.accessTicket;
        }

        /**
         * @return cmptId
         */
        public String getCmptId() {
            return this.cmptId;
        }

        /**
         * @return globalParam
         */
        public String getGlobalParam() {
            return this.globalParam;
        }

        /**
         * @return invalidTime
         */
        public String getInvalidTime() {
            return this.invalidTime;
        }

        /**
         * @return maxTicketNum
         */
        public Integer getMaxTicketNum() {
            return this.maxTicketNum;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return registerTime
         */
        public String getRegisterTime() {
            return this.registerTime;
        }

        /**
         * @return usedTicketNum
         */
        public Integer getUsedTicketNum() {
            return this.usedTicketNum;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return watermarkParam
         */
        public String getWatermarkParam() {
            return this.watermarkParam;
        }

        /**
         * @return worksId
         */
        public String getWorksId() {
            return this.worksId;
        }

        public static final class Builder {
            private String accessTicket; 
            private String cmptId; 
            private String globalParam; 
            private String invalidTime; 
            private Integer maxTicketNum; 
            private String organizationId; 
            private String registerTime; 
            private Integer usedTicketNum; 
            private String userId; 
            private String watermarkParam; 
            private String worksId; 

            /**
             * AccessTicket.
             */
            public Builder accessTicket(String accessTicket) {
                this.accessTicket = accessTicket;
                return this;
            }

            /**
             * CmptId.
             */
            public Builder cmptId(String cmptId) {
                this.cmptId = cmptId;
                return this;
            }

            /**
             * GlobalParam.
             */
            public Builder globalParam(String globalParam) {
                this.globalParam = globalParam;
                return this;
            }

            /**
             * InvalidTime.
             */
            public Builder invalidTime(String invalidTime) {
                this.invalidTime = invalidTime;
                return this;
            }

            /**
             * MaxTicketNum.
             */
            public Builder maxTicketNum(Integer maxTicketNum) {
                this.maxTicketNum = maxTicketNum;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * RegisterTime.
             */
            public Builder registerTime(String registerTime) {
                this.registerTime = registerTime;
                return this;
            }

            /**
             * UsedTicketNum.
             */
            public Builder usedTicketNum(Integer usedTicketNum) {
                this.usedTicketNum = usedTicketNum;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WatermarkParam.
             */
            public Builder watermarkParam(String watermarkParam) {
                this.watermarkParam = watermarkParam;
                return this;
            }

            /**
             * WorksId.
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
