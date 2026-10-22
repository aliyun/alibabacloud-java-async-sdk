// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link QueryForOperationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryForOperationResponseBody</p>
 */
public class QueryForOperationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryForOperationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryForOperationResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryForOperationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEE90F8C-EDC2-5394-953B-D07A121612B5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryForOperationResponseBody build() {
            return new QueryForOperationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryForOperationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryForOperationResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private Long applyTime;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("AuditMemo")
        private String auditMemo;

        @com.aliyun.core.annotation.NameInMap("AuditTime")
        private Long auditTime;

        @com.aliyun.core.annotation.NameInMap("Auditor")
        private String auditor;

        @com.aliyun.core.annotation.NameInMap("CustomerUid")
        private String customerUid;

        @com.aliyun.core.annotation.NameInMap("EmailType")
        private String emailType;

        @com.aliyun.core.annotation.NameInMap("HasUnsubscribe")
        private Boolean hasUnsubscribe;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("SendCount")
        private String sendCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UseDesc")
        private String useDesc;

        private List(Builder builder) {
            this.applyTime = builder.applyTime;
            this.assetType = builder.assetType;
            this.auditMemo = builder.auditMemo;
            this.auditTime = builder.auditTime;
            this.auditor = builder.auditor;
            this.customerUid = builder.customerUid;
            this.emailType = builder.emailType;
            this.hasUnsubscribe = builder.hasUnsubscribe;
            this.id = builder.id;
            this.ip = builder.ip;
            this.sendCount = builder.sendCount;
            this.status = builder.status;
            this.useDesc = builder.useDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return applyTime
         */
        public Long getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return auditMemo
         */
        public String getAuditMemo() {
            return this.auditMemo;
        }

        /**
         * @return auditTime
         */
        public Long getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return auditor
         */
        public String getAuditor() {
            return this.auditor;
        }

        /**
         * @return customerUid
         */
        public String getCustomerUid() {
            return this.customerUid;
        }

        /**
         * @return emailType
         */
        public String getEmailType() {
            return this.emailType;
        }

        /**
         * @return hasUnsubscribe
         */
        public Boolean getHasUnsubscribe() {
            return this.hasUnsubscribe;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return sendCount
         */
        public String getSendCount() {
            return this.sendCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return useDesc
         */
        public String getUseDesc() {
            return this.useDesc;
        }

        public static final class Builder {
            private Long applyTime; 
            private String assetType; 
            private String auditMemo; 
            private Long auditTime; 
            private String auditor; 
            private String customerUid; 
            private String emailType; 
            private Boolean hasUnsubscribe; 
            private Long id; 
            private String ip; 
            private String sendCount; 
            private String status; 
            private String useDesc; 

            private Builder() {
            } 

            private Builder(List model) {
                this.applyTime = model.applyTime;
                this.assetType = model.assetType;
                this.auditMemo = model.auditMemo;
                this.auditTime = model.auditTime;
                this.auditor = model.auditor;
                this.customerUid = model.customerUid;
                this.emailType = model.emailType;
                this.hasUnsubscribe = model.hasUnsubscribe;
                this.id = model.id;
                this.ip = model.ip;
                this.sendCount = model.sendCount;
                this.status = model.status;
                this.useDesc = model.useDesc;
            } 

            /**
             * <p>The application time.</p>
             * 
             * <strong>example:</strong>
             * <p>1788873796000</p>
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * <p>The asset type. Valid values:</p>
             * <ul>
             * <li><strong>EIP</strong>: VPC public IP address.</li>
             * <li><strong>SLB</strong>: load balancing.</li>
             * <li><strong>ECS</strong>: Public IP address in the classic network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EIP</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The review remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>agree</p>
             */
            public Builder auditMemo(String auditMemo) {
                this.auditMemo = auditMemo;
                return this;
            }

            /**
             * <p>The review time.</p>
             * 
             * <strong>example:</strong>
             * <p>1791937132000</p>
             */
            public Builder auditTime(Long auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * <p>The reviewer.</p>
             * 
             * <strong>example:</strong>
             * <p>149754</p>
             */
            public Builder auditor(String auditor) {
                this.auditor = auditor;
                return this;
            }

            /**
             * <p>The customer UID.</p>
             * 
             * <strong>example:</strong>
             * <p>1068723216148614</p>
             */
            public Builder customerUid(String customerUid) {
                this.customerUid = customerUid;
                return this;
            }

            /**
             * <p>The type of the sent email.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder emailType(String emailType) {
                this.emailType = emailType;
                return this;
            }

            /**
             * <p>Specifies whether the email contains an unsubscribe option. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasUnsubscribe(Boolean hasUnsubscribe) {
                this.hasUnsubscribe = hasUnsubscribe;
                return this;
            }

            /**
             * <p>The unique ID.</p>
             * 
             * <strong>example:</strong>
             * <p>710864062</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.158.58</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The description of the number of sent emails.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sendCount(String sendCount) {
                this.sendCount = sendCount;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>auditing</strong>: Under review.</li>
             * <li><strong>approved</strong>: Approved.</li>
             * <li><strong>rejected</strong>: Rejected.</li>
             * <li><strong>effective</strong>: Effective.</li>
             * <li><strong>ineffective</strong>: Ineffective.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder useDesc(String useDesc) {
                this.useDesc = useDesc;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryForOperationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryForOperationResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The page number from which the query results are displayed.</p>
             * <blockquote>
             * <p>Default value: 1, which indicates that the query results are displayed from the first page.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries to return on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryForOperationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryForOperationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
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
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private PageInfo pageInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageInfo = model.pageInfo;
            } 

            /**
             * <p>The event data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The pagination information.</p>
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
