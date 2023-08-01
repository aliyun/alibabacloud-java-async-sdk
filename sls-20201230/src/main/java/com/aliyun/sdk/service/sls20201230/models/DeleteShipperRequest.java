// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteShipperRequest} extends {@link RequestModel}
 *
 * <p>DeleteShipperRequest</p>
 */
public class DeleteShipperRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("shipperName")
    @Validation(required = true)
    private String shipperName;

    private DeleteShipperRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shipperName = builder.shipperName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteShipperRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return shipperName
     */
    public String getShipperName() {
        return this.shipperName;
    }

    public static final class Builder extends Request.Builder<DeleteShipperRequest, Builder> {
        private String project; 
        private String logstore; 
        private String shipperName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteShipperRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shipperName = request.shipperName;
        } 

        /**
         * Project名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * shipperName.
         */
        public Builder shipperName(String shipperName) {
            this.putPathParameter("shipperName", shipperName);
            this.shipperName = shipperName;
            return this;
        }

        @Override
        public DeleteShipperRequest build() {
            return new DeleteShipperRequest(this);
        } 

    } 

}
