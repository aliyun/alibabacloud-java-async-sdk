// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertDeployGroupRequest} extends {@link RequestModel}
 *
 * <p>InsertDeployGroupRequest</p>
 */
public class InsertDeployGroupRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("InitPackageVersionId")
    private String initPackageVersionId;

    private InsertDeployGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupName = builder.groupName;
        this.initPackageVersionId = builder.initPackageVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertDeployGroupRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return initPackageVersionId
     */
    public String getInitPackageVersionId() {
        return this.initPackageVersionId;
    }

    public static final class Builder extends Request.Builder<InsertDeployGroupRequest, Builder> {
        private String appId; 
        private String groupName; 
        private String initPackageVersionId; 

        private Builder() {
            super();
        } 

        private Builder(InsertDeployGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupName = request.groupName;
            this.initPackageVersionId = request.initPackageVersionId;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the instance group. The name can be up to 64 characters in length.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The version of the initial deployment package associated with the instance group. You can call the ListHistoryDeployVersion operation to query the version. For more information, see [ListHistoryDeployVersion](~~149392~~).
         */
        public Builder initPackageVersionId(String initPackageVersionId) {
            this.putQueryParameter("InitPackageVersionId", initPackageVersionId);
            this.initPackageVersionId = initPackageVersionId;
            return this;
        }

        @Override
        public InsertDeployGroupRequest build() {
            return new InsertDeployGroupRequest(this);
        } 

    } 

}
