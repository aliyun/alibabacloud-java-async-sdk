// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddressBookRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddressBookRequest</p>
 */
public class DescribeAddressBookRequest extends Request {
    @Query
    @NameInMap("ContainPort")
    private String containPort;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private String currentPage;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Query")
    private String query;

    private DescribeAddressBookRequest(Builder builder) {
        super(builder);
        this.containPort = builder.containPort;
        this.currentPage = builder.currentPage;
        this.groupType = builder.groupType;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddressBookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containPort
     */
    public String getContainPort() {
        return this.containPort;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
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
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<DescribeAddressBookRequest, Builder> {
        private String containPort; 
        private String currentPage; 
        private String groupType; 
        private String lang; 
        private String pageSize; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAddressBookRequest request) {
            super(request);
            this.containPort = request.containPort;
            this.currentPage = request.currentPage;
            this.groupType = request.groupType;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.query = request.query;
        } 

        /**
         * The port that is included in the address book. This parameter takes effect only when the **GroupType** parameter is set to **port**.
         */
        public Builder containPort(String containPort) {
            this.putQueryParameter("ContainPort", containPort);
            this.containPort = containPort;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The type of the address book. Valid values:
         * <p>
         * 
         * * **ip**: IP address book
         * * **domain**: domain address book
         * * **port**: port address book
         * * **tag**: Elastic Compute Service (ECS) tag-based address book
         * * **allCloud**: cloud service address book
         * * **threat**: threat intelligence address book
         * 
         * > If you do not specify a type, the domain address books and ECS tag-based address books are queried.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * The language of the content within the request. Valid values:
         * <p>
         * 
         * * **zh**: Chinese (default)
         * * **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 10. Maximum value: 50.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The query condition that is used to search for the address book.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public DescribeAddressBookRequest build() {
            return new DescribeAddressBookRequest(this);
        } 

    } 

}
