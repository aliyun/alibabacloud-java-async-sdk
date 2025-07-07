// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseAccountQueryAccountGrantedRolesRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseAccountQueryAccountGrantedRolesRequest</p>
 */
public class EnterpriseAccountQueryAccountGrantedRolesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsOpenApi")
    private Boolean isOpenApi;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Pk")
    private String pk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowCompleteInfo")
    private Boolean showCompleteInfo;

    private EnterpriseAccountQueryAccountGrantedRolesRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.isOpenApi = builder.isOpenApi;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pk = builder.pk;
        this.showCompleteInfo = builder.showCompleteInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountQueryAccountGrantedRolesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return isOpenApi
     */
    public Boolean getIsOpenApi() {
        return this.isOpenApi;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return showCompleteInfo
     */
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public static final class Builder extends Request.Builder<EnterpriseAccountQueryAccountGrantedRolesRequest, Builder> {
        private String appName; 
        private Boolean isOpenApi; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private String pk; 
        private Boolean showCompleteInfo; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseAccountQueryAccountGrantedRolesRequest request) {
            super(request);
            this.appName = request.appName;
            this.isOpenApi = request.isOpenApi;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pk = request.pk;
            this.showCompleteInfo = request.showCompleteInfo;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * IsOpenApi.
         */
        public Builder isOpenApi(Boolean isOpenApi) {
            this.putBodyParameter("IsOpenApi", isOpenApi);
            this.isOpenApi = isOpenApi;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putBodyParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * Pk.
         */
        public Builder pk(String pk) {
            this.putBodyParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * ShowCompleteInfo.
         */
        public Builder showCompleteInfo(Boolean showCompleteInfo) {
            this.putBodyParameter("ShowCompleteInfo", showCompleteInfo);
            this.showCompleteInfo = showCompleteInfo;
            return this;
        }

        @Override
        public EnterpriseAccountQueryAccountGrantedRolesRequest build() {
            return new EnterpriseAccountQueryAccountGrantedRolesRequest(this);
        } 

    } 

}
