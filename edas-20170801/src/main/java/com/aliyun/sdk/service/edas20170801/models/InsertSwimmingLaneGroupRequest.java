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
 * {@link InsertSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>InsertSwimmingLaneGroupRequest</p>
 */
public class InsertSwimmingLaneGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryApp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entryApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logicalRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>IDs of all applications that are related to the lane group. Separate multiple applications with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bdb251cc-02a6-48dd-891b-2ab21b25****,ee33ed0c-fddc-47b5-9f63-e1ccc4be****</p>
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>The ingress application. The application is in the EDAS:{application ID} format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EDAS:5cc89013-9232-4b36-b3eb-ff89b3d2****</p>
         */
        public Builder entryApp(String entryApp) {
            this.putQueryParameter("EntryApp", entryApp);
            this.entryApp = entryApp;
            return this;
        }

        /**
         * <p>The ID of the custom namespace. The ID is in the physical region ID:custom namespace identifier format. Example: cn-hangzhou:test.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:test</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * <p>The name of the lane group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
