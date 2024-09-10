// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeVersionByUuidsRequest} extends {@link RequestModel}
 *
 * <p>UpgradeVersionByUuidsRequest</p>
 */
public class UpgradeVersionByUuidsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > uuidList;

    private UpgradeVersionByUuidsRequest(Builder builder) {
        super(builder);
        this.upgradeVersion = builder.upgradeVersion;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeVersionByUuidsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return upgradeVersion
     */
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<UpgradeVersionByUuidsRequest, Builder> {
        private String upgradeVersion; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeVersionByUuidsRequest request) {
            super(request);
            this.upgradeVersion = request.upgradeVersion;
            this.uuidList = request.uuidList;
        } 

        /**
         * UpgradeVersion.
         */
        public Builder upgradeVersion(String upgradeVersion) {
            this.putQueryParameter("UpgradeVersion", upgradeVersion);
            this.upgradeVersion = upgradeVersion;
            return this;
        }

        /**
         * UuidList.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public UpgradeVersionByUuidsRequest build() {
            return new UpgradeVersionByUuidsRequest(this);
        } 

    } 

}
