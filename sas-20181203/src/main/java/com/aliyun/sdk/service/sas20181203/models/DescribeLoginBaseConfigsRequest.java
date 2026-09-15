// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeLoginBaseConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoginBaseConfigsRequest</p>
 */
public class DescribeLoginBaseConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeLoginBaseConfigsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoginBaseConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeLoginBaseConfigsRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoginBaseConfigsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates that the first page is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Settings for paged query. The number of logon configuration entries to display on each page during paging. Default value: <strong>5</strong>, which indicates that five logon configuration entries are displayed on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The selection mode for the assets on which the policy takes effect. This parameter is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>Target</strong>: the UUID of the server to add or delete, or the ID of the server group.</li>
         * </ul>
         * <blockquote>
         * <p>If the targetType parameter is set to uuid, this parameter specifies the UUID of the server. If the targetType parameter is set to groupId, this parameter specifies the ID of the server group. If the targetType parameter is set to global, this parameter is set to a hyphen (-).</p>
         * </blockquote>
         * <ul>
         * <li><strong>targetType</strong>: the selection mode for the assets on which the policy takes effect. Valid values:<ul>
         * <li><strong>uuid</strong>: queries by individual server.</li>
         * <li><strong>groupId</strong>: queries by server group.</li>
         * <li><strong>global</strong>: queries all servers.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[ {&quot;target&quot;: &quot;inet-7c676676-06fa-442e-90fb-b802e5d6****&quot;, &quot;targetType&quot;: &quot;uuid&quot; } ]</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The type of logon configuration to query. Valid values:</p>
         * <ul>
         * <li><strong>login_common_location</strong>: common logon location.</li>
         * <li><strong>login_common_ip</strong>: common logon IP address.</li>
         * <li><strong>login_common_time</strong>: common logon time.</li>
         * <li><strong>login_common_account</strong>: common logon account.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_location</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeLoginBaseConfigsRequest build() {
            return new DescribeLoginBaseConfigsRequest(this);
        } 

    } 

}
