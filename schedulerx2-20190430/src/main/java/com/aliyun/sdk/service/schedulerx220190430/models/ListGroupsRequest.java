// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListGroupsRequest</p>
 */
public class ListGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppGroupName")
    private String appGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListGroupsRequest(Builder builder) {
        super(builder);
        this.appGroupName = builder.appGroupName;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupName
     */
    public String getAppGroupName() {
        return this.appGroupName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListGroupsRequest, Builder> {
        private String appGroupName; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupsRequest request) {
            super(request);
            this.appGroupName = request.appGroupName;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the application group.
         */
        public Builder appGroupName(String appGroupName) {
            this.putQueryParameter("AppGroupName", appGroupName);
            this.appGroupName = appGroupName;
            return this;
        }

        /**
         * The namespace ID. You can obtain the namespace ID on the **Namespace** page in the SchedulerX console.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The source of the namespace. This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListGroupsRequest build() {
            return new ListGroupsRequest(this);
        } 

    } 

}
