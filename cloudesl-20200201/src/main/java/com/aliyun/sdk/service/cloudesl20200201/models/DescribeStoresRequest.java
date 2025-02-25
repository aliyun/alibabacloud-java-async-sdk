// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoresRequest} extends {@link RequestModel}
 *
 * <p>DescribeStoresRequest</p>
 */
public class DescribeStoresRequest extends Request {
    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("FromDate")
    private String fromDate;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("StoreId")
    private String storeId;

    @Body
    @NameInMap("StoreName")
    private String storeName;

    @Body
    @NameInMap("TemplateVersion")
    private String templateVersion;

    @Body
    @NameInMap("ToDate")
    private String toDate;

    @Body
    @NameInMap("UserStoreCode")
    private String userStoreCode;

    private DescribeStoresRequest(Builder builder) {
        super(builder);
        this.extraParams = builder.extraParams;
        this.fromDate = builder.fromDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storeId = builder.storeId;
        this.storeName = builder.storeName;
        this.templateVersion = builder.templateVersion;
        this.toDate = builder.toDate;
        this.userStoreCode = builder.userStoreCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoresRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return fromDate
     */
    public String getFromDate() {
        return this.fromDate;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return storeName
     */
    public String getStoreName() {
        return this.storeName;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return toDate
     */
    public String getToDate() {
        return this.toDate;
    }

    /**
     * @return userStoreCode
     */
    public String getUserStoreCode() {
        return this.userStoreCode;
    }

    public static final class Builder extends Request.Builder<DescribeStoresRequest, Builder> {
        private String extraParams; 
        private String fromDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String storeId; 
        private String storeName; 
        private String templateVersion; 
        private String toDate; 
        private String userStoreCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStoresRequest request) {
            super(request);
            this.extraParams = request.extraParams;
            this.fromDate = request.fromDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.storeId = request.storeId;
            this.storeName = request.storeName;
            this.templateVersion = request.templateVersion;
            this.toDate = request.toDate;
            this.userStoreCode = request.userStoreCode;
        } 

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * FromDate.
         */
        public Builder fromDate(String fromDate) {
            this.putBodyParameter("FromDate", fromDate);
            this.fromDate = fromDate;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * StoreName.
         */
        public Builder storeName(String storeName) {
            this.putBodyParameter("StoreName", storeName);
            this.storeName = storeName;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putBodyParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * ToDate.
         */
        public Builder toDate(String toDate) {
            this.putBodyParameter("ToDate", toDate);
            this.toDate = toDate;
            return this;
        }

        /**
         * UserStoreCode.
         */
        public Builder userStoreCode(String userStoreCode) {
            this.putBodyParameter("UserStoreCode", userStoreCode);
            this.userStoreCode = userStoreCode;
            return this;
        }

        @Override
        public DescribeStoresRequest build() {
            return new DescribeStoresRequest(this);
        } 

    } 

}
