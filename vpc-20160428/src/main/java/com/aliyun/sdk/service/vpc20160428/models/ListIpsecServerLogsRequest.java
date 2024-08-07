// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpsecServerLogsRequest} extends {@link RequestModel}
 *
 * <p>ListIpsecServerLogsRequest</p>
 */
public class ListIpsecServerLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private Integer from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpsecServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipsecServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinutePeriod")
    private Integer minutePeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    private Integer to;

    private ListIpsecServerLogsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.ipsecServerId = builder.ipsecServerId;
        this.minutePeriod = builder.minutePeriod;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpsecServerLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return ipsecServerId
     */
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    /**
     * @return minutePeriod
     */
    public Integer getMinutePeriod() {
        return this.minutePeriod;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<ListIpsecServerLogsRequest, Builder> {
        private Integer from; 
        private String ipsecServerId; 
        private Integer minutePeriod; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Integer to; 

        private Builder() {
            super();
        } 

        private Builder(ListIpsecServerLogsRequest request) {
            super(request);
            this.from = request.from;
            this.ipsecServerId = request.ipsecServerId;
            this.minutePeriod = request.minutePeriod;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.to = request.to;
        } 

        /**
         * The beginning of the time range to query. The value must be a UNIX timestamp. For example, 1671003744 specifies 15:42:24 (UTC+8) on December 14, 2022.
         * <p>
         * 
         * >  If you specify **From**, you must also specify **To** or **MinutePeriod**.
         */
        public Builder from(Integer from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The ID of the IPsec server.
         */
        public Builder ipsecServerId(String ipsecServerId) {
            this.putQueryParameter("IpsecServerId", ipsecServerId);
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * The interval at which log data is queried. Valid values: **1** to **10**. Unit: minutes.
         * <p>
         * 
         * >  If both **From** and **To** are not specified, you must specify **MinutePeriod**.
         */
        public Builder minutePeriod(Integer minutePeriod) {
            this.putQueryParameter("MinutePeriod", minutePeriod);
            this.minutePeriod = minutePeriod;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1** to **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region where the IPsec server is created.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to obtain the region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The end of the time range to query. The value must be a unix timestamp. For example, 1671004344 specifies 15:52:24 (UTC+8) on December 14, 2022.
         * <p>
         * 
         * >  If you specify **To**, you must also specify **From** or **MinutePeriod**.
         */
        public Builder to(Integer to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public ListIpsecServerLogsRequest build() {
            return new ListIpsecServerLogsRequest(this);
        } 

    } 

}
