// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAddressBookRequest} extends {@link RequestModel}
 *
 * <p>DescribeAddressBookRequest</p>
 */
public class DescribeAddressBookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainPort")
    private String containPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
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
         * <p>The port that is included in the address book. This parameter takes effect only when the <strong>GroupType</strong> parameter is set to <strong>port</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder containPort(String containPort) {
            this.putQueryParameter("ContainPort", containPort);
            this.containPort = containPort;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The type of the address book. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address book</li>
         * <li><strong>domain</strong>: domain address book</li>
         * <li><strong>port</strong>: port address book</li>
         * <li><strong>tag</strong>: Elastic Compute Service (ECS) tag-based address book</li>
         * <li><strong>allCloud</strong>: cloud service address book</li>
         * <li><strong>threat</strong>: threat intelligence address book</li>
         * <li><strong>ipv6</strong>: IPv6 address book<blockquote>
         * <p> If you do not specify a type, the domain address books and ECS tag-based address books are queried.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The language of the content within the request. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Default value: 10. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query condition that is used to search for the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
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
