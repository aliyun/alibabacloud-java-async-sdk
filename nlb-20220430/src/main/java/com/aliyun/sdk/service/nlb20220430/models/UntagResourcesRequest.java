// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link UntagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesRequest</p>
 */
public class UntagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private java.util.List<String> tagKey;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKey
     */
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private java.util.List<String> resourceId; 
        private String resourceType; 
        private java.util.List<String> tagKey; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tagKey = request.tagKey;
        } 

        /**
         * <p>Specifies whether to remove all tags from the specified resource. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: removes all tags from the specified resource.</li>
         * <li><strong>false</strong>: does not remove all tags from the specified resource. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putBodyParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The value of <strong>RequestId</strong> is different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The region ID of the resource.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource. You can specify up to 50 resource IDs in each call.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The type of the resource from which you want to remove tags. Valid values:</p>
         * <ul>
         * <li><strong>loadbalancer</strong>: a Network Load Balancer (NLB) instance</li>
         * <li><strong>securitypolicy</strong>: a security policy</li>
         * <li><strong>servergroup</strong>: a server group</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>loadbalancer</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The key of the tag that you want to remove. You can remove up to 20 tags in each call.</p>
         */
        public Builder tagKey(java.util.List<String> tagKey) {
            this.putBodyParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
