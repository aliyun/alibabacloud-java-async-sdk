// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link StartApplicationRequest} extends {@link RequestModel}
 *
 * <p>StartApplicationRequest</p>
 */
public class StartApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EccInfo")
    private String eccInfo;

    private StartApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eccInfo = builder.eccInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return eccInfo
     */
    public String getEccInfo() {
        return this.eccInfo;
    }

    public static final class Builder extends Request.Builder<StartApplicationRequest, Builder> {
        private String appId; 
        private String eccInfo; 

        private Builder() {
            super();
        } 

        private Builder(StartApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.eccInfo = request.eccInfo;
        } 

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-4f92-4413**********</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the elastic compute container (ECC) that corresponds to the Elastic Compute Service (ECS) instance on which you want to start the application. Separate multiple ECC IDs with commas (,). You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see <a href="https://help.aliyun.com/document_detail/149394.html">QueryApplicationStatus</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder eccInfo(String eccInfo) {
            this.putQueryParameter("EccInfo", eccInfo);
            this.eccInfo = eccInfo;
            return this;
        }

        @Override
        public StartApplicationRequest build() {
            return new StartApplicationRequest(this);
        } 

    } 

}
