// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListLegacyQueueEventLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLegacyQueueEventLogsResponseBody</p>
 */
public class ListLegacyQueueEventLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListLegacyQueueEventLogsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A5A8998-41F9-5F85-BFCF-EB2B6E376812</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the invocation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLegacyQueueEventLogsResponseBody build() {
            return new ListLegacyQueueEventLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLegacyQueueEventLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLegacyQueueEventLogsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acid")
        private String acid;

        @com.aliyun.core.annotation.NameInMap("Ani")
        private String ani;

        @com.aliyun.core.annotation.NameInMap("AnswerPhone")
        private String answerPhone;

        @com.aliyun.core.annotation.NameInMap("AnswerTime")
        private Long answerTime;

        @com.aliyun.core.annotation.NameInMap("Cause")
        private String cause;

        @com.aliyun.core.annotation.NameInMap("Dnis")
        private String dnis;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Long queueTime;

        @com.aliyun.core.annotation.NameInMap("StatisticDate")
        private String statisticDate;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("Vq")
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

            private Builder() {
            } 

            private Builder(List model) {
                this.acid = model.acid;
                this.ani = model.ani;
                this.answerPhone = model.answerPhone;
                this.answerTime = model.answerTime;
                this.cause = model.cause;
                this.dnis = model.dnis;
                this.id = model.id;
                this.queueTime = model.queueTime;
                this.statisticDate = model.statisticDate;
                this.tenantId = model.tenantId;
                this.vq = model.vq;
            } 

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>456328****</p>
             */
            public Builder acid(String acid) {
                this.acid = acid;
                return this;
            }

            /**
             * <p>Calling party</p>
             * 
             * <strong>example:</strong>
             * <p>8012****</p>
             */
            public Builder ani(String ani) {
                this.ani = ani;
                return this;
            }

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder answerPhone(String answerPhone) {
                this.answerPhone = answerPhone;
                return this;
            }

            /**
             * <p>Acknowledgement duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder answerTime(Long answerTime) {
                this.answerTime = answerTime;
                return this;
            }

            /**
             * <p>Hang-up reason.</p>
             * 
             * <strong>example:</strong>
             * <p>正常</p>
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * <p>Dialed number.</p>
             * 
             * <strong>example:</strong>
             * <p>1312211****</p>
             */
            public Builder dnis(String dnis) {
                this.dnis = dnis;
                return this;
            }

            /**
             * <p>Primary key</p>
             * 
             * <strong>example:</strong>
             * <p>109160</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Queue duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder queueTime(Long queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * <p>Statistics date.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-03T10:15:30</p>
             */
            public Builder statisticDate(String statisticDate) {
                this.statisticDate = statisticDate;
                return this;
            }

            /**
             * <p>Tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acc3733</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
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
    /**
     * 
     * {@link ListLegacyQueueEventLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLegacyQueueEventLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>List of queue event logs.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number, ranging from 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size, ranging from 1 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
