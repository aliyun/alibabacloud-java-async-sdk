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
 * {@link ScaleInApplicationRequest} extends {@link RequestModel}
 *
 * <p>ScaleInApplicationRequest</p>
 */
public class ScaleInApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EccInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eccInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStatus")
    private Boolean forceStatus;

    private ScaleInApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.eccInfo = builder.eccInfo;
        this.forceStatus = builder.forceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleInApplicationRequest create() {
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

    /**
     * @return forceStatus
     */
    public Boolean getForceStatus() {
        return this.forceStatus;
    }

    public static final class Builder extends Request.Builder<ScaleInApplicationRequest, Builder> {
        private String appId; 
        private String eccInfo; 
        private Boolean forceStatus; 

        private Builder() {
            super();
        } 

        private Builder(ScaleInApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.eccInfo = request.eccInfo;
            this.forceStatus = request.forceStatus;
        } 

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-4f92-44***********************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the elastic compute container (ECC) that corresponds to the Elastic Compute Service (ECS) instance to be removed for the application. Separate multiple ECC IDs with commas (,). You can call the QueryApplicationStatus operation to query the ECC ID. For more information, see <a href="https://help.aliyun.com/document_detail/149394.html">QueryApplicationStatus</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7040f221-42df-48e8-9*******************</p>
         */
        public Builder eccInfo(String eccInfo) {
            this.putQueryParameter("EccInfo", eccInfo);
            this.eccInfo = eccInfo;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly unpublish the application from the ECS instance. You need to set this parameter to true only if the ECS instance expires. In normal cases, you do not need to set this parameter to true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceStatus(Boolean forceStatus) {
            this.putQueryParameter("ForceStatus", forceStatus);
            this.forceStatus = forceStatus;
            return this;
        }

        @Override
        public ScaleInApplicationRequest build() {
            return new ScaleInApplicationRequest(this);
        } 

    } 

}
