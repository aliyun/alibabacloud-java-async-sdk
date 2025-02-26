// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link OperateAppRequest} extends {@link RequestModel}
 *
 * <p>OperateAppRequest</p>
 */
public class OperateAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private Integer appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    private java.util.List<String> instanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    private OperateAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.instanceIdList = builder.instanceIdList;
        this.operateType = builder.operateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * @return instanceIdList
     */
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    public static final class Builder extends Request.Builder<OperateAppRequest, Builder> {
        private Integer appId; 
        private java.util.List<String> instanceIdList; 
        private String operateType; 

        private Builder() {
            super();
        } 

        private Builder(OperateAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.instanceIdList = request.instanceIdList;
            this.operateType = request.operateType;
        } 

        /**
         * <p>The ID of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder appId(Integer appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The IDs of the cloud phone instances.</p>
         */
        public Builder instanceIdList(java.util.List<String> instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * <p>The type of the operation.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>stop: closes the app.</li>
         * <li>restart: reopens the app.</li>
         * <li>start: open the app.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        @Override
        public OperateAppRequest build() {
            return new OperateAppRequest(this);
        } 

    } 

}
