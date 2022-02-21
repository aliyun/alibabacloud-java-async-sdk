// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainUsageDataRequest</p>
 */
public class DescribeDomainUsageDataRequest extends Request {
    @Query
    @NameInMap("Area")
    private String area;

    @Query
    @NameInMap("DataProtocol")
    private String dataProtocol;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Field")
    @Validation(required = true)
    private String field;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeDomainUsageDataRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.dataProtocol = builder.dataProtocol;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.field = builder.field;
        this.interval = builder.interval;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainUsageDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return dataProtocol
     */
    public String getDataProtocol() {
        return this.dataProtocol;
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
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDomainUsageDataRequest, Builder> {
        private String area; 
        private String dataProtocol; 
        private String domainName; 
        private String endTime; 
        private String field; 
        private String interval; 
        private Long ownerId; 
        private String startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainUsageDataRequest response) {
            super(response);
            this.area = response.area;
            this.dataProtocol = response.dataProtocol;
            this.domainName = response.domainName;
            this.endTime = response.endTime;
            this.field = response.field;
            this.interval = response.interval;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.type = response.type;
        } 

        /**
         * Area.
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * DataProtocol.
         */
        public Builder dataProtocol(String dataProtocol) {
            this.putQueryParameter("DataProtocol", dataProtocol);
            this.dataProtocol = dataProtocol;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Field.
         */
        public Builder field(String field) {
            this.putQueryParameter("Field", field);
            this.field = field;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDomainUsageDataRequest build() {
            return new DescribeDomainUsageDataRequest(this);
        } 

    } 

}
