// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileProtectEventRequest} extends {@link RequestModel}
 *
 * <p>ListFileProtectEventRequest</p>
 */
public class ListFileProtectEventRequest extends Request {
    @Query
    @NameInMap("AlertLevels")
    private java.util.List < Integer > alertLevels;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    @Validation(maxLength = 100, minLength = 1)
    private String pageSize;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    @Query
    @NameInMap("Status")
    private String status;

    private ListFileProtectEventRequest(Builder builder) {
        super(builder);
        this.alertLevels = builder.alertLevels;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.ruleName = builder.ruleName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertLevels
     */
    public java.util.List < Integer > getAlertLevels() {
        return this.alertLevels;
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
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListFileProtectEventRequest, Builder> {
        private java.util.List < Integer > alertLevels; 
        private Integer currentPage; 
        private String pageSize; 
        private String ruleName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListFileProtectEventRequest request) {
            super(request);
            this.alertLevels = request.alertLevels;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.ruleName = request.ruleName;
            this.status = request.status;
        } 

        /**
         * AlertLevels.
         */
        public Builder alertLevels(java.util.List < Integer > alertLevels) {
            this.putQueryParameter("AlertLevels", alertLevels);
            this.alertLevels = alertLevels;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListFileProtectEventRequest build() {
            return new ListFileProtectEventRequest(this);
        } 

    } 

}
