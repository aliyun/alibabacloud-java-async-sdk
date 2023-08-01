// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetShipperStatusRequest} extends {@link RequestModel}
 *
 * <p>GetShipperStatusRequest</p>
 */
public class GetShipperStatusRequest extends Request {
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

    @Query
    @NameInMap("from")
    @Validation(required = true)
    private Long from;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("size")
    private Integer size;

    @Query
    @NameInMap("status")
    private String status;

    @Query
    @NameInMap("to")
    @Validation(required = true)
    private Long to;

    private GetShipperStatusRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.shipperName = builder.shipperName;
        this.from = builder.from;
        this.offset = builder.offset;
        this.size = builder.size;
        this.status = builder.status;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShipperStatusRequest create() {
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

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetShipperStatusRequest, Builder> {
        private String project; 
        private String logstore; 
        private String shipperName; 
        private Long from; 
        private Integer offset; 
        private Integer size; 
        private String status; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(GetShipperStatusRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.shipperName = request.shipperName;
            this.from = request.from;
            this.offset = request.offset;
            this.size = request.size;
            this.status = request.status;
            this.to = request.to;
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

        /**
         * from.
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Long to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        @Override
        public GetShipperStatusRequest build() {
            return new GetShipperStatusRequest(this);
        } 

    } 

}
