// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetDedicatedIpWarmUpDetailRequest} extends {@link RequestModel}
 *
 * <p>GetDedicatedIpWarmUpDetailRequest</p>
 */
public class GetDedicatedIpWarmUpDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedIp")
    private String dedicatedIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDayMark")
    private Long endDayMark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Esp")
    private String esp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDayMark")
    private Long startDayMark;

    private GetDedicatedIpWarmUpDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dedicatedIp = builder.dedicatedIp;
        this.endDayMark = builder.endDayMark;
        this.esp = builder.esp;
        this.startDayMark = builder.startDayMark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDedicatedIpWarmUpDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dedicatedIp
     */
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

    /**
     * @return endDayMark
     */
    public Long getEndDayMark() {
        return this.endDayMark;
    }

    /**
     * @return esp
     */
    public String getEsp() {
        return this.esp;
    }

    /**
     * @return startDayMark
     */
    public Long getStartDayMark() {
        return this.startDayMark;
    }

    public static final class Builder extends Request.Builder<GetDedicatedIpWarmUpDetailRequest, Builder> {
        private String regionId; 
        private String dedicatedIp; 
        private Long endDayMark; 
        private String esp; 
        private Long startDayMark; 

        private Builder() {
            super();
        } 

        private Builder(GetDedicatedIpWarmUpDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dedicatedIp = request.dedicatedIp;
            this.endDayMark = request.endDayMark;
            this.esp = request.esp;
            this.startDayMark = request.startDayMark;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DedicatedIp.
         */
        public Builder dedicatedIp(String dedicatedIp) {
            this.putQueryParameter("DedicatedIp", dedicatedIp);
            this.dedicatedIp = dedicatedIp;
            return this;
        }

        /**
         * EndDayMark.
         */
        public Builder endDayMark(Long endDayMark) {
            this.putQueryParameter("EndDayMark", endDayMark);
            this.endDayMark = endDayMark;
            return this;
        }

        /**
         * Esp.
         */
        public Builder esp(String esp) {
            this.putQueryParameter("Esp", esp);
            this.esp = esp;
            return this;
        }

        /**
         * StartDayMark.
         */
        public Builder startDayMark(Long startDayMark) {
            this.putQueryParameter("StartDayMark", startDayMark);
            this.startDayMark = startDayMark;
            return this;
        }

        @Override
        public GetDedicatedIpWarmUpDetailRequest build() {
            return new GetDedicatedIpWarmUpDetailRequest(this);
        } 

    } 

}
