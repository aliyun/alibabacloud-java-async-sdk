// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuditPageListRequest</p>
 */
public class DescribeAuditPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("auditStatus")
    private String auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    private DescribeAuditPageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.auditStatus = builder.auditStatus;
        this.currentPage = builder.currentPage;
        this.eventCode = builder.eventCode;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditPageListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DescribeAuditPageListRequest, Builder> {
        private String lang; 
        private String auditStatus; 
        private String currentPage; 
        private String eventCode; 
        private String pageSize; 
        private String regId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAuditPageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.auditStatus = request.auditStatus;
            this.currentPage = request.currentPage;
            this.eventCode = request.eventCode;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.ruleName = request.ruleName;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * auditStatus.
         */
        public Builder auditStatus(String auditStatus) {
            this.putQueryParameter("auditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * ruleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DescribeAuditPageListRequest build() {
            return new DescribeAuditPageListRequest(this);
        } 

    } 

}
