// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceRequest</p>
 */
public class GetInstanceRequest extends Request {
    @Query
    @NameInMap("Host")
    @Validation(required = true)
    private String host;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private Integer port;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Sid")
    private String sid;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private GetInstanceRequest(Builder builder) {
        super(builder);
        this.host = builder.host;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.sid = builder.sid;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return this.sid;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetInstanceRequest, Builder> {
        private String host; 
        private Integer port; 
        private String regionId; 
        private String sid; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceRequest response) {
            super(response);
            this.host = response.host;
            this.port = response.port;
            this.regionId = response.regionId;
            this.sid = response.sid;
            this.tid = response.tid;
        } 

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
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
         * Sid.
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetInstanceRequest build() {
            return new GetInstanceRequest(this);
        } 

    } 

}
