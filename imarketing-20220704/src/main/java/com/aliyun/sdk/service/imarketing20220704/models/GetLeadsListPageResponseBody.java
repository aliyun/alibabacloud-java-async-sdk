// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLeadsListPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetLeadsListPageResponseBody</p>
 */
public class GetLeadsListPageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetLeadsListPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLeadsListPageResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Integer code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetLeadsListPageResponseBody build() {
            return new GetLeadsListPageResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ComponentId")
        private String componentId;

        @NameInMap("ContentId")
        private Long contentId;

        @NameInMap("CreativeId")
        private Integer creativeId;

        @NameInMap("CreativeName")
        private String creativeName;

        @NameInMap("LeadsDetail")
        private String leadsDetail;

        @NameInMap("SerialId")
        private Long serialId;

        @NameInMap("TaskId")
        private Long taskId;

        private List(Builder builder) {
            this.componentId = builder.componentId;
            this.contentId = builder.contentId;
            this.creativeId = builder.creativeId;
            this.creativeName = builder.creativeName;
            this.leadsDetail = builder.leadsDetail;
            this.serialId = builder.serialId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return contentId
         */
        public Long getContentId() {
            return this.contentId;
        }

        /**
         * @return creativeId
         */
        public Integer getCreativeId() {
            return this.creativeId;
        }

        /**
         * @return creativeName
         */
        public String getCreativeName() {
            return this.creativeName;
        }

        /**
         * @return leadsDetail
         */
        public String getLeadsDetail() {
            return this.leadsDetail;
        }

        /**
         * @return serialId
         */
        public Long getSerialId() {
            return this.serialId;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String componentId; 
            private Long contentId; 
            private Integer creativeId; 
            private String creativeName; 
            private String leadsDetail; 
            private Long serialId; 
            private Long taskId; 

            /**
             * ComponentId.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * ContentId.
             */
            public Builder contentId(Long contentId) {
                this.contentId = contentId;
                return this;
            }

            /**
             * CreativeId.
             */
            public Builder creativeId(Integer creativeId) {
                this.creativeId = creativeId;
                return this;
            }

            /**
             * CreativeName.
             */
            public Builder creativeName(String creativeName) {
                this.creativeName = creativeName;
                return this;
            }

            /**
             * LeadsDetail.
             */
            public Builder leadsDetail(String leadsDetail) {
                this.leadsDetail = leadsDetail;
                return this;
            }

            /**
             * SerialId.
             */
            public Builder serialId(Long serialId) {
                this.serialId = serialId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalNumber")
        private Integer totalNumber;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer totalNumber; 

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
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
             * TotalNumber.
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageInfo")
        private PageInfo pageInfo;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageInfo = builder.pageInfo;
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
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private PageInfo pageInfo; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageInfo.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
