// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamsOnlineListRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamsOnlineListRequest</p>
 */
public class DescribeLiveStreamsOnlineListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OnlyStream")
    private String onlyStream;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryType")
    private String queryType;

    @Query
    @NameInMap("StreamName")
    private String streamName;

    @Query
    @NameInMap("StreamType")
    private String streamType;

    private DescribeLiveStreamsOnlineListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.onlyStream = builder.onlyStream;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.streamName = builder.streamName;
        this.streamType = builder.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamsOnlineListRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return onlyStream
     */
    public String getOnlyStream() {
        return this.onlyStream;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return streamType
     */
    public String getStreamType() {
        return this.streamType;
    }

    public static final class Builder extends Request.Builder<DescribeLiveStreamsOnlineListRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String domainName; 
        private String onlyStream; 
        private Long ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String queryType; 
        private String streamName; 
        private String streamType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamsOnlineListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.onlyStream = request.onlyStream;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.streamName = request.streamName;
            this.streamType = request.streamType;
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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
         * OnlyStream.
         */
        public Builder onlyStream(String onlyStream) {
            this.putQueryParameter("OnlyStream", onlyStream);
            this.onlyStream = onlyStream;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * StreamType.
         */
        public Builder streamType(String streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        @Override
        public DescribeLiveStreamsOnlineListRequest build() {
            return new DescribeLiveStreamsOnlineListRequest(this);
        } 

    } 

}
