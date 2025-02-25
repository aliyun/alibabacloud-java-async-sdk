// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHuYaTranscodeByDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeHuYaTranscodeByDomainRequest</p>
 */
public class DescribeHuYaTranscodeByDomainRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    private String businessType;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeHuYaTranscodeByDomainRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHuYaTranscodeByDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeHuYaTranscodeByDomainRequest, Builder> {
        private String businessType; 
        private String domain; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHuYaTranscodeByDomainRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeHuYaTranscodeByDomainRequest build() {
            return new DescribeHuYaTranscodeByDomainRequest(this);
        } 

    } 

}
