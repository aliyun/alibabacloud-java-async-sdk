// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link MoveIpRequest} extends {@link RequestModel}
 *
 * <p>MoveIpRequest</p>
 */
public class MoveIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpList")
    private String ipList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    private MoveIpRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipList = builder.ipList;
        this.regionId = builder.regionId;
        this.sourceInstanceId = builder.sourceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveIpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public static final class Builder extends Request.Builder<MoveIpRequest, Builder> {
        private String instanceId; 
        private String ipList; 
        private String regionId; 
        private String sourceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(MoveIpRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipList = request.ipList;
            this.regionId = request.regionId;
            this.sourceInstanceId = request.sourceInstanceId;
        } 

        /**
         * <p>The ID of the destination Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ddos_originpre_public_cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of IP addresses to migrate to an Anti-DDoS Origin instance for protection. The list is represented as a character string in JSON array format. Each element in the JSON array is a structure that contains the following fields:</p>
         * <ul>
         * <li><p><strong>ip</strong>: String type. Required. The IP address to add.</p>
         * </li>
         * <li><p><strong>member_uid</strong>: String type. Optional. The member accounts to which the asset belongs. This field is required only when you add an asset under member accounts. Example: [{&quot;ip&quot;:&quot;121.41.XX.XX&quot;,&quot;member_uid&quot;:&quot;120100811162****&quot;}]</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ip&quot;:&quot;121.41.XX.XX&quot;},{&quot;ip&quot;:&quot;121.42.XX.XX&quot;}]</p>
         */
        public Builder ipList(String ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
            return this;
        }

        /**
         * <p>The region ID of the Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p>You can call the DescribeRegions operation to query all regions supported by Anti-DDoS Origin.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the source Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ddos_originpre_public_cn-***</p>
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        @Override
        public MoveIpRequest build() {
            return new MoveIpRequest(this);
        } 

    } 

}
