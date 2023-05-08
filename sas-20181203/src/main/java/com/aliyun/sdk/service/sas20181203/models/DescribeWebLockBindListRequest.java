// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockBindListRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebLockBindListRequest</p>
 */
public class DescribeWebLockBindListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeWebLockBindListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockBindListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeWebLockBindListRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String remark; 
        private String sourceIp; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebLockBindListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
        } 

        /**
         * on
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The error code for web tamper proofing. Valid values:
         * <p>
         * 
         * *   **2001**: The Security Center agent is offline.
         * *   **9999**: The connection timed out.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The error message for web tamper proofing. Valid values:
         * <p>
         * 
         * *   **client offline**: The Security Center agent is offline.
         * *   **timeout**: The connection timed out.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the returned page. Pages start from page 1. Default value: 1.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The language of the content within the request and the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The name of the server.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeWebLockBindListRequest build() {
            return new DescribeWebLockBindListRequest(this);
        } 

    } 

}
