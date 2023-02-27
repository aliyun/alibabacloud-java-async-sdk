// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLegacyQueueEventLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLegacyQueueEventLogsResponseBody</p>
 */
public class ListLegacyQueueEventLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListLegacyQueueEventLogsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLegacyQueueEventLogsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ListLegacyQueueEventLogsResponseBody build() {
            return new ListLegacyQueueEventLogsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("Acid")
        private String acid;

        @NameInMap("Ani")
        private String ani;

        @NameInMap("AnswerPhone")
        private String answerPhone;

        @NameInMap("AnswerTime")
        private Long answerTime;

        @NameInMap("Cause")
        private String cause;

        @NameInMap("Dnis")
        private String dnis;

        @NameInMap("Id")
        private Long id;

        @NameInMap("QueueTime")
        private Long queueTime;

        @NameInMap("StatisticDate")
        private String statisticDate;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("Vq")
        private String vq;

        private List(Builder builder) {
            this.acid = builder.acid;
            this.ani = builder.ani;
            this.answerPhone = builder.answerPhone;
            this.answerTime = builder.answerTime;
            this.cause = builder.cause;
            this.dnis = builder.dnis;
            this.id = builder.id;
            this.queueTime = builder.queueTime;
            this.statisticDate = builder.statisticDate;
            this.tenantId = builder.tenantId;
            this.vq = builder.vq;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return acid
         */
        public String getAcid() {
            return this.acid;
        }

        /**
         * @return ani
         */
        public String getAni() {
            return this.ani;
        }

        /**
         * @return answerPhone
         */
        public String getAnswerPhone() {
            return this.answerPhone;
        }

        /**
         * @return answerTime
         */
        public Long getAnswerTime() {
            return this.answerTime;
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return dnis
         */
        public String getDnis() {
            return this.dnis;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return queueTime
         */
        public Long getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return statisticDate
         */
        public String getStatisticDate() {
            return this.statisticDate;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return vq
         */
        public String getVq() {
            return this.vq;
        }

        public static final class Builder {
            private String acid; 
            private String ani; 
            private String answerPhone; 
            private Long answerTime; 
            private String cause; 
            private String dnis; 
            private Long id; 
            private Long queueTime; 
            private String statisticDate; 
            private String tenantId; 
            private String vq; 

            /**
             * Acid.
             */
            public Builder acid(String acid) {
                this.acid = acid;
                return this;
            }

            /**
             * Ani.
             */
            public Builder ani(String ani) {
                this.ani = ani;
                return this;
            }

            /**
             * AnswerPhone.
             */
            public Builder answerPhone(String answerPhone) {
                this.answerPhone = answerPhone;
                return this;
            }

            /**
             * AnswerTime.
             */
            public Builder answerTime(Long answerTime) {
                this.answerTime = answerTime;
                return this;
            }

            /**
             * Cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * Dnis.
             */
            public Builder dnis(String dnis) {
                this.dnis = dnis;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * QueueTime.
             */
            public Builder queueTime(Long queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * StatisticDate.
             */
            public Builder statisticDate(String statisticDate) {
                this.statisticDate = statisticDate;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Vq.
             */
            public Builder vq(String vq) {
                this.vq = vq;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
