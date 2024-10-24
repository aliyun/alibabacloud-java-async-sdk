// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAutoCcBlacklistRequest} extends {@link RequestModel}
 *
 * <p>DeleteAutoCcBlacklistRequest</p>
 */
public class DeleteAutoCcBlacklistRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Blacklist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blacklist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DeleteAutoCcBlacklistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.blacklist = builder.blacklist;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAutoCcBlacklistRequest create() {
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
     * @return blacklist
     */
    public String getBlacklist() {
        return this.blacklist;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteAutoCcBlacklistRequest, Builder> {
        private String regionId; 
        private String blacklist; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAutoCcBlacklistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.blacklist = request.blacklist;
            this.instanceId = request.instanceId;
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
         * <p>The IP addresses that you want to manage. This parameter is a JSON string. The string contains the following fields:</p>
         * <ul>
         * <li><strong>src</strong>: the IP address. This field is required and must be of the STRING type.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;src&quot;:&quot;198.51.XX.XX&quot;},{&quot;src&quot;:&quot;198.52.XX.XX&quot;}]</p>
         */
        public Builder blacklist(String blacklist) {
            this.putQueryParameter("Blacklist", blacklist);
            this.blacklist = blacklist;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteAutoCcBlacklistRequest build() {
            return new DeleteAutoCcBlacklistRequest(this);
        } 

    } 

}
