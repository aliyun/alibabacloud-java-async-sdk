// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesNoPagingRequest} extends {@link RequestModel}
 *
 * <p>ListNodesNoPagingRequest</p>
 */
public class ListNodesNoPagingRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("OnlyDetached")
    private Boolean onlyDetached;

    @Query
    @NameInMap("Role")
    private String role;

    private ListNodesNoPagingRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.hostName = builder.hostName;
        this.onlyDetached = builder.onlyDetached;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesNoPagingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return onlyDetached
     */
    public Boolean getOnlyDetached() {
        return this.onlyDetached;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder extends Request.Builder<ListNodesNoPagingRequest, Builder> {
        private String clusterId; 
        private String hostName; 
        private Boolean onlyDetached; 
        private String role; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesNoPagingRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.hostName = request.hostName;
            this.onlyDetached = request.onlyDetached;
            this.role = request.role;
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
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * OnlyDetached.
         */
        public Builder onlyDetached(Boolean onlyDetached) {
            this.putQueryParameter("OnlyDetached", onlyDetached);
            this.onlyDetached = onlyDetached;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        @Override
        public ListNodesNoPagingRequest build() {
            return new ListNodesNoPagingRequest(this);
        } 

    } 

}
