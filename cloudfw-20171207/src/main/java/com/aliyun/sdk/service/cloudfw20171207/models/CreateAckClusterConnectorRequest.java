// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateAckClusterConnectorRequest} extends {@link RequestModel}
 *
 * <p>CreateAckClusterConnectorRequest</p>
 */
public class CreateAckClusterConnectorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryVswitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryVswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryVswitchIp")
    private String primaryVswitchIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVswitchId")
    private String standbyVswitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVswitchIp")
    private String standbyVswitchIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ttl;

    private CreateAckClusterConnectorRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.connectorName = builder.connectorName;
        this.memberUid = builder.memberUid;
        this.primaryVswitchId = builder.primaryVswitchId;
        this.primaryVswitchIp = builder.primaryVswitchIp;
        this.regionNo = builder.regionNo;
        this.standbyVswitchId = builder.standbyVswitchId;
        this.standbyVswitchIp = builder.standbyVswitchIp;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAckClusterConnectorRequest create() {
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
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return primaryVswitchId
     */
    public String getPrimaryVswitchId() {
        return this.primaryVswitchId;
    }

    /**
     * @return primaryVswitchIp
     */
    public String getPrimaryVswitchIp() {
        return this.primaryVswitchIp;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return standbyVswitchId
     */
    public String getStandbyVswitchId() {
        return this.standbyVswitchId;
    }

    /**
     * @return standbyVswitchIp
     */
    public String getStandbyVswitchIp() {
        return this.standbyVswitchIp;
    }

    /**
     * @return ttl
     */
    public String getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<CreateAckClusterConnectorRequest, Builder> {
        private String clusterId; 
        private String connectorName; 
        private String memberUid; 
        private String primaryVswitchId; 
        private String primaryVswitchIp; 
        private String regionNo; 
        private String standbyVswitchId; 
        private String standbyVswitchIp; 
        private String ttl; 

        private Builder() {
            super();
        } 

        private Builder(CreateAckClusterConnectorRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.connectorName = request.connectorName;
            this.memberUid = request.memberUid;
            this.primaryVswitchId = request.primaryVswitchId;
            this.primaryVswitchIp = request.primaryVswitchIp;
            this.regionNo = request.regionNo;
            this.standbyVswitchId = request.standbyVswitchId;
            this.standbyVswitchIp = request.standbyVswitchIp;
            this.ttl = request.ttl;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb0f5640b1b2d404cad6ba21509d7847b</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-cluster-connector-name</p>
         */
        public Builder connectorName(String connectorName) {
            this.putQueryParameter("ConnectorName", connectorName);
            this.connectorName = connectorName;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zerfbbje7dvnbii2****</p>
         */
        public Builder primaryVswitchId(String primaryVswitchId) {
            this.putQueryParameter("PrimaryVswitchId", primaryVswitchId);
            this.primaryVswitchId = primaryVswitchId;
            return this;
        }

        /**
         * PrimaryVswitchIp.
         */
        public Builder primaryVswitchIp(String primaryVswitchIp) {
            this.putQueryParameter("PrimaryVswitchIp", primaryVswitchIp);
            this.primaryVswitchIp = primaryVswitchIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * StandbyVswitchId.
         */
        public Builder standbyVswitchId(String standbyVswitchId) {
            this.putQueryParameter("StandbyVswitchId", standbyVswitchId);
            this.standbyVswitchId = standbyVswitchId;
            return this;
        }

        /**
         * StandbyVswitchIp.
         */
        public Builder standbyVswitchIp(String standbyVswitchIp) {
            this.putQueryParameter("StandbyVswitchIp", standbyVswitchIp);
            this.standbyVswitchIp = standbyVswitchIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ttl(String ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public CreateAckClusterConnectorRequest build() {
            return new CreateAckClusterConnectorRequest(this);
        } 

    } 

}
