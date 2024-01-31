// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFaultDiagnosisUserListRequest} extends {@link RequestModel}
 *
 * <p>DescribeFaultDiagnosisUserListRequest</p>
 */
public class DescribeFaultDiagnosisUserListRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("FaultTypes")
    private String faultTypes;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("StartTs")
    @Validation(required = true)
    private Long startTs;

    @Query
    @NameInMap("UserId")
    private String userId;

    private DescribeFaultDiagnosisUserListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.endTs = builder.endTs;
        this.faultTypes = builder.faultTypes;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.startTs = builder.startTs;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultDiagnosisUserListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return faultTypes
     */
    public String getFaultTypes() {
        return this.faultTypes;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeFaultDiagnosisUserListRequest, Builder> {
        private String appId; 
        private String channelId; 
        private Long endTs; 
        private String faultTypes; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Long startTs; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFaultDiagnosisUserListRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.endTs = request.endTs;
            this.faultTypes = request.faultTypes;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.startTs = request.startTs;
            this.userId = request.userId;
        } 

        /**
         * APP ID。
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * EndTs.
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * FaultTypes.
         */
        public Builder faultTypes(String faultTypes) {
            this.putQueryParameter("FaultTypes", faultTypes);
            this.faultTypes = faultTypes;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * StartTs.
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeFaultDiagnosisUserListRequest build() {
            return new DescribeFaultDiagnosisUserListRequest(this);
        } 

    } 

}
