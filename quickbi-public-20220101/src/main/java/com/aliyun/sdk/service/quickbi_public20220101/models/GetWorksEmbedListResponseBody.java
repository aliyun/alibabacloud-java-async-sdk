// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetWorksEmbedListResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorksEmbedListResponseBody</p>
 */
public class GetWorksEmbedListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetWorksEmbedListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorksEmbedListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetWorksEmbedListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>38C0F*<strong><strong>0-415</strong></strong>9F1-*****422BDB65</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Array of report objects</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Whether the request was successful</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorksEmbedListResponseBody build() {
            return new GetWorksEmbedListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorksEmbedListResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorksEmbedListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmbedTime")
        private String embedTime;

        @com.aliyun.core.annotation.NameInMap("WorksId")
        private String worksId;

        @com.aliyun.core.annotation.NameInMap("WorksName")
        private String worksName;

        @com.aliyun.core.annotation.NameInMap("WorksType")
        private String worksType;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.embedTime = builder.embedTime;
            this.worksId = builder.worksId;
            this.worksName = builder.worksName;
            this.worksType = builder.worksType;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return embedTime
         */
        public String getEmbedTime() {
            return this.embedTime;
        }

        /**
         * @return worksId
         */
        public String getWorksId() {
            return this.worksId;
        }

        /**
         * @return worksName
         */
        public String getWorksName() {
            return this.worksName;
        }

        /**
         * @return worksType
         */
        public String getWorksType() {
            return this.worksType;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String embedTime; 
            private String worksId; 
            private String worksName; 
            private String worksType; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.embedTime = model.embedTime;
                this.worksId = model.worksId;
                this.worksName = model.worksName;
                this.worksType = model.worksType;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>Embed time</p>
             * 
             * <strong>example:</strong>
             * <p>YYYY-mm-DD hh:MM:ss</p>
             */
            public Builder embedTime(String embedTime) {
                this.embedTime = embedTime;
                return this;
            }

            /**
             * <p>Report ID</p>
             * 
             * <strong>example:</strong>
             * <p>897ce25e-<strong><strong>-</strong></strong>-af84-d13c5610****</p>
             */
            public Builder worksId(String worksId) {
                this.worksId = worksId;
                return this;
            }

            /**
             * <p>Report name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder worksName(String worksName) {
                this.worksName = worksName;
                return this;
            }

            /**
             * <p>Report type</p>
             * 
             * <strong>example:</strong>
             * <p>page</p>
             */
            public Builder worksType(String worksType) {
                this.worksType = worksType;
                return this;
            }

            /**
             * <p>Workspace ID</p>
             * 
             * <strong>example:</strong>
             * <p>87c6b145-<strong><strong>-43e1-9426-8f93be23</strong></strong></p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorksEmbedListResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorksEmbedListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Long totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Long totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Long getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long pageNo; 
            private Long pageSize; 
            private Long totalNum; 
            private Long totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.totalNum = model.totalNum;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>Array of reports</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>Number of items per page</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of items</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>Total number of pages</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalPages(Long totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
