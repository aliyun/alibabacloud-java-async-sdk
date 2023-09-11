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
    @NameInMap("ContactIds")
    private String contactIds;

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
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Query
    @NameInMap("Verbose")
    private String verbose;

    private DescribeContactsRequest(Builder builder) {
        super(builder);
        this.contactIds = builder.contactIds;
        this.contactName = builder.contactName;
        this.email = builder.email;
        this.page = builder.page;
        this.phone = builder.phone;
        this.regionId = builder.regionId;
        this.size = builder.size;
        this.verbose = builder.verbose;
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
     * @return contactIds
     */
    public String getContactIds() {
        return this.contactIds;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return verbose
     */
    public String getVerbose() {
        return this.verbose;
    }

    public static final class Builder extends Request.Builder<DescribeContactsRequest, Builder> {
        private String contactIds; 
        private String contactName; 
        private String email; 
        private Long page; 
        private String phone; 
        private String regionId; 
        private Long size; 
        private String verbose; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContactsRequest request) {
            super(request);
            this.contactIds = request.contactIds;
            this.contactName = request.contactName;
            this.email = request.email;
            this.page = request.page;
            this.phone = request.phone;
            this.regionId = request.regionId;
            this.size = request.size;
            this.verbose = request.verbose;
        } 

        /**
         * The ID of the alert contact that you want to query. Separate multiple contact IDs with spaces.
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("ContactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        /**
         * The name of the alert contact.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * The email address of the alert contact.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The mobile number of the alert contact.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of alert contacts to return on each page.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Specifies whether to return redundant information.
         */
        public Builder verbose(String verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        @Override
        public DescribeContactsRequest build() {
            return new DescribeContactsRequest(this);
        } 

    } 

}
