// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpsecServerLogsRequest} extends {@link RequestModel}
 *
 * <p>ListIpsecServerLogsRequest</p>
 */
public class ListIpsecServerLogsRequest extends Request {
    @Query
    @NameInMap("From")
    private Integer from;

    @Query
    @NameInMap("IpsecServerId")
    @Validation(required = true)
    private String ipsecServerId;

    @Query
    @NameInMap("MinutePeriod")
    private Integer minutePeriod;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("To")
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
         * From.
         */
        public Builder from(Integer from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * IpsecServerId.
         */
        public Builder ipsecServerId(String ipsecServerId) {
            this.putQueryParameter("IpsecServerId", ipsecServerId);
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * MinutePeriod.
         */
        public Builder minutePeriod(Integer minutePeriod) {
            this.putQueryParameter("MinutePeriod", minutePeriod);
            this.minutePeriod = minutePeriod;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * To.
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
