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
    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Path
    @NameInMap("shipperName")
    @Validation(required = true)
    private String shipperName;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private DeleteShipperRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.shipperName = builder.shipperName;
        this.project = builder.project;
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

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<DeleteShipperRequest, Builder> {
        private String logstore; 
        private String shipperName; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteShipperRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.shipperName = request.shipperName;
            this.project = request.project;
        } 

        /**
         * Logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 投递任务的名称。
         */
        public Builder shipperName(String shipperName) {
            this.putPathParameter("shipperName", shipperName);
            this.shipperName = shipperName;
            return this;
        }

        /**
         * Project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public DeleteShipperRequest build() {
            return new DeleteShipperRequest(this);
        } 

    } 

}
