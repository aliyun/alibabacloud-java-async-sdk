// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceRequest</p>
 */
public class GetInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sid")
    private String sid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private GetInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.host = builder.host;
        this.port = builder.port;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String host; 
        private Integer port; 
        private String sid; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.host = request.host;
            this.port = request.port;
            this.sid = request.sid;
            this.tid = request.tid;
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
         * <p>The endpoint of the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to obtain the endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.17.XXX.XXX</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>The port number that is used to connect to the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to obtain the port number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The system ID (SID) of the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to obtain the SID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2***</p>
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
