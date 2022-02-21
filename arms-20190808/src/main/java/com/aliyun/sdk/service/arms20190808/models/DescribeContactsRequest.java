// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContactsRequest</p>
 */
public class DescribeContactsRequest extends Request {
    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("Phone")
    private String phone;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    private DescribeContactsRequest(Builder builder) {
        super(builder);
        this.contactName = builder.contactName;
        this.email = builder.email;
        this.page = builder.page;
        this.phone = builder.phone;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<DescribeContactsRequest, Builder> {
        private String contactName; 
        private String email; 
        private Long page; 
        private String phone; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContactsRequest response) {
            super(response);
            this.contactName = response.contactName;
            this.email = response.email;
            this.page = response.page;
            this.phone = response.phone;
            this.size = response.size;
        } 

        /**
         * 告警联系人名称
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * 告警联系人邮箱
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * 告警联系人手机号码
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public DescribeContactsRequest build() {
            return new DescribeContactsRequest(this);
        } 

    } 

}
