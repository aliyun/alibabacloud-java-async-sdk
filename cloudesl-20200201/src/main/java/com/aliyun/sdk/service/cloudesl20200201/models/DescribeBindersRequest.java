// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBindersRequest} extends {@link RequestModel}
 *
 * <p>DescribeBindersRequest</p>
 */
public class DescribeBindersRequest extends Request {
    @Body
    @NameInMap("EslBarCode")
    private String eslBarCode;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("ItemBarCode")
    private String itemBarCode;

    @Body
    @NameInMap("ItemTitle")
    private String itemTitle;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    private DescribeBindersRequest(Builder builder) {
        super(builder);
        this.eslBarCode = builder.eslBarCode;
        this.extraParams = builder.extraParams;
        this.itemBarCode = builder.itemBarCode;
        this.itemTitle = builder.itemTitle;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBindersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eslBarCode
     */
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return itemBarCode
     */
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    /**
     * @return itemTitle
     */
    public String getItemTitle() {
        return this.itemTitle;
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

    public static final class Builder extends Request.Builder<DescribeBindersRequest, Builder> {
        private String eslBarCode; 
        private String extraParams; 
        private String itemBarCode; 
        private String itemTitle; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBindersRequest request) {
            super(request);
            this.eslBarCode = request.eslBarCode;
            this.extraParams = request.extraParams;
            this.itemBarCode = request.itemBarCode;
            this.itemTitle = request.itemTitle;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.storeId = request.storeId;
        } 

        /**
         * EslBarCode.
         */
        public Builder eslBarCode(String eslBarCode) {
            this.putBodyParameter("EslBarCode", eslBarCode);
            this.eslBarCode = eslBarCode;
            return this;
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
         * ItemBarCode.
         */
        public Builder itemBarCode(String itemBarCode) {
            this.putBodyParameter("ItemBarCode", itemBarCode);
            this.itemBarCode = itemBarCode;
            return this;
        }

        /**
         * ItemTitle.
         */
        public Builder itemTitle(String itemTitle) {
            this.putBodyParameter("ItemTitle", itemTitle);
            this.itemTitle = itemTitle;
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

        @Override
        public DescribeBindersRequest build() {
            return new DescribeBindersRequest(this);
        } 

    } 

}
