// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>InsertSwimmingLaneGroupRequest</p>
 */
public class InsertSwimmingLaneGroupRequest extends Request {
    @Query
    @NameInMap("AppIds")
    @Validation(required = true)
    private String appIds;

    @Query
    @NameInMap("EntryApp")
    @Validation(required = true)
    private String entryApp;

    @Query
    @NameInMap("LogicalRegionId")
    @Validation(required = true)
    private String logicalRegionId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private InsertSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.entryApp = builder.entryApp;
        this.logicalRegionId = builder.logicalRegionId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertSwimmingLaneGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    /**
     * @return entryApp
     */
    public String getEntryApp() {
        return this.entryApp;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<InsertSwimmingLaneGroupRequest, Builder> {
        private String appIds; 
        private String entryApp; 
        private String logicalRegionId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(InsertSwimmingLaneGroupRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.entryApp = request.entryApp;
            this.logicalRegionId = request.logicalRegionId;
            this.name = request.name;
        } 

        /**
         * IDs of all applications that are related to the lane group. Separate multiple applications with commas (,).
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * The ingress application. The application is in the EDAS:{application ID} format.
         */
        public Builder entryApp(String entryApp) {
            this.putQueryParameter("EntryApp", entryApp);
            this.entryApp = entryApp;
            return this;
        }

        /**
         * The ID of the custom namespace. The ID is in the physical region ID:custom namespace identifier format. Example: cn-hangzhou:test.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * The name of the lane group.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public InsertSwimmingLaneGroupRequest build() {
            return new InsertSwimmingLaneGroupRequest(this);
        } 

    } 

}
