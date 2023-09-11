// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertContactRequest} extends {@link RequestModel}
 *
 * <p>SearchAlertContactRequest</p>
 */
public class SearchAlertContactRequest extends Request {
    @Query
    @NameInMap("ContactIds")
    private String contactIds;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("Phone")
    private String phone;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SearchAlertContactRequest(Builder builder) {
        super(builder);
        this.contactIds = builder.contactIds;
        this.contactName = builder.contactName;
        this.currentPage = builder.currentPage;
        this.email = builder.email;
        this.pageSize = builder.pageSize;
        this.phone = builder.phone;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertContactRequest create() {
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
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<SearchAlertContactRequest, Builder> {
        private String contactIds; 
        private String contactName; 
        private String currentPage; 
        private String email; 
        private String pageSize; 
        private String phone; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SearchAlertContactRequest request) {
            super(request);
            this.contactIds = request.contactIds;
            this.contactName = request.contactName;
            this.currentPage = request.currentPage;
            this.email = request.email;
            this.pageSize = request.pageSize;
            this.phone = request.phone;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the alert contact.
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
         * The number of the page to return.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * The number of entries to return on each page.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * The ID of the region. Set the value to `cn-hangzhou`.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SearchAlertContactRequest build() {
            return new SearchAlertContactRequest(this);
        } 

    } 

}
