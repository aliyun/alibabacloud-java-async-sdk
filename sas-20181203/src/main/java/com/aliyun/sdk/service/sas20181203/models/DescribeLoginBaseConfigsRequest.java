// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoginBaseConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoginBaseConfigsRequest</p>
 */
public class DescribeLoginBaseConfigsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Target")
    private String target;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **5**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The server to which the configuration is applied. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **Target**: the UUID or group ID of the server to add or delete.
         * 
         * > If targetType is set to uuid, the value of Target is the UUID of the server. If targetType is set to groupId, the value of Target is the group ID of the server. If targetType is set to global, the value of Target is a hyphen (-).
         * 
         * *   **targetType**: the type of the server to which the configuration is applied. Valid values:
         * 
         *     *   **uuid**: a server
         *     *   **groupId**: a server group
         *     *   **global**: all servers
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * The logon type of the configuration to query. Valid values:
         * <p>
         * 
         * *   **login\_common_location**: common logon location
         * *   **login\_common_ip**: common logon IP address
         * *   **login\_common_time**: common logon time range
         * *   **login\_common_account**: common logon account
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
