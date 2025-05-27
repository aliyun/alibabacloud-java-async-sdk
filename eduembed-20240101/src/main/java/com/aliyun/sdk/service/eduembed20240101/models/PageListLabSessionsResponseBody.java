// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link PageListLabSessionsResponseBody} extends {@link TeaModel}
 *
 * <p>PageListLabSessionsResponseBody</p>
 */
public class PageListLabSessionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LabSessions")
    private java.util.List<LabSessions> labSessions;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private PageListLabSessionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.labSessions = builder.labSessions;
        this.message = builder.message;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageListLabSessionsResponseBody create() {
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
     * @return labSessions
     */
    public java.util.List<LabSessions> getLabSessions() {
        return this.labSessions;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
        private String code; 
        private java.util.List<LabSessions> labSessions; 
        private String message; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(PageListLabSessionsResponseBody model) {
            this.code = model.code;
            this.labSessions = model.labSessions;
            this.message = model.message;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LabSessions.
         */
        public Builder labSessions(java.util.List<LabSessions> labSessions) {
            this.labSessions = labSessions;
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
         * Page.
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public PageListLabSessionsResponseBody build() {
            return new PageListLabSessionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PageListLabSessionsResponseBody} extends {@link TeaModel}
     *
     * <p>PageListLabSessionsResponseBody</p>
     */
    public static class LabSessions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LabId")
        private Long labId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private LabSessions(Builder builder) {
            this.createTime = builder.createTime;
            this.finished = builder.finished;
            this.id = builder.id;
            this.labId = builder.labId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabSessions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return labId
         */
        public Long getLabId() {
            return this.labId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean finished; 
            private String id; 
            private Long labId; 
            private String url; 

            private Builder() {
            } 

            private Builder(LabSessions model) {
                this.createTime = model.createTime;
                this.finished = model.finished;
                this.id = model.id;
                this.labId = model.labId;
                this.url = model.url;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LabId.
             */
            public Builder labId(Long labId) {
                this.labId = labId;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public LabSessions build() {
                return new LabSessions(this);
            } 

        } 

    }
}
