// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link AddBsnFabricBizChainRequest} extends {@link RequestModel}
 *
 * <p>AddBsnFabricBizChainRequest</p>
 */
public class AddBsnFabricBizChainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userCode;

    private AddBsnFabricBizChainRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.name = builder.name;
        this.nodeList = builder.nodeList;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.userCode = builder.userCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBsnFabricBizChainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeList
     */
    public String getNodeList() {
        return this.nodeList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return userCode
     */
    public String getUserCode() {
        return this.userCode;
    }

    public static final class Builder extends Request.Builder<AddBsnFabricBizChainRequest, Builder> {
        private String appCode; 
        private String name; 
        private String nodeList; 
        private String regionId; 
        private String remark; 
        private String userCode; 

        private Builder() {
            super();
        } 

        private Builder(AddBsnFabricBizChainRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.name = request.name;
            this.nodeList = request.nodeList;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.userCode = request.userCode;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder nodeList(String nodeList) {
            this.putQueryParameter("NodeList", nodeList);
            this.nodeList = nodeList;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userCode(String userCode) {
            this.putQueryParameter("UserCode", userCode);
            this.userCode = userCode;
            return this;
        }

        @Override
        public AddBsnFabricBizChainRequest build() {
            return new AddBsnFabricBizChainRequest(this);
        } 

    } 

}
