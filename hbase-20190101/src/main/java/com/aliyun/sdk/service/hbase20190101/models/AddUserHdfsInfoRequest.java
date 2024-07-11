// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserHdfsInfoRequest} extends {@link RequestModel}
 *
 * <p>AddUserHdfsInfoRequest</p>
 */
public class AddUserHdfsInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extInfo;

    private AddUserHdfsInfoRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.extInfo = builder.extInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserHdfsInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    public static final class Builder extends Request.Builder<AddUserHdfsInfoRequest, Builder> {
        private String clientToken; 
        private String clusterId; 
        private String extInfo; 

        private Builder() {
            super();
        } 

        private Builder(AddUserHdfsInfoRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.extInfo = request.extInfo;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putQueryParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        @Override
        public AddUserHdfsInfoRequest build() {
            return new AddUserHdfsInfoRequest(this);
        } 

    } 

}
