// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeDomainAdvanceConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainAdvanceConfigsRequest</p>
 */
public class DescribeDomainAdvanceConfigsRequest extends Request {
    @Query
    @NameInMap("DomainList")
    private String domainList;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;


    private DescribeDomainAdvanceConfigsRequest(Builder builder) {
        super(builder);
        this.domainList = builder.domainList;
        this.instanceId = builder.instanceId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainAdvanceConfigsRequest create() {
        return builder().build();
    }

    /**
     * @return domainList
     */
    public String getDomainList() {
        return this.domainList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder {
        private String domainList; 
        private String instanceId; 
        private String resourceGroupId; 

        /**
         * <p>DomainList.</p>
         */
        public Builder domainList(String domainList) {
            this.putQueryParameter("DomainList", domainList);
            this.domainList = domainList;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>ResourceGroupId.</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public DescribeDomainAdvanceConfigsRequest build() {
            return new DescribeDomainAdvanceConfigsRequest(this);
        } 

    } 

}
