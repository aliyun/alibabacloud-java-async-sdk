// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseRequest} extends {@link RequestModel}
 *
 * <p>GetDatabaseRequest</p>
 */
public class GetDatabaseRequest extends Request {
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
    @NameInMap("SchemaName")
    @Validation(required = true)
    private String schemaName;

    @Query
    @NameInMap("Sid")
    private String sid;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private GetDatabaseRequest(Builder builder) {
        super(builder);
        this.host = builder.host;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.schemaName = builder.schemaName;
        this.sid = builder.sid;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseRequest create() {
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
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
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

    public static final class Builder extends Request.Builder<GetDatabaseRequest, Builder> {
        private String host; 
        private Integer port; 
        private String regionId; 
        private String schemaName; 
        private String sid; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetDatabaseRequest response) {
            super(response);
            this.host = response.host;
            this.port = response.port;
            this.regionId = response.regionId;
            this.schemaName = response.schemaName;
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
         * SchemaName.
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
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
        public GetDatabaseRequest build() {
            return new GetDatabaseRequest(this);
        } 

    } 

}
