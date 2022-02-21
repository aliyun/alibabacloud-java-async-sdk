// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchLogRequest} extends {@link RequestModel}
 *
 * <p>SearchLogRequest</p>
 */
public class SearchLogRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("FromTimestamp")
    @Validation(required = true)
    private Integer fromTimestamp;

    @Query
    @NameInMap("HostInnerIp")
    private String hostInnerIp;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("Line")
    @Validation(required = true)
    private Integer line;

    @Query
    @NameInMap("LogstoreName")
    @Validation(required = true)
    private String logstoreName;

    @Query
    @NameInMap("Offset")
    @Validation(required = true)
    private Integer offset;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Reverse")
    @Validation(required = true)
    private Boolean reverse;

    @Query
    @NameInMap("SlsQueryString")
    @Validation(required = true)
    private String slsQueryString;

    @Query
    @NameInMap("ToTimestamp")
    @Validation(required = true)
    private Integer toTimestamp;

    private SearchLogRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.fromTimestamp = builder.fromTimestamp;
        this.hostInnerIp = builder.hostInnerIp;
        this.hostName = builder.hostName;
        this.line = builder.line;
        this.logstoreName = builder.logstoreName;
        this.offset = builder.offset;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.reverse = builder.reverse;
        this.slsQueryString = builder.slsQueryString;
        this.toTimestamp = builder.toTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return fromTimestamp
     */
    public Integer getFromTimestamp() {
        return this.fromTimestamp;
    }

    /**
     * @return hostInnerIp
     */
    public String getHostInnerIp() {
        return this.hostInnerIp;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return line
     */
    public Integer getLine() {
        return this.line;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return slsQueryString
     */
    public String getSlsQueryString() {
        return this.slsQueryString;
    }

    /**
     * @return toTimestamp
     */
    public Integer getToTimestamp() {
        return this.toTimestamp;
    }

    public static final class Builder extends Request.Builder<SearchLogRequest, Builder> {
        private String clusterId; 
        private Integer fromTimestamp; 
        private String hostInnerIp; 
        private String hostName; 
        private Integer line; 
        private String logstoreName; 
        private Integer offset; 
        private String regionId; 
        private Long resourceOwnerId; 
        private Boolean reverse; 
        private String slsQueryString; 
        private Integer toTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(SearchLogRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.fromTimestamp = response.fromTimestamp;
            this.hostInnerIp = response.hostInnerIp;
            this.hostName = response.hostName;
            this.line = response.line;
            this.logstoreName = response.logstoreName;
            this.offset = response.offset;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.reverse = response.reverse;
            this.slsQueryString = response.slsQueryString;
            this.toTimestamp = response.toTimestamp;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * FromTimestamp.
         */
        public Builder fromTimestamp(Integer fromTimestamp) {
            this.putQueryParameter("FromTimestamp", fromTimestamp);
            this.fromTimestamp = fromTimestamp;
            return this;
        }

        /**
         * HostInnerIp.
         */
        public Builder hostInnerIp(String hostInnerIp) {
            this.putQueryParameter("HostInnerIp", hostInnerIp);
            this.hostInnerIp = hostInnerIp;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * Line.
         */
        public Builder line(Integer line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * LogstoreName.
         */
        public Builder logstoreName(String logstoreName) {
            this.putQueryParameter("LogstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * SlsQueryString.
         */
        public Builder slsQueryString(String slsQueryString) {
            this.putQueryParameter("SlsQueryString", slsQueryString);
            this.slsQueryString = slsQueryString;
            return this;
        }

        /**
         * ToTimestamp.
         */
        public Builder toTimestamp(Integer toTimestamp) {
            this.putQueryParameter("ToTimestamp", toTimestamp);
            this.toTimestamp = toTimestamp;
            return this;
        }

        @Override
        public SearchLogRequest build() {
            return new SearchLogRequest(this);
        } 

    } 

}
