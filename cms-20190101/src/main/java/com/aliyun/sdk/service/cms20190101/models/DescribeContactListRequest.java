// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeContactListRequest} extends {@link RequestModel}
 *
 * <p>DescribeContactListRequest</p>
 */
public class DescribeContactListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChanelType")
    private String chanelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChanelValue")
    private String chanelValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
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
         * <p>The alert notification method. Valid values:</p>
         * <ul>
         * <li>Mail: emails</li>
         * <li>DingWebHook: DingTalk chatbots</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Mail</p>
         */
        public Builder chanelType(String chanelType) {
            this.putQueryParameter("ChanelType", chanelType);
            this.chanelType = chanelType;
            return this;
        }

        /**
         * <p>The value specified for the alert notification method.</p>
         * <blockquote>
         * <p> This parameter is required only if you set the <code>ChanelType</code> parameter to <code>Mail</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
         */
        public Builder chanelValue(String chanelValue) {
            this.putQueryParameter("ChanelValue", chanelValue);
            this.chanelValue = chanelValue;
            return this;
        }

        /**
         * <p>The name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
