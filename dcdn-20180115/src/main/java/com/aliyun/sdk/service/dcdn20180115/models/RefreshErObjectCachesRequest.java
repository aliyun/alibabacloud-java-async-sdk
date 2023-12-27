// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshErObjectCachesRequest} extends {@link RequestModel}
 *
 * <p>RefreshErObjectCachesRequest</p>
 */
public class RefreshErObjectCachesRequest extends Request {
    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("MergeDomainName")
    private String mergeDomainName;

    @Query
    @NameInMap("ObjectPath")
    @Validation(required = true)
    private String objectPath;

    @Query
    @NameInMap("ObjectType")
    @Validation(required = true)
    private String objectType;

    @Query
    @NameInMap("RoutineId")
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
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * MergeDomainName.
         */
        public Builder mergeDomainName(String mergeDomainName) {
            this.putQueryParameter("MergeDomainName", mergeDomainName);
            this.mergeDomainName = mergeDomainName;
            return this;
        }

        /**
         * ObjectPath.
         */
        public Builder objectPath(String objectPath) {
            this.putQueryParameter("ObjectPath", objectPath);
            this.objectPath = objectPath;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * RoutineId.
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
