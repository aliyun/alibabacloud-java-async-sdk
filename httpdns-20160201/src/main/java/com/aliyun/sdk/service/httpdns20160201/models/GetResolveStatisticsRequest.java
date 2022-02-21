// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResolveStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetResolveStatisticsRequest</p>
 */
public class GetResolveStatisticsRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Granularity")
    @Validation(required = true)
    private String granularity;

    @Query
    @NameInMap("ProtocolName")
    private String protocolName;

    @Query
    @NameInMap("TimeSpan")
    @Validation(required = true)
    private Integer timeSpan;

    private GetResolveStatisticsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.granularity = builder.granularity;
        this.protocolName = builder.protocolName;
        this.timeSpan = builder.timeSpan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResolveStatisticsRequest create() {
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
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return protocolName
     */
    public String getProtocolName() {
        return this.protocolName;
    }

    /**
     * @return timeSpan
     */
    public Integer getTimeSpan() {
        return this.timeSpan;
    }

    public static final class Builder extends Request.Builder<GetResolveStatisticsRequest, Builder> {
        private String domainName; 
        private String granularity; 
        private String protocolName; 
        private Integer timeSpan; 

        private Builder() {
            super();
        } 

        private Builder(GetResolveStatisticsRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.granularity = response.granularity;
            this.protocolName = response.protocolName;
            this.timeSpan = response.timeSpan;
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
         * Granularity.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * ProtocolName.
         */
        public Builder protocolName(String protocolName) {
            this.putQueryParameter("ProtocolName", protocolName);
            this.protocolName = protocolName;
            return this;
        }

        /**
         * TimeSpan.
         */
        public Builder timeSpan(Integer timeSpan) {
            this.putQueryParameter("TimeSpan", timeSpan);
            this.timeSpan = timeSpan;
            return this;
        }

        @Override
        public GetResolveStatisticsRequest build() {
            return new GetResolveStatisticsRequest(this);
        } 

    } 

}
