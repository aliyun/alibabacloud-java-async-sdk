// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlaEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlaEventListRequest</p>
 */
public class DescribeSlaEventListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeSlaEventListRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ip = builder.ip;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlaEventListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSlaEventListRequest, Builder> {
        private Long endTime; 
        private String ip; 
        private Long page; 
        private Long pageSize; 
        private String region; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlaEventListRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ip = request.ip;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.region = request.region;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         * <p>
         * 
         * >  This UNIX timestamp must indicate a point in time that is accurate to the minute.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The page number.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the service Valid values:
         * <p>
         * 
         * *   **cn**: Anti-DDoS Pro
         * *   **cn-hongkong**: Anti-DDoS Premium
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         * <p>
         * 
         * >  This UNIX timestamp must indicate a point in time that is accurate to the minute.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSlaEventListRequest build() {
            return new DescribeSlaEventListRequest(this);
        } 

    } 

}
