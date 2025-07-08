// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryExportSendRecordListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryExportSendRecordListNewResponseBody</p>
 */
public class QueryExportSendRecordListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QueryExportSendRecordListNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExportSendRecordListNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private List list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QueryExportSendRecordListNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryExportSendRecordListNewResponseBody build() {
            return new QueryExportSendRecordListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryExportSendRecordListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryExportSendRecordListNewResponseBody</p>
     */
    public static class FcFileUpInsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileFeature")
        private String fileFeature;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HandlerStatus")
        private Integer handlerStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private FcFileUpInsResponse(Builder builder) {
            this.fileFeature = builder.fileFeature;
            this.fileUrl = builder.fileUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.handlerStatus = builder.handlerStatus;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcFileUpInsResponse create() {
            return builder().build();
        }

        /**
         * @return fileFeature
         */
        public String getFileFeature() {
            return this.fileFeature;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return handlerStatus
         */
        public Integer getHandlerStatus() {
            return this.handlerStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String fileFeature; 
            private String fileUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer handlerStatus; 
            private Long id; 

            private Builder() {
            } 

            private Builder(FcFileUpInsResponse model) {
                this.fileFeature = model.fileFeature;
                this.fileUrl = model.fileUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.handlerStatus = model.handlerStatus;
                this.id = model.id;
            } 

            /**
             * FileFeature.
             */
            public Builder fileFeature(String fileFeature) {
                this.fileFeature = fileFeature;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HandlerStatus.
             */
            public Builder handlerStatus(Integer handlerStatus) {
                this.handlerStatus = handlerStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public FcFileUpInsResponse build() {
                return new FcFileUpInsResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryExportSendRecordListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryExportSendRecordListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FcFileUpInsResponse")
        private java.util.List<FcFileUpInsResponse> fcFileUpInsResponse;

        private List(Builder builder) {
            this.fcFileUpInsResponse = builder.fcFileUpInsResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return fcFileUpInsResponse
         */
        public java.util.List<FcFileUpInsResponse> getFcFileUpInsResponse() {
            return this.fcFileUpInsResponse;
        }

        public static final class Builder {
            private java.util.List<FcFileUpInsResponse> fcFileUpInsResponse; 

            private Builder() {
            } 

            private Builder(List model) {
                this.fcFileUpInsResponse = model.fcFileUpInsResponse;
            } 

            /**
             * FcFileUpInsResponse.
             */
            public Builder fcFileUpInsResponse(java.util.List<FcFileUpInsResponse> fcFileUpInsResponse) {
                this.fcFileUpInsResponse = fcFileUpInsResponse;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
