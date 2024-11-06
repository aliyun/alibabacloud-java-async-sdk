// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainIpaBpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainIpaBpsDataRequest</p>
 */
public class DescribeDcdnDomainIpaBpsDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FixTimeGap")
    private String fixTimeGap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspNameEn")
    private String ispNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationNameEn")
    private String locationNameEn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeMerge")
    private String timeMerge;

    private DescribeDcdnDomainIpaBpsDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.fixTimeGap = builder.fixTimeGap;
        this.interval = builder.interval;
        this.ispNameEn = builder.ispNameEn;
        this.locationNameEn = builder.locationNameEn;
        this.startTime = builder.startTime;
        this.timeMerge = builder.timeMerge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainIpaBpsDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fixTimeGap
     */
    public String getFixTimeGap() {
        return this.fixTimeGap;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return ispNameEn
     */
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    /**
     * @return locationNameEn
     */
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeMerge
     */
    public String getTimeMerge() {
        return this.timeMerge;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnDomainIpaBpsDataRequest, Builder> {
        private String domainName; 
        private String endTime; 
        private String fixTimeGap; 
        private String interval; 
        private String ispNameEn; 
        private String locationNameEn; 
        private String startTime; 
        private String timeMerge; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainIpaBpsDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.fixTimeGap = request.fixTimeGap;
            this.interval = request.interval;
            this.ispNameEn = request.ispNameEn;
            this.locationNameEn = request.locationNameEn;
            this.startTime = request.startTime;
            this.timeMerge = request.timeMerge;
        } 

        /**
         * <p>The accelerated domain name.</p>
         * <p>Separate multiple domain names with commas (,). If you leave this parameter empty, all accelerated domain names are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T21:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to implement padding with zeros. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fixTimeGap(String fixTimeGap) {
            this.putQueryParameter("FixTimeGap", fixTimeGap);
            this.fixTimeGap = fixTimeGap;
            return this;
        }

        /**
         * <p>The time granularity of data entries. Unit: seconds.</p>
         * <p>The time granularity varies with the time range specified by <strong>StartTime</strong> and <strong>EndTime</strong>.</p>
         * <ul>
         * <li>If the time range between StartTime and EndTime is less than 3 days, the valid values are <strong>300</strong>, <strong>3600</strong>, and <strong>86400</strong>. If you leave this parameter empty, <strong>300</strong> is used.</li>
         * <li>If the time range between StartTime and EndTime is greater than or equal to 3 days and less than 31 days, the valid values are <strong>3600</strong> and <strong>86400</strong>. Default value: <strong>3600</strong>.</li>
         * <li>If the time range between StartTime and EndTime is 31 days or longer, the valid value is <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The name of the Internet service provider (ISP).</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/207199.html">DescribeDcdnRegionAndIsp</a> operation to query ISPs.</p>
         * 
         * <strong>example:</strong>
         * <p>Unicom</p>
         */
        public Builder ispNameEn(String ispNameEn) {
            this.putQueryParameter("IspNameEn", ispNameEn);
            this.ispNameEn = ispNameEn;
            return this;
        }

        /**
         * <p>The name of the region.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/207199.html">DescribeDcdnRegionAndIsp</a> operation to query regions.</p>
         * 
         * <strong>example:</strong>
         * <p>beijing</p>
         */
        public Builder locationNameEn(String locationNameEn) {
            this.putQueryParameter("LocationNameEn", locationNameEn);
            this.locationNameEn = locationNameEn;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Specifies whether to automatically set the interval. If you set <strong>TimeMerge</strong> to <strong>1</strong>, the value of the <strong>Interval</strong> parameter is automatically assigned based on the <strong>startTime</strong> and <strong>endTime</strong> parameters. You can specify either this parameter or the <strong>Interval</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeMerge(String timeMerge) {
            this.putQueryParameter("TimeMerge", timeMerge);
            this.timeMerge = timeMerge;
            return this;
        }

        @Override
        public DescribeDcdnDomainIpaBpsDataRequest build() {
            return new DescribeDcdnDomainIpaBpsDataRequest(this);
        } 

    } 

}
