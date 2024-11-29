// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The beginning of the time range to query. The value must be a UNIX timestamp. For example, 1671003744 specifies 15:42:24 (UTC+8) on December 14, 2022.</p>
         * <blockquote>
         * <p> If you specify <strong>From</strong>, you must also specify <strong>To</strong> or <strong>MinutePeriod</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1671003744</p>
         */
        public Builder from(Integer from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The ID of the IPsec server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iss-2zei2n5q5zhirfh73****</p>
         */
        public Builder ipsecServerId(String ipsecServerId) {
            this.putQueryParameter("IpsecServerId", ipsecServerId);
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * <p>The interval at which log data is queried. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: minutes.</p>
         * <blockquote>
         * <p> If both <strong>From</strong> and <strong>To</strong> are not specified, you must specify <strong>MinutePeriod</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minutePeriod(Integer minutePeriod) {
            this.putQueryParameter("MinutePeriod", minutePeriod);
            this.minutePeriod = minutePeriod;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region where the IPsec server is created.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value must be a unix timestamp. For example, 1671004344 specifies 15:52:24 (UTC+8) on December 14, 2022.</p>
         * <blockquote>
         * <p> If you specify <strong>To</strong>, you must also specify <strong>From</strong> or <strong>MinutePeriod</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1671004344</p>
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
