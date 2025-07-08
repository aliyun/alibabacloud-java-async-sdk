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
 * {@link QueryContactsListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryContactsListNewResponseBody</p>
 */
public class QueryContactsListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QueryContactsListNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryContactsListNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
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
        private java.util.List<List> list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QueryContactsListNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
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

        public QueryContactsListNewResponseBody build() {
            return new QueryContactsListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryContactsListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryContactsListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpenPkgWarning")
        private Integer openPkgWarning;

        @com.aliyun.core.annotation.NameInMap("OpenPreventBrushWarning")
        private Integer openPreventBrushWarning;

        @com.aliyun.core.annotation.NameInMap("OpenSendWarning")
        private Integer openSendWarning;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("ReceiveSignTemplateAuditResult")
        private Integer receiveSignTemplateAuditResult;

        private List(Builder builder) {
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.openPkgWarning = builder.openPkgWarning;
            this.openPreventBrushWarning = builder.openPreventBrushWarning;
            this.openSendWarning = builder.openSendWarning;
            this.phone = builder.phone;
            this.receiveSignTemplateAuditResult = builder.receiveSignTemplateAuditResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return openPkgWarning
         */
        public Integer getOpenPkgWarning() {
            return this.openPkgWarning;
        }

        /**
         * @return openPreventBrushWarning
         */
        public Integer getOpenPreventBrushWarning() {
            return this.openPreventBrushWarning;
        }

        /**
         * @return openSendWarning
         */
        public Integer getOpenSendWarning() {
            return this.openSendWarning;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return receiveSignTemplateAuditResult
         */
        public Integer getReceiveSignTemplateAuditResult() {
            return this.receiveSignTemplateAuditResult;
        }

        public static final class Builder {
            private String email; 
            private Long id; 
            private String name; 
            private Integer openPkgWarning; 
            private Integer openPreventBrushWarning; 
            private Integer openSendWarning; 
            private String phone; 
            private Integer receiveSignTemplateAuditResult; 

            private Builder() {
            } 

            private Builder(List model) {
                this.email = model.email;
                this.id = model.id;
                this.name = model.name;
                this.openPkgWarning = model.openPkgWarning;
                this.openPreventBrushWarning = model.openPreventBrushWarning;
                this.openSendWarning = model.openSendWarning;
                this.phone = model.phone;
                this.receiveSignTemplateAuditResult = model.receiveSignTemplateAuditResult;
            } 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OpenPkgWarning.
             */
            public Builder openPkgWarning(Integer openPkgWarning) {
                this.openPkgWarning = openPkgWarning;
                return this;
            }

            /**
             * OpenPreventBrushWarning.
             */
            public Builder openPreventBrushWarning(Integer openPreventBrushWarning) {
                this.openPreventBrushWarning = openPreventBrushWarning;
                return this;
            }

            /**
             * OpenSendWarning.
             */
            public Builder openSendWarning(Integer openSendWarning) {
                this.openSendWarning = openSendWarning;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * ReceiveSignTemplateAuditResult.
             */
            public Builder receiveSignTemplateAuditResult(Integer receiveSignTemplateAuditResult) {
                this.receiveSignTemplateAuditResult = receiveSignTemplateAuditResult;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
