// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshErObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>RefreshErObjectCachesRequest</p>
 */
public class RefreshErObjectCachesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MergeDomainName")
    private String mergeDomainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutineId")
    private String routineId;

    private RefreshErObjectCachesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.mergeDomainName = builder.mergeDomainName;
        this.objectPath = builder.objectPath;
        this.objectType = builder.objectType;
        this.routineId = builder.routineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshErObjectCachesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return mergeDomainName
     */
    public String getMergeDomainName() {
        return this.mergeDomainName;
    }

    /**
     * @return objectPath
     */
    public String getObjectPath() {
        return this.objectPath;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return routineId
     */
    public String getRoutineId() {
        return this.routineId;
    }

    public static final class Builder extends Request.Builder<RefreshErObjectCachesRequest, Builder> {
        private Boolean force; 
        private String mergeDomainName; 
        private String objectPath; 
        private String objectType; 
        private String routineId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshErObjectCachesRequest request) {
            super(request);
            this.force = request.force;
            this.mergeDomainName = request.mergeDomainName;
            this.objectPath = request.objectPath;
            this.objectType = request.objectType;
            this.routineId = request.routineId;
        } 

        /**
         * Specifies whether to refresh resources in a directory if the resources requested are different from the resources on the origin server. Default value: false.
         * <p>
         * 
         * *   **true**: refreshes all resources in the directory.
         * *   **false**: refreshes the changed resources in the directory.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The domain names that are merged for refreshing. POPs that provide services for the domain names are refreshed.
         * <p>
         * 
         * >  Separate multiple domain names with commas (,).
         */
        public Builder mergeDomainName(String mergeDomainName) {
            this.putQueryParameter("MergeDomainName", mergeDomainName);
            this.mergeDomainName = mergeDomainName;
            return this;
        }

        /**
         * The URL that you want to refresh.
         * <p>
         * 
         * > *   Separate URLs with line feeds (\n or \r\n). Each object path can be up to 1,024 characters in length.
         * >*   The URLs in a request must belong to the same domain name.
         * >*   You can refresh up to 1,000 URLs in each request.
         */
        public Builder objectPath(String objectPath) {
            this.putQueryParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
            return this;
        }

        /**
         * The refresh type. Valid values:
         * <p>
         * 
         * *   **File** (default): refreshes content based on URLs.
         * *   **Directory**: refreshes content based on directories.
         * *   **Regex**: refreshes content based on regular expressions.
         * *   **IgnoreParams**: removes the question mark (`?`) and parameters after the question mark (`?`) in a request URL and refreshes content. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource without specific parameters. If the URLs match, the points of presence (POPs) refresh the cached resource.
         * 
         * >  If you refresh the files in one or more directories, the resources in the directory that you want to refresh are marked as expired. You cannot delete the directory. If clients request resources on POPs that are marked as expired, Dynamic Content Delivery Network (DCDN) checks whether the resources on your origin server are updated. If resources are updated, DCDN retrieves the latest version of the resources and returns the resources to the clients. Otherwise, the origin server returns the 304 status code.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * The ID of the routine, which is in the format of "Name.Subdomain" and is the unique identifier of a custom routine.
         */
        public Builder routineId(String routineId) {
            this.putQueryParameter("RoutineId", routineId);
            this.routineId = routineId;
            return this;
        }

        @Override
        public RefreshErObjectCachesRequest build() {
            return new RefreshErObjectCachesRequest(this);
        } 

    } 

}
