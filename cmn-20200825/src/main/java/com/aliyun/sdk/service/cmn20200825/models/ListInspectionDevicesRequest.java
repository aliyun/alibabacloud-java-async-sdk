// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInspectionDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListInspectionDevicesRequest</p>
 */
public class ListInspectionDevicesRequest extends Request {
    @Query
    @NameInMap("AppState")
    private String appState;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Model")
    private java.util.List < String > model;

    @Query
    @NameInMap("Role")
    private String role;

    @Query
    @NameInMap("Space")
    private String space;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private ListInspectionDevicesRequest(Builder builder) {
        super(builder);
        this.appState = builder.appState;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.role = builder.role;
        this.space = builder.space;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInspectionDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appState
     */
    public String getAppState() {
        return this.appState;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public java.util.List < String > getModel() {
        return this.model;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return space
     */
    public String getSpace() {
        return this.space;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<ListInspectionDevicesRequest, Builder> {
        private String appState; 
        private String instanceId; 
        private java.util.List < String > model; 
        private String role; 
        private String space; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(ListInspectionDevicesRequest request) {
            super(request);
            this.appState = request.appState;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.role = request.role;
            this.space = request.space;
            this.vendor = request.vendor;
        } 

        /**
         * AppState.
         */
        public Builder appState(String appState) {
            this.putQueryParameter("AppState", appState);
            this.appState = appState;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(java.util.List < String > model) {
            String modelShrink = shrink(model, "Model", "json");
            this.putQueryParameter("Model", modelShrink);
            this.model = model;
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

        /**
         * Space.
         */
        public Builder space(String space) {
            this.putQueryParameter("Space", space);
            this.space = space;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public ListInspectionDevicesRequest build() {
            return new ListInspectionDevicesRequest(this);
        } 

    } 

}
