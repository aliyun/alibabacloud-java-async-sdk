// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryStudioAppDomainListOpenResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStudioAppDomainListOpenResponseBody</p>
 */
public class QueryStudioAppDomainListOpenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryStudioAppDomainListOpenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStudioAppDomainListOpenResponseBody create() {
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryStudioAppDomainListOpenResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public QueryStudioAppDomainListOpenResponseBody build() {
            return new QueryStudioAppDomainListOpenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryStudioAppDomainListOpenResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStudioAppDomainListOpenResponseBody</p>
     */
    public static class DomainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("IsBeian")
        private String isBeian;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private DomainInfo(Builder builder) {
            this.appId = builder.appId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.host = builder.host;
            this.id = builder.id;
            this.isBeian = builder.isBeian;
            this.projectId = builder.projectId;
            this.protocol = builder.protocol;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return isBeian
         */
        public String getIsBeian() {
            return this.isBeian;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String appId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String host; 
            private Integer id; 
            private String isBeian; 
            private String projectId; 
            private String protocol; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(DomainInfo model) {
                this.appId = model.appId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.host = model.host;
                this.id = model.id;
                this.isBeian = model.isBeian;
                this.projectId = model.projectId;
                this.protocol = model.protocol;
                this.tenantId = model.tenantId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * IsBeian.
             */
            public Builder isBeian(String isBeian) {
                this.isBeian = isBeian;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryStudioAppDomainListOpenResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStudioAppDomainListOpenResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainInfo")
        private java.util.List<DomainInfo> domainInfo;

        private List(Builder builder) {
            this.domainInfo = builder.domainInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return domainInfo
         */
        public java.util.List<DomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

        public static final class Builder {
            private java.util.List<DomainInfo> domainInfo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.domainInfo = model.domainInfo;
            } 

            /**
             * DomainInfo.
             */
            public Builder domainInfo(java.util.List<DomainInfo> domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryStudioAppDomainListOpenResponseBody} extends {@link TeaModel}
     *
     * <p>QueryStudioAppDomainListOpenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private List list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 
            private Integer totalPage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
                this.totalPage = model.totalPage;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
