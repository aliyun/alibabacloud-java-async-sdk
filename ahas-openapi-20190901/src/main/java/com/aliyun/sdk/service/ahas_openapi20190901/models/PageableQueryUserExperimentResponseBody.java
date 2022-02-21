// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageableQueryUserExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>PageableQueryUserExperimentResponseBody</p>
 */
public class PageableQueryUserExperimentResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("ExperimentList")
    private java.util.List < ExperimentList> experimentList;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Pages")
    private Integer pages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private PageableQueryUserExperimentResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.experimentList = builder.experimentList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.pages = builder.pages;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageableQueryUserExperimentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return experimentList
     */
    public java.util.List < ExperimentList> getExperimentList() {
        return this.experimentList;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pages
     */
    public Integer getPages() {
        return this.pages;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private java.util.List < ExperimentList> experimentList; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageSize; 
        private Integer pages; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ExperimentList.
         */
        public Builder experimentList(java.util.List < ExperimentList> experimentList) {
            this.experimentList = experimentList;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Pages.
         */
        public Builder pages(Integer pages) {
            this.pages = pages;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public PageableQueryUserExperimentResponseBody build() {
            return new PageableQueryUserExperimentResponseBody(this);
        } 

    } 

    public static class ExperimentList extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("ExperimentId")
        private String experimentId;

        @NameInMap("MiniApps")
        private java.util.List < String > miniApps;

        @NameInMap("Name")
        private String name;

        @NameInMap("Permission")
        private Integer permission;

        @NameInMap("Result")
        private String result;

        @NameInMap("State")
        private String state;

        @NameInMap("Tags")
        private java.util.List < String > tags;

        private ExperimentList(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.experimentId = builder.experimentId;
            this.miniApps = builder.miniApps;
            this.name = builder.name;
            this.permission = builder.permission;
            this.result = builder.result;
            this.state = builder.state;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExperimentList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return miniApps
         */
        public java.util.List < String > getMiniApps() {
            return this.miniApps;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return permission
         */
        public Integer getPermission() {
            return this.permission;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long createTime; 
            private String creator; 
            private String experimentId; 
            private java.util.List < String > miniApps; 
            private String name; 
            private Integer permission; 
            private String result; 
            private String state; 
            private java.util.List < String > tags; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * MiniApps.
             */
            public Builder miniApps(java.util.List < String > miniApps) {
                this.miniApps = miniApps;
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
             * Permission.
             */
            public Builder permission(Integer permission) {
                this.permission = permission;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            public ExperimentList build() {
                return new ExperimentList(this);
            } 

        } 

    }
}
