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
 * {@link StopApplicationRequest} extends {@link RequestModel}
 *
 * <p>StopApplicationRequest</p>
 */
public class StopApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EccInfo")
    private String eccInfo;

    private StopApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eccInfo = builder.eccInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<StopApplicationRequest, Builder> {
        private String appId; 
        private String eccInfo; 

        private Builder() {
            super();
        } 

        private Builder(StopApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.eccInfo = request.eccInfo;
        } 

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c627c157-560d*******</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the elastic compute container (ECC) that corresponds to the Elastic Compute Service (ECS) instance on which you want to stop the application. You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see <a href="https://help.aliyun.com/document_detail/149394.html">QueryApplicationStatus</a>.</p>
         * <ul>
         * <li>If you want to stop the application on multiple ECS instances, separate the ECC IDs with commas (,).</li>
         * <li>If you leave this parameter empty, the application will be stopped on all ECS instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>74ee9166-<strong><strong>1f6-bcb60e5b</strong></strong></p>
         */
        public Builder eccInfo(String eccInfo) {
            this.putQueryParameter("EccInfo", eccInfo);
            this.eccInfo = eccInfo;
            return this;
        }

        @Override
        public StopApplicationRequest build() {
            return new StopApplicationRequest(this);
        } 

    } 

}
