// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link ModifySecurityIPGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityIPGroupRequest</p>
 */
public class ModifySecurityIPGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GIpList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gIpList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalIgName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalIgName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalSecurityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionName;

    private ModifySecurityIPGroupRequest(Builder builder) {
        super(builder);
        this.gIpList = builder.gIpList;
        this.globalIgName = builder.globalIgName;
        this.globalSecurityGroupId = builder.globalSecurityGroupId;
        this.regionName = builder.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIPGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gIpList
     */
    public String getGIpList() {
        return this.gIpList;
    }

    /**
     * @return globalIgName
     */
    public String getGlobalIgName() {
        return this.globalIgName;
    }

    /**
     * @return globalSecurityGroupId
     */
    public String getGlobalSecurityGroupId() {
        return this.globalSecurityGroupId;
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    public static final class Builder extends Request.Builder<ModifySecurityIPGroupRequest, Builder> {
        private String gIpList; 
        private String globalIgName; 
        private String globalSecurityGroupId; 
        private String regionName; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityIPGroupRequest request) {
            super(request);
            this.gIpList = request.gIpList;
            this.globalIgName = request.globalIgName;
            this.globalSecurityGroupId = request.globalSecurityGroupId;
            this.regionName = request.regionName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        public Builder gIpList(String gIpList) {
            this.putQueryParameter("GIpList", gIpList);
            this.gIpList = gIpList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        public Builder globalIgName(String globalIgName) {
            this.putQueryParameter("GlobalIgName", globalIgName);
            this.globalIgName = globalIgName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>g-9ubyrqeoko****,g-pdxlrvn13k****</p>
         */
        public Builder globalSecurityGroupId(String globalSecurityGroupId) {
            this.putQueryParameter("GlobalSecurityGroupId", globalSecurityGroupId);
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        @Override
        public ModifySecurityIPGroupRequest build() {
            return new ModifySecurityIPGroupRequest(this);
        } 

    } 

}
