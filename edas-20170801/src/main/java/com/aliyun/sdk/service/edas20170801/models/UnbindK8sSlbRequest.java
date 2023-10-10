// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindK8sSlbRequest} extends {@link RequestModel}
 *
 * <p>UnbindK8sSlbRequest</p>
 */
public class UnbindK8sSlbRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("SlbName")
    private String slbName;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UnbindK8sSlbRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
        this.slbName = builder.slbName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindK8sSlbRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return slbName
     */
    public String getSlbName() {
        return this.slbName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UnbindK8sSlbRequest, Builder> {
        private String appId; 
        private String clusterId; 
        private String slbName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UnbindK8sSlbRequest request) {
            super(request);
            this.appId = request.appId;
            this.clusterId = request.clusterId;
            this.slbName = request.slbName;
            this.type = request.type;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the cluster. You can call the GetK8sCluster operation to query the cluster ID. For more information, see [GetK8sCluster](~~181437~~).
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the SLB instance.
         */
        public Builder slbName(String slbName) {
            this.putQueryParameter("SlbName", slbName);
            this.slbName = slbName;
            return this;
        }

        /**
         * The type of the SLB instance. Valid values:
         * <p>
         * 
         * *   **internet**: Internet-facing SLB instance
         * *   **intranet**: internal-facing SLB instance
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UnbindK8sSlbRequest build() {
            return new UnbindK8sSlbRequest(this);
        } 

    } 

}
