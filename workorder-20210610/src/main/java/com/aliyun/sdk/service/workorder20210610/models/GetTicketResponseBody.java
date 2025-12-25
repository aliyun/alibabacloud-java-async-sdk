// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

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
 * {@link GetTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetTicketResponseBody</p>
 */
public class GetTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetTicketResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketResponseBody create() {
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
    public Integer getCode() {
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetTicketResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The return code of the request result.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned after the call succeeds.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. If success is set to false, the message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Page number of the paging query parameter</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in a pagination query parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C499BB0F-630D-5BE6-B3EA-5FCD95B85503</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates that the call is normal.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of query results, that is, the total number of my ticket records.</p>
         * 
         * <strong>example:</strong>
         * <p>108</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetTicketResponseBody build() {
            return new GetTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class Severity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Severity(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Severity create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            private Builder() {
            } 

            private Builder(Severity model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * <p>Enumeration Text</p>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>Enumeration</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Severity build() {
                return new Severity(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Status(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * <p>Status Enumeration Text</p>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>State enumeration value</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private Severity severity;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        @com.aliyun.core.annotation.NameInMap("TicketId")
        private String ticketId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.categoryId = builder.categoryId;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.severity = builder.severity;
            this.status = builder.status;
            this.ticketId = builder.ticketId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return severity
         */
        public Severity getSeverity() {
            return this.severity;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        /**
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String categoryId; 
            private Long createTime; 
            private String creatorId; 
            private String description; 
            private Severity severity; 
            private Status status; 
            private String ticketId; 
            private String title; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categoryId = model.categoryId;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.description = model.description;
                this.severity = model.severity;
                this.status = model.status;
                this.ticketId = model.ticketId;
                this.title = model.title;
            } 

            /**
             * <p>The ID of the ticket issue category.</p>
             * 
             * <strong>example:</strong>
             * <p>7161</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The timestamp when the ticket was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1623396736000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The uid of the ticket creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1168025</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The description of the ticket. Only pure text format is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Why ECS renewal failed?</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Urgency enumeration value, 1 for general problem, 2 for urgent problem</p>
             */
            public Builder severity(Severity severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The status of the ticket. The reference values are as follows 1, &quot;assigned&quot;, &quot;Pending Response&quot;, 2, &quot;handling&quot;, &quot;handling&quot;, 3, &quot;wait_feedback&quot;, &quot;Pending feedback&quot;, 4: &quot;feedback&quot;, &quot;Feedback&quot;, 5, &quot;wait_confirm&quot;, &quot;To be confirmed&quot;, 6, &quot;confirmed&quot;, &quot;Completed&quot;</p>
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Work Order Number</p>
             * 
             * <strong>example:</strong>
             * <p>0005PYGCW</p>
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            /**
             * <p>The title of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>Why ECS renewal failed?</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
