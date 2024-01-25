// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertSettingRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertSettingRequest</p>
 */
public class DescribeAlertSettingRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Body
    @NameInMap("CustomerName")
    private String customerName;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("SearchKeyword")
    private String searchKeyword;

    @Body
    @NameInMap("SettingStatus")
    private String settingStatus;

    @Body
    @NameInMap("Uid")
    private Long uid;

    private DescribeAlertSettingRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.customerName = builder.customerName;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.searchKeyword = builder.searchKeyword;
        this.settingStatus = builder.settingStatus;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return customerName
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchKeyword
     */
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    /**
     * @return settingStatus
     */
    public String getSettingStatus() {
        return this.settingStatus;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DescribeAlertSettingRequest, Builder> {
        private Long currentPage; 
        private String customerName; 
        private String operaUid; 
        private Long pageSize; 
        private String searchKeyword; 
        private String settingStatus; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertSettingRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.customerName = request.customerName;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.searchKeyword = request.searchKeyword;
            this.settingStatus = request.settingStatus;
            this.uid = request.uid;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * CustomerName.
         */
        public Builder customerName(String customerName) {
            this.putBodyParameter("CustomerName", customerName);
            this.customerName = customerName;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchKeyword.
         */
        public Builder searchKeyword(String searchKeyword) {
            this.putBodyParameter("SearchKeyword", searchKeyword);
            this.searchKeyword = searchKeyword;
            return this;
        }

        /**
         * SettingStatus.
         */
        public Builder settingStatus(String settingStatus) {
            this.putBodyParameter("SettingStatus", settingStatus);
            this.settingStatus = settingStatus;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DescribeAlertSettingRequest build() {
            return new DescribeAlertSettingRequest(this);
        } 

    } 

}
