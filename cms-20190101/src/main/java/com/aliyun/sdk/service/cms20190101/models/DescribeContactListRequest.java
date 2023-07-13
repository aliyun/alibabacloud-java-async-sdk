// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactListRequest} extends {@link RequestModel}
 *
 * <p>DescribeContactListRequest</p>
 */
public class DescribeContactListRequest extends Request {
    @Query
    @NameInMap("ChanelType")
    private String chanelType;

    @Query
    @NameInMap("ChanelValue")
    private String chanelValue;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private DescribeContactListRequest(Builder builder) {
        super(builder);
        this.chanelType = builder.chanelType;
        this.chanelValue = builder.chanelValue;
        this.contactName = builder.contactName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chanelType
     */
    public String getChanelType() {
        return this.chanelType;
    }

    /**
     * @return chanelValue
     */
    public String getChanelValue() {
        return this.chanelValue;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
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

    public static final class Builder extends Request.Builder<DescribeContactListRequest, Builder> {
        private String chanelType; 
        private String chanelValue; 
        private String contactName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContactListRequest request) {
            super(request);
            this.chanelType = request.chanelType;
            this.chanelValue = request.chanelValue;
            this.contactName = request.contactName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The status of the TradeManager ID.
         * <p>
         * 
         * Valid value: OK. The value OK indicates that the TradeManager ID is valid and can receive alert notifications.
         * 
         * >  This parameter can be returned only on the China site (aliyun.com).
         */
        public Builder chanelType(String chanelType) {
            this.putQueryParameter("ChanelType", chanelType);
            this.chanelType = chanelType;
            return this;
        }

        /**
         * The error message.
         */
        public Builder chanelValue(String chanelValue) {
            this.putQueryParameter("ChanelValue", chanelValue);
            this.chanelValue = chanelValue;
            return this;
        }

        /**
         * The value specified for the alert notification method.
         * <p>
         * 
         * >  This parameter is required only if you set the `ChanelType` parameter to `Mail`.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeContactList**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeContactListRequest build() {
            return new DescribeContactListRequest(this);
        } 

    } 

}
